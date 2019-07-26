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

/**
 * Staging settings.
 */
public class StagingSettings {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Staging linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /**
     * The path to storage for storing the interim data. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "path")
    private Object path;

    /**
     * Specifies whether to use compression when copying data via an interim
     * staging. Default value is false. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "enableCompression")
    private Object enableCompression;

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
     * @return the StagingSettings object itself.
     */
    public StagingSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get staging linked service reference.
     *
     * @return the linkedServiceName value
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set staging linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set
     * @return the StagingSettings object itself.
     */
    public StagingSettings withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path to storage for storing the interim data. Type: string (or Expression with resultType string).
     *
     * @return the path value
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path to storage for storing the interim data. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set
     * @return the StagingSettings object itself.
     */
    public StagingSettings withPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Get specifies whether to use compression when copying data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableCompression value
     */
    public Object enableCompression() {
        return this.enableCompression;
    }

    /**
     * Set specifies whether to use compression when copying data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableCompression the enableCompression value to set
     * @return the StagingSettings object itself.
     */
    public StagingSettings withEnableCompression(Object enableCompression) {
        this.enableCompression = enableCompression;
        return this;
    }

}
