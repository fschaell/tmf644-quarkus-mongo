package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.model.TimePeriod;

import javax.validation.Valid;
import java.net.URI;
import java.util.Objects;


/**
 * Aspects of the agreement not formally specified elsewhere in the agreement and that cannot be captured elsewhere in a formal notation, or automatically monitored and require a more human level of management.
 **/
public class AgreementTermOrConditionEntity {
  
  public String id;
  public String description;
  public TimePeriodEntity validFor;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

  
}

