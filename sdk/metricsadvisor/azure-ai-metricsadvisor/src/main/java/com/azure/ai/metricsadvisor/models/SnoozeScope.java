// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SnoozeScope. */
public final class SnoozeScope extends ExpandableStringEnum<SnoozeScope> {
    /** Static value Metric for SnoozeScope. */
    public static final SnoozeScope METRIC = fromString("Metric");

    /** Static value Series for SnoozeScope. */
    public static final SnoozeScope SERIES = fromString("Series");

    /**
     * Creates or finds a SnoozeScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SnoozeScope.
     */
    @JsonCreator
    public static SnoozeScope fromString(String name) {
        return fromString(name, SnoozeScope.class);
    }

    /** @return known SnoozeScope values. */
    public static Collection<SnoozeScope> values() {
        return values(SnoozeScope.class);
    }
}
