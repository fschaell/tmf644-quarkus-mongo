package org.openapitools.model;

import org.openapitools.model.PartyPrivacyAgreement;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The event data structure
 **/
public class PartyPrivacyAgreementCreateEventPayload   {
  
  private @Valid PartyPrivacyAgreement partyPrivacyAgreement;

  /**
   **/
  public PartyPrivacyAgreementCreateEventPayload partyPrivacyAgreement(PartyPrivacyAgreement partyPrivacyAgreement) {
    this.partyPrivacyAgreement = partyPrivacyAgreement;
    return this;
  }

  
  @JsonProperty("partyPrivacyAgreement")
  public PartyPrivacyAgreement getPartyPrivacyAgreement() {
    return partyPrivacyAgreement;
  }
  public void setPartyPrivacyAgreement(PartyPrivacyAgreement partyPrivacyAgreement) {
    this.partyPrivacyAgreement = partyPrivacyAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyAgreementCreateEventPayload partyPrivacyAgreementCreateEventPayload = (PartyPrivacyAgreementCreateEventPayload) o;
    return Objects.equals(this.partyPrivacyAgreement, partyPrivacyAgreementCreateEventPayload.partyPrivacyAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyAgreementCreateEventPayload {\n");
    
    sb.append("    partyPrivacyAgreement: ").append(toIndentedString(partyPrivacyAgreement)).append("\n");
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

