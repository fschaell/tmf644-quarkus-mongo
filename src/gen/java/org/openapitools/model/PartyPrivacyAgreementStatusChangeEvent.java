package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.PartyPrivacyAgreementStatusChangeEventPayload;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The notification data structure
 **/
public class PartyPrivacyAgreementStatusChangeEvent   {
  
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
  private @Valid PartyPrivacyAgreementStatusChangeEventPayload event;

  /**
   * Identifier of the Process flow
   **/
  public PartyPrivacyAgreementStatusChangeEvent id(String id) {
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
  public PartyPrivacyAgreementStatusChangeEvent href(String href) {
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
  public PartyPrivacyAgreementStatusChangeEvent eventId(String eventId) {
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
  public PartyPrivacyAgreementStatusChangeEvent eventTime(Date eventTime) {
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
  public PartyPrivacyAgreementStatusChangeEvent eventType(String eventType) {
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
  public PartyPrivacyAgreementStatusChangeEvent correlationId(String correlationId) {
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
  public PartyPrivacyAgreementStatusChangeEvent domain(String domain) {
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
  public PartyPrivacyAgreementStatusChangeEvent title(String title) {
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
  public PartyPrivacyAgreementStatusChangeEvent description(String description) {
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
  public PartyPrivacyAgreementStatusChangeEvent priority(String priority) {
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
  public PartyPrivacyAgreementStatusChangeEvent timeOcurred(Date timeOcurred) {
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
  public PartyPrivacyAgreementStatusChangeEvent event(PartyPrivacyAgreementStatusChangeEventPayload event) {
    this.event = event;
    return this;
  }

  
  @JsonProperty("event")
  public PartyPrivacyAgreementStatusChangeEventPayload getEvent() {
    return event;
  }
  public void setEvent(PartyPrivacyAgreementStatusChangeEventPayload event) {
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
    PartyPrivacyAgreementStatusChangeEvent partyPrivacyAgreementStatusChangeEvent = (PartyPrivacyAgreementStatusChangeEvent) o;
    return Objects.equals(this.id, partyPrivacyAgreementStatusChangeEvent.id) &&
        Objects.equals(this.href, partyPrivacyAgreementStatusChangeEvent.href) &&
        Objects.equals(this.eventId, partyPrivacyAgreementStatusChangeEvent.eventId) &&
        Objects.equals(this.eventTime, partyPrivacyAgreementStatusChangeEvent.eventTime) &&
        Objects.equals(this.eventType, partyPrivacyAgreementStatusChangeEvent.eventType) &&
        Objects.equals(this.correlationId, partyPrivacyAgreementStatusChangeEvent.correlationId) &&
        Objects.equals(this.domain, partyPrivacyAgreementStatusChangeEvent.domain) &&
        Objects.equals(this.title, partyPrivacyAgreementStatusChangeEvent.title) &&
        Objects.equals(this.description, partyPrivacyAgreementStatusChangeEvent.description) &&
        Objects.equals(this.priority, partyPrivacyAgreementStatusChangeEvent.priority) &&
        Objects.equals(this.timeOcurred, partyPrivacyAgreementStatusChangeEvent.timeOcurred) &&
        Objects.equals(this.event, partyPrivacyAgreementStatusChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyAgreementStatusChangeEvent {\n");
    
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

