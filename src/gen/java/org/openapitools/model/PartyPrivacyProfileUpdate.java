package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PartyPrivacyAgreementRef;
import org.openapitools.model.PartyPrivacyProfileCharacteristic;
import org.openapitools.model.PartyPrivacyProfileSpecificationRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A Party Privacy Profile represents the set of Privacy settings defined for a Party Skipped properties: id,href,creationDate
 **/
public class PartyPrivacyProfileUpdate   {
  
  private @Valid String description;
  private @Valid String name;
  private @Valid String status;
  private @Valid RelatedParty agreedByParty;
  private @Valid PartyPrivacyAgreementRef agreement;
  private @Valid RelatedParty applicableForParty;
  private @Valid List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristic>();
  private @Valid PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification;
  private @Valid TimePeriod validFor;
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   * Description of the privacy profile
   **/
  public PartyPrivacyProfileUpdate description(String description) {
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
   * Name of the privacy profile
   **/
  public PartyPrivacyProfileUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The status of this profile (such as agreed, created, terminated, etc.)
   **/
  public PartyPrivacyProfileUpdate status(String status) {
    this.status = status;
    return this;
  }

  
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  public PartyPrivacyProfileUpdate agreedByParty(RelatedParty agreedByParty) {
    this.agreedByParty = agreedByParty;
    return this;
  }

  
  @JsonProperty("agreedByParty")
  @NotNull
  public RelatedParty getAgreedByParty() {
    return agreedByParty;
  }
  public void setAgreedByParty(RelatedParty agreedByParty) {
    this.agreedByParty = agreedByParty;
  }

  /**
   **/
  public PartyPrivacyProfileUpdate agreement(PartyPrivacyAgreementRef agreement) {
    this.agreement = agreement;
    return this;
  }

  
  @JsonProperty("agreement")
  public PartyPrivacyAgreementRef getAgreement() {
    return agreement;
  }
  public void setAgreement(PartyPrivacyAgreementRef agreement) {
    this.agreement = agreement;
  }

  /**
   **/
  public PartyPrivacyProfileUpdate applicableForParty(RelatedParty applicableForParty) {
    this.applicableForParty = applicableForParty;
    return this;
  }

  
  @JsonProperty("applicableForParty")
  public RelatedParty getApplicableForParty() {
    return applicableForParty;
  }
  public void setApplicableForParty(RelatedParty applicableForParty) {
    this.applicableForParty = applicableForParty;
  }

  /**
   * List of characteristics of the privacy profile
   **/
  public PartyPrivacyProfileUpdate partyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfileCharacteristic")
  public List<PartyPrivacyProfileCharacteristic> getPartyPrivacyProfileCharacteristic() {
    return partyPrivacyProfileCharacteristic;
  }
  public void setPartyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
  }

  /**
   **/
  public PartyPrivacyProfileUpdate partyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfileSpecification")
  public PartyPrivacyProfileSpecificationRef getPartyPrivacyProfileSpecification() {
    return partyPrivacyProfileSpecification;
  }
  public void setPartyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
  }

  /**
   **/
  public PartyPrivacyProfileUpdate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public PartyPrivacyProfileUpdate atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }
  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   **/
  public PartyPrivacyProfileUpdate atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  
  @JsonProperty("@schemaLocation")
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }
  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   **/
  public PartyPrivacyProfileUpdate atType(String atType) {
    this.atType = atType;
    return this;
  }

  
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }
  public void setAtType(String atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyProfileUpdate partyPrivacyProfileUpdate = (PartyPrivacyProfileUpdate) o;
    return Objects.equals(this.description, partyPrivacyProfileUpdate.description) &&
        Objects.equals(this.name, partyPrivacyProfileUpdate.name) &&
        Objects.equals(this.status, partyPrivacyProfileUpdate.status) &&
        Objects.equals(this.agreedByParty, partyPrivacyProfileUpdate.agreedByParty) &&
        Objects.equals(this.agreement, partyPrivacyProfileUpdate.agreement) &&
        Objects.equals(this.applicableForParty, partyPrivacyProfileUpdate.applicableForParty) &&
        Objects.equals(this.partyPrivacyProfileCharacteristic, partyPrivacyProfileUpdate.partyPrivacyProfileCharacteristic) &&
        Objects.equals(this.partyPrivacyProfileSpecification, partyPrivacyProfileUpdate.partyPrivacyProfileSpecification) &&
        Objects.equals(this.validFor, partyPrivacyProfileUpdate.validFor) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, status, agreedByParty, agreement, applicableForParty, partyPrivacyProfileCharacteristic, partyPrivacyProfileSpecification, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    agreedByParty: ").append(toIndentedString(agreedByParty)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    applicableForParty: ").append(toIndentedString(applicableForParty)).append("\n");
    sb.append("    partyPrivacyProfileCharacteristic: ").append(toIndentedString(partyPrivacyProfileCharacteristic)).append("\n");
    sb.append("    partyPrivacyProfileSpecification: ").append(toIndentedString(partyPrivacyProfileSpecification)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

