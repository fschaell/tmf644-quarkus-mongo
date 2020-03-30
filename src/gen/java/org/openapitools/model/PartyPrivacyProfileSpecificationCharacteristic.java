package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RoleSpecification;
import org.openapitools.model.SpecificationCharacteristicValue;
import org.openapitools.model.TimePeriod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A characteristic of the party privacy profile, whose value(s) would be supplied at runtime. For example, email address
 **/
public class PartyPrivacyProfileSpecificationCharacteristic   {
  
  private @Valid String id;
  private @Valid String criticalityLevel;
  private @Valid String description;
  private @Valid String name;
  private @Valid String privacyType;
  private @Valid String privacyUsagePurpose;
  private @Valid List<RoleSpecification> allowedRole = new ArrayList<RoleSpecification>();
  private @Valid List<SpecificationCharacteristicValue> partyPrivacyProfileSpecCharacteristicValue = new ArrayList<SpecificationCharacteristicValue>();
  private @Valid TimePeriod validFor;
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   **/
  public PartyPrivacyProfileSpecificationCharacteristic id(String id) {
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
   * Level of criticality for this characteristic of personal identifiable information (e.g. in terms of the damage if this item was breached), such as low, medium, high.
   **/
  public PartyPrivacyProfileSpecificationCharacteristic criticalityLevel(String criticalityLevel) {
    this.criticalityLevel = criticalityLevel;
    return this;
  }

  
  @JsonProperty("criticalityLevel")
  public String getCriticalityLevel() {
    return criticalityLevel;
  }
  public void setCriticalityLevel(String criticalityLevel) {
    this.criticalityLevel = criticalityLevel;
  }

  /**
   * Description of the characteristic
   **/
  public PartyPrivacyProfileSpecificationCharacteristic description(String description) {
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
   * Name of the characteristic
   **/
  public PartyPrivacyProfileSpecificationCharacteristic name(String name) {
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
   * Type of privacy (e.g. Internal Purpose, External Purpose, Internal Retention, External Retention)
   **/
  public PartyPrivacyProfileSpecificationCharacteristic privacyType(String privacyType) {
    this.privacyType = privacyType;
    return this;
  }

  
  @JsonProperty("privacyType")
  public String getPrivacyType() {
    return privacyType;
  }
  public void setPrivacyType(String privacyType) {
    this.privacyType = privacyType;
  }

  /**
   * Defines the purpose authorized or refused for the characteristic (e.g. ADMIN, INFORMATION, MARKETING, RESEARCH).
   **/
  public PartyPrivacyProfileSpecificationCharacteristic privacyUsagePurpose(String privacyUsagePurpose) {
    this.privacyUsagePurpose = privacyUsagePurpose;
    return this;
  }

  
  @JsonProperty("privacyUsagePurpose")
  public String getPrivacyUsagePurpose() {
    return privacyUsagePurpose;
  }
  public void setPrivacyUsagePurpose(String privacyUsagePurpose) {
    this.privacyUsagePurpose = privacyUsagePurpose;
  }

  /**
   * A list of roles in the organization who are allowed access to this characteristic
   **/
  public PartyPrivacyProfileSpecificationCharacteristic allowedRole(List<RoleSpecification> allowedRole) {
    this.allowedRole = allowedRole;
    return this;
  }

  
  @JsonProperty("allowedRole")
  public List<RoleSpecification> getAllowedRole() {
    return allowedRole;
  }
  public void setAllowedRole(List<RoleSpecification> allowedRole) {
    this.allowedRole = allowedRole;
  }

  /**
   * List of values that can be assigned to this characteristic at runtime
   **/
  public PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecCharacteristicValue(List<SpecificationCharacteristicValue> partyPrivacyProfileSpecCharacteristicValue) {
    this.partyPrivacyProfileSpecCharacteristicValue = partyPrivacyProfileSpecCharacteristicValue;
    return this;
  }

  
  @JsonProperty("partyPrivacyProfileSpecCharacteristicValue")
  public List<SpecificationCharacteristicValue> getPartyPrivacyProfileSpecCharacteristicValue() {
    return partyPrivacyProfileSpecCharacteristicValue;
  }
  public void setPartyPrivacyProfileSpecCharacteristicValue(List<SpecificationCharacteristicValue> partyPrivacyProfileSpecCharacteristicValue) {
    this.partyPrivacyProfileSpecCharacteristicValue = partyPrivacyProfileSpecCharacteristicValue;
  }

  /**
   **/
  public PartyPrivacyProfileSpecificationCharacteristic validFor(TimePeriod validFor) {
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
  public PartyPrivacyProfileSpecificationCharacteristic atBaseType(String atBaseType) {
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
  public PartyPrivacyProfileSpecificationCharacteristic atSchemaLocation(URI atSchemaLocation) {
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
  public PartyPrivacyProfileSpecificationCharacteristic atType(String atType) {
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
    PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecificationCharacteristic = (PartyPrivacyProfileSpecificationCharacteristic) o;
    return Objects.equals(this.id, partyPrivacyProfileSpecificationCharacteristic.id) &&
        Objects.equals(this.criticalityLevel, partyPrivacyProfileSpecificationCharacteristic.criticalityLevel) &&
        Objects.equals(this.description, partyPrivacyProfileSpecificationCharacteristic.description) &&
        Objects.equals(this.name, partyPrivacyProfileSpecificationCharacteristic.name) &&
        Objects.equals(this.privacyType, partyPrivacyProfileSpecificationCharacteristic.privacyType) &&
        Objects.equals(this.privacyUsagePurpose, partyPrivacyProfileSpecificationCharacteristic.privacyUsagePurpose) &&
        Objects.equals(this.allowedRole, partyPrivacyProfileSpecificationCharacteristic.allowedRole) &&
        Objects.equals(this.partyPrivacyProfileSpecCharacteristicValue, partyPrivacyProfileSpecificationCharacteristic.partyPrivacyProfileSpecCharacteristicValue) &&
        Objects.equals(this.validFor, partyPrivacyProfileSpecificationCharacteristic.validFor) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileSpecificationCharacteristic.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileSpecificationCharacteristic.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileSpecificationCharacteristic.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, criticalityLevel, description, name, privacyType, privacyUsagePurpose, allowedRole, partyPrivacyProfileSpecCharacteristicValue, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecificationCharacteristic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    criticalityLevel: ").append(toIndentedString(criticalityLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyType: ").append(toIndentedString(privacyType)).append("\n");
    sb.append("    privacyUsagePurpose: ").append(toIndentedString(privacyUsagePurpose)).append("\n");
    sb.append("    allowedRole: ").append(toIndentedString(allowedRole)).append("\n");
    sb.append("    partyPrivacyProfileSpecCharacteristicValue: ").append(toIndentedString(partyPrivacyProfileSpecCharacteristicValue)).append("\n");
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

