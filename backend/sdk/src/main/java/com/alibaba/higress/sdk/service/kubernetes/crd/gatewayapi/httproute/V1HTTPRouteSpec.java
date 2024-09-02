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
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Spec defines the desired state of HTTPRoute.
 */
@Data
public class V1HTTPRouteSpec {
  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";
  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames = null;

  public static final String SERIALIZED_NAME_PARENT_REFS = "parentRefs";
  @SerializedName(SERIALIZED_NAME_PARENT_REFS)
  private List<V1HTTPRouteSpecParentRefs> parentRefs = null;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1HTTPRouteSpecRules> rules = null;

  public V1HTTPRouteSpec addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

  public V1HTTPRouteSpec addParentRefsItem(V1HTTPRouteSpecParentRefs parentRefsItem) {
    if (this.parentRefs == null) {
      this.parentRefs = new ArrayList<>();
    }
    this.parentRefs.add(parentRefsItem);
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
    V1HTTPRouteSpec v1HttpRouteSpec = (V1HTTPRouteSpec) o;
    return Objects.equals(this.hostnames, v1HttpRouteSpec.hostnames) &&
        Objects.equals(this.parentRefs, v1HttpRouteSpec.parentRefs) &&
        Objects.equals(this.rules, v1HttpRouteSpec.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, parentRefs, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPRouteSpec {\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    parentRefs: ").append(toIndentedString(parentRefs)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

