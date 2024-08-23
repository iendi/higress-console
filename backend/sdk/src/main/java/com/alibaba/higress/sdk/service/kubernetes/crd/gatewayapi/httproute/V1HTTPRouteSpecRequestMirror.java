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
 * RequestMirror defines a schema for a filter that mirrors requests. Requests are sent to the specified destination, but responses from that destination are ignored.   This filter can be used multiple times within the same rule. Note that not all implementations will be able to support mirroring to multiple backends.   Support: Extended
 */
@Data
public class V1HTTPRouteSpecRequestMirror {
  public static final String SERIALIZED_NAME_BACKEND_REF = "backendRef";
  @SerializedName(SERIALIZED_NAME_BACKEND_REF)
  private V1HTTPRouteSpecRequestMirrorBackendRef backendRef;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPRouteSpecRequestMirror v1HTTPRouteSpecRequestMirror = (V1HTTPRouteSpecRequestMirror) o;
    return Objects.equals(this.backendRef, v1HTTPRouteSpecRequestMirror.backendRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPRouteSpecRequestMirror {\n");
    sb.append("    backendRef: ").append(toIndentedString(backendRef)).append("\n");
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

