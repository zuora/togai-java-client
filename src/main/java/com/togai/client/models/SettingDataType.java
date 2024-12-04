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
 * Gets or Sets SettingDataType
 */
@JsonAdapter(SettingDataType.Adapter.class)
public enum SettingDataType {
  
  STRING("STRING"),
  
  NUMERIC("NUMERIC"),
  
  JSON("JSON"),
  
  JSON_LOGIC("JSON_LOGIC");

  private String value;

  SettingDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SettingDataType fromValue(String value) {
    for (SettingDataType b : SettingDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SettingDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SettingDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SettingDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SettingDataType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    SettingDataType.fromValue(value);
  }
}

