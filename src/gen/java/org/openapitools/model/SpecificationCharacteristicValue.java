package org.openapitools.model;

import java.net.URI;
import org.openapitools.model.TimePeriod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A number or text that can be assigned to a SpecificationCharacteristic
 **/
public class SpecificationCharacteristicValue   {
  
  private @Valid Boolean isDefault;
  private @Valid String rangeInterval;
  private @Valid String regex;
  private @Valid String unitOfMeasure;
  private @Valid Integer valueFrom;
  private @Valid Integer valueTo;
  private @Valid String valueType;
  private @Valid TimePeriod validFor;
  private @Valid Object value;
  private @Valid String atBaseType;
  private @Valid URI atSchemaLocation;
  private @Valid String atType;

  /**
   * If true, the Boolean Indicates if the value is the default value for a characteristic
   **/
  public SpecificationCharacteristicValue isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \&quot;open\&quot;, \&quot;closed\&quot;, \&quot;closedBottom\&quot; and \&quot;closedTop\&quot;.
   **/
  public SpecificationCharacteristicValue rangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
    return this;
  }

  
  @JsonProperty("rangeInterval")
  public String getRangeInterval() {
    return rangeInterval;
  }
  public void setRangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
  }

  /**
   * A regular expression constraint for given value
   **/
  public SpecificationCharacteristicValue regex(String regex) {
    this.regex = regex;
    return this;
  }

  
  @JsonProperty("regex")
  public String getRegex() {
    return regex;
  }
  public void setRegex(String regex) {
    this.regex = regex;
  }

  /**
   * unit of measure for the valueCould be minutes, GB, etc
   **/
  public SpecificationCharacteristicValue unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  
  @JsonProperty("unitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }
  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  /**
   * The low range value that a characteristic can take on
   **/
  public SpecificationCharacteristicValue valueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  
  @JsonProperty("valueFrom")
  public Integer getValueFrom() {
    return valueFrom;
  }
  public void setValueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
  }

  /**
   * The upper range value that a characteristic can take on
   **/
  public SpecificationCharacteristicValue valueTo(Integer valueTo) {
    this.valueTo = valueTo;
    return this;
  }

  
  @JsonProperty("valueTo")
  public Integer getValueTo() {
    return valueTo;
  }
  public void setValueTo(Integer valueTo) {
    this.valueTo = valueTo;
  }

  /**
   * A kind of value that the characteristic value can take on, such as numeric, text and so forth
   **/
  public SpecificationCharacteristicValue valueType(String valueType) {
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
   **/
  public SpecificationCharacteristicValue validFor(TimePeriod validFor) {
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
   **/
  public SpecificationCharacteristicValue value(Object value) {
    this.value = value;
    return this;
  }

  
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  public SpecificationCharacteristicValue atBaseType(String atBaseType) {
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
  public SpecificationCharacteristicValue atSchemaLocation(URI atSchemaLocation) {
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
  public SpecificationCharacteristicValue atType(String atType) {
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
    SpecificationCharacteristicValue specificationCharacteristicValue = (SpecificationCharacteristicValue) o;
    return Objects.equals(this.isDefault, specificationCharacteristicValue.isDefault) &&
        Objects.equals(this.rangeInterval, specificationCharacteristicValue.rangeInterval) &&
        Objects.equals(this.regex, specificationCharacteristicValue.regex) &&
        Objects.equals(this.unitOfMeasure, specificationCharacteristicValue.unitOfMeasure) &&
        Objects.equals(this.valueFrom, specificationCharacteristicValue.valueFrom) &&
        Objects.equals(this.valueTo, specificationCharacteristicValue.valueTo) &&
        Objects.equals(this.valueType, specificationCharacteristicValue.valueType) &&
        Objects.equals(this.validFor, specificationCharacteristicValue.validFor) &&
        Objects.equals(this.value, specificationCharacteristicValue.value) &&
        Objects.equals(this.atBaseType, specificationCharacteristicValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, specificationCharacteristicValue.atSchemaLocation) &&
        Objects.equals(this.atType, specificationCharacteristicValue.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, rangeInterval, regex, unitOfMeasure, valueFrom, valueTo, valueType, validFor, value, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificationCharacteristicValue {\n");
    
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    rangeInterval: ").append(toIndentedString(rangeInterval)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
    sb.append("    valueTo: ").append(toIndentedString(valueTo)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

