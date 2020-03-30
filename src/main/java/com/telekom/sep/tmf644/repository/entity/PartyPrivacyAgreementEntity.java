package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class PartyPrivacyAgreementEntity {
  
  public String id;
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
  public List<AgreementItem> agreementItem = new ArrayList<AgreementItem>();
  public TimePeriodEntity agreementPeriod;
  public AgreementSpecificationRef agreementSpecification;
  public List<AgreementRef> associatedAgreement = new ArrayList<AgreementRef>();
  public List<Characteristic> characteristic = new ArrayList<Characteristic>();
  public TimePeriod completionDate;
  public List<RelatedParty> engagedPartyRole = new ArrayList<RelatedParty>();
  public List<PartyPrivacyProfileRef> partyPrivacyProfile = new ArrayList<PartyPrivacyProfileRef>();
  public List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic = new ArrayList<PartyPrivacyProfileCharacteristic>();
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

  
}

