package org.openapitools.model;

import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 **/
public class TimePeriod   {
  
  private @Valid Date endDateTime;
  private @Valid Date startDateTime;

  /**
   * End of the time period, using IETC-RFC-3339 format
   **/
  public TimePeriod endDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  
  @JsonProperty("endDateTime")
  public Date getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }

  /**
   * Start of the time period, using IETC-RFC-3339 format. If you define a start, you must also define an end
   **/
  public TimePeriod startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  
  @JsonProperty("startDateTime")
  public Date getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(this.endDateTime, timePeriod.endDateTime) &&
        Objects.equals(this.startDateTime, timePeriod.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

