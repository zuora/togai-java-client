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
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Represents the type of entity(STANDARD/AD_HOC/COMPOSITE)
 */
@JsonAdapter(InvoicesType.Adapter.class)
public enum InvoicesType {
  
  STANDARD("STANDARD"),
  
  AD_HOC("AD_HOC"),
  
  CUSTOM("CUSTOM"),
  
  COMPOSITE("COMPOSITE"),
  
  STANDARD_ADVANCED("STANDARD_ADVANCED"),
  
  ADHOC_ADVANCED("ADHOC_ADVANCED");

  private String value;

  InvoicesType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvoicesType fromValue(String value) {
    for (InvoicesType b : InvoicesType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InvoicesType> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvoicesType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InvoicesType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InvoicesType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    InvoicesType.fromValue(value);
  }
}

