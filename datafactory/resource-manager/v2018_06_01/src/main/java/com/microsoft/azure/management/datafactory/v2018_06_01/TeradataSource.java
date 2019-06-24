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
 * A copy activity Teradata source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TeradataSource")
public class TeradataSource extends CopySource {
    /**
     * Teradata query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * The partition mechanism that will be used for teradata read in parallel.
     */
    @JsonProperty(value = "partitionOption")
    private Object partitionOption;

    /**
     * The settings that will be leveraged for teradata source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private TeradataPartitionSettings partitionSettings;

    /**
     * Get teradata query. Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set teradata query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the TeradataSource object itself.
     */
    public TeradataSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the partition mechanism that will be used for teradata read in parallel.
     *
     * @return the partitionOption value
     */
    public Object partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partition mechanism that will be used for teradata read in parallel.
     *
     * @param partitionOption the partitionOption value to set
     * @return the TeradataSource object itself.
     */
    public TeradataSource withPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the settings that will be leveraged for teradata source partitioning.
     *
     * @return the partitionSettings value
     */
    public TeradataPartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the settings that will be leveraged for teradata source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set
     * @return the TeradataSource object itself.
     */
    public TeradataSource withPartitionSettings(TeradataPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

}
