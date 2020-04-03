package com.telekom.sep.tmf644.repository.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.openapitools.model.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Party Privacy Profile Specification serves as a template for creating Privacy Profiles. The specification defines characteristics for the profile. For example there might be a profile specification for residential customers, and a different specification for partners.
 **/
@MongoEntity(collection="PartyPrivacyProfileSpecification")
public class PartyPrivacyProfileSpecificationEntity extends PanacheMongoEntity {

  public String id;
  public String href;
  public String description;
  public Date lastUpdate;
  public String name;
  public String status;
  public String version;
  public List<PartyPrivacyRoleSpecificationEntity> applicableRole = new ArrayList<PartyPrivacyRoleSpecificationEntity>();
  public List<PartyPrivacyProfileSpecificationCharacteristicEntity> partyPrivacyProfileSpecCharacteristic = new ArrayList<PartyPrivacyProfileSpecificationCharacteristicEntity>();
  public List<ProductOfferingRefEntity> productOffering = new ArrayList<ProductOfferingRefEntity>();
  public List<RelatedPartyEntity> relatedParty = new ArrayList<RelatedPartyEntity>();
  public TimePeriodEntity validFor;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

}

