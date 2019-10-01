// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.RetryOptions;
import com.azure.core.amqp.TransportType;
import com.azure.core.amqp.implementation.ConnectionStringProperties;
import com.azure.core.amqp.implementation.TracerProvider;
import com.azure.core.amqp.models.ProxyConfiguration;
import com.azure.core.credentials.TokenCredential;
import com.azure.core.exception.AzureException;
import com.azure.core.implementation.util.ImplUtils;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.tracing.Tracer;
import com.azure.messaging.eventhubs.implementation.ClientConstants;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.messaging.eventhubs.models.PartitionContext;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.function.Function;
import java.util.function.Supplier;
import reactor.core.scheduler.Scheduler;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of the {@link
 * EventProcessor}. Calling {@link #buildEventProcessor()} constructs a new instance of {@link EventProcessor}.
 *
 * <p>
 * To create an instance of {@link EventProcessor} that processes events with user-provided callback, configure the
 * following fields:
 *
 * <ul>
 * <li>{@link #consumerGroup(String) Consumer group name}.</li>
 * <li>{@link EventHubAsyncClient} - An asynchronous Event Hub client the {@link EventProcessor} will use for
 * consuming events.</li>
 * <li>{@link PartitionManager} - An instance of PartitionManager. To get started, you can pass an instance of
 * {@link InMemoryPartitionManager}. For production, choose an implementation that will store checkpoints and partition
 * ownership details to a durable store.</li>
 * <li>{@link #partitionProcessorFactory(Supplier) partitionProcessorFactory} - A user-defined {@link Function} that
 * creates
 * new instances of {@link PartitionProcessor} for processing events. Users should extend from
 * {@link PartitionProcessor} abstract class to implement
 * {@link PartitionProcessor#processEvent(PartitionContext, EventData)}.</li>
 * </ul>
 *
 * <p><strong>Creating an {@link EventProcessor}</strong></p>
 * {@codesnippet com.azure.messaging.eventhubs.eventprocessorbuilder.instantiation}
 *
 * @see EventProcessor
 * @see EventHubConsumer
 */
public class EventProcessorBuilder {

    private final ClientLogger logger = new ClientLogger(EventProcessorBuilder.class);

    private EventHubClientBuilder eventHubClientBuilder;
    private TokenCredential credentials;
    private Configuration configuration;
    private ProxyConfiguration proxyConfiguration;
    private RetryOptions retryOptions;
    private Scheduler scheduler;
    private TransportType transport;
    private String fullyQualifiedNamespace;
    private String eventHubName;
    private Supplier<PartitionProcessor> partitionProcessorFactory;
    private String consumerGroup;
    private PartitionManager partitionManager;

    public EventProcessorBuilder() {
        eventHubClientBuilder = new EventHubClientBuilder();
    }

    public EventProcessorBuilder connectionString(String connectionString) {
        eventHubClientBuilder.connectionString(connectionString);
        return this;
    }

    /**
     * Sets the credential information given a connection string to the Event Hubs namespace and name to a specific
     * Event Hub instance.
     *
     * @param connectionString The connection string to use for connecting to the Event Hubs namespace; it is
     *     expected that the shared access key properties are contained in this connection string, but not the Event Hub
     *     name.
     * @param eventHubName The name of the Event Hub to connect the client to.
     *
     * @return The updated {@link EventHubClientBuilder} object.
     *
     * @throws NullPointerException if {@code connectionString} or {@code eventHubName} is null.
     * @throws IllegalArgumentException if {@code connectionString} or {@code eventHubName} is an empty string. Or, if
     * the {@code connectionString} contains the Event Hub name.
     * @throws AzureException If the shared access signature token credential could not be created using the connection
     * string.
     */
    public EventProcessorBuilder connectionString(String connectionString, String eventHubName) {
        eventHubClientBuilder.connectionString(connectionString, eventHubName);
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     *
     * If not specified, the default configuration store is used to configure the {@link EventHubAsyncClient}. Use
     * {@link Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to configure the {@link EventHubAsyncClient}.
     *
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventProcessorBuilder configuration(Configuration configuration) {
        eventHubClientBuilder.configuration(configuration);
        return this;
    }

    /**
     * Sets the credential information for which Event Hub instance to connect to, and how to authorize against it.
     *
     * @param fullyQualifiedNamespace The fully qualified name for the Event Hubs namespace. This is likely to be
     *     similar to <strong>{@literal "{your-namespace}.servicebus.windows.net}"</strong>.
     * @param eventHubName The name of the Event Hub to connect the client to.
     * @param credential The token credential to use for authorization. Access controls may be specified by the
     *     Event Hubs namespace or the requested Event Hub, depending on Azure configuration.
     *
     * @return The updated {@link EventHubClientBuilder} object.
     *
     * @throws IllegalArgumentException if {@code fullyQualifiedNamespace} or {@code eventHubName} is an empty string.
     * @throws NullPointerException if {@code fullyQualifiedNamespace}, {@code eventHubName}, {@code credentials} is
     *     null.
     */
    public EventProcessorBuilder credential(String fullyQualifiedNamespace, String eventHubName,
        TokenCredential credential) {

        eventHubClientBuilder.credential(fullyQualifiedNamespace, eventHubName, credential);
        return this;
    }

    /**
     * Sets the proxy configuration to use for {@link EventHubAsyncClient}. When a proxy is configured, {@link
     * TransportType#AMQP_WEB_SOCKETS} must be used for the transport type.
     *
     * @param proxyConfiguration The proxy configuration to use.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventProcessorBuilder proxyConfiguration(ProxyConfiguration proxyConfiguration) {
        eventHubClientBuilder.proxyConfiguration(proxyConfiguration);
        return this;
    }

    /**
     * Sets the scheduler for operations such as connecting to and receiving or sending data to Event Hubs. If none is
     * specified, an elastic pool is used.
     *
     * @param scheduler The scheduler for operations such as connecting to and receiving or sending data to Event Hubs.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventProcessorBuilder scheduler(Scheduler scheduler) {
        eventHubClientBuilder.scheduler(scheduler);
        return this;
    }

    /**
     * Sets the transport type by which all the communication with Azure Event Hubs occurs. Default value is {@link
     * TransportType#AMQP}.
     *
     * @param transport The transport type to use.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventProcessorBuilder transportType(TransportType transport) {
        eventHubClientBuilder.transportType(transport);
        return this;
    }

    /**
     * Sets the retry policy for {@link EventHubAsyncClient}. If not specified, the default retry options are used.
     *
     * @param retryOptions The retry policy to use.
     * @return The updated {@link EventHubClientBuilder} object.
     */
    public EventProcessorBuilder retry(RetryOptions retryOptions) {
        eventHubClientBuilder.retry(retryOptions);
        return this;
    }

    /**
     * Sets the consumer group name from which the {@link EventProcessor} should consume events.
     *
     * @param consumerGroup The consumer group name this {@link EventProcessor} should consume events.
     * @return The updated {@link EventProcessorBuilder} instance.
     */
    public EventProcessorBuilder consumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
     * Sets the {@link PartitionManager} the {@link EventProcessor} will use for storing partition ownership and
     * checkpoint information.
     *
     * <p>
     * Users can, optionally, provide their own implementation of {@link PartitionManager} which will store ownership
     * and checkpoint information. If not provided, the {@link EventProcessor} will first check for any available
     * implementation of {@link PartitionManager} in the classpath and fallback to {@link InMemoryPartitionManager} if
     * none found.
     * </p>
     *
     * @param partitionManager Implementation of {@link PartitionManager}.
     * @return The updated {@link EventProcessorBuilder} instance.
     */
    public EventProcessorBuilder partitionManager(PartitionManager partitionManager) {
        this.partitionManager = partitionManager;
        return this;
    }

    /**
     * Sets the partition processor factory for creating new instance(s) of {@link PartitionProcessor}.
     * <p>
     * Use this to have finer control over processing events from partitions. This will also allow you to control the
     * frequency of checkpointing.
     * </p>
     *
     * @param partitionProcessorFactory The factory that creates new {@link PartitionProcessor} for each partition.
     * @return The updated {@link EventProcessorBuilder} instance.
     */
    public EventProcessorBuilder partitionProcessorFactory(Supplier<PartitionProcessor> partitionProcessorFactory) {
        this.partitionProcessorFactory = partitionProcessorFactory;
        return this;
    }

    /**
     * This will create a new {@link EventProcessor} configured with the options set in this builder. Each call to this
     * method will return a new instance of {@link EventProcessor}.
     *
     * <p>
     * All partitions processed by this {@link EventProcessor} will start processing from {@link
     * EventPosition#earliest() earliest} available event in the respective partitions.
     * </p>
     *
     * @return A new instance of {@link EventProcessor}.
     */
    public EventProcessor buildEventProcessor() {
        final TracerProvider tracerProvider = new TracerProvider(ServiceLoader.load(Tracer.class));
        return new EventProcessor(eventHubClientBuilder, this.consumerGroup,
            this.partitionProcessorFactory, EventPosition.earliest(), partitionManager, tracerProvider);
    }
}
