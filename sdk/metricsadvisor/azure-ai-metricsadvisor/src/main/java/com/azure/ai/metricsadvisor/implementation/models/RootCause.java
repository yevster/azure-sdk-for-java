// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RootCause model. */
@Fluent
public final class RootCause {
    /*
     * The rootCause property.
     */
    @JsonProperty(value = "rootCause", required = true)
    private DimensionGroupIdentity rootCause;

    /*
     * drilling down path from query anomaly to root cause
     */
    @JsonProperty(value = "path", required = true)
    private List<String> path;

    /*
     * score
     */
    @JsonProperty(value = "score", required = true)
    private double score;

    /*
     * description
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Get the rootCause property: The rootCause property.
     *
     * @return the rootCause value.
     */
    public DimensionGroupIdentity getRootCause() {
        return this.rootCause;
    }

    /**
     * Set the rootCause property: The rootCause property.
     *
     * @param rootCause the rootCause value to set.
     * @return the RootCause object itself.
     */
    public RootCause setRootCause(DimensionGroupIdentity rootCause) {
        this.rootCause = rootCause;
        return this;
    }

    /**
     * Get the path property: drilling down path from query anomaly to root cause.
     *
     * @return the path value.
     */
    public List<String> getPath() {
        return this.path;
    }

    /**
     * Set the path property: drilling down path from query anomaly to root cause.
     *
     * @param path the path value to set.
     * @return the RootCause object itself.
     */
    public RootCause setPath(List<String> path) {
        this.path = path;
        return this;
    }

    /**
     * Get the score property: score.
     *
     * @return the score value.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Set the score property: score.
     *
     * @param score the score value to set.
     * @return the RootCause object itself.
     */
    public RootCause setScore(double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the description property: description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: description.
     *
     * @param description the description value to set.
     * @return the RootCause object itself.
     */
    public RootCause setDescription(String description) {
        this.description = description;
        return this;
    }
}
