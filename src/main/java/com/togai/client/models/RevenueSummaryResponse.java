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
import com.togai.client.models.RevenueSummaryResponseRevenueSummary;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.togai.client.JSON;

/**
 * RevenueSummaryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RevenueSummaryResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private Map<String, BigDecimal> usages = new HashMap<>();

  public static final String SERIALIZED_NAME_REVENUE_SUMMARY = "revenueSummary";
  @SerializedName(SERIALIZED_NAME_REVENUE_SUMMARY)
  private RevenueSummaryResponseRevenueSummary revenueSummary;

  public RevenueSummaryResponse() {
  }

  public RevenueSummaryResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RevenueSummaryResponse currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public RevenueSummaryResponse usages(Map<String, BigDecimal> usages) {
    
    this.usages = usages;
    return this;
  }

  public RevenueSummaryResponse putUsagesItem(String key, BigDecimal usagesItem) {
    this.usages.put(key, usagesItem);
    return this;
  }

   /**
   * Get usages
   * @return usages
  **/
  @javax.annotation.Nonnull

  public Map<String, BigDecimal> getUsages() {
    return usages;
  }


  public void setUsages(Map<String, BigDecimal> usages) {
    this.usages = usages;
  }


  public RevenueSummaryResponse revenueSummary(RevenueSummaryResponseRevenueSummary revenueSummary) {
    
    this.revenueSummary = revenueSummary;
    return this;
  }

   /**
   * Get revenueSummary
   * @return revenueSummary
  **/
  @javax.annotation.Nonnull

  public RevenueSummaryResponseRevenueSummary getRevenueSummary() {
    return revenueSummary;
  }


  public void setRevenueSummary(RevenueSummaryResponseRevenueSummary revenueSummary) {
    this.revenueSummary = revenueSummary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueSummaryResponse revenueSummaryResponse = (RevenueSummaryResponse) o;
    return Objects.equals(this.id, revenueSummaryResponse.id) &&
        Objects.equals(this.currency, revenueSummaryResponse.currency) &&
        Objects.equals(this.usages, revenueSummaryResponse.usages) &&
        Objects.equals(this.revenueSummary, revenueSummaryResponse.revenueSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, currency, usages, revenueSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueSummaryResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    revenueSummary: ").append(toIndentedString(revenueSummary)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("currency");
    openapiFields.add("usages");
    openapiFields.add("revenueSummary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("usages");
    openapiRequiredFields.add("revenueSummary");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RevenueSummaryResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RevenueSummaryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevenueSummaryResponse is not found in the empty JSON string", RevenueSummaryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RevenueSummaryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevenueSummaryResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RevenueSummaryResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the required field `revenueSummary`
      RevenueSummaryResponseRevenueSummary.validateJsonObject(jsonObj.getAsJsonObject("revenueSummary"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevenueSummaryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevenueSummaryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevenueSummaryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevenueSummaryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RevenueSummaryResponse>() {
           @Override
           public void write(JsonWriter out, RevenueSummaryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevenueSummaryResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevenueSummaryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevenueSummaryResponse
  * @throws IOException if the JSON string is invalid with respect to RevenueSummaryResponse
  */
  public static RevenueSummaryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevenueSummaryResponse.class);
  }

 /**
  * Convert an instance of RevenueSummaryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

