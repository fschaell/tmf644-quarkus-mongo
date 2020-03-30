package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import java.net.URI;
import java.util.Date;
import java.util.Objects;


/**
 * A business participant that is responsible for approving the agreement.
 **/
public class AgreementAuthorizationEntity {

  private @Valid Date date;
  private @Valid String signatureRepresentation;
  private @Valid String state;
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   * The date associated with the authorization state.
   **/
  public AgreementAuthorizationEntity date(Date date) {
    this.date = date;
    return this;
  }


  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Indication that represents whether the signature is a physical paper signature or a digital signature.
   **/
  public AgreementAuthorizationEntity signatureRepresentation(String signatureRepresentation) {
    this.signatureRepresentation = signatureRepresentation;
    return this;
  }


  @JsonProperty("signatureRepresentation")
  public String getSignatureRepresentation() {
    return signatureRepresentation;
  }
  public void setSignatureRepresentation(String signatureRepresentation) {
    this.signatureRepresentation = signatureRepresentation;
  }

  /**
   * Current status of the authorization, for example in process, approved, rejected.
   **/
  public AgreementAuthorizationEntity state(String state) {
    this.state = state;
    return this;
  }


  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public AgreementAuthorizationEntity atBaseType(String atBaseType) {
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
  public AgreementAuthorizationEntity atSchemaLocation(URI atSchemaLocation) {
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
  public AgreementAuthorizationEntity atType(String atType) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementAuthorizationEntity agreementAuthorization = (AgreementAuthorizationEntity) o;
    return Objects.equals(this.date, agreementAuthorization.date) &&
        Objects.equals(this.signatureRepresentation, agreementAuthorization.signatureRepresentation) &&
        Objects.equals(this.state, agreementAuthorization.state) &&
        Objects.equals(this.atBaseType, agreementAuthorization.atBaseType) &&
        Objects.equals(this.atSchemaLocation, agreementAuthorization.atSchemaLocation) &&
        Objects.equals(this.atType, agreementAuthorization.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, signatureRepresentation, state, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAuthorization {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    signatureRepresentation: ").append(toIndentedString(signatureRepresentation)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

