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


package com.alibaba.higress.sdk.service.kubernetes.crd.gatewayapi.gatewayclass;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Objects;

/**
 * Spec defines the desired state of GatewayClass.
 */
@Data
public class V1GatewayClassSpec {
  public static final String CONTROLLER_NAME = "higress.io/gateway-controller";

  public static final String SERIALIZED_NAME_CONTROLLER_NAME = "controllerName";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_NAME)
  private String controllerName = CONTROLLER_NAME;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PARAMETERS_REF = "parametersRef";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_REF)
  private V1GatewayClassSpecParametersRef parametersRef;

}

