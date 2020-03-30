package org.openapitools.model;

import org.openapitools.model.PartyPrivacyProfile;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The event data structure
 **/
public class PartyPrivacyProfileAttributeValueChangeEventPayload   {
  
  private @Valid PartyPrivacyProfile partyPrivacyProfile;

  /**
   **/
  public PartyPrivacyProfileAttributeValueChangeEventPayload partyPrivacyProfile(PartyPrivacyProfile partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfile")
  public PartyPrivacyProfile getPartyPrivacyProfile() {
    return partyPrivacyProfile;
  }
  public void setPartyPrivacyProfile(PartyPrivacyProfile partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyProfileAttributeValueChangeEventPayload partyPrivacyProfileAttributeValueChangeEventPayload = (PartyPrivacyProfileAttributeValueChangeEventPayload) o;
    return Objects.equals(this.partyPrivacyProfile, partyPrivacyProfileAttributeValueChangeEventPayload.partyPrivacyProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileAttributeValueChangeEventPayload {\n");
    
    sb.append("    partyPrivacyProfile: ").append(toIndentedString(partyPrivacyProfile)).append("\n");
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

