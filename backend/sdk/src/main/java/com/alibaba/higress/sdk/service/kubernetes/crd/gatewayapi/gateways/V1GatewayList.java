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


package com.alibaba.higress.sdk.service.kubernetes.crd.gatewayapi.gateways;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.openapi.models.V1ListMeta;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GatewayList is a list of Gateway
 */
@Data
public class V1GatewayList implements io.kubernetes.client.common.KubernetesListObject {
    public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
    public static final String SERIALIZED_NAME_ITEMS = "items";
    public static final String SERIALIZED_NAME_KIND = "kind";
    public static final String SERIALIZED_NAME_METADATA = "metadata";
    @SerializedName(SERIALIZED_NAME_API_VERSION)
    private String apiVersion;
    @SerializedName(SERIALIZED_NAME_ITEMS)
    private List<V1Gateway> items = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_KIND)
    private String kind;
    @SerializedName(SERIALIZED_NAME_METADATA)
    private V1ListMeta metadata = null;

    public V1GatewayList addItemsItem(V1Gateway itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1GatewayList v1GatewayList = (V1GatewayList) o;
        return Objects.equals(this.apiVersion, v1GatewayList.apiVersion) &&
                Objects.equals(this.items, v1GatewayList.items) &&
                Objects.equals(this.kind, v1GatewayList.kind) &&
                Objects.equals(this.metadata, v1GatewayList.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, items, kind, metadata);
    }


    @Override
    public String toString() {
        String sb = "class V1beta1GatewayList {\n" +
                "    apiVersion: " + toIndentedString(apiVersion) + "\n" +
                "    items: " + toIndentedString(items) + "\n" +
                "    kind: " + toIndentedString(kind) + "\n" +
                "    metadata: " + toIndentedString(metadata) + "\n" +
                "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

