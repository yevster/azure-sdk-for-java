/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ServiceTasks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ProjectServiceProjectTask;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ServiceProjectTask;

class ServiceTasksImpl extends WrapperImpl<ServiceTasksInner> implements ServiceTasks {
    private final DataMigrationManager manager;

    ServiceTasksImpl(DataMigrationManager manager) {
        super(manager.inner().serviceTasks());
        this.manager = manager;
    }

    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public ServiceProjectTaskImpl define(String name) {
        return wrapModel(name);
    }

    private ServiceProjectTaskImpl wrapModel(ProjectTaskInner inner) {
        return  new ServiceProjectTaskImpl(inner, manager());
    }

    private ServiceProjectTaskImpl wrapModel(String name) {
        return new ServiceProjectTaskImpl(name, this.manager());
    }

    @Override
    public Observable<ProjectServiceProjectTask> cancelAsync(String groupName, String serviceName, String taskName) {
        ServiceTasksInner client = this.inner();
        return client.cancelAsync(groupName, serviceName, taskName)
        .map(new Func1<ProjectTaskInner, ProjectServiceProjectTask>() {
            @Override
            public ProjectServiceProjectTask call(ProjectTaskInner inner) {
                return new ProjectServiceProjectTaskImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceProjectTask> listAsync(final String groupName, final String serviceName) {
        ServiceTasksInner client = this.inner();
        return client.listAsync(groupName, serviceName)
        .flatMapIterable(new Func1<Page<ProjectTaskInner>, Iterable<ProjectTaskInner>>() {
            @Override
            public Iterable<ProjectTaskInner> call(Page<ProjectTaskInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProjectTaskInner, ServiceProjectTask>() {
            @Override
            public ServiceProjectTask call(ProjectTaskInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServiceProjectTask> getAsync(String groupName, String serviceName, String taskName) {
        ServiceTasksInner client = this.inner();
        return client.getAsync(groupName, serviceName, taskName)
        .map(new Func1<ProjectTaskInner, ServiceProjectTask>() {
            @Override
            public ServiceProjectTask call(ProjectTaskInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String groupName, String serviceName, String taskName) {
        ServiceTasksInner client = this.inner();
        return client.deleteAsync(groupName, serviceName, taskName).toCompletable();
    }

}
