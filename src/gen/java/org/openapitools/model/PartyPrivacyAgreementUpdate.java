package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.model.AgreementAuthorization;
import org.openapitools.model.AgreementItem;
import org.openapitools.model.AgreementRef;
import org.openapitools.model.AgreementSpecificationRef;
import org.openapitools.model.Characteristic;
import org.openapitools.model.PartyPrivacyProfileCharacteristic;
import org.openapitools.model.PartyPrivacyProfileRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A specific type of agreement that formalizes the privacy profiles requested for a party Skipped properties: id,href
 **/
public class PartyPrivacyAgreementUpdate   {
  
  private @Valid String agreementType;
  private @Valid String description;
  private @Valid Integer documentNumber;
  private @Valid Date initialDate;
  private @Valid String name;
  private @Valid String statementOfIntent;
  private @Valid String status;
  private @Valid String version;
  private @Valid List<AgreementAuthorization> agreementAuthorization = new ArrayList<AgreementAuthorization>();
  private @Valid List<AgreementItem> agreementItem = new ArrayList<AgreementItem>();
  private @Valid TimePeriod agreementPeriod;
  private @Valid AgreementSpecificationRef agreementSpecification;
  private @Valid List<AgreementRef> associatedAgreement = new ArrayList<AgreementRef>();
  private @Valid List<Characteristic> characteristic = new ArrayList<Characteristic>();
  private @Valid TimePeriod completionDate;
  private @Valid List<RelatedParty> engagedPartyRole = new ArrayList<RelatedParty>();
  private @Valid List<PartyPrivacyProfileRef> partyPrivacyProfile = new ArrayList<PartyPrivacyProfileRef>();
  private @Valid List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristic>();
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   * The type of the agreement. For example commercial
   **/
  public PartyPrivacyAgreementUpdate agreementType(String agreementType) {
    this.agreementType = agreementType;
    return this;
  }

  
  @JsonProperty("agreementType")
  @NotNull
  public String getAgreementType() {
    return agreementType;
  }
  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }

  /**
   * Narrative that explains the agreement and details about the it , such as why the agreement is taking place.
   **/
  public PartyPrivacyAgreementUpdate description(String description) {
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
   * A reference number assigned to an Agreement that follows a prescribed numbering system.
   **/
  public PartyPrivacyAgreementUpdate documentNumber(Integer documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  
  @JsonProperty("documentNumber")
  public Integer getDocumentNumber() {
    return documentNumber;
  }
  public void setDocumentNumber(Integer documentNumber) {
    this.documentNumber = documentNumber;
  }

  /**
   * Date at which the agreement was initialized
   **/
  public PartyPrivacyAgreementUpdate initialDate(Date initialDate) {
    this.initialDate = initialDate;
    return this;
  }

  
  @JsonProperty("initialDate")
  public Date getInitialDate() {
    return initialDate;
  }
  public void setInitialDate(Date initialDate) {
    this.initialDate = initialDate;
  }

  /**
   * A human-readable name for the agreement
   **/
  public PartyPrivacyAgreementUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * An overview and goals of the Agreement
   **/
  public PartyPrivacyAgreementUpdate statementOfIntent(String statementOfIntent) {
    this.statementOfIntent = statementOfIntent;
    return this;
  }

  
  @JsonProperty("statementOfIntent")
  public String getStatementOfIntent() {
    return statementOfIntent;
  }
  public void setStatementOfIntent(String statementOfIntent) {
    this.statementOfIntent = statementOfIntent;
  }

  /**
   * The current status of the agreement. Typical values are: in process, approved and rejected
   **/
  public PartyPrivacyAgreementUpdate status(String status) {
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
   * A string identifying the version of the agreement
   **/
  public PartyPrivacyAgreementUpdate version(String version) {
    this.version = version;
    return this;
  }

  
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  public PartyPrivacyAgreementUpdate agreementAuthorization(List<AgreementAuthorization> agreementAuthorization) {
    this.agreementAuthorization = agreementAuthorization;
    return this;
  }

  
  @JsonProperty("agreementAuthorization")
  public List<AgreementAuthorization> getAgreementAuthorization() {
    return agreementAuthorization;
  }
  public void setAgreementAuthorization(List<AgreementAuthorization> agreementAuthorization) {
    this.agreementAuthorization = agreementAuthorization;
  }

  /**
   **/
  public PartyPrivacyAgreementUpdate agreementItem(List<AgreementItem> agreementItem) {
    this.agreementItem = agreementItem;
    return this;
  }

  
  @JsonProperty("agreementItem")
  @NotNull
 @Size(min=1)  public List<AgreementItem> getAgreementItem() {
    return agreementItem;
  }
  public void setAgreementItem(List<AgreementItem> agreementItem) {
    this.agreementItem = agreementItem;
  }

  /**
   **/
  public PartyPrivacyAgreementUpdate agreementPeriod(TimePeriod agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
    return this;
  }

  
  @JsonProperty("agreementPeriod")
  public TimePeriod getAgreementPeriod() {
    return agreementPeriod;
  }
  public void setAgreementPeriod(TimePeriod agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
  }

  /**
   **/
  public PartyPrivacyAgreementUpdate agreementSpecification(AgreementSpecificationRef agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

  
  @JsonProperty("agreementSpecification")
  public AgreementSpecificationRef getAgreementSpecification() {
    return agreementSpecification;
  }
  public void setAgreementSpecification(AgreementSpecificationRef agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }

  /**
   **/
  public PartyPrivacyAgreementUpdate associatedAgreement(List<AgreementRef> associatedAgreement) {
    this.associatedAgreement = associatedAgreement;
    return this;
  }

  
  @JsonProperty("associatedAgreement")
  public List<AgreementRef> getAssociatedAgreement() {
    return associatedAgreement;
  }
  public void setAssociatedAgreement(List<AgreementRef> associatedAgreement) {
    this.associatedAgreement = associatedAgreement;
  }

  /**
   **/
  public PartyPrivacyAgreementUpdate characteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  
  @JsonProperty("characteristic")
  public List<Characteristic> getCharacteristic() {
    return characteristic;
  }
  public void setCharacteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
  }

  /**
   **/
  public PartyPrivacyAgreementUpdate completionDate(TimePeriod completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  
  @JsonProperty("completionDate")
  public TimePeriod getCompletionDate() {
    return completionDate;
  }
  public void setCompletionDate(TimePeriod completionDate) {
    this.completionDate = completionDate;
  }

  /**
   **/
  public PartyPrivacyAgreementUpdate engagedPartyRole(List<RelatedParty> engagedPartyRole) {
    this.engagedPartyRole = engagedPartyRole;
    return this;
  }

  
  @JsonProperty("engagedPartyRole")
  @NotNull
 @Size(min=1)  public List<RelatedParty> getEngagedPartyRole() {
    return engagedPartyRole;
  }
  public void setEngagedPartyRole(List<RelatedParty> engagedPartyRole) {
    this.engagedPartyRole = engagedPartyRole;
  }

  /**
   * The privacy profiles that are the subject of the agreement
   **/
  public PartyPrivacyAgreementUpdate partyPrivacyProfile(List<PartyPrivacyProfileRef> partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfile")
  public List<PartyPrivacyProfileRef> getPartyPrivacyProfile() {
    return partyPrivacyProfile;
  }
  public void setPartyPrivacyProfile(List<PartyPrivacyProfileRef> partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
  }

  /**
   * A list of (typically) high criticality characteristics whose chosen privacy rules are included in the agreement
   **/
  public PartyPrivacyAgreementUpdate partyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
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
   * When sub-classing, this defines the super-class
   **/
  public PartyPrivacyAgreementUpdate atBaseType(String atBaseType) {
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
  public PartyPrivacyAgreementUpdate atSchemaLocation(URI atSchemaLocation) {
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
  public PartyPrivacyAgreementUpdate atType(String atType) {
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
    PartyPrivacyAgreementUpdate partyPrivacyAgreementUpdate = (PartyPrivacyAgreementUpdate) o;
    return Objects.equals(this.agreementType, partyPrivacyAgreementUpdate.agreementType) &&
        Objects.equals(this.description, partyPrivacyAgreementUpdate.description) &&
        Objects.equals(this.documentNumber, partyPrivacyAgreementUpdate.documentNumber) &&
        Objects.equals(this.initialDate, partyPrivacyAgreementUpdate.initialDate) &&
        Objects.equals(this.name, partyPrivacyAgreementUpdate.name) &&
        Objects.equals(this.statementOfIntent, partyPrivacyAgreementUpdate.statementOfIntent) &&
        Objects.equals(this.status, partyPrivacyAgreementUpdate.status) &&
        Objects.equals(this.version, partyPrivacyAgreementUpdate.version) &&
        Objects.equals(this.agreementAuthorization, partyPrivacyAgreementUpdate.agreementAuthorization) &&
        Objects.equals(this.agreementItem, partyPrivacyAgreementUpdate.agreementItem) &&
        Objects.equals(this.agreementPeriod, partyPrivacyAgreementUpdate.agreementPeriod) &&
        Objects.equals(this.agreementSpecification, partyPrivacyAgreementUpdate.agreementSpecification) &&
        Objects.equals(this.associatedAgreement, partyPrivacyAgreementUpdate.associatedAgreement) &&
        Objects.equals(this.characteristic, partyPrivacyAgreementUpdate.characteristic) &&
        Objects.equals(this.completionDate, partyPrivacyAgreementUpdate.completionDate) &&
        Objects.equals(this.engagedPartyRole, partyPrivacyAgreementUpdate.engagedPartyRole) &&
        Objects.equals(this.partyPrivacyProfile, partyPrivacyAgreementUpdate.partyPrivacyProfile) &&
        Objects.equals(this.partyPrivacyProfileCharacteristic, partyPrivacyAgreementUpdate.partyPrivacyProfileCharacteristic) &&
        Objects.equals(this.atBaseType, partyPrivacyAgreementUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyAgreementUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyAgreementUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementType, description, documentNumber, initialDate, name, statementOfIntent, status, version, agreementAuthorization, agreementItem, agreementPeriod, agreementSpecification, associatedAgreement, characteristic, completionDate, engagedPartyRole, partyPrivacyProfile, partyPrivacyProfileCharacteristic, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyAgreementUpdate {\n");
    
    sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    initialDate: ").append(toIndentedString(initialDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statementOfIntent: ").append(toIndentedString(statementOfIntent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    agreementAuthorization: ").append(toIndentedString(agreementAuthorization)).append("\n");
    sb.append("    agreementItem: ").append(toIndentedString(agreementItem)).append("\n");
    sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
    sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
    sb.append("    associatedAgreement: ").append(toIndentedString(associatedAgreement)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    engagedPartyRole: ").append(toIndentedString(engagedPartyRole)).append("\n");
    sb.append("    partyPrivacyProfile: ").append(toIndentedString(partyPrivacyProfile)).append("\n");
    sb.append("    partyPrivacyProfileCharacteristic: ").append(toIndentedString(partyPrivacyProfileCharacteristic)).append("\n");
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

