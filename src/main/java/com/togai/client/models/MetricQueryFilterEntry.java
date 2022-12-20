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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 *  | Metric Name | FilterEntry Name |    Allowed groupBy fields    |      Default Values      |                 Allowed Values                  | |-------------|------------------|------------------------------|--------------------------|-------------------------------------------------| | EVENTS      | ACCOUNT_ID       | ACCOUNT_ID, EVENT_STATUS     | None                     | *\\&lt;one or more valid accounts IDs&gt;              | | EVENTS      | CUSTOMER_ID      | ACCOUNT_ID, EVENT_STATUS     | None                     | *\\&lt;at most one valid customer ID&gt;               | | EVENTS      | EVENT_STATUS     | ACCOUNT_ID, EVENT_STATUS     | [PROCESSED, UNPROCESSED] | oneOrMoreOf PROCESSED, UNPROCESSED, IN_PROGRESS | | USAGE       | ACCOUNT_ID       | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\&lt;one or more valid accounts ID&gt;               | | USAGE       | CUSTOMER_ID      | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\&lt;at most one valid customer ID&gt;               | | USAGE       | USAGE_METER_NAME | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\&lt;one or more valid usage meter name&gt;          | | REVENUE     | ACCOUNT_ID       | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\&lt;one or more valid accounts ID&gt;               | | REVENUE     | CUSTOMER_ID      | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\&lt;at most one valid customer ID&gt;               | | REVENUE     | USAGE_METER_NAME | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\&lt;one or more valid usage meter name&gt;          | | EVENTS      | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_NAME | &lt;From auth token&gt;        |                                                 | | USAGE       | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_NAME | &lt;From auth token&gt;        |                                                 | | REVENUE     | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_NAME | &lt;From auth token&gt;        |                                                 | 
 */
@ApiModel(description = " | Metric Name | FilterEntry Name |    Allowed groupBy fields    |      Default Values      |                 Allowed Values                  | |-------------|------------------|------------------------------|--------------------------|-------------------------------------------------| | EVENTS      | ACCOUNT_ID       | ACCOUNT_ID, EVENT_STATUS     | None                     | *\\<one or more valid accounts IDs>              | | EVENTS      | CUSTOMER_ID      | ACCOUNT_ID, EVENT_STATUS     | None                     | *\\<at most one valid customer ID>               | | EVENTS      | EVENT_STATUS     | ACCOUNT_ID, EVENT_STATUS     | [PROCESSED, UNPROCESSED] | oneOrMoreOf PROCESSED, UNPROCESSED, IN_PROGRESS | | USAGE       | ACCOUNT_ID       | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\<one or more valid accounts ID>               | | USAGE       | CUSTOMER_ID      | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\<at most one valid customer ID>               | | USAGE       | USAGE_METER_NAME | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\<one or more valid usage meter name>          | | REVENUE     | ACCOUNT_ID       | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\<one or more valid accounts ID>               | | REVENUE     | CUSTOMER_ID      | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\<at most one valid customer ID>               | | REVENUE     | USAGE_METER_NAME | ACCOUNT_ID, USAGE_METER_NAME | None                     | *\\<one or more valid usage meter name>          | | EVENTS      | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_NAME | <From auth token>        |                                                 | | USAGE       | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_NAME | <From auth token>        |                                                 | | REVENUE     | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_NAME | <From auth token>        |                                                 | ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricQueryFilterEntry implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_FIELD_VALUES = "fieldValues";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUES)
  private List<String> fieldValues = new ArrayList<>();

  public MetricQueryFilterEntry() {
  }

  public MetricQueryFilterEntry fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public MetricQueryFilterEntry fieldValues(List<String> fieldValues) {
    
    this.fieldValues = fieldValues;
    return this;
  }

  public MetricQueryFilterEntry addFieldValuesItem(String fieldValuesItem) {
    this.fieldValues.add(fieldValuesItem);
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getFieldValues() {
    return fieldValues;
  }


  public void setFieldValues(List<String> fieldValues) {
    this.fieldValues = fieldValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricQueryFilterEntry metricQueryFilterEntry = (MetricQueryFilterEntry) o;
    return Objects.equals(this.fieldName, metricQueryFilterEntry.fieldName) &&
        Objects.equals(this.fieldValues, metricQueryFilterEntry.fieldValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricQueryFilterEntry {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
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
    openapiFields.add("fieldName");
    openapiFields.add("fieldValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldName");
    openapiRequiredFields.add("fieldValues");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetricQueryFilterEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MetricQueryFilterEntry.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetricQueryFilterEntry is not found in the empty JSON string", MetricQueryFilterEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MetricQueryFilterEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetricQueryFilterEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MetricQueryFilterEntry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("fieldValues") != null && !jsonObj.get("fieldValues").isJsonNull()) && !jsonObj.get("fieldValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldValues` to be an array in the JSON string but got `%s`", jsonObj.get("fieldValues").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetricQueryFilterEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricQueryFilterEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricQueryFilterEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricQueryFilterEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricQueryFilterEntry>() {
           @Override
           public void write(JsonWriter out, MetricQueryFilterEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetricQueryFilterEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetricQueryFilterEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetricQueryFilterEntry
  * @throws IOException if the JSON string is invalid with respect to MetricQueryFilterEntry
  */
  public static MetricQueryFilterEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricQueryFilterEntry.class);
  }

 /**
  * Convert an instance of MetricQueryFilterEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

