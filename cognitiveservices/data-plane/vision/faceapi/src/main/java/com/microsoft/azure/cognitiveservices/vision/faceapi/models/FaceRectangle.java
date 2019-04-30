/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A rectangle within which a face can be found.
 */
public class FaceRectangle {
    /**
     * The width of the rectangle, in pixels.
     */
    @JsonProperty(value = "width", required = true)
    private int width;

    /**
     * The height of the rectangle, in pixels.
     */
    @JsonProperty(value = "height", required = true)
    private int height;

    /**
     * The distance from the left edge if the image to the left edge of the
     * rectangle, in pixels.
     */
    @JsonProperty(value = "left", required = true)
    private int left;

    /**
     * The distance from the top edge if the image to the top edge of the
     * rectangle, in pixels.
     */
    @JsonProperty(value = "top", required = true)
    private int top;

    /**
     * Get the width of the rectangle, in pixels.
     *
     * @return the width value
     */
    public int width() {
        return this.width;
    }

    /**
     * Set the width of the rectangle, in pixels.
     *
     * @param width the width value to set
     * @return the FaceRectangle object itself.
     */
    public FaceRectangle withWidth(int width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height of the rectangle, in pixels.
     *
     * @return the height value
     */
    public int height() {
        return this.height;
    }

    /**
     * Set the height of the rectangle, in pixels.
     *
     * @param height the height value to set
     * @return the FaceRectangle object itself.
     */
    public FaceRectangle withHeight(int height) {
        this.height = height;
        return this;
    }

    /**
     * Get the distance from the left edge if the image to the left edge of the rectangle, in pixels.
     *
     * @return the left value
     */
    public int left() {
        return this.left;
    }

    /**
     * Set the distance from the left edge if the image to the left edge of the rectangle, in pixels.
     *
     * @param left the left value to set
     * @return the FaceRectangle object itself.
     */
    public FaceRectangle withLeft(int left) {
        this.left = left;
        return this;
    }

    /**
     * Get the distance from the top edge if the image to the top edge of the rectangle, in pixels.
     *
     * @return the top value
     */
    public int top() {
        return this.top;
    }

    /**
     * Set the distance from the top edge if the image to the top edge of the rectangle, in pixels.
     *
     * @param top the top value to set
     * @return the FaceRectangle object itself.
     */
    public FaceRectangle withTop(int top) {
        this.top = top;
        return this;
    }

}
