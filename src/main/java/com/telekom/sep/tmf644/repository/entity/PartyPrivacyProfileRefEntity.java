package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;


/**
 * Reference to Party Privacy Profile resource
 **/
public class PartyPrivacyProfileRefEntity {
  
  public String id;
  public String href;
  public String name;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;
  public String atReferredType;

 
}

