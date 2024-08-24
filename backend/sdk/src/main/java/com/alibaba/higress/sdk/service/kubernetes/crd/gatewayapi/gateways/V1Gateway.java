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


package com.alibaba.higress.sdk.service.kubernetes.crd.gatewayapi.gateways;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Objects;

/**
 * Gateway represents an instance of a service-traffic handling infrastructure by binding Listeners to a set of IP addresses.
 */
@Data
public class V1Gateway implements io.kubernetes.client.common.KubernetesObject {
  public static final String API_GROUP = "gateway.networking.k8s.io";
  public static final String VERSION = "v1";
  public static final String KIND = "Gateway";
  public static final String PLURAL = "gateways";

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion = API_GROUP + "/" + VERSION;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind = KIND;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata = null;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1GatewaySpec spec;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private V1GatewayStatus status;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Gateway v1Gateway = (V1Gateway) o;
    return Objects.equals(this.apiVersion, v1Gateway.apiVersion) &&
        Objects.equals(this.kind, v1Gateway.kind) &&
        Objects.equals(this.metadata, v1Gateway.metadata) &&
        Objects.equals(this.spec, v1Gateway.spec) &&
        Objects.equals(this.status, v1Gateway.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Gateway {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

