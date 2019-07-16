/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerBlobAuditingPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerBlobAuditingPolicy;

class ServerBlobAuditingPoliciesImpl extends WrapperImpl<ServerBlobAuditingPoliciesInner> implements ServerBlobAuditingPolicies {
    private final SqlManager manager;

    ServerBlobAuditingPoliciesImpl(SqlManager manager) {
        super(manager.inner().serverBlobAuditingPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ServerBlobAuditingPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ServerBlobAuditingPolicyImpl wrapModel(ServerBlobAuditingPolicyInner inner) {
        return  new ServerBlobAuditingPolicyImpl(inner, manager());
    }

    private ServerBlobAuditingPolicyImpl wrapModel(String name) {
        return new ServerBlobAuditingPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ServerBlobAuditingPolicy> listByServerAsync(final String resourceGroupName, final String serverName) {
        ServerBlobAuditingPoliciesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<ServerBlobAuditingPolicyInner>, Iterable<ServerBlobAuditingPolicyInner>>() {
            @Override
            public Iterable<ServerBlobAuditingPolicyInner> call(Page<ServerBlobAuditingPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServerBlobAuditingPolicyInner, ServerBlobAuditingPolicy>() {
            @Override
            public ServerBlobAuditingPolicy call(ServerBlobAuditingPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerBlobAuditingPolicy> getAsync(String resourceGroupName, String serverName) {
        ServerBlobAuditingPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName)
        .map(new Func1<ServerBlobAuditingPolicyInner, ServerBlobAuditingPolicy>() {
            @Override
            public ServerBlobAuditingPolicy call(ServerBlobAuditingPolicyInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
