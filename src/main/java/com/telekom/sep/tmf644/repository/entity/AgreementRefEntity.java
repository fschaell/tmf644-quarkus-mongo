package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;


/**
 * Agreement reference. An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.
 **/
public class AgreementRefEntity {
  
  public String id;
  public String href;
  public String name;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;
  public String atReferredType;

  
}

