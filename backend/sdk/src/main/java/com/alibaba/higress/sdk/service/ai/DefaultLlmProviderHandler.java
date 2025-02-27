/*
 * Copyright (c) 2022-2023 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.alibaba.higress.sdk.service.ai;

import java.util.Map;

import com.alibaba.higress.sdk.service.kubernetes.crd.mcp.V1McpBridge;

class DefaultLlmProviderHandler extends AbstractLlmProviderHandler {

    private final String type;
    private final String domain;
    private final int port;
    private final String protocol;

    DefaultLlmProviderHandler(String type, String domain, int port, String protocol) {
        this.type = type;
        this.domain = domain;
        this.port = port;
        this.protocol = protocol;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    protected String getServiceRegistryType(Map<String, Object> providerConfig) {
        return V1McpBridge.REGISTRY_TYPE_DNS;
    }

    @Override
    protected String getServiceDomain(Map<String, Object> providerConfig) {
        return domain;
    }

    @Override
    protected int getServicePort(Map<String, Object> providerConfig) {
        return port;
    }

    @Override
    protected String getServiceProtocol(Map<String, Object> providerConfig) {
        return protocol;
    }
}
