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
 * ParentRef corresponds with a ParentRef in the spec that this RouteParentStatus struct describes the status of.
 */
@Data
public class V1HTTPRouteStatusParentRef {
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

  public static final String SERIALIZED_NAME_SECTION_NAME = "sectionName";
  @SerializedName(SERIALIZED_NAME_SECTION_NAME)
  private String sectionName;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPRouteStatusParentRef v1HTTPRouteStatusParentRef = (V1HTTPRouteStatusParentRef) o;
    return Objects.equals(this.group, v1HTTPRouteStatusParentRef.group) &&
        Objects.equals(this.kind, v1HTTPRouteStatusParentRef.kind) &&
        Objects.equals(this.name, v1HTTPRouteStatusParentRef.name) &&
        Objects.equals(this.namespace, v1HTTPRouteStatusParentRef.namespace) &&
        Objects.equals(this.port, v1HTTPRouteStatusParentRef.port) &&
        Objects.equals(this.sectionName, v1HTTPRouteStatusParentRef.sectionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, name, namespace, port, sectionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPRouteStatusParentRef {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
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

