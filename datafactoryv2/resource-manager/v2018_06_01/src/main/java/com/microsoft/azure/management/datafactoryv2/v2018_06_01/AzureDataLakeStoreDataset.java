/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DatasetInner;

/**
 * Azure Data Lake Store dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreFile")
@JsonFlatten
public class AzureDataLakeStoreDataset extends DatasetInner {
    /**
     * Path to the folder in the Azure Data Lake Store. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath")
    private Object folderPath;

    /**
     * The name of the file in the Azure Data Lake Store. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.fileName")
    private Object fileName;

    /**
     * The format of the Data Lake Store.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /**
     * The data compression method used for the item(s) in the Azure Data Lake
     * Store.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /**
     * Get path to the folder in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     *
     * @return the folderPath value
     */
    public Object folderPath() {
        return this.folderPath;
    }

    /**
     * Set path to the folder in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     *
     * @param folderPath the folderPath value to set
     * @return the AzureDataLakeStoreDataset object itself.
     */
    public AzureDataLakeStoreDataset withFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the name of the file in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     *
     * @return the fileName value
     */
    public Object fileName() {
        return this.fileName;
    }

    /**
     * Set the name of the file in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     *
     * @param fileName the fileName value to set
     * @return the AzureDataLakeStoreDataset object itself.
     */
    public AzureDataLakeStoreDataset withFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the format of the Data Lake Store.
     *
     * @return the format value
     */
    public DatasetStorageFormat format() {
        return this.format;
    }

    /**
     * Set the format of the Data Lake Store.
     *
     * @param format the format value to set
     * @return the AzureDataLakeStoreDataset object itself.
     */
    public AzureDataLakeStoreDataset withFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the data compression method used for the item(s) in the Azure Data Lake Store.
     *
     * @return the compression value
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the data compression method used for the item(s) in the Azure Data Lake Store.
     *
     * @param compression the compression value to set
     * @return the AzureDataLakeStoreDataset object itself.
     */
    public AzureDataLakeStoreDataset withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

}
