/*
 * Togai Apis
 * APIs for Togai App
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engg@togai.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.togai.core.service.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.togai.core.service.client.model.Event;
import com.togai.core.service.client.model.IngestionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Raw usage event ingested by the business team and the status of the event ingestion.
 */
@ApiModel(description = "Raw usage event ingested by the business team and the status of the event ingestion.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventWithStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EVENT_PAYLOAD = "eventPayload";
  @SerializedName(SERIALIZED_NAME_EVENT_PAYLOAD)
  private Event eventPayload;

  public static final String SERIALIZED_NAME_INGESTION_STATUS = "ingestionStatus";
  @SerializedName(SERIALIZED_NAME_INGESTION_STATUS)
  private IngestionStatus ingestionStatus;

  public EventWithStatus() {
  }

  public EventWithStatus eventPayload(Event eventPayload) {
    
    this.eventPayload = eventPayload;
    return this;
  }

   /**
   * Get eventPayload
   * @return eventPayload
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Event getEventPayload() {
    return eventPayload;
  }


  public void setEventPayload(Event eventPayload) {
    this.eventPayload = eventPayload;
  }


  public EventWithStatus ingestionStatus(IngestionStatus ingestionStatus) {
    
    this.ingestionStatus = ingestionStatus;
    return this;
  }

   /**
   * Get ingestionStatus
   * @return ingestionStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IngestionStatus getIngestionStatus() {
    return ingestionStatus;
  }


  public void setIngestionStatus(IngestionStatus ingestionStatus) {
    this.ingestionStatus = ingestionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventWithStatus eventWithStatus = (EventWithStatus) o;
    return Objects.equals(this.eventPayload, eventWithStatus.eventPayload) &&
        Objects.equals(this.ingestionStatus, eventWithStatus.ingestionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventPayload, ingestionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventWithStatus {\n");
    sb.append("    eventPayload: ").append(toIndentedString(eventPayload)).append("\n");
    sb.append("    ingestionStatus: ").append(toIndentedString(ingestionStatus)).append("\n");
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

}

