/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AuthenticationType.
 */
public final class AuthenticationType extends ExpandableStringEnum<AuthenticationType> {
    /** Static value None for AuthenticationType. */
    public static final AuthenticationType NONE = fromString("None");

    /** Static value WindowsAuthentication for AuthenticationType. */
    public static final AuthenticationType WINDOWS_AUTHENTICATION = fromString("WindowsAuthentication");

    /** Static value SqlAuthentication for AuthenticationType. */
    public static final AuthenticationType SQL_AUTHENTICATION = fromString("SqlAuthentication");

    /** Static value ActiveDirectoryIntegrated for AuthenticationType. */
    public static final AuthenticationType ACTIVE_DIRECTORY_INTEGRATED = fromString("ActiveDirectoryIntegrated");

    /** Static value ActiveDirectoryPassword for AuthenticationType. */
    public static final AuthenticationType ACTIVE_DIRECTORY_PASSWORD = fromString("ActiveDirectoryPassword");

    /**
     * Creates or finds a AuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding AuthenticationType
     */
    @JsonCreator
    public static AuthenticationType fromString(String name) {
        return fromString(name, AuthenticationType.class);
    }

    /**
     * @return known AuthenticationType values
     */
    public static Collection<AuthenticationType> values() {
        return values(AuthenticationType.class);
    }
}
