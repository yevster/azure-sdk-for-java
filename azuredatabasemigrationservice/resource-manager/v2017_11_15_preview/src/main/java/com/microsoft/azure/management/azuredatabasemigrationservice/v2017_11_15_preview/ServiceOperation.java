/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.implementation.DataMigrationManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.implementation.ServiceOperationInner;

/**
 * Type representing ServiceOperation.
 */
public interface ServiceOperation extends HasInner<ServiceOperationInner>, HasManager<DataMigrationManager> {
    /**
     * @return the display value.
     */
    ServiceOperationDisplay display();

    /**
     * @return the name value.
     */
    String name();

}
