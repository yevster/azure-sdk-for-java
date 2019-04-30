/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SnapshotApplyMode.
 */
public enum SnapshotApplyMode {
    /** Enum value CreateNew. */
    CREATE_NEW("CreateNew");

    /** The actual serialized value for a SnapshotApplyMode instance. */
    private String value;

    SnapshotApplyMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SnapshotApplyMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SnapshotApplyMode object, or null if unable to parse.
     */
    @JsonCreator
    public static SnapshotApplyMode fromString(String value) {
        SnapshotApplyMode[] items = SnapshotApplyMode.values();
        for (SnapshotApplyMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
