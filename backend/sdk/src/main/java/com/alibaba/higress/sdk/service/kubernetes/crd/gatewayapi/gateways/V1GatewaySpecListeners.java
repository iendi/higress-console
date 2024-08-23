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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Objects;

/**
 * Listener embodies the concept of a logical endpoint where a Gateway accepts network connections.
 */
@Data
public class V1GatewaySpecListeners {
  public static final String SERIALIZED_NAME_ALLOWED_ROUTES = "allowedRoutes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ROUTES)
  private V1GatewaySpecAllowedRoutes allowedRoutes;


  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private V1GatewaySpecTls tls;


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
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1GatewaySpecListeners {\n");
    sb.append("    allowedRoutes: ").append(toIndentedString(allowedRoutes)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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

