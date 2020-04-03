package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;


/**
 * ProductOffering reference. A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.
 **/
public class ProductOfferingRefEntity {
  
  public String id;
  public String href;
  public String name;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;
  public String atReferredType;

  
}

