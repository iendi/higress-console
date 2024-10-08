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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import lombok.Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * TLS is the TLS configuration for the Listener. This field is required if the Protocol field is \&quot;HTTPS\&quot; or \&quot;TLS\&quot;. It is invalid to set this field if the Protocol field is \&quot;HTTP\&quot;, \&quot;TCP\&quot;, or \&quot;UDP\&quot;.   The association of SNIs to Certificate defined in GatewayTLSConfig is defined based on the Hostname field for this listener.   The GatewayClass MUST use the longest matching SNI out of all available certificates for any TLS handshake.   Support: Core
 */
@Data
public class V1GatewaySpecTls {
    public static final String SERIALIZED_NAME_CERTIFICATE_REFS = "certificateRefs";
    public static final String SERIALIZED_NAME_MODE = "mode";
    public static final String SERIALIZED_NAME_OPTIONS = "options";
    @SerializedName(SERIALIZED_NAME_CERTIFICATE_REFS)
    private List<V1GatewaySpecTlsCertificateRefs> certificateRefs = null;
    @SerializedName(SERIALIZED_NAME_MODE)
    private ModeEnum mode;
    @SerializedName(SERIALIZED_NAME_OPTIONS)
    private Map<String, String> options = null;

    public V1GatewaySpecTls addCertificateRefsItem(V1GatewaySpecTlsCertificateRefs certificateRefsItem) {
        if (this.certificateRefs == null) {
            this.certificateRefs = new ArrayList<>();
        }
        this.certificateRefs.add(certificateRefsItem);
        return this;
    }

    /**
     * CertificateRefs contains a series of references to Kubernetes objects that contains TLS certificates and private keys. These certificates are used to establish a TLS handshake for requests that match the hostname of the associated listener.   A single CertificateRef to a Kubernetes Secret has \&quot;Core\&quot; support. Implementations MAY choose to support attaching multiple certificates to a Listener, but this behavior is implementation-specific.   References to a resource in different namespace are invalid UNLESS there is a ReferenceGrant in the target namespace that allows the certificate to be attached. If a ReferenceGrant does not allow this reference, the \&quot;ResolvedRefs\&quot; condition MUST be set to False for this listener with the \&quot;RefNotPermitted\&quot; reason.   This field is required to have at least one element when the mode is set to \&quot;Terminate\&quot; (default) and is optional otherwise.   CertificateRefs can reference to standard Kubernetes resources, i.e. Secret, or implementation-specific custom resources.   Support: Core - A single reference to a Kubernetes Secret of type kubernetes.io/tls   Support: Implementation-specific (More than one reference or other resource types)
     *
     * @return certificateRefs
     **/

    public V1GatewaySpecTls putOptionsItem(String key, String optionsItem) {
        if (this.options == null) {
            this.options = new HashMap<>();
        }
        this.options.put(key, optionsItem);
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
        V1GatewaySpecTls v1GatewaySpecTls = (V1GatewaySpecTls) o;
        return Objects.equals(this.certificateRefs, v1GatewaySpecTls.certificateRefs) &&
                Objects.equals(this.mode, v1GatewaySpecTls.mode) &&
                Objects.equals(this.options, v1GatewaySpecTls.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateRefs, mode, options);
    }

    @Override
    public String toString() {
        String sb = "class V1beta1GatewaySpecTls {\n" +
                "    certificateRefs: " + toIndentedString(certificateRefs) + "\n" +
                "    mode: " + toIndentedString(mode) + "\n" +
                "    options: " + toIndentedString(options) + "\n" +
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

    /**
     * Mode defines the TLS behavior for the TLS session initiated by the client. There are two possible modes:   - Terminate: The TLS session between the downstream client and the   Gateway is terminated at the Gateway. This mode requires certificates   to be specified in some way, such as populating the certificateRefs   field. - Passthrough: The TLS session is NOT terminated by the Gateway. This   implies that the Gateway can&#39;t decipher the TLS stream except for   the ClientHello message of the TLS protocol. The certificateRefs field   is ignored in this mode.   Support: Core
     */
    @JsonAdapter(ModeEnum.Adapter.class)
    public enum ModeEnum {
        /**
         * The TLS session between the downstream client and the Gateway is terminated at the Gateway.
         * This mode requires certificates to be specified in some way, such as populating the certificateRefs field.
         */
        TERMINATE("Terminate"),
        /**
         * The TLS session is NOT terminated by the Gateway.
         * This implies that the Gateway can't decipher the TLS stream except for the ClientHello message of the TLS protocol.
         * The certificateRefs field is ignored in this mode.
         */
        PASSTHROUGH("Passthrough");

        private final String value;

        ModeEnum(String value) {
            this.value = value;
        }

        public static ModeEnum fromValue(String value) {
            for (ModeEnum b : ModeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<ModeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ModeEnum.fromValue(value);
            }
        }
    }

}

