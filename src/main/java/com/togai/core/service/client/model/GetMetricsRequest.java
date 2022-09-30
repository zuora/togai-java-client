/*
 * Togai Apis
 * APIs for Togai App
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engg@togai.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.togai.core.service.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.togai.core.service.client.model.MetricQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import java.io.Serializable;

/**
 * Request to get metrics from togai
 */
@ApiModel(description = "Request to get metrics from togai")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetMetricsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_METRIC_QUERIES = "metricQueries";
  @SerializedName(SERIALIZED_NAME_METRIC_QUERIES)
  private Set<MetricQuery> metricQueries = new LinkedHashSet<>();

  public GetMetricsRequest() {
  }

  public GetMetricsRequest startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public GetMetricsRequest endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public GetMetricsRequest metricQueries(Set<MetricQuery> metricQueries) {
    
    this.metricQueries = metricQueries;
    return this;
  }

  public GetMetricsRequest addMetricQueriesItem(MetricQuery metricQueriesItem) {
    this.metricQueries.add(metricQueriesItem);
    return this;
  }

   /**
   * Get metricQueries
   * @return metricQueries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<MetricQuery> getMetricQueries() {
    return metricQueries;
  }


  public void setMetricQueries(Set<MetricQuery> metricQueries) {
    this.metricQueries = metricQueries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMetricsRequest getMetricsRequest = (GetMetricsRequest) o;
    return Objects.equals(this.startTime, getMetricsRequest.startTime) &&
        Objects.equals(this.endTime, getMetricsRequest.endTime) &&
        Objects.equals(this.metricQueries, getMetricsRequest.metricQueries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, metricQueries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMetricsRequest {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    metricQueries: ").append(toIndentedString(metricQueries)).append("\n");
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

