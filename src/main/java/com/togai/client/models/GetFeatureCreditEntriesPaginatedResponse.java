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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.togai.client.models.FeatureCreditEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.togai.client.JSON;

/**
 * GetFeatureCreditEntriesPaginatedResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GetFeatureCreditEntriesPaginatedResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private List<FeatureCreditEntry> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  @javax.annotation.Nullable
  private String nextToken;

  public GetFeatureCreditEntriesPaginatedResponse() {
  }

  public GetFeatureCreditEntriesPaginatedResponse data(@javax.annotation.Nullable List<FeatureCreditEntry> data) {
    this.data = data;
    return this;
  }

  public GetFeatureCreditEntriesPaginatedResponse addDataItem(FeatureCreditEntry dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public List<FeatureCreditEntry> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable List<FeatureCreditEntry> data) {
    this.data = data;
  }


  public GetFeatureCreditEntriesPaginatedResponse nextToken(@javax.annotation.Nullable String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * Get nextToken
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(@javax.annotation.Nullable String nextToken) {
    this.nextToken = nextToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeatureCreditEntriesPaginatedResponse getFeatureCreditEntriesPaginatedResponse = (GetFeatureCreditEntriesPaginatedResponse) o;
    return Objects.equals(this.data, getFeatureCreditEntriesPaginatedResponse.data) &&
        Objects.equals(this.nextToken, getFeatureCreditEntriesPaginatedResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeatureCreditEntriesPaginatedResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("nextToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetFeatureCreditEntriesPaginatedResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFeatureCreditEntriesPaginatedResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFeatureCreditEntriesPaginatedResponse is not found in the empty JSON string", GetFeatureCreditEntriesPaginatedResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFeatureCreditEntriesPaginatedResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFeatureCreditEntriesPaginatedResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            FeatureCreditEntry.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
      if ((jsonObj.get("nextToken") != null && !jsonObj.get("nextToken").isJsonNull()) && !jsonObj.get("nextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFeatureCreditEntriesPaginatedResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFeatureCreditEntriesPaginatedResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFeatureCreditEntriesPaginatedResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFeatureCreditEntriesPaginatedResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFeatureCreditEntriesPaginatedResponse>() {
           @Override
           public void write(JsonWriter out, GetFeatureCreditEntriesPaginatedResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFeatureCreditEntriesPaginatedResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetFeatureCreditEntriesPaginatedResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetFeatureCreditEntriesPaginatedResponse
   * @throws IOException if the JSON string is invalid with respect to GetFeatureCreditEntriesPaginatedResponse
   */
  public static GetFeatureCreditEntriesPaginatedResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFeatureCreditEntriesPaginatedResponse.class);
  }

  /**
   * Convert an instance of GetFeatureCreditEntriesPaginatedResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

