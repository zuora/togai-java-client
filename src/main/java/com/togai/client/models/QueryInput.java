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
import com.togai.client.models.QueryColumn;
import com.togai.client.models.QueryFilter;
import com.togai.client.models.QueryInputSortInner;
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
 * QueryInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class QueryInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SELECTS = "selects";
  @SerializedName(SERIALIZED_NAME_SELECTS)
  @javax.annotation.Nonnull
  private List<QueryColumn> selects = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUERY_FILTERS = "queryFilters";
  @SerializedName(SERIALIZED_NAME_QUERY_FILTERS)
  @javax.annotation.Nullable
  private List<QueryFilter> queryFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_BASE_DATA_SOURCE = "baseDataSource";
  @SerializedName(SERIALIZED_NAME_BASE_DATA_SOURCE)
  @javax.annotation.Nonnull
  private String baseDataSource;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  @javax.annotation.Nonnull
  private List<QueryInputSortInner> sort = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEEK_VALUES = "seekValues";
  @SerializedName(SERIALIZED_NAME_SEEK_VALUES)
  @javax.annotation.Nullable
  private List<String> seekValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nonnull
  private Integer limit;

  public QueryInput() {
  }

  public QueryInput selects(@javax.annotation.Nonnull List<QueryColumn> selects) {
    this.selects = selects;
    return this;
  }

  public QueryInput addSelectsItem(QueryColumn selectsItem) {
    if (this.selects == null) {
      this.selects = new ArrayList<>();
    }
    this.selects.add(selectsItem);
    return this;
  }

  /**
   * Get selects
   * @return selects
   */
  @javax.annotation.Nonnull
  public List<QueryColumn> getSelects() {
    return selects;
  }

  public void setSelects(@javax.annotation.Nonnull List<QueryColumn> selects) {
    this.selects = selects;
  }


  public QueryInput queryFilters(@javax.annotation.Nullable List<QueryFilter> queryFilters) {
    this.queryFilters = queryFilters;
    return this;
  }

  public QueryInput addQueryFiltersItem(QueryFilter queryFiltersItem) {
    if (this.queryFilters == null) {
      this.queryFilters = new ArrayList<>();
    }
    this.queryFilters.add(queryFiltersItem);
    return this;
  }

  /**
   * Get queryFilters
   * @return queryFilters
   */
  @javax.annotation.Nullable
  public List<QueryFilter> getQueryFilters() {
    return queryFilters;
  }

  public void setQueryFilters(@javax.annotation.Nullable List<QueryFilter> queryFilters) {
    this.queryFilters = queryFilters;
  }


  public QueryInput baseDataSource(@javax.annotation.Nonnull String baseDataSource) {
    this.baseDataSource = baseDataSource;
    return this;
  }

  /**
   * Get baseDataSource
   * @return baseDataSource
   */
  @javax.annotation.Nonnull
  public String getBaseDataSource() {
    return baseDataSource;
  }

  public void setBaseDataSource(@javax.annotation.Nonnull String baseDataSource) {
    this.baseDataSource = baseDataSource;
  }


  public QueryInput sort(@javax.annotation.Nonnull List<QueryInputSortInner> sort) {
    this.sort = sort;
    return this;
  }

  public QueryInput addSortItem(QueryInputSortInner sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

  /**
   * Get sort
   * @return sort
   */
  @javax.annotation.Nonnull
  public List<QueryInputSortInner> getSort() {
    return sort;
  }

  public void setSort(@javax.annotation.Nonnull List<QueryInputSortInner> sort) {
    this.sort = sort;
  }


  public QueryInput seekValues(@javax.annotation.Nullable List<String> seekValues) {
    this.seekValues = seekValues;
    return this;
  }

  public QueryInput addSeekValuesItem(String seekValuesItem) {
    if (this.seekValues == null) {
      this.seekValues = new ArrayList<>();
    }
    this.seekValues.add(seekValuesItem);
    return this;
  }

  /**
   * Get seekValues
   * @return seekValues
   */
  @javax.annotation.Nullable
  public List<String> getSeekValues() {
    return seekValues;
  }

  public void setSeekValues(@javax.annotation.Nullable List<String> seekValues) {
    this.seekValues = seekValues;
  }


  public QueryInput limit(@javax.annotation.Nonnull Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  @javax.annotation.Nonnull
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(@javax.annotation.Nonnull Integer limit) {
    this.limit = limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInput queryInput = (QueryInput) o;
    return Objects.equals(this.selects, queryInput.selects) &&
        Objects.equals(this.queryFilters, queryInput.queryFilters) &&
        Objects.equals(this.baseDataSource, queryInput.baseDataSource) &&
        Objects.equals(this.sort, queryInput.sort) &&
        Objects.equals(this.seekValues, queryInput.seekValues) &&
        Objects.equals(this.limit, queryInput.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selects, queryFilters, baseDataSource, sort, seekValues, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryInput {\n");
    sb.append("    selects: ").append(toIndentedString(selects)).append("\n");
    sb.append("    queryFilters: ").append(toIndentedString(queryFilters)).append("\n");
    sb.append("    baseDataSource: ").append(toIndentedString(baseDataSource)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    seekValues: ").append(toIndentedString(seekValues)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("selects");
    openapiFields.add("queryFilters");
    openapiFields.add("baseDataSource");
    openapiFields.add("sort");
    openapiFields.add("seekValues");
    openapiFields.add("limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("selects");
    openapiRequiredFields.add("baseDataSource");
    openapiRequiredFields.add("sort");
    openapiRequiredFields.add("limit");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QueryInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryInput is not found in the empty JSON string", QueryInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("selects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selects` to be an array in the JSON string but got `%s`", jsonObj.get("selects").toString()));
      }

      JsonArray jsonArrayselects = jsonObj.getAsJsonArray("selects");
      // validate the required field `selects` (array)
      for (int i = 0; i < jsonArrayselects.size(); i++) {
        QueryColumn.validateJsonElement(jsonArrayselects.get(i));
      };
      if (jsonObj.get("queryFilters") != null && !jsonObj.get("queryFilters").isJsonNull()) {
        JsonArray jsonArrayqueryFilters = jsonObj.getAsJsonArray("queryFilters");
        if (jsonArrayqueryFilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("queryFilters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `queryFilters` to be an array in the JSON string but got `%s`", jsonObj.get("queryFilters").toString()));
          }

          // validate the optional field `queryFilters` (array)
          for (int i = 0; i < jsonArrayqueryFilters.size(); i++) {
            QueryFilter.validateJsonElement(jsonArrayqueryFilters.get(i));
          };
        }
      }
      if (!jsonObj.get("baseDataSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseDataSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseDataSource").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sort").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be an array in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }

      JsonArray jsonArraysort = jsonObj.getAsJsonArray("sort");
      // validate the required field `sort` (array)
      for (int i = 0; i < jsonArraysort.size(); i++) {
        QueryInputSortInner.validateJsonElement(jsonArraysort.get(i));
      };
      // ensure the optional json data is an array if present
      if (jsonObj.get("seekValues") != null && !jsonObj.get("seekValues").isJsonNull() && !jsonObj.get("seekValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `seekValues` to be an array in the JSON string but got `%s`", jsonObj.get("seekValues").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInput.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInput>() {
           @Override
           public void write(JsonWriter out, QueryInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QueryInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QueryInput
   * @throws IOException if the JSON string is invalid with respect to QueryInput
   */
  public static QueryInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInput.class);
  }

  /**
   * Convert an instance of QueryInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

