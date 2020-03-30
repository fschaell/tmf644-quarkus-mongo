package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AgreementTermOrCondition;
import org.openapitools.model.ProductOfferingRef;
import org.openapitools.model.ProductRef;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A part of the agreement expressed in terms of a product offering and possibly including specific terms and conditions.
 **/
public class AgreementItem   {
  
  private @Valid List<ProductRef> product = new ArrayList<ProductRef>();
  private @Valid List<ProductOfferingRef> productOffering = new ArrayList<ProductOfferingRef>();
  private @Valid List<AgreementTermOrCondition> termOrCondition = new ArrayList<AgreementTermOrCondition>();
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   * The list of products indirectly referred by this agreement item (since an agreement item refers primarily to product offerings)
   **/
  public AgreementItem product(List<ProductRef> product) {
    this.product = product;
    return this;
  }

  
  @JsonProperty("product")
  public List<ProductRef> getProduct() {
    return product;
  }
  public void setProduct(List<ProductRef> product) {
    this.product = product;
  }

  /*
   * The list of product offerings referred by this agreement item
   **/
  public AgreementItem productOffering(List<ProductOfferingRef> productOffering) {
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
   **/
  public AgreementItem termOrCondition(List<AgreementTermOrCondition> termOrCondition) {
    this.termOrCondition = termOrCondition;
    return this;
  }

  
  @JsonProperty("termOrCondition")
  public List<AgreementTermOrCondition> getTermOrCondition() {
    return termOrCondition;
  }
  public void setTermOrCondition(List<AgreementTermOrCondition> termOrCondition) {
    this.termOrCondition = termOrCondition;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public AgreementItem atBaseType(String atBaseType) {
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
  public AgreementItem atSchemaLocation(URI atSchemaLocation) {
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
  public AgreementItem atType(String atType) {
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
    AgreementItem agreementItem = (AgreementItem) o;
    return Objects.equals(this.product, agreementItem.product) &&
        Objects.equals(this.productOffering, agreementItem.productOffering) &&
        Objects.equals(this.termOrCondition, agreementItem.termOrCondition) &&
        Objects.equals(this.atBaseType, agreementItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, agreementItem.atSchemaLocation) &&
        Objects.equals(this.atType, agreementItem.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productOffering, termOrCondition, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementItem {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    termOrCondition: ").append(toIndentedString(termOrCondition)).append("\n");
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

