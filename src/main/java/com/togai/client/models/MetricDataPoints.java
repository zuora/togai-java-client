/*
 * Togai Apis
 * APIs for Togai App
 *
 * The version of the OpenAPI document: 1.0
 * Contact: engg@togai.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.togai.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.togai.client.models.MetricDataPointsGroupedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.togai.client.JSON;

/**
 * MetricDataPoints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricDataPoints implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUPED_BY = "groupedBy";
  @SerializedName(SERIALIZED_NAME_GROUPED_BY)
  private MetricDataPointsGroupedBy groupedBy;

  public static final String SERIALIZED_NAME_TIMESTAMPS = "timestamps";
  @SerializedName(SERIALIZED_NAME_TIMESTAMPS)
  private List<OffsetDateTime> timestamps = new ArrayList<>();

  public static final String SERIALIZED_NAME_METRIC_VALUES = "metricValues";
  @SerializedName(SERIALIZED_NAME_METRIC_VALUES)
  private List<BigDecimal> metricValues = new ArrayList<>();

  public MetricDataPoints() {
  }

  public MetricDataPoints groupedBy(MetricDataPointsGroupedBy groupedBy) {
    
    this.groupedBy = groupedBy;
    return this;
  }

   /**
   * Get groupedBy
   * @return groupedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetricDataPointsGroupedBy getGroupedBy() {
    return groupedBy;
  }


  public void setGroupedBy(MetricDataPointsGroupedBy groupedBy) {
    this.groupedBy = groupedBy;
  }


  public MetricDataPoints timestamps(List<OffsetDateTime> timestamps) {
    
    this.timestamps = timestamps;
    return this;
  }

  public MetricDataPoints addTimestampsItem(OffsetDateTime timestampsItem) {
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<OffsetDateTime> getTimestamps() {
    return timestamps;
  }


  public void setTimestamps(List<OffsetDateTime> timestamps) {
    this.timestamps = timestamps;
  }


  public MetricDataPoints metricValues(List<BigDecimal> metricValues) {
    
    this.metricValues = metricValues;
    return this;
  }

  public MetricDataPoints addMetricValuesItem(BigDecimal metricValuesItem) {
    this.metricValues.add(metricValuesItem);
    return this;
  }

   /**
   * Get metricValues
   * @return metricValues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BigDecimal> getMetricValues() {
    return metricValues;
  }


  public void setMetricValues(List<BigDecimal> metricValues) {
    this.metricValues = metricValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricDataPoints metricDataPoints = (MetricDataPoints) o;
    return Objects.equals(this.groupedBy, metricDataPoints.groupedBy) &&
        Objects.equals(this.timestamps, metricDataPoints.timestamps) &&
        Objects.equals(this.metricValues, metricDataPoints.metricValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupedBy, timestamps, metricValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricDataPoints {\n");
    sb.append("    groupedBy: ").append(toIndentedString(groupedBy)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    metricValues: ").append(toIndentedString(metricValues)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("groupedBy");
    openapiFields.add("timestamps");
    openapiFields.add("metricValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("timestamps");
    openapiRequiredFields.add("metricValues");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetricDataPoints
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MetricDataPoints.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetricDataPoints is not found in the empty JSON string", MetricDataPoints.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MetricDataPoints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetricDataPoints` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MetricDataPoints.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `groupedBy`
      if (jsonObj.get("groupedBy") != null && !jsonObj.get("groupedBy").isJsonNull()) {
        MetricDataPointsGroupedBy.validateJsonObject(jsonObj.getAsJsonObject("groupedBy"));
      }
      // ensure the json data is an array
      if ((jsonObj.get("timestamps") != null && !jsonObj.get("timestamps").isJsonNull()) && !jsonObj.get("timestamps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamps` to be an array in the JSON string but got `%s`", jsonObj.get("timestamps").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("metricValues") != null && !jsonObj.get("metricValues").isJsonNull()) && !jsonObj.get("metricValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metricValues` to be an array in the JSON string but got `%s`", jsonObj.get("metricValues").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetricDataPoints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricDataPoints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricDataPoints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricDataPoints.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricDataPoints>() {
           @Override
           public void write(JsonWriter out, MetricDataPoints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetricDataPoints read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetricDataPoints given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetricDataPoints
  * @throws IOException if the JSON string is invalid with respect to MetricDataPoints
  */
  public static MetricDataPoints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricDataPoints.class);
  }

 /**
  * Convert an instance of MetricDataPoints to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

