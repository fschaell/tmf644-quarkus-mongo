package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.openapitools.model.TimePeriod;

import javax.validation.Valid;
import java.net.URI;
import java.util.Objects;


/**
 * A number or text that can be assigned to a SpecificationCharacteristic
 **/
public class SpecificationCharacteristicValueEntity {
  
  public Boolean isDefault;
  public String rangeInterval;
  public String regex;
  public String unitOfMeasure;
  public Integer valueFrom;
  public Integer valueTo;
  public String valueType;
  public TimePeriod validFor;
  public String value;
  @BsonProperty("baseType")
  public String atBaseType;
  @BsonProperty("schemaLocation")
  public URI atSchemaLocation;
  @BsonProperty("type")
  public String atType;

  
  
}

