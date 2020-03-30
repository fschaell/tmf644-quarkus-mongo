package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.model.AgreementTermOrCondition;
import org.openapitools.model.ProductOfferingRef;
import org.openapitools.model.ProductRef;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * A part of the agreement expressed in terms of a product offering and possibly including specific terms and conditions.
 **/
public class AgreementItemEntity {
  
  public List<ProductRef> product = new ArrayList<ProductRef>();
  public List<ProductOfferingRef> productOffering = new ArrayList<ProductOfferingRef>();
  public List<AgreementTermOrCondition> termOrCondition = new ArrayList<AgreementTermOrCondition>();
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

 
}

