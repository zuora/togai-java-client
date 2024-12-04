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
 * Miscellaneous charges are the charges that can be added to the invoice. A charge must either have rate and quantity or value. In case of rate and quantity, the value must not be provided as it is automatically calculated as (rate * quantity).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class MiscellaneousCharge implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  @javax.annotation.Nullable
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  @javax.annotation.Nullable
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private String value;

  public static final String SERIALIZED_NAME_CONSIDER_FOR_REVENUE = "considerForRevenue";
  @SerializedName(SERIALIZED_NAME_CONSIDER_FOR_REVENUE)
  @javax.annotation.Nullable
  private Boolean considerForRevenue = false;

  public MiscellaneousCharge() {
  }

  public MiscellaneousCharge name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the miscellaneous charge
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public MiscellaneousCharge rate(@javax.annotation.Nullable BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate of the charge
   * @return rate
   */
  @javax.annotation.Nullable
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(@javax.annotation.Nullable BigDecimal rate) {
    this.rate = rate;
  }


  public MiscellaneousCharge quantity(@javax.annotation.Nullable BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the charge
   * @return quantity
   */
  @javax.annotation.Nullable
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(@javax.annotation.Nullable BigDecimal quantity) {
    this.quantity = quantity;
  }


  public MiscellaneousCharge value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the charge Possible values: 1. Fixed number [Example: 10] 2. Json Logic [Example: {\&quot;*\&quot;: [{\&quot;var\&quot;: \&quot;um.lineitem.id\&quot;}, 0.1]}]    You can use all line item ids as variables in the json logic 
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable String value) {
    this.value = value;
  }


  public MiscellaneousCharge considerForRevenue(@javax.annotation.Nullable Boolean considerForRevenue) {
    this.considerForRevenue = considerForRevenue;
    return this;
  }

  /**
   * Specifies whether to consider this miscellaneous charge for revenue or not
   * @return considerForRevenue
   */
  @javax.annotation.Nullable
  public Boolean getConsiderForRevenue() {
    return considerForRevenue;
  }

  public void setConsiderForRevenue(@javax.annotation.Nullable Boolean considerForRevenue) {
    this.considerForRevenue = considerForRevenue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiscellaneousCharge miscellaneousCharge = (MiscellaneousCharge) o;
    return Objects.equals(this.name, miscellaneousCharge.name) &&
        Objects.equals(this.rate, miscellaneousCharge.rate) &&
        Objects.equals(this.quantity, miscellaneousCharge.quantity) &&
        Objects.equals(this.value, miscellaneousCharge.value) &&
        Objects.equals(this.considerForRevenue, miscellaneousCharge.considerForRevenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rate, quantity, value, considerForRevenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousCharge {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    considerForRevenue: ").append(toIndentedString(considerForRevenue)).append("\n");
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
    openapiFields.add("rate");
    openapiFields.add("quantity");
    openapiFields.add("value");
    openapiFields.add("considerForRevenue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MiscellaneousCharge
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MiscellaneousCharge.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiscellaneousCharge is not found in the empty JSON string", MiscellaneousCharge.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MiscellaneousCharge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MiscellaneousCharge` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MiscellaneousCharge.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiscellaneousCharge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiscellaneousCharge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiscellaneousCharge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiscellaneousCharge.class));

       return (TypeAdapter<T>) new TypeAdapter<MiscellaneousCharge>() {
           @Override
           public void write(JsonWriter out, MiscellaneousCharge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MiscellaneousCharge read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MiscellaneousCharge given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MiscellaneousCharge
   * @throws IOException if the JSON string is invalid with respect to MiscellaneousCharge
   */
  public static MiscellaneousCharge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiscellaneousCharge.class);
  }

  /**
   * Convert an instance of MiscellaneousCharge to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

