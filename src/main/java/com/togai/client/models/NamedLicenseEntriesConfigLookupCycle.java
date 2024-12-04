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
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * Cycle of named license entries to be looked up, this will be considered if mode is LOOKUP_CYCLE
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class NamedLicenseEntriesConfigLookupCycle implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CYCLE_EFFECTIVE_ON = "cycleEffectiveOn";
  @SerializedName(SERIALIZED_NAME_CYCLE_EFFECTIVE_ON)
  @javax.annotation.Nullable
  private OffsetDateTime cycleEffectiveOn;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nonnull
  private String accountId;

  public NamedLicenseEntriesConfigLookupCycle() {
  }

  public NamedLicenseEntriesConfigLookupCycle cycleEffectiveOn(@javax.annotation.Nullable OffsetDateTime cycleEffectiveOn) {
    this.cycleEffectiveOn = cycleEffectiveOn;
    return this;
  }

  /**
   * Effective date of the cycle, will be used to get the named license entries of the cycle
   * @return cycleEffectiveOn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCycleEffectiveOn() {
    return cycleEffectiveOn;
  }

  public void setCycleEffectiveOn(@javax.annotation.Nullable OffsetDateTime cycleEffectiveOn) {
    this.cycleEffectiveOn = cycleEffectiveOn;
  }


  public NamedLicenseEntriesConfigLookupCycle accountId(@javax.annotation.Nonnull String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nonnull
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nonnull String accountId) {
    this.accountId = accountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedLicenseEntriesConfigLookupCycle namedLicenseEntriesConfigLookupCycle = (NamedLicenseEntriesConfigLookupCycle) o;
    return Objects.equals(this.cycleEffectiveOn, namedLicenseEntriesConfigLookupCycle.cycleEffectiveOn) &&
        Objects.equals(this.accountId, namedLicenseEntriesConfigLookupCycle.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleEffectiveOn, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedLicenseEntriesConfigLookupCycle {\n");
    sb.append("    cycleEffectiveOn: ").append(toIndentedString(cycleEffectiveOn)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
    openapiFields.add("cycleEffectiveOn");
    openapiFields.add("accountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NamedLicenseEntriesConfigLookupCycle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NamedLicenseEntriesConfigLookupCycle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NamedLicenseEntriesConfigLookupCycle is not found in the empty JSON string", NamedLicenseEntriesConfigLookupCycle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NamedLicenseEntriesConfigLookupCycle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NamedLicenseEntriesConfigLookupCycle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NamedLicenseEntriesConfigLookupCycle.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NamedLicenseEntriesConfigLookupCycle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NamedLicenseEntriesConfigLookupCycle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NamedLicenseEntriesConfigLookupCycle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NamedLicenseEntriesConfigLookupCycle.class));

       return (TypeAdapter<T>) new TypeAdapter<NamedLicenseEntriesConfigLookupCycle>() {
           @Override
           public void write(JsonWriter out, NamedLicenseEntriesConfigLookupCycle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NamedLicenseEntriesConfigLookupCycle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NamedLicenseEntriesConfigLookupCycle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NamedLicenseEntriesConfigLookupCycle
   * @throws IOException if the JSON string is invalid with respect to NamedLicenseEntriesConfigLookupCycle
   */
  public static NamedLicenseEntriesConfigLookupCycle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NamedLicenseEntriesConfigLookupCycle.class);
  }

  /**
   * Convert an instance of NamedLicenseEntriesConfigLookupCycle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

