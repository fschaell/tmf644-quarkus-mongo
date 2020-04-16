package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.openapitools.model.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 * A specific type of agreement that formalizes the privacy profiles requested for a party
 **/
@MongoEntity(collection="PartyPrivacyAgreement")
public class PartyPrivacyAgreementEntity extends PanacheMongoEntity {
  
  public String href;
  public String agreementType;
  public String description;
  public Integer documentNumber;
  public Date initialDate;
  public String name;
  public String statementOfIntent;
  public String status;
  public String version;
  public List<AgreementAuthorization> agreementAuthorization = new ArrayList<AgreementAuthorization>();
  public List<AgreementItem> agreementItem = new ArrayList<AgreementItem>();
  public TimePeriod agreementPeriod;
  public AgreementSpecificationRef agreementSpecification;
  //
  public List<AgreementRef> associatedAgreement = new ArrayList<AgreementRef>();
  public List<Characteristic> characteristic = new ArrayList<Characteristic>();
  public TimePeriod completionDate;
  public List<RelatedParty> engagedPartyRole = new ArrayList<RelatedParty>();
  public List<PartyPrivacyProfileRef> partyPrivacyProfile = new ArrayList<PartyPrivacyProfileRef>();
  public List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristic>();

  @BsonProperty("baseType")
  public String atBaseType;
  @BsonProperty("schemaLocation")
  public URI atSchemaLocation;
  @BsonProperty("type")
  public String atType;

  
}

