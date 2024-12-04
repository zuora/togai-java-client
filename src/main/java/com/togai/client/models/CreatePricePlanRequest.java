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
import com.togai.client.models.CreatePricePlanDetails;
import com.togai.client.models.CreatePricingRule;
import com.togai.client.models.PricePlanType;
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
 * Request to create a price plan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreatePricePlanRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private PricePlanType type;

  public static final String SERIALIZED_NAME_PRICE_PLAN_DETAILS = "pricePlanDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_DETAILS)
  @javax.annotation.Nonnull
  private CreatePricePlanDetails pricePlanDetails;

  public static final String SERIALIZED_NAME_PRICING_RULES = "pricingRules";
  @SerializedName(SERIALIZED_NAME_PRICING_RULES)
  @javax.annotation.Nullable
  private List<CreatePricingRule> pricingRules = new ArrayList<>();

  public CreatePricePlanRequest() {
  }

  public CreatePricePlanRequest name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the price plan
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreatePricePlanRequest description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of price plan
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public CreatePricePlanRequest type(@javax.annotation.Nullable PricePlanType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public PricePlanType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable PricePlanType type) {
    this.type = type;
  }


  public CreatePricePlanRequest pricePlanDetails(@javax.annotation.Nonnull CreatePricePlanDetails pricePlanDetails) {
    this.pricePlanDetails = pricePlanDetails;
    return this;
  }

  /**
   * Get pricePlanDetails
   * @return pricePlanDetails
   */
  @javax.annotation.Nonnull
  public CreatePricePlanDetails getPricePlanDetails() {
    return pricePlanDetails;
  }

  public void setPricePlanDetails(@javax.annotation.Nonnull CreatePricePlanDetails pricePlanDetails) {
    this.pricePlanDetails = pricePlanDetails;
  }


  public CreatePricePlanRequest pricingRules(@javax.annotation.Nullable List<CreatePricingRule> pricingRules) {
    this.pricingRules = pricingRules;
    return this;
  }

  public CreatePricePlanRequest addPricingRulesItem(CreatePricingRule pricingRulesItem) {
    if (this.pricingRules == null) {
      this.pricingRules = new ArrayList<>();
    }
    this.pricingRules.add(pricingRulesItem);
    return this;
  }

  /**
   * Get pricingRules
   * @return pricingRules
   */
  @javax.annotation.Nullable
  public List<CreatePricingRule> getPricingRules() {
    return pricingRules;
  }

  public void setPricingRules(@javax.annotation.Nullable List<CreatePricingRule> pricingRules) {
    this.pricingRules = pricingRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePricePlanRequest createPricePlanRequest = (CreatePricePlanRequest) o;
    return Objects.equals(this.name, createPricePlanRequest.name) &&
        Objects.equals(this.description, createPricePlanRequest.description) &&
        Objects.equals(this.type, createPricePlanRequest.type) &&
        Objects.equals(this.pricePlanDetails, createPricePlanRequest.pricePlanDetails) &&
        Objects.equals(this.pricingRules, createPricePlanRequest.pricingRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, pricePlanDetails, pricingRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePricePlanRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pricePlanDetails: ").append(toIndentedString(pricePlanDetails)).append("\n");
    sb.append("    pricingRules: ").append(toIndentedString(pricingRules)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("type");
    openapiFields.add("pricePlanDetails");
    openapiFields.add("pricingRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("pricePlanDetails");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatePricePlanRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatePricePlanRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePricePlanRequest is not found in the empty JSON string", CreatePricePlanRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatePricePlanRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePricePlanRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePricePlanRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        PricePlanType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the required field `pricePlanDetails`
      CreatePricePlanDetails.validateJsonElement(jsonObj.get("pricePlanDetails"));
      if (jsonObj.get("pricingRules") != null && !jsonObj.get("pricingRules").isJsonNull()) {
        JsonArray jsonArraypricingRules = jsonObj.getAsJsonArray("pricingRules");
        if (jsonArraypricingRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pricingRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pricingRules` to be an array in the JSON string but got `%s`", jsonObj.get("pricingRules").toString()));
          }

          // validate the optional field `pricingRules` (array)
          for (int i = 0; i < jsonArraypricingRules.size(); i++) {
            CreatePricingRule.validateJsonElement(jsonArraypricingRules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePricePlanRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePricePlanRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePricePlanRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePricePlanRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePricePlanRequest>() {
           @Override
           public void write(JsonWriter out, CreatePricePlanRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePricePlanRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatePricePlanRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatePricePlanRequest
   * @throws IOException if the JSON string is invalid with respect to CreatePricePlanRequest
   */
  public static CreatePricePlanRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePricePlanRequest.class);
  }

  /**
   * Convert an instance of CreatePricePlanRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

