package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Sets the communication endpoint address the service instance must use to deliver notification information
 **/
public class EventSubscription   {
  
  private @Valid String id;
  private @Valid String callback;
  private @Valid String query;

  /**
   * Id of the listener
   **/
  public EventSubscription id(String id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The callback being registered.
   **/
  public EventSubscription callback(String callback) {
    this.callback = callback;
    return this;
  }

  
  @JsonProperty("callback")
  @NotNull
  public String getCallback() {
    return callback;
  }
  public void setCallback(String callback) {
    this.callback = callback;
  }

  /**
   * additional data to be passed
   **/
  public EventSubscription query(String query) {
    this.query = query;
    return this;
  }

  
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscription eventSubscription = (EventSubscription) o;
    return Objects.equals(this.id, eventSubscription.id) &&
        Objects.equals(this.callback, eventSubscription.callback) &&
        Objects.equals(this.query, eventSubscription.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, callback, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

