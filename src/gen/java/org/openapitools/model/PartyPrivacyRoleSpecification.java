package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AgreementSpecificationRef;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A PartyPrivacyRoleSpecification represents a specification of a role defined in the context of a given privacy spesification, such as Customer, User.
 **/
public class PartyPrivacyRoleSpecification   {
  
  private @Valid String description;
  private @Valid String name;
  private @Valid List<AgreementSpecificationRef> agreementSpecification = new ArrayList<AgreementSpecificationRef>();
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   * An explanatory text documenting the role specification
   **/
  public PartyPrivacyRoleSpecification description(String description) {
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
   * The name of the role specification. This name uniquely identifies the role specification
   **/
  public PartyPrivacyRoleSpecification name(String name) {
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
   **/
  public PartyPrivacyRoleSpecification agreementSpecification(List<AgreementSpecificationRef> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

  
  @JsonProperty("agreementSpecification")
  public List<AgreementSpecificationRef> getAgreementSpecification() {
    return agreementSpecification;
  }
  public void setAgreementSpecification(List<AgreementSpecificationRef> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public PartyPrivacyRoleSpecification atBaseType(String atBaseType) {
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
  public PartyPrivacyRoleSpecification atSchemaLocation(URI atSchemaLocation) {
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
  public PartyPrivacyRoleSpecification atType(String atType) {
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
    PartyPrivacyRoleSpecification partyPrivacyRoleSpecification = (PartyPrivacyRoleSpecification) o;
    return Objects.equals(this.description, partyPrivacyRoleSpecification.description) &&
        Objects.equals(this.name, partyPrivacyRoleSpecification.name) &&
        Objects.equals(this.agreementSpecification, partyPrivacyRoleSpecification.agreementSpecification) &&
        Objects.equals(this.atBaseType, partyPrivacyRoleSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyRoleSpecification.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyRoleSpecification.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, agreementSpecification, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyRoleSpecification {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
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

