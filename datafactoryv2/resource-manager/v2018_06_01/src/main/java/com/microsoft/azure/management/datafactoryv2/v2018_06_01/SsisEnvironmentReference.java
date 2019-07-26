/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ssis environment reference.
 */
public class SsisEnvironmentReference {
    /**
     * Environment reference id.
     */
    @JsonProperty(value = "id")
    private Long id;

    /**
     * Environment folder name.
     */
    @JsonProperty(value = "environmentFolderName")
    private String environmentFolderName;

    /**
     * Environment name.
     */
    @JsonProperty(value = "environmentName")
    private String environmentName;

    /**
     * Reference type.
     */
    @JsonProperty(value = "referenceType")
    private String referenceType;

    /**
     * Get environment reference id.
     *
     * @return the id value
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set environment reference id.
     *
     * @param id the id value to set
     * @return the SsisEnvironmentReference object itself.
     */
    public SsisEnvironmentReference withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get environment folder name.
     *
     * @return the environmentFolderName value
     */
    public String environmentFolderName() {
        return this.environmentFolderName;
    }

    /**
     * Set environment folder name.
     *
     * @param environmentFolderName the environmentFolderName value to set
     * @return the SsisEnvironmentReference object itself.
     */
    public SsisEnvironmentReference withEnvironmentFolderName(String environmentFolderName) {
        this.environmentFolderName = environmentFolderName;
        return this;
    }

    /**
     * Get environment name.
     *
     * @return the environmentName value
     */
    public String environmentName() {
        return this.environmentName;
    }

    /**
     * Set environment name.
     *
     * @param environmentName the environmentName value to set
     * @return the SsisEnvironmentReference object itself.
     */
    public SsisEnvironmentReference withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * Get reference type.
     *
     * @return the referenceType value
     */
    public String referenceType() {
        return this.referenceType;
    }

    /**
     * Set reference type.
     *
     * @param referenceType the referenceType value to set
     * @return the SsisEnvironmentReference object itself.
     */
    public SsisEnvironmentReference withReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

}
