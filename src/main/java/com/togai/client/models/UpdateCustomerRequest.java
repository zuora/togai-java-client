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
import java.io.IOException;
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
 * Payload to update customer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCustomerRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIMARY_EMAIL = "primaryEmail";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EMAIL)
  private String primaryEmail;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private String billingAddress;

  public UpdateCustomerRequest() {
  }

  public UpdateCustomerRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Customer
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateCustomerRequest primaryEmail(String primaryEmail) {
    
    this.primaryEmail = primaryEmail;
    return this;
  }

   /**
   * Primary email of the customer
   * @return primaryEmail
  **/
  @javax.annotation.Nullable

  public String getPrimaryEmail() {
    return primaryEmail;
  }


  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }


  public UpdateCustomerRequest billingAddress(String billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * billing address of the customer
   * @return billingAddress
  **/
  @javax.annotation.Nullable

  public String getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerRequest updateCustomerRequest = (UpdateCustomerRequest) o;
    return Objects.equals(this.name, updateCustomerRequest.name) &&
        Objects.equals(this.primaryEmail, updateCustomerRequest.primaryEmail) &&
        Objects.equals(this.billingAddress, updateCustomerRequest.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, primaryEmail, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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
    openapiFields.add("primaryEmail");
    openapiFields.add("billingAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateCustomerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateCustomerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateCustomerRequest is not found in the empty JSON string", UpdateCustomerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateCustomerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateCustomerRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("primaryEmail") != null && !jsonObj.get("primaryEmail").isJsonNull()) && !jsonObj.get("primaryEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryEmail").toString()));
      }
      if ((jsonObj.get("billingAddress") != null && !jsonObj.get("billingAddress").isJsonNull()) && !jsonObj.get("billingAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateCustomerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateCustomerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateCustomerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateCustomerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateCustomerRequest>() {
           @Override
           public void write(JsonWriter out, UpdateCustomerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateCustomerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateCustomerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateCustomerRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateCustomerRequest
  */
  public static UpdateCustomerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateCustomerRequest.class);
  }

 /**
  * Convert an instance of UpdateCustomerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

