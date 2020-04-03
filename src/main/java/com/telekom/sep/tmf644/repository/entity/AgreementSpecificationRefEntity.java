package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;


/**
 * AgreementSpecification reference. An AgreementSpecification represents a template of an agreement that can be used when establishing partnerships.
 **/
public class AgreementSpecificationRefEntity {
  
  public String id;
  public String href;
  public String description;
  public String name;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;
  public String atReferredType;

  
}

