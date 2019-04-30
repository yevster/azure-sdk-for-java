/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that validates connection to PostgreSQL and source server
 * requirements.
 */
public class ConnectToSourcePostgreSqlSyncTaskInput {
    /**
     * Connection information for source PostgreSQL server.
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private PostgreSqlConnectionInfo sourceConnectionInfo;

    /**
     * Get connection information for source PostgreSQL server.
     *
     * @return the sourceConnectionInfo value
     */
    public PostgreSqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set connection information for source PostgreSQL server.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set
     * @return the ConnectToSourcePostgreSqlSyncTaskInput object itself.
     */
    public ConnectToSourcePostgreSqlSyncTaskInput withSourceConnectionInfo(PostgreSqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

}
