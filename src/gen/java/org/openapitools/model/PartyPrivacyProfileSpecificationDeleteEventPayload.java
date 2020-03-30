package org.openapitools.model;

import org.openapitools.model.PartyPrivacyProfileSpecification;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The event data structure
 **/
public class PartyPrivacyProfileSpecificationDeleteEventPayload   {
  
  private @Valid PartyPrivacyProfileSpecification partyPrivacyProfileSpecification;

  /**
   **/
  public PartyPrivacyProfileSpecificationDeleteEventPayload partyPrivacyProfileSpecification(PartyPrivacyProfileSpecification partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfileSpecification")
  public PartyPrivacyProfileSpecification getPartyPrivacyProfileSpecification() {
    return partyPrivacyProfileSpecification;
  }
  public void setPartyPrivacyProfileSpecification(PartyPrivacyProfileSpecification partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyProfileSpecificationDeleteEventPayload partyPrivacyProfileSpecificationDeleteEventPayload = (PartyPrivacyProfileSpecificationDeleteEventPayload) o;
    return Objects.equals(this.partyPrivacyProfileSpecification, partyPrivacyProfileSpecificationDeleteEventPayload.partyPrivacyProfileSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyProfileSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecificationDeleteEventPayload {\n");
    
    sb.append("    partyPrivacyProfileSpecification: ").append(toIndentedString(partyPrivacyProfileSpecification)).append("\n");
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

