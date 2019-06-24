/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Parquet sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ParquetSink")
public class ParquetSink extends CopySink {
    /**
     * Parquet store settings.
     */
    @JsonProperty(value = "storeSettings")
    private ConnectorWriteSetting storeSettings;

    /**
     * Get parquet store settings.
     *
     * @return the storeSettings value
     */
    public ConnectorWriteSetting storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set parquet store settings.
     *
     * @param storeSettings the storeSettings value to set
     * @return the ParquetSink object itself.
     */
    public ParquetSink withStoreSettings(ConnectorWriteSetting storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

}
