package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.model.RoleSpecification;
import org.openapitools.model.SpecificationCharacteristicValue;
import org.openapitools.model.TimePeriod;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * A characteristic of the party privacy profile, whose value(s) would be supplied at runtime. For example, email address
 **/
public class PartyPrivacyProfileSpecificationCharacteristicEntity {
  
  public String id;
  public String criticalityLevel;
  public String description;
  public String name;
  public String privacyType;
  public String privacyUsagePurpose;
  public List<RoleSpecificationEntity> allowedRole = new ArrayList<RoleSpecificationEntity>();
  public List<SpecificationCharacteristicValue> partyPrivacyProfileSpecCharacteristicValue = new ArrayList<SpecificationCharacteristicValue>();
  public TimePeriodEntity validFor;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

  
}

