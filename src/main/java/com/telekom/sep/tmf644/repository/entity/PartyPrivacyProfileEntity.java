package com.telekom.sep.tmf644.repository.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.openapitools.model.AgreementRef;
import org.openapitools.model.PartyPrivacyProfileSpecification;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * A Party Privacy Profile represents the set of Privacy settings defined for a Party
 **/
@MongoEntity(collection="PartyPrivacyProfile")
public class PartyPrivacyProfileEntity extends PanacheMongoEntity {

  public String href;
  public Date creationDate;
  public String description;
  public String name;
  public String status;
  public RelatedPartyEntity agreedByParty;
  public AgreementRefEntity agreement;
  public RelatedPartyEntity applicableForParty;
  public List<PartyPrivacyProfileCharacteristicEntity> partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristicEntity>();
  public PartyPrivacyProfileSpecificationRefEntity partyPrivacyProfileSpecification;
  public TimePeriodEntity validFor;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;



}

