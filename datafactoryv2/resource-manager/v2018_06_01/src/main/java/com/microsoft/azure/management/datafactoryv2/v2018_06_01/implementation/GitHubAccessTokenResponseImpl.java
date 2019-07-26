/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactoryv2.v2018_06_01.GitHubAccessTokenResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class GitHubAccessTokenResponseImpl extends WrapperImpl<GitHubAccessTokenResponseInner> implements GitHubAccessTokenResponse {
    private final DataFactoryManager manager;
    GitHubAccessTokenResponseImpl(GitHubAccessTokenResponseInner inner, DataFactoryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public String gitHubAccessToken() {
        return this.inner().gitHubAccessToken();
    }

}
