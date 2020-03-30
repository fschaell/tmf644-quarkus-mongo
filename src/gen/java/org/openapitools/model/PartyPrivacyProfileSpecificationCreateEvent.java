package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.PartyPrivacyProfileSpecificationCreateEventPayload;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The notification data structure
 **/
public class PartyPrivacyProfileSpecificationCreateEvent   {
  
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
  private @Valid PartyPrivacyProfileSpecificationCreateEventPayload event;

  /**
   * Identifier of the Process flow
   **/
  public PartyPrivacyProfileSpecificationCreateEvent id(String id) {
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
  public PartyPrivacyProfileSpecificationCreateEvent href(String href) {
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
  public PartyPrivacyProfileSpecificationCreateEvent eventId(String eventId) {
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
  public PartyPrivacyProfileSpecificationCreateEvent eventTime(Date eventTime) {
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
  public PartyPrivacyProfileSpecificationCreateEvent eventType(String eventType) {
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
  public PartyPrivacyProfileSpecificationCreateEvent correlationId(String correlationId) {
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
  public PartyPrivacyProfileSpecificationCreateEvent domain(String domain) {
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
  public PartyPrivacyProfileSpecificationCreateEvent title(String title) {
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
  public PartyPrivacyProfileSpecificationCreateEvent description(String description) {
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
  public PartyPrivacyProfileSpecificationCreateEvent priority(String priority) {
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
  public PartyPrivacyProfileSpecificationCreateEvent timeOcurred(Date timeOcurred) {
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
  public PartyPrivacyProfileSpecificationCreateEvent event(PartyPrivacyProfileSpecificationCreateEventPayload event) {
    this.event = event;
    return this;
  }

  
  @JsonProperty("event")
  public PartyPrivacyProfileSpecificationCreateEventPayload getEvent() {
    return event;
  }
  public void setEvent(PartyPrivacyProfileSpecificationCreateEventPayload event) {
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
    PartyPrivacyProfileSpecificationCreateEvent partyPrivacyProfileSpecificationCreateEvent = (PartyPrivacyProfileSpecificationCreateEvent) o;
    return Objects.equals(this.id, partyPrivacyProfileSpecificationCreateEvent.id) &&
        Objects.equals(this.href, partyPrivacyProfileSpecificationCreateEvent.href) &&
        Objects.equals(this.eventId, partyPrivacyProfileSpecificationCreateEvent.eventId) &&
        Objects.equals(this.eventTime, partyPrivacyProfileSpecificationCreateEvent.eventTime) &&
        Objects.equals(this.eventType, partyPrivacyProfileSpecificationCreateEvent.eventType) &&
        Objects.equals(this.correlationId, partyPrivacyProfileSpecificationCreateEvent.correlationId) &&
        Objects.equals(this.domain, partyPrivacyProfileSpecificationCreateEvent.domain) &&
        Objects.equals(this.title, partyPrivacyProfileSpecificationCreateEvent.title) &&
        Objects.equals(this.description, partyPrivacyProfileSpecificationCreateEvent.description) &&
        Objects.equals(this.priority, partyPrivacyProfileSpecificationCreateEvent.priority) &&
        Objects.equals(this.timeOcurred, partyPrivacyProfileSpecificationCreateEvent.timeOcurred) &&
        Objects.equals(this.event, partyPrivacyProfileSpecificationCreateEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecificationCreateEvent {\n");
    
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

