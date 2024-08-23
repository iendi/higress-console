/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alibaba.higress.sdk.service.kubernetes.crd.gatewayapi.httproute;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Objects;

/**
 * BackendRef references a resource where mirrored requests are sent.   Mirrored requests must be sent only to a single destination endpoint within this BackendRef, irrespective of how many endpoints are present within this BackendRef.   If the referent cannot be found, this BackendRef is invalid and must be dropped from the Gateway. The controller must ensure the \&quot;ResolvedRefs\&quot; condition on the Route status is set to &#x60;status: False&#x60; and not configure this backend in the underlying implementation.   If there is a cross-namespace reference to an *existing* object that is not allowed by a ReferenceGrant, the controller must ensure the \&quot;ResolvedRefs\&quot;  condition on the Route is set to &#x60;status: False&#x60;, with the \&quot;RefNotPermitted\&quot; reason and not configure this backend in the underlying implementation.   In either error case, the Message of the &#x60;ResolvedRefs&#x60; Condition should be used to provide more detail about the problem.   Support: Extended for Kubernetes Service   Support: Implementation-specific for any other resource
 */
@Data
public class V1HTTPRouteSpecRequestMirrorBackendRef {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPRouteSpecRequestMirrorBackendRef v1HTTPRouteSpecRequestMirrorBackendRef = (V1HTTPRouteSpecRequestMirrorBackendRef) o;
    return Objects.equals(this.group, v1HTTPRouteSpecRequestMirrorBackendRef.group) &&
        Objects.equals(this.kind, v1HTTPRouteSpecRequestMirrorBackendRef.kind) &&
        Objects.equals(this.name, v1HTTPRouteSpecRequestMirrorBackendRef.name) &&
        Objects.equals(this.namespace, v1HTTPRouteSpecRequestMirrorBackendRef.namespace) &&
        Objects.equals(this.port, v1HTTPRouteSpecRequestMirrorBackendRef.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, name, namespace, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPRouteSpecRequestMirrorBackendRef {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("}");
    return sb.toString();
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
