package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RelatedParty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A characteristic for an instantiated party profile, where the value indicates the allowed use of the characteristic
 **/
public class PartyPrivacyProfileCharacteristic   {
  
  private @Valid String id;
  private @Valid String name;
  private @Valid String privacyUsagePurpose;
  private @Valid String valueType;
  private @Valid List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
  private @Valid Object value;
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   **/
  public PartyPrivacyProfileCharacteristic id(String id) {
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
   * Name of the characteristic
   **/
  public PartyPrivacyProfileCharacteristic name(String name) {
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
   * Defines the purpose authorized or refused for the characteristic (e.g. ADMIN, INFORMATION, MARKETING, RESEARCH, etc.
   **/
  public PartyPrivacyProfileCharacteristic privacyUsagePurpose(String privacyUsagePurpose) {
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
   * Data type of the value of the characteristic
   **/
  public PartyPrivacyProfileCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @JsonProperty("valueType")
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * A list of parties to which the allowed use of the characteristic applies.
   **/
  public PartyPrivacyProfileCharacteristic relatedParty(List<RelatedParty> relatedParty) {
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
  public PartyPrivacyProfileCharacteristic value(Object value) {
    this.value = value;
    return this;
  }

  
  @JsonProperty("value")
  @NotNull
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public PartyPrivacyProfileCharacteristic atBaseType(String atBaseType) {
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
  public PartyPrivacyProfileCharacteristic atSchemaLocation(URI atSchemaLocation) {
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
  public PartyPrivacyProfileCharacteristic atType(String atType) {
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
    PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic = (PartyPrivacyProfileCharacteristic) o;
    return Objects.equals(this.id, partyPrivacyProfileCharacteristic.id) &&
        Objects.equals(this.name, partyPrivacyProfileCharacteristic.name) &&
        Objects.equals(this.privacyUsagePurpose, partyPrivacyProfileCharacteristic.privacyUsagePurpose) &&
        Objects.equals(this.valueType, partyPrivacyProfileCharacteristic.valueType) &&
        Objects.equals(this.relatedParty, partyPrivacyProfileCharacteristic.relatedParty) &&
        Objects.equals(this.value, partyPrivacyProfileCharacteristic.value) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileCharacteristic.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileCharacteristic.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileCharacteristic.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, privacyUsagePurpose, valueType, relatedParty, value, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileCharacteristic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyUsagePurpose: ").append(toIndentedString(privacyUsagePurpose)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

