package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.PartyPrivacyAgreementAttributeValueChangeEventPayload;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The notification data structure
 **/
public class PartyPrivacyAgreementAttributeValueChangeEvent   {
  
  private @Valid String eventId;
  private @Valid Date eventTime;
  private @Valid String eventType;
  private @Valid String correlationId;
  private @Valid String domain;
  private @Valid String title;
  private @Valid String description;
  private @Valid String priority;
  private @Valid Date timeOcurred;
  private @Valid String fieldPath;
  private @Valid PartyPrivacyAgreementAttributeValueChangeEventPayload event;

  /**
   * The identifier of the notification.
   **/
  public PartyPrivacyAgreementAttributeValueChangeEvent eventId(String eventId) {
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
  public PartyPrivacyAgreementAttributeValueChangeEvent eventTime(Date eventTime) {
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
  public PartyPrivacyAgreementAttributeValueChangeEvent eventType(String eventType) {
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
  public PartyPrivacyAgreementAttributeValueChangeEvent correlationId(String correlationId) {
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
  public PartyPrivacyAgreementAttributeValueChangeEvent domain(String domain) {
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
  public PartyPrivacyAgreementAttributeValueChangeEvent title(String title) {
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
  public PartyPrivacyAgreementAttributeValueChangeEvent description(String description) {
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
  public PartyPrivacyAgreementAttributeValueChangeEvent priority(String priority) {
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
  public PartyPrivacyAgreementAttributeValueChangeEvent timeOcurred(Date timeOcurred) {
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
   * The path identifying the object field concerned by this notification.
   **/
  public PartyPrivacyAgreementAttributeValueChangeEvent fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  
  @JsonProperty("fieldPath")
  public String getFieldPath() {
    return fieldPath;
  }
  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  /**
   **/
  public PartyPrivacyAgreementAttributeValueChangeEvent event(PartyPrivacyAgreementAttributeValueChangeEventPayload event) {
    this.event = event;
    return this;
  }

  
  @JsonProperty("event")
  public PartyPrivacyAgreementAttributeValueChangeEventPayload getEvent() {
    return event;
  }
  public void setEvent(PartyPrivacyAgreementAttributeValueChangeEventPayload event) {
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
    PartyPrivacyAgreementAttributeValueChangeEvent partyPrivacyAgreementAttributeValueChangeEvent = (PartyPrivacyAgreementAttributeValueChangeEvent) o;
    return Objects.equals(this.eventId, partyPrivacyAgreementAttributeValueChangeEvent.eventId) &&
        Objects.equals(this.eventTime, partyPrivacyAgreementAttributeValueChangeEvent.eventTime) &&
        Objects.equals(this.eventType, partyPrivacyAgreementAttributeValueChangeEvent.eventType) &&
        Objects.equals(this.correlationId, partyPrivacyAgreementAttributeValueChangeEvent.correlationId) &&
        Objects.equals(this.domain, partyPrivacyAgreementAttributeValueChangeEvent.domain) &&
        Objects.equals(this.title, partyPrivacyAgreementAttributeValueChangeEvent.title) &&
        Objects.equals(this.description, partyPrivacyAgreementAttributeValueChangeEvent.description) &&
        Objects.equals(this.priority, partyPrivacyAgreementAttributeValueChangeEvent.priority) &&
        Objects.equals(this.timeOcurred, partyPrivacyAgreementAttributeValueChangeEvent.timeOcurred) &&
        Objects.equals(this.fieldPath, partyPrivacyAgreementAttributeValueChangeEvent.fieldPath) &&
        Objects.equals(this.event, partyPrivacyAgreementAttributeValueChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, fieldPath, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyAgreementAttributeValueChangeEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
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

