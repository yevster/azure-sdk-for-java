/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * A copy activity sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CopySink")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "CosmosDbMongoDbApiSink", value = CosmosDbMongoDbApiSink.class),
    @JsonSubTypes.Type(name = "SalesforceServiceCloudSink", value = SalesforceServiceCloudSink.class),
    @JsonSubTypes.Type(name = "SalesforceSink", value = SalesforceSink.class),
    @JsonSubTypes.Type(name = "AzureDataExplorerSink", value = AzureDataExplorerSink.class),
    @JsonSubTypes.Type(name = "CommonDataServiceForAppsSink", value = CommonDataServiceForAppsSink.class),
    @JsonSubTypes.Type(name = "DynamicsCrmSink", value = DynamicsCrmSink.class),
    @JsonSubTypes.Type(name = "DynamicsSink", value = DynamicsSink.class),
    @JsonSubTypes.Type(name = "MicrosoftAccessSink", value = MicrosoftAccessSink.class),
    @JsonSubTypes.Type(name = "InformixSink", value = InformixSink.class),
    @JsonSubTypes.Type(name = "OdbcSink", value = OdbcSink.class),
    @JsonSubTypes.Type(name = "AzureSearchIndexSink", value = AzureSearchIndexSink.class),
    @JsonSubTypes.Type(name = "AzureBlobFSSink", value = AzureBlobFSSink.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreSink", value = AzureDataLakeStoreSink.class),
    @JsonSubTypes.Type(name = "OracleSink", value = OracleSink.class),
    @JsonSubTypes.Type(name = "SqlDWSink", value = SqlDWSink.class),
    @JsonSubTypes.Type(name = "SqlMISink", value = SqlMISink.class),
    @JsonSubTypes.Type(name = "AzureSqlSink", value = AzureSqlSink.class),
    @JsonSubTypes.Type(name = "SqlServerSink", value = SqlServerSink.class),
    @JsonSubTypes.Type(name = "SqlSink", value = SqlSink.class),
    @JsonSubTypes.Type(name = "DocumentDbCollectionSink", value = DocumentDbCollectionSink.class),
    @JsonSubTypes.Type(name = "FileSystemSink", value = FileSystemSink.class),
    @JsonSubTypes.Type(name = "BlobSink", value = BlobSink.class),
    @JsonSubTypes.Type(name = "ParquetSink", value = ParquetSink.class),
    @JsonSubTypes.Type(name = "AzureTableSink", value = AzureTableSink.class),
    @JsonSubTypes.Type(name = "AzureQueueSink", value = AzureQueueSink.class),
    @JsonSubTypes.Type(name = "SapCloudForCustomerSink", value = SapCloudForCustomerSink.class),
    @JsonSubTypes.Type(name = "DelimitedTextSink", value = DelimitedTextSink.class)
})
public class CopySink {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Write batch size. Type: integer (or Expression with resultType integer),
     * minimum: 0.
     */
    @JsonProperty(value = "writeBatchSize")
    private Object writeBatchSize;

    /**
     * Write batch timeout. Type: string (or Expression with resultType
     * string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "writeBatchTimeout")
    private Object writeBatchTimeout;

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "sinkRetryCount")
    private Object sinkRetryCount;

    /**
     * Sink retry wait. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "sinkRetryWait")
    private Object sinkRetryWait;

    /**
     * The maximum concurrent connection count for the sink data store. Type:
     * integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "maxConcurrentConnections")
    private Object maxConcurrentConnections;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the CopySink object itself.
     */
    public CopySink withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the writeBatchSize value
     */
    public Object writeBatchSize() {
        return this.writeBatchSize;
    }

    /**
     * Set write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param writeBatchSize the writeBatchSize value to set
     * @return the CopySink object itself.
     */
    public CopySink withWriteBatchSize(Object writeBatchSize) {
        this.writeBatchSize = writeBatchSize;
        return this;
    }

    /**
     * Get write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the writeBatchTimeout value
     */
    public Object writeBatchTimeout() {
        return this.writeBatchTimeout;
    }

    /**
     * Set write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param writeBatchTimeout the writeBatchTimeout value to set
     * @return the CopySink object itself.
     */
    public CopySink withWriteBatchTimeout(Object writeBatchTimeout) {
        this.writeBatchTimeout = writeBatchTimeout;
        return this;
    }

    /**
     * Get sink retry count. Type: integer (or Expression with resultType integer).
     *
     * @return the sinkRetryCount value
     */
    public Object sinkRetryCount() {
        return this.sinkRetryCount;
    }

    /**
     * Set sink retry count. Type: integer (or Expression with resultType integer).
     *
     * @param sinkRetryCount the sinkRetryCount value to set
     * @return the CopySink object itself.
     */
    public CopySink withSinkRetryCount(Object sinkRetryCount) {
        this.sinkRetryCount = sinkRetryCount;
        return this;
    }

    /**
     * Get sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the sinkRetryWait value
     */
    public Object sinkRetryWait() {
        return this.sinkRetryWait;
    }

    /**
     * Set sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param sinkRetryWait the sinkRetryWait value to set
     * @return the CopySink object itself.
     */
    public CopySink withSinkRetryWait(Object sinkRetryWait) {
        this.sinkRetryWait = sinkRetryWait;
        return this;
    }

    /**
     * Get the maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     *
     * @return the maxConcurrentConnections value
     */
    public Object maxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     *
     * @param maxConcurrentConnections the maxConcurrentConnections value to set
     * @return the CopySink object itself.
     */
    public CopySink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

}
