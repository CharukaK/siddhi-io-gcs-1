/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package io.siddhi.extension.io.gcs.sink.internal.util;

import io.siddhi.extension.io.gcs.sink.internal.beans.GCSSinkConfig;
import io.siddhi.extension.io.gcs.sink.internal.beans.StateContainer;
import io.siddhi.extension.io.gcs.util.ServiceClient;

/**
 * Interface for RotationStrategies.
 */
public abstract class RotationStrategy {

    private GCSSinkConfig config;
    private ServiceClient client;
    private StateContainer stateContainer = new StateContainer();

    public abstract void queueEvent(String objectName, Object event);

    public GCSSinkConfig getConfig() {
        return config;
    }

    public ServiceClient getClient() {
        return client;
    }

    public void setConfig(GCSSinkConfig config) {
        this.config = config;
    }

    public void setClient(ServiceClient client) {
        this.client = client;
    }

    public StateContainer getStateContainer() {
        return stateContainer;
    }
}
