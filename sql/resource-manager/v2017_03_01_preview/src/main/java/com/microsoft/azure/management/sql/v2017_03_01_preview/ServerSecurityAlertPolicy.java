/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.ServerSecurityAlertPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing ServerSecurityAlertPolicy.
 */
public interface ServerSecurityAlertPolicy extends HasInner<ServerSecurityAlertPolicyInner>, Indexable, Refreshable<ServerSecurityAlertPolicy>, Updatable<ServerSecurityAlertPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the disabledAlerts value.
     */
    List<String> disabledAlerts();

    /**
     * @return the emailAccountAdmins value.
     */
    Boolean emailAccountAdmins();

    /**
     * @return the emailAddresses value.
     */
    List<String> emailAddresses();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the retentionDays value.
     */
    Integer retentionDays();

    /**
     * @return the state value.
     */
    SecurityAlertPolicyState state();

    /**
     * @return the storageAccountAccessKey value.
     */
    String storageAccountAccessKey();

    /**
     * @return the storageEndpoint value.
     */
    String storageEndpoint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ServerSecurityAlertPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithState, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServerSecurityAlertPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServerSecurityAlertPolicy definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            */
            WithState withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify State.
         */
        interface WithState {
           /**
            * Specifies state.
            */
            WithCreate withState(SecurityAlertPolicyState state);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify DisabledAlerts.
         */
        interface WithDisabledAlerts {
            /**
             * Specifies disabledAlerts.
             */
            WithCreate withDisabledAlerts(List<String> disabledAlerts);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify EmailAccountAdmins.
         */
        interface WithEmailAccountAdmins {
            /**
             * Specifies emailAccountAdmins.
             */
            WithCreate withEmailAccountAdmins(Boolean emailAccountAdmins);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify EmailAddresses.
         */
        interface WithEmailAddresses {
            /**
             * Specifies emailAddresses.
             */
            WithCreate withEmailAddresses(List<String> emailAddresses);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             */
            WithCreate withRetentionDays(Integer retentionDays);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify StorageAccountAccessKey.
         */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies storageAccountAccessKey.
             */
            WithCreate withStorageAccountAccessKey(String storageAccountAccessKey);
        }

        /**
         * The stage of the serversecurityalertpolicy definition allowing to specify StorageEndpoint.
         */
        interface WithStorageEndpoint {
            /**
             * Specifies storageEndpoint.
             */
            WithCreate withStorageEndpoint(String storageEndpoint);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServerSecurityAlertPolicy>, DefinitionStages.WithDisabledAlerts, DefinitionStages.WithEmailAccountAdmins, DefinitionStages.WithEmailAddresses, DefinitionStages.WithRetentionDays, DefinitionStages.WithStorageAccountAccessKey, DefinitionStages.WithStorageEndpoint {
        }
    }
    /**
     * The template for a ServerSecurityAlertPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServerSecurityAlertPolicy>, UpdateStages.WithDisabledAlerts, UpdateStages.WithEmailAccountAdmins, UpdateStages.WithEmailAddresses, UpdateStages.WithRetentionDays, UpdateStages.WithStorageAccountAccessKey, UpdateStages.WithStorageEndpoint {
    }

    /**
     * Grouping of ServerSecurityAlertPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the serversecurityalertpolicy update allowing to specify DisabledAlerts.
         */
        interface WithDisabledAlerts {
            /**
             * Specifies disabledAlerts.
             */
            Update withDisabledAlerts(List<String> disabledAlerts);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify EmailAccountAdmins.
         */
        interface WithEmailAccountAdmins {
            /**
             * Specifies emailAccountAdmins.
             */
            Update withEmailAccountAdmins(Boolean emailAccountAdmins);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify EmailAddresses.
         */
        interface WithEmailAddresses {
            /**
             * Specifies emailAddresses.
             */
            Update withEmailAddresses(List<String> emailAddresses);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             */
            Update withRetentionDays(Integer retentionDays);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify StorageAccountAccessKey.
         */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies storageAccountAccessKey.
             */
            Update withStorageAccountAccessKey(String storageAccountAccessKey);
        }

        /**
         * The stage of the serversecurityalertpolicy update allowing to specify StorageEndpoint.
         */
        interface WithStorageEndpoint {
            /**
             * Specifies storageEndpoint.
             */
            Update withStorageEndpoint(String storageEndpoint);
        }

    }
}
