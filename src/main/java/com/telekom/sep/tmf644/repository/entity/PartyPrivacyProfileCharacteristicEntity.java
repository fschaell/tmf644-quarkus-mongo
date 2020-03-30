package com.telekom.sep.tmf644.repository.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;


/**
 * A characteristic for an instantiated party profile, where the value indicates the allowed use of the characteristic
 **/
public class PartyPrivacyProfileCharacteristicEntity {
  
  public String id;
  public String name;
  public String privacyUsagePurpose;
  public String valueType;
  public List<RelatedPartyEntity> relatedParty = new ArrayList<RelatedPartyEntity>();
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

 
}

