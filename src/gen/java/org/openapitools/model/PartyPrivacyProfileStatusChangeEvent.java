package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.PartyPrivacyProfileStatusChangeEventPayload;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The notification data structure
 **/
public class PartyPrivacyProfileStatusChangeEvent   {
  
  private @Valid String id;
  private @Valid String href;
  private @Valid String eventId;
  private @Valid Date eventTime;
  private @Valid String eventType;
  private @Valid String correlationId;
  private @Valid String domain;
  private @Valid String title;
  private @Valid String description;
  private @Valid String priority;
  private @Valid Date timeOcurred;
  private @Valid PartyPrivacyProfileStatusChangeEventPayload event;

  /**
   * Identifier of the Process flow
   **/
  public PartyPrivacyProfileStatusChangeEvent id(String id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the ProcessFlow
   **/
  public PartyPrivacyProfileStatusChangeEvent href(String href) {
    this.href = href;
    return this;
  }

  
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * The identifier of the notification.
   **/
  public PartyPrivacyProfileStatusChangeEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Time of the event occurrence.
   **/
  public PartyPrivacyProfileStatusChangeEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  /**
   * The type of the notification.
   **/
  public PartyPrivacyProfileStatusChangeEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  /**
   * The correlation id for this event.
   **/
  public PartyPrivacyProfileStatusChangeEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  /**
   * The domain of the event.
   **/
  public PartyPrivacyProfileStatusChangeEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * The title of the event.
   **/
  public PartyPrivacyProfileStatusChangeEvent title(String title) {
    this.title = title;
    return this;
  }

  
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * An explnatory of the event.
   **/
  public PartyPrivacyProfileStatusChangeEvent description(String description) {
    this.description = description;
    return this;
  }

  
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A priority.
   **/
  public PartyPrivacyProfileStatusChangeEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }
  public void setPriority(String priority) {
    this.priority = priority;
  }

  /**
   * The time the event occured.
   **/
  public PartyPrivacyProfileStatusChangeEvent timeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  
  @JsonProperty("timeOcurred")
  public Date getTimeOcurred() {
    return timeOcurred;
  }
  public void setTimeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  /**
   **/
  public PartyPrivacyProfileStatusChangeEvent event(PartyPrivacyProfileStatusChangeEventPayload event) {
    this.event = event;
    return this;
  }

  
  @JsonProperty("event")
  public PartyPrivacyProfileStatusChangeEventPayload getEvent() {
    return event;
  }
  public void setEvent(PartyPrivacyProfileStatusChangeEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyProfileStatusChangeEvent partyPrivacyProfileStatusChangeEvent = (PartyPrivacyProfileStatusChangeEvent) o;
    return Objects.equals(this.id, partyPrivacyProfileStatusChangeEvent.id) &&
        Objects.equals(this.href, partyPrivacyProfileStatusChangeEvent.href) &&
        Objects.equals(this.eventId, partyPrivacyProfileStatusChangeEvent.eventId) &&
        Objects.equals(this.eventTime, partyPrivacyProfileStatusChangeEvent.eventTime) &&
        Objects.equals(this.eventType, partyPrivacyProfileStatusChangeEvent.eventType) &&
        Objects.equals(this.correlationId, partyPrivacyProfileStatusChangeEvent.correlationId) &&
        Objects.equals(this.domain, partyPrivacyProfileStatusChangeEvent.domain) &&
        Objects.equals(this.title, partyPrivacyProfileStatusChangeEvent.title) &&
        Objects.equals(this.description, partyPrivacyProfileStatusChangeEvent.description) &&
        Objects.equals(this.priority, partyPrivacyProfileStatusChangeEvent.priority) &&
        Objects.equals(this.timeOcurred, partyPrivacyProfileStatusChangeEvent.timeOcurred) &&
        Objects.equals(this.event, partyPrivacyProfileStatusChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileStatusChangeEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

