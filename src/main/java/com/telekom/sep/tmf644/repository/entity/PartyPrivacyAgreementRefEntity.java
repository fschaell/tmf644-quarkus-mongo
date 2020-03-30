package com.telekom.sep.tmf644.repository.entity;

import java.net.URI;


/**
 * Reference to Party Privacy Agreement resource
 **/
public class PartyPrivacyAgreementRefEntity {
  
  //external id
  public String id;

  //rest endpoint - here the api gateway endpoint should be used
  public String href;
  public String name;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;
  public String atReferredType;

  
}

