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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HTTPRouteMatch defines the predicate used to match requests to a given action. Multiple match types are ANDed together, i.e. the match will evaluate to true only if all conditions are satisfied.   For example, the match below will match a HTTP request only if its path starts with &#x60;/foo&#x60; AND it contains the &#x60;version: v1&#x60; header:   &#x60;&#x60;&#x60; match:    path:    value: \&quot;/foo\&quot;  headers:  - name: \&quot;version\&quot;    value \&quot;v1\&quot;   &#x60;&#x60;&#x60;
 */
@Data
public class V1HTTPRouteSpecMatches {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<V1HTTPRouteSpecHeaders> headers = null;

  /**
   * Method specifies HTTP method matcher. When specified, this route will be matched only if the request has the specified method.   Support: Extended
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    /**
     * GET is an HTTP method used to request data from a specified resource.
     * Commonly used to retrieve information.
     */
    GET("GET"),

    /**
     * HEAD is an HTTP method used to request headers from a specified resource.
     * Similar to GET, but without the response body.
     */
    HEAD("HEAD"),

    /**
     * POST is an HTTP method used to send data to a server to create/update a resource.
     * Commonly used for submitting form data or uploading files.
     */
    POST("POST"),

    /**
     * PUT is an HTTP method used to update or create a resource at the specified resource.
     * Typically used for updating existing resources.
     */
    PUT("PUT"),

    /**
     * DELETE is an HTTP method used to delete a specified resource.
     * Used for removing resources from the server.
     */
    DELETE("DELETE"),

    /**
     * CONNECT is an HTTP method used to establish a tunnel to the server identified by the target resource.
     * Commonly used for tunneling HTTP requests over a network.
     */
    CONNECT("CONNECT"),

    /**
     * OPTIONS is an HTTP method used to describe the communication options for the target resource.
     * Used to determine the capabilities of a server, such as allowed HTTP methods.
     */
    OPTIONS("OPTIONS"),

    /**
     * TRACE is an HTTP method used to perform a message loop-back test along the path to the target resource.
     * Typically used for diagnostic purposes.
     */
    TRACE("TRACE"),

    /**
     * PATCH is an HTTP method used to apply partial modifications to a resource.
     * Often used when you need to update a resource with a few changes rather than replacing the entire resource.
     */
    PATCH("PATCH");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private V1HTTPRouteSpecPath path;

  public static final String SERIALIZED_NAME_QUERY_PARAMS = "queryParams";
  @SerializedName(SERIALIZED_NAME_QUERY_PARAMS)
  private List<V1HTTPRouteSpecQueryParams> queryParams = null;


  public V1HTTPRouteSpecMatches addHeadersItem(V1HTTPRouteSpecHeaders headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

  public V1HTTPRouteSpecMatches addQueryParamsItem(V1HTTPRouteSpecQueryParams queryParamsItem) {
    if (this.queryParams == null) {
      this.queryParams = new ArrayList<>();
    }
    this.queryParams.add(queryParamsItem);
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
    V1HTTPRouteSpecMatches v1HttpRouteSpecMatches = (V1HTTPRouteSpecMatches) o;
    return Objects.equals(this.headers, v1HttpRouteSpecMatches.headers) &&
        Objects.equals(this.method, v1HttpRouteSpecMatches.method) &&
        Objects.equals(this.path, v1HttpRouteSpecMatches.path) &&
        Objects.equals(this.queryParams, v1HttpRouteSpecMatches.queryParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, method, path, queryParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPRouteSpecMatches {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    queryParams: ").append(toIndentedString(queryParams)).append("\n");
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

