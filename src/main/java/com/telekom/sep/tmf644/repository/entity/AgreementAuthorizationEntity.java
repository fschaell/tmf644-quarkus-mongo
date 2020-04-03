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

  public Date date;
  public String signatureRepresentation;
  public String state;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

 
}

