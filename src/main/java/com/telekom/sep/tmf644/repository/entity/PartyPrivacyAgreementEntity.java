package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
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
  public List<AgreementAuthorizationEntity> agreementAuthorization = new ArrayList<AgreementAuthorizationEntity>();
  public List<AgreementItemEntity> agreementItem = new ArrayList<AgreementItemEntity>();
  public TimePeriodEntity agreementPeriod;
  public AgreementSpecificationRefEntity agreementSpecification;
  //
  public List<AgreementRefEntity> associatedAgreement = new ArrayList<AgreementRefEntity>();
  public List<CharacteristicEntity> characteristic = new ArrayList<CharacteristicEntity>();
  public TimePeriodEntity completionDate;
  public List<RelatedPartyEntity> engagedPartyRole = new ArrayList<RelatedPartyEntity>();
  public List<PartyPrivacyProfileRefEntity> partyPrivacyProfile = new ArrayList<PartyPrivacyProfileRefEntity>();
  public List<PartyPrivacyProfileCharacteristicEntity> partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristicEntity>();
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

  
}

