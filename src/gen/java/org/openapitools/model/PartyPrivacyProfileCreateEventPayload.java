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
public class PartyPrivacyProfileCreateEventPayload   {
  
  private @Valid PartyPrivacyProfile partyPrivacyProfile;

  /**
   **/
  public PartyPrivacyProfileCreateEventPayload partyPrivacyProfile(PartyPrivacyProfile partyPrivacyProfile) {
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
    PartyPrivacyProfileCreateEventPayload partyPrivacyProfileCreateEventPayload = (PartyPrivacyProfileCreateEventPayload) o;
    return Objects.equals(this.partyPrivacyProfile, partyPrivacyProfileCreateEventPayload.partyPrivacyProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileCreateEventPayload {\n");
    
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

