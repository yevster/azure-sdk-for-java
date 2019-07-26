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
 * Dataset reference type.
 */
public class DatasetReference {
    /**
     * Dataset reference type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Reference dataset name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /**
     * Arguments for dataset.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /**
     * Creates an instance of DatasetReference class.
     * @param referenceName reference dataset name.
     */
    public DatasetReference() {
        type = "DatasetReference";
    }

    /**
     * Get dataset reference type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set dataset reference type.
     *
     * @param type the type value to set
     * @return the DatasetReference object itself.
     */
    public DatasetReference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get reference dataset name.
     *
     * @return the referenceName value
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set reference dataset name.
     *
     * @param referenceName the referenceName value to set
     * @return the DatasetReference object itself.
     */
    public DatasetReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get arguments for dataset.
     *
     * @return the parameters value
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set arguments for dataset.
     *
     * @param parameters the parameters value to set
     * @return the DatasetReference object itself.
     */
    public DatasetReference withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

}
