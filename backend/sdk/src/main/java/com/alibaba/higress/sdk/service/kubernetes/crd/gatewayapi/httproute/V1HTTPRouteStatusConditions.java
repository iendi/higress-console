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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Condition contains details for one aspect of the current state of this API Resource. --- This struct is intended for direct use as an array at the field path .status.conditions.  For example,    type FooStatus struct{      // Represents the observations of a foo&#39;s current state.      // Known .status.conditions.type are: \&quot;Available\&quot;, \&quot;Progressing\&quot;, and \&quot;Degraded\&quot;      // +patchMergeKey&#x3D;type      // +patchStrategy&#x3D;merge      // +listType&#x3D;map      // +listMapKey&#x3D;type      Conditions []metav1.Condition &#x60;json:\&quot;conditions,omitempty\&quot; patchStrategy:\&quot;merge\&quot; patchMergeKey:\&quot;type\&quot; protobuf:\&quot;bytes,1,rep,name&#x3D;conditions\&quot;&#x60;        // other fields  }
 */
@Data
public class V1HTTPRouteStatusConditions {
  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  /**
   * status of the condition, one of True, False, Unknown.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    TRUE("True"),
    
    FALSE("False"),
    
    UNKNOWN("Unknown");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPRouteStatusConditions v1HTTPRouteStatusConditions = (V1HTTPRouteStatusConditions) o;
    return Objects.equals(this.lastTransitionTime, v1HTTPRouteStatusConditions.lastTransitionTime) &&
        Objects.equals(this.message, v1HTTPRouteStatusConditions.message) &&
        Objects.equals(this.observedGeneration, v1HTTPRouteStatusConditions.observedGeneration) &&
        Objects.equals(this.reason, v1HTTPRouteStatusConditions.reason) &&
        Objects.equals(this.status, v1HTTPRouteStatusConditions.status) &&
        Objects.equals(this.type, v1HTTPRouteStatusConditions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, observedGeneration, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPRouteStatusConditions {\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
