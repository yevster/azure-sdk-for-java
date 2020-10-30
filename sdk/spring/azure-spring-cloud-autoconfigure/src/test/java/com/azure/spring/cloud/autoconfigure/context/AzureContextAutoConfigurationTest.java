// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.context;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.azure.spring.cloud.context.core.api.CredentialsProvider;
import com.azure.spring.cloud.context.core.config.AzureProperties;
import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.Azure;

public class AzureContextAutoConfigurationTest {
    private ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(AzureContextAutoConfiguration.class))
            .withUserConfiguration(TestConfiguration.class);

    @Test
    public void testAzurePropertiesConfigured() {
        this.contextRunner.withPropertyValues("spring.cloud.azure.credentialFilePath=credential")
                .withPropertyValues("spring.cloud.azure.resourceGroup=group1")
                .withPropertyValues("spring.cloud.azure.region=westUS").run(context -> {
                    assertThat(context).hasSingleBean(AzureProperties.class);
                    assertThat(context.getBean(AzureProperties.class).getCredentialFilePath()).isEqualTo("credential");
                    assertThat(context.getBean(AzureProperties.class).getResourceGroup()).isEqualTo("group1");
                    assertThat(context.getBean(AzureProperties.class).getRegion()).isEqualTo("westUS");
                    assertThat(context.getBean(AzureProperties.class).getEnvironment())
                            .isEqualTo(AzureEnvironment.AZURE);
                });
    }

    @Test
    public void testRequiredAzureProperties() {
        this.contextRunner.withPropertyValues("spring.cloud.azure.credentialFilePath=credential")
                .withPropertyValues("spring.cloud.azure.resourceGroup=group1").run(context -> {
                    assertThat(context).hasSingleBean(AzureProperties.class);
                    assertThat(context.getBean(AzureProperties.class).getCredentialFilePath()).isEqualTo("credential");
                    assertThat(context.getBean(AzureProperties.class).getResourceGroup()).isEqualTo("group1");
                });
    }

    @Test
    public void testAzureDisabled() {
        this.contextRunner.withPropertyValues("spring.cloud.azure.enabled=false")
                .run(context -> assertThat(context).doesNotHaveBean(AzureProperties.class));
    }

    @Test
    public void testWithoutAzureClass() {
        this.contextRunner.withClassLoader(new FilteredClassLoader(Azure.class))
                .run(context -> assertThat(context).doesNotHaveBean(AzureProperties.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testLocationRequiredWhenAutoCreateResources() {
        this.contextRunner.withPropertyValues("spring.cloud.azure.credentialFilePath=credential")
                .withPropertyValues("spring.cloud.azure.resourceGroup=group1")
                .withPropertyValues("spring.cloud.azure.auto-create-resources=true")
                .run(context -> context.getBean(AzureProperties.class));
    }

    @Test
    // Ensure a default subscription ID is correctly used when not specified in the
    // properties
    public void testDefaultSubscriptionId() throws IOException {
        AzureProperties azureProperties = new AzureProperties();
        String expectedSubscriptionId = "non-default-subscription-id";
        
        //Mock credentials
        AzureTokenCredentials mockCredentials = mock(AzureTokenCredentials.class);
        when(mockCredentials.domain()).thenReturn("testdomain");
        when(mockCredentials.environment()).thenReturn(AzureEnvironment.AZURE);
        when(mockCredentials.defaultSubscriptionId()).thenReturn(expectedSubscriptionId);
        
        //Call real auto-config logic with stubbed-out connectivity
        AzureContextAutoConfiguration mockAutoConfig = mock(AzureContextAutoConfiguration.class);
        when(mockAutoConfig.azure(any(), any())).thenCallRealMethod();
        when(mockAutoConfig.authenticateToAzure(any(), anyString(), any())).then(invocation -> {
            assertEquals(expectedSubscriptionId, invocation.getArgument(1));
            return mock(Azure.class);
        });
        mockAutoConfig.azure(mockCredentials, azureProperties);
        verify(mockAutoConfig, times(1)).authenticateToAzure(any(), eq(expectedSubscriptionId), any());

    }

    @Configuration
    static class TestConfiguration {

        @Bean
        Azure azure() {
            return mock(Azure.class);
        }

        @Bean
        CredentialsProvider credentialsProvider() {
            return mock(CredentialsProvider.class);
        }

        @Bean
        AzureTokenCredentials credentials() {
            return mock(AzureTokenCredentials.class);
        }
    }
}
