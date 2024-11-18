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
package com.alibaba.higress.sdk.service.strategy.route;

import com.alibaba.higress.sdk.model.Route;

public class RouteContext {

    private final RouteStrategy strategy;

    public RouteContext(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public Route add(Route route) {
        return strategy.add(route);
    }

    public Route update(Route route) {
        return strategy.update(route);
    }

    public void delete(String name) {
        strategy.delete(name);
    }
}
