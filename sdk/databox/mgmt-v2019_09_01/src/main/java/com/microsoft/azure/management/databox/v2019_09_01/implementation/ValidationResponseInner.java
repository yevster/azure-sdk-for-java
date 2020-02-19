/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01.implementation;

import com.microsoft.azure.management.databox.v2019_09_01.OverallValidationStatus;
import java.util.List;
import com.microsoft.azure.management.databox.v2019_09_01.ValidationInputResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Response of pre job creation validations.
 */
@JsonFlatten
public class ValidationResponseInner {
    /**
     * Overall validation status. Possible values include: 'AllValidToProceed',
     * 'InputsRevisitRequired', 'CertainInputValidationsSkipped'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private OverallValidationStatus status;

    /**
     * List of response details contain validationType and its response as key
     * and value respectively.
     */
    @JsonProperty(value = "properties.individualResponseDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<ValidationInputResponse> individualResponseDetails;

    /**
     * Get overall validation status. Possible values include: 'AllValidToProceed', 'InputsRevisitRequired', 'CertainInputValidationsSkipped'.
     *
     * @return the status value
     */
    public OverallValidationStatus status() {
        return this.status;
    }

    /**
     * Get list of response details contain validationType and its response as key and value respectively.
     *
     * @return the individualResponseDetails value
     */
    public List<ValidationInputResponse> individualResponseDetails() {
        return this.individualResponseDetails;
    }

}