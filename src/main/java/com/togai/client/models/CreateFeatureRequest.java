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
import com.togai.client.models.EventSchemasForFeature;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
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
 * Create a Feature stand-alone or associate it with schemas
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateFeatureRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_BILLABLE_NAME = "billableName";
  @SerializedName(SERIALIZED_NAME_BILLABLE_NAME)
  @javax.annotation.Nullable
  private String billableName;

  public static final String SERIALIZED_NAME_SCHEMA_ASSOCIATIONS = "schemaAssociations";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ASSOCIATIONS)
  @javax.annotation.Nonnull
  private Set<EventSchemasForFeature> schemaAssociations = new LinkedHashSet<>();

  public CreateFeatureRequest() {
  }

  public CreateFeatureRequest name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the feature
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateFeatureRequest billableName(@javax.annotation.Nullable String billableName) {
    this.billableName = billableName;
    return this;
  }

  /**
   * Billable name of feature. Billable name takes precedence over name to display in invoice.
   * @return billableName
   */
  @javax.annotation.Nullable
  public String getBillableName() {
    return billableName;
  }

  public void setBillableName(@javax.annotation.Nullable String billableName) {
    this.billableName = billableName;
  }


  public CreateFeatureRequest schemaAssociations(@javax.annotation.Nonnull Set<EventSchemasForFeature> schemaAssociations) {
    this.schemaAssociations = schemaAssociations;
    return this;
  }

  public CreateFeatureRequest addSchemaAssociationsItem(EventSchemasForFeature schemaAssociationsItem) {
    if (this.schemaAssociations == null) {
      this.schemaAssociations = new LinkedHashSet<>();
    }
    this.schemaAssociations.add(schemaAssociationsItem);
    return this;
  }

  /**
   * Association of a feature with event_schemas
   * @return schemaAssociations
   */
  @javax.annotation.Nonnull
  public Set<EventSchemasForFeature> getSchemaAssociations() {
    return schemaAssociations;
  }

  public void setSchemaAssociations(@javax.annotation.Nonnull Set<EventSchemasForFeature> schemaAssociations) {
    this.schemaAssociations = schemaAssociations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeatureRequest createFeatureRequest = (CreateFeatureRequest) o;
    return Objects.equals(this.name, createFeatureRequest.name) &&
        Objects.equals(this.billableName, createFeatureRequest.billableName) &&
        Objects.equals(this.schemaAssociations, createFeatureRequest.schemaAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, billableName, schemaAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFeatureRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    billableName: ").append(toIndentedString(billableName)).append("\n");
    sb.append("    schemaAssociations: ").append(toIndentedString(schemaAssociations)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("billableName");
    openapiFields.add("schemaAssociations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("schemaAssociations");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateFeatureRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFeatureRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFeatureRequest is not found in the empty JSON string", CreateFeatureRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateFeatureRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFeatureRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFeatureRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("billableName") != null && !jsonObj.get("billableName").isJsonNull()) && !jsonObj.get("billableName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billableName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billableName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("schemaAssociations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemaAssociations` to be an array in the JSON string but got `%s`", jsonObj.get("schemaAssociations").toString()));
      }

      JsonArray jsonArrayschemaAssociations = jsonObj.getAsJsonArray("schemaAssociations");
      // validate the required field `schemaAssociations` (array)
      for (int i = 0; i < jsonArrayschemaAssociations.size(); i++) {
        EventSchemasForFeature.validateJsonElement(jsonArrayschemaAssociations.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFeatureRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFeatureRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFeatureRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFeatureRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFeatureRequest>() {
           @Override
           public void write(JsonWriter out, CreateFeatureRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFeatureRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateFeatureRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateFeatureRequest
   * @throws IOException if the JSON string is invalid with respect to CreateFeatureRequest
   */
  public static CreateFeatureRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFeatureRequest.class);
  }

  /**
   * Convert an instance of CreateFeatureRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

