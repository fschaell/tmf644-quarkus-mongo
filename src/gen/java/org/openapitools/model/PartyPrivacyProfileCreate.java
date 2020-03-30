package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
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
 * A Party Privacy Profile represents the set of Privacy settings defined for a Party Skipped properties: id,href
 **/
public class PartyPrivacyProfileCreate   {
  
  private @Valid Date creationDate;
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
   * The date on which the PartyPrivacyProfile was created
   **/
  public PartyPrivacyProfileCreate creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Description of the privacy profile
   **/
  public PartyPrivacyProfileCreate description(String description) {
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
  public PartyPrivacyProfileCreate name(String name) {
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
  public PartyPrivacyProfileCreate status(String status) {
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
  public PartyPrivacyProfileCreate agreedByParty(RelatedParty agreedByParty) {
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
  public PartyPrivacyProfileCreate agreement(PartyPrivacyAgreementRef agreement) {
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
  public PartyPrivacyProfileCreate applicableForParty(RelatedParty applicableForParty) {
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
  public PartyPrivacyProfileCreate partyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfileCharacteristic")
  @NotNull
 @Size(min=1)  public List<PartyPrivacyProfileCharacteristic> getPartyPrivacyProfileCharacteristic() {
    return partyPrivacyProfileCharacteristic;
  }
  public void setPartyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
  }

  /**
   **/
  public PartyPrivacyProfileCreate partyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfileSpecification")
  @NotNull
  public PartyPrivacyProfileSpecificationRef getPartyPrivacyProfileSpecification() {
    return partyPrivacyProfileSpecification;
  }
  public void setPartyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
  }

  /**
   **/
  public PartyPrivacyProfileCreate validFor(TimePeriod validFor) {
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
  public PartyPrivacyProfileCreate atBaseType(String atBaseType) {
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
  public PartyPrivacyProfileCreate atSchemaLocation(URI atSchemaLocation) {
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
  public PartyPrivacyProfileCreate atType(String atType) {
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
    PartyPrivacyProfileCreate partyPrivacyProfileCreate = (PartyPrivacyProfileCreate) o;
    return Objects.equals(this.creationDate, partyPrivacyProfileCreate.creationDate) &&
        Objects.equals(this.description, partyPrivacyProfileCreate.description) &&
        Objects.equals(this.name, partyPrivacyProfileCreate.name) &&
        Objects.equals(this.status, partyPrivacyProfileCreate.status) &&
        Objects.equals(this.agreedByParty, partyPrivacyProfileCreate.agreedByParty) &&
        Objects.equals(this.agreement, partyPrivacyProfileCreate.agreement) &&
        Objects.equals(this.applicableForParty, partyPrivacyProfileCreate.applicableForParty) &&
        Objects.equals(this.partyPrivacyProfileCharacteristic, partyPrivacyProfileCreate.partyPrivacyProfileCharacteristic) &&
        Objects.equals(this.partyPrivacyProfileSpecification, partyPrivacyProfileCreate.partyPrivacyProfileSpecification) &&
        Objects.equals(this.validFor, partyPrivacyProfileCreate.validFor) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileCreate.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, description, name, status, agreedByParty, agreement, applicableForParty, partyPrivacyProfileCharacteristic, partyPrivacyProfileSpecification, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileCreate {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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

