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
 * ExtensionRef is an optional, implementation-specific extension to the \&quot;filter\&quot; behavior.  For example, resource \&quot;myroutefilter\&quot; in group \&quot;networking.example.net\&quot;). ExtensionRef MUST NOT be used for core and extended filters.   This filter can be used multiple times within the same rule.   Support: Implementation-specific
 */
@Data
public class V1HTTPRouteSpecExtensionRef {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPRouteSpecExtensionRef v1HTTPRouteSpecExtensionRef = (V1HTTPRouteSpecExtensionRef) o;
    return Objects.equals(this.group, v1HTTPRouteSpecExtensionRef.group) &&
        Objects.equals(this.kind, v1HTTPRouteSpecExtensionRef.kind) &&
        Objects.equals(this.name, v1HTTPRouteSpecExtensionRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPRouteSpecExtensionRef {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

