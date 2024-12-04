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
import java.math.BigDecimal;
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
 * Pricing Rules Logs Changes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PricingRuleChangesLog implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_KEY_NAME = "keyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  @javax.annotation.Nullable
  private String keyName;

  public static final String SERIALIZED_NAME_OLD_REVENUE = "oldRevenue";
  @SerializedName(SERIALIZED_NAME_OLD_REVENUE)
  @javax.annotation.Nonnull
  private BigDecimal oldRevenue;

  public static final String SERIALIZED_NAME_NEW_REVENUE = "newRevenue";
  @SerializedName(SERIALIZED_NAME_NEW_REVENUE)
  @javax.annotation.Nonnull
  private BigDecimal newRevenue;

  public static final String SERIALIZED_NAME_OLD_USAGE = "oldUsage";
  @SerializedName(SERIALIZED_NAME_OLD_USAGE)
  @javax.annotation.Nullable
  private BigDecimal oldUsage;

  public static final String SERIALIZED_NAME_NEW_USAGE = "newUsage";
  @SerializedName(SERIALIZED_NAME_NEW_USAGE)
  @javax.annotation.Nullable
  private BigDecimal newUsage;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  @javax.annotation.Nullable
  private String errorMessage;

  public PricingRuleChangesLog() {
  }

  public PricingRuleChangesLog key(@javax.annotation.Nonnull String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nonnull String key) {
    this.key = key;
  }


  public PricingRuleChangesLog keyName(@javax.annotation.Nullable String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Get keyName
   * @return keyName
   */
  @javax.annotation.Nullable
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(@javax.annotation.Nullable String keyName) {
    this.keyName = keyName;
  }


  public PricingRuleChangesLog oldRevenue(@javax.annotation.Nonnull BigDecimal oldRevenue) {
    this.oldRevenue = oldRevenue;
    return this;
  }

  /**
   * Get oldRevenue
   * @return oldRevenue
   */
  @javax.annotation.Nonnull
  public BigDecimal getOldRevenue() {
    return oldRevenue;
  }

  public void setOldRevenue(@javax.annotation.Nonnull BigDecimal oldRevenue) {
    this.oldRevenue = oldRevenue;
  }


  public PricingRuleChangesLog newRevenue(@javax.annotation.Nonnull BigDecimal newRevenue) {
    this.newRevenue = newRevenue;
    return this;
  }

  /**
   * Get newRevenue
   * @return newRevenue
   */
  @javax.annotation.Nonnull
  public BigDecimal getNewRevenue() {
    return newRevenue;
  }

  public void setNewRevenue(@javax.annotation.Nonnull BigDecimal newRevenue) {
    this.newRevenue = newRevenue;
  }


  public PricingRuleChangesLog oldUsage(@javax.annotation.Nullable BigDecimal oldUsage) {
    this.oldUsage = oldUsage;
    return this;
  }

  /**
   * Get oldUsage
   * @return oldUsage
   */
  @javax.annotation.Nullable
  public BigDecimal getOldUsage() {
    return oldUsage;
  }

  public void setOldUsage(@javax.annotation.Nullable BigDecimal oldUsage) {
    this.oldUsage = oldUsage;
  }


  public PricingRuleChangesLog newUsage(@javax.annotation.Nullable BigDecimal newUsage) {
    this.newUsage = newUsage;
    return this;
  }

  /**
   * Get newUsage
   * @return newUsage
   */
  @javax.annotation.Nullable
  public BigDecimal getNewUsage() {
    return newUsage;
  }

  public void setNewUsage(@javax.annotation.Nullable BigDecimal newUsage) {
    this.newUsage = newUsage;
  }


  public PricingRuleChangesLog errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingRuleChangesLog pricingRuleChangesLog = (PricingRuleChangesLog) o;
    return Objects.equals(this.key, pricingRuleChangesLog.key) &&
        Objects.equals(this.keyName, pricingRuleChangesLog.keyName) &&
        Objects.equals(this.oldRevenue, pricingRuleChangesLog.oldRevenue) &&
        Objects.equals(this.newRevenue, pricingRuleChangesLog.newRevenue) &&
        Objects.equals(this.oldUsage, pricingRuleChangesLog.oldUsage) &&
        Objects.equals(this.newUsage, pricingRuleChangesLog.newUsage) &&
        Objects.equals(this.errorMessage, pricingRuleChangesLog.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, keyName, oldRevenue, newRevenue, oldUsage, newUsage, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingRuleChangesLog {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    oldRevenue: ").append(toIndentedString(oldRevenue)).append("\n");
    sb.append("    newRevenue: ").append(toIndentedString(newRevenue)).append("\n");
    sb.append("    oldUsage: ").append(toIndentedString(oldUsage)).append("\n");
    sb.append("    newUsage: ").append(toIndentedString(newUsage)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("keyName");
    openapiFields.add("oldRevenue");
    openapiFields.add("newRevenue");
    openapiFields.add("oldUsage");
    openapiFields.add("newUsage");
    openapiFields.add("errorMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("oldRevenue");
    openapiRequiredFields.add("newRevenue");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PricingRuleChangesLog
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricingRuleChangesLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricingRuleChangesLog is not found in the empty JSON string", PricingRuleChangesLog.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PricingRuleChangesLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricingRuleChangesLog` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PricingRuleChangesLog.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("keyName") != null && !jsonObj.get("keyName").isJsonNull()) && !jsonObj.get("keyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyName").toString()));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricingRuleChangesLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricingRuleChangesLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricingRuleChangesLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricingRuleChangesLog.class));

       return (TypeAdapter<T>) new TypeAdapter<PricingRuleChangesLog>() {
           @Override
           public void write(JsonWriter out, PricingRuleChangesLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricingRuleChangesLog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PricingRuleChangesLog given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PricingRuleChangesLog
   * @throws IOException if the JSON string is invalid with respect to PricingRuleChangesLog
   */
  public static PricingRuleChangesLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricingRuleChangesLog.class);
  }

  /**
   * Convert an instance of PricingRuleChangesLog to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

