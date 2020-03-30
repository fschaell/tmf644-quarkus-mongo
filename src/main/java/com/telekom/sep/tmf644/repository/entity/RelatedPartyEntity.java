package com.telekom.sep.tmf644.repository.entity;

import java.net.URI;


/**
 * Related Entity reference. A related party defines party or party role linked to a specific entity.
 **/
public class RelatedPartyEntity {
  
  public String id;
  public String href;
  public String name;
  public String role;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;
  public String atReferredType;

  
}

