package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.model.PartyPrivacyProfileSpecificationCharacteristic;
import org.openapitools.model.PartyPrivacyRoleSpecification;
import org.openapitools.model.ProductOfferingRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Party Privacy Profile Specification serves as a template for creating Privacy Profiles. The specification defines characteristics for the profile. For example there might be a profile specification for residential customers, and a different specification for partners. Skipped properties: id,href
 **/
public class PartyPrivacyProfileSpecificationUpdate   {
  
  private @Valid String description;
  private @Valid Date lastUpdate;
  private @Valid String name;
  private @Valid String status;
  private @Valid String version;
  private @Valid List<PartyPrivacyRoleSpecification> applicableRole = new ArrayList<PartyPrivacyRoleSpecification>();
  private @Valid List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic = new ArrayList<PartyPrivacyProfileSpecificationCharacteristic>();
  private @Valid List<ProductOfferingRef> productOffering = new ArrayList<ProductOfferingRef>();
  private @Valid List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
  private @Valid TimePeriod validFor;
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   * Description of the specification
   **/
  public PartyPrivacyProfileSpecificationUpdate description(String description) {
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
   * Date and time when the specification was last updated
   **/
  public PartyPrivacyProfileSpecificationUpdate lastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  
  @JsonProperty("lastUpdate")
  public Date getLastUpdate() {
    return lastUpdate;
  }
  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * Name of the specification
   **/
  public PartyPrivacyProfileSpecificationUpdate name(String name) {
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
   * Lifecycle status of the specification (e.g. In Design, Active, Rejected, Retired)
   **/
  public PartyPrivacyProfileSpecificationUpdate status(String status) {
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
   * The version of the specification, in case it is desired to maintain multiple versions of profile specifications
   **/
  public PartyPrivacyProfileSpecificationUpdate version(String version) {
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
   * A list of roles to which this specification can apply. For example: Shop Agent, Call Center Agent.
   **/
  public PartyPrivacyProfileSpecificationUpdate applicableRole(List<PartyPrivacyRoleSpecification> applicableRole) {
    this.applicableRole = applicableRole;
    return this;
  }

  
  @JsonProperty("applicableRole")
  public List<PartyPrivacyRoleSpecification> getApplicableRole() {
    return applicableRole;
  }
  public void setApplicableRole(List<PartyPrivacyRoleSpecification> applicableRole) {
    this.applicableRole = applicableRole;
  }

  /**
   * List of characteristics of the specification, whose values would typically be supplied when the profile is instantiated
   **/
  public PartyPrivacyProfileSpecificationUpdate partyPrivacyProfileSpecCharacteristic(List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic) {
    this.partyPrivacyProfileSpecCharacteristic = partyPrivacyProfileSpecCharacteristic;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfileSpecCharacteristic")
  public List<PartyPrivacyProfileSpecificationCharacteristic> getPartyPrivacyProfileSpecCharacteristic() {
    return partyPrivacyProfileSpecCharacteristic;
  }
  public void setPartyPrivacyProfileSpecCharacteristic(List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic) {
    this.partyPrivacyProfileSpecCharacteristic = partyPrivacyProfileSpecCharacteristic;
  }

  /**
   **/
  public PartyPrivacyProfileSpecificationUpdate productOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  
  @JsonProperty("productOffering")
  public List<ProductOfferingRef> getProductOffering() {
    return productOffering;
  }
  public void setProductOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
  }

  /**
   * List of parties or party roles involved in the definition or management of the specification
   **/
  public PartyPrivacyProfileSpecificationUpdate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  /**
   **/
  public PartyPrivacyProfileSpecificationUpdate validFor(TimePeriod validFor) {
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
  public PartyPrivacyProfileSpecificationUpdate atBaseType(String atBaseType) {
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
  public PartyPrivacyProfileSpecificationUpdate atSchemaLocation(URI atSchemaLocation) {
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
  public PartyPrivacyProfileSpecificationUpdate atType(String atType) {
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
    PartyPrivacyProfileSpecificationUpdate partyPrivacyProfileSpecificationUpdate = (PartyPrivacyProfileSpecificationUpdate) o;
    return Objects.equals(this.description, partyPrivacyProfileSpecificationUpdate.description) &&
        Objects.equals(this.lastUpdate, partyPrivacyProfileSpecificationUpdate.lastUpdate) &&
        Objects.equals(this.name, partyPrivacyProfileSpecificationUpdate.name) &&
        Objects.equals(this.status, partyPrivacyProfileSpecificationUpdate.status) &&
        Objects.equals(this.version, partyPrivacyProfileSpecificationUpdate.version) &&
        Objects.equals(this.applicableRole, partyPrivacyProfileSpecificationUpdate.applicableRole) &&
        Objects.equals(this.partyPrivacyProfileSpecCharacteristic, partyPrivacyProfileSpecificationUpdate.partyPrivacyProfileSpecCharacteristic) &&
        Objects.equals(this.productOffering, partyPrivacyProfileSpecificationUpdate.productOffering) &&
        Objects.equals(this.relatedParty, partyPrivacyProfileSpecificationUpdate.relatedParty) &&
        Objects.equals(this.validFor, partyPrivacyProfileSpecificationUpdate.validFor) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileSpecificationUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileSpecificationUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileSpecificationUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, lastUpdate, name, status, version, applicableRole, partyPrivacyProfileSpecCharacteristic, productOffering, relatedParty, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecificationUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    applicableRole: ").append(toIndentedString(applicableRole)).append("\n");
    sb.append("    partyPrivacyProfileSpecCharacteristic: ").append(toIndentedString(partyPrivacyProfileSpecCharacteristic)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

