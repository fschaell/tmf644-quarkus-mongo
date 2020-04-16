package com.telekom.sep.tmf644.repository.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
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

  public String href;
  public String description;
  public Date lastUpdate;
  public String name;
  public String status;
  public String version;
  public List<PartyPrivacyRoleSpecification> applicableRole = new ArrayList<PartyPrivacyRoleSpecification>();
  public List<PartyPrivacyProfileSpecificationCharacteristicEntity> partyPrivacyProfileSpecCharacteristic = new ArrayList<PartyPrivacyProfileSpecificationCharacteristicEntity>();
  public List<ProductOfferingRef> productOffering = new ArrayList<ProductOfferingRef>();
  public List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
  public TimePeriod validFor;
  @BsonProperty("baseType")
  public String atBaseType;
  @BsonProperty("schemaLocation")
  public URI atSchemaLocation;
  @BsonProperty("type")
  public String atType;

}

