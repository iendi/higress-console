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
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Listener embodies the concept of a logical endpoint where a Gateway accepts network connections.
 */
@Data
public class V1GatewaySpecListeners {
    public static final String SERIALIZED_NAME_ALLOWED_ROUTES = "allowedRoutes";
    public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
    public static final String SERIALIZED_NAME_NAME = "name";
    public static final String SERIALIZED_NAME_PORT = "port";
    public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
    public static final String SERIALIZED_NAME_TLS = "tls";
    @SerializedName(SERIALIZED_NAME_ALLOWED_ROUTES)
    private V1GatewaySpecAllowedRoutes allowedRoutes;
    @SerializedName(SERIALIZED_NAME_HOSTNAME)
    private String hostname;
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;
    @SerializedName(SERIALIZED_NAME_PROTOCOL)
    private String protocol;
    @SerializedName(SERIALIZED_NAME_TLS)
    private V1GatewaySpecTls tls;

    @NotNull
    public static V1GatewaySpecTls getDefaultTls(String cert) {
        V1GatewaySpecTls tls = new V1GatewaySpecTls();
        List<V1GatewaySpecTlsCertificateRefs> certificateRefs = new ArrayList<>();
        V1GatewaySpecTlsCertificateRefs certificateRef = new V1GatewaySpecTlsCertificateRefs();
        certificateRef.setKind("Secret");
        certificateRef.setName(cert);
        certificateRefs.add(certificateRef);
        tls.setCertificateRefs(certificateRefs);
        tls.setMode(V1GatewaySpecTls.ModeEnum.TERMINATE);
        return tls;
    }

    @NotNull
    public static V1GatewaySpecAllowedRoutes getDefaultAllowedRoutes() {
        V1GatewaySpecAllowedRoutes allowedRoute = new V1GatewaySpecAllowedRoutes();
        V1GatewaySpecAllowedRoutesNamespaces ns = new V1GatewaySpecAllowedRoutesNamespaces();
        ns.setFrom(V1GatewaySpecAllowedRoutesNamespaces.FromEnum.ALL);
        allowedRoute.setNamespaces(ns);
        return allowedRoute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1GatewaySpecListeners v1GatewaySpecListeners = (V1GatewaySpecListeners) o;
        return Objects.equals(this.allowedRoutes, v1GatewaySpecListeners.allowedRoutes) &&
                Objects.equals(this.hostname, v1GatewaySpecListeners.hostname) &&
                Objects.equals(this.name, v1GatewaySpecListeners.name) &&
                Objects.equals(this.port, v1GatewaySpecListeners.port) &&
                Objects.equals(this.protocol, v1GatewaySpecListeners.protocol) &&
                Objects.equals(this.tls, v1GatewaySpecListeners.tls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedRoutes, hostname, name, port, protocol, tls);
    }


    @Override
    public String toString() {
        String sb = "class V1beta1GatewaySpecListeners {\n" +
                "    allowedRoutes: " + toIndentedString(allowedRoutes) + "\n" +
                "    hostname: " + toIndentedString(hostname) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    port: " + toIndentedString(port) + "\n" +
                "    protocol: " + toIndentedString(protocol) + "\n" +
                "    tls: " + toIndentedString(tls) + "\n" +
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

