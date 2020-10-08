// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.ai.metricsadvisor.models.AnomalyValue;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AnomalyFeedbackValue model. */
@Fluent
public final class AnomalyFeedbackValue {
    /*
     * The anomalyValue property.
     */
    @JsonProperty(value = "anomalyValue", required = true)
    private AnomalyValue anomalyValue;

    /**
     * Get the anomalyValue property: The anomalyValue property.
     *
     * @return the anomalyValue value.
     */
    public AnomalyValue getAnomalyValue() {
        return this.anomalyValue;
    }

    /**
     * Set the anomalyValue property: The anomalyValue property.
     *
     * @param anomalyValue the anomalyValue value to set.
     * @return the AnomalyFeedbackValue object itself.
     */
    public AnomalyFeedbackValue setAnomalyValue(AnomalyValue anomalyValue) {
        this.anomalyValue = anomalyValue;
        return this;
    }
}
