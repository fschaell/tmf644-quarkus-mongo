package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.codecs.pojo.annotations.BsonProperty;
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

  @BsonProperty("id")
  public String id;
  public String criticalityLevel;
  public String description;
  public String name;
  public String privacyType;
  public String privacyUsagePurpose;
  public List<RoleSpecification> allowedRole = new ArrayList<RoleSpecification>();
  public List<SpecificationCharacteristicValueEntity> partyPrivacyProfileSpecCharacteristicValue = new ArrayList<SpecificationCharacteristicValueEntity>();
  public TimePeriod validFor;
  @BsonProperty("baseType")
  public String atBaseType;
  @BsonProperty("schemaLocation")
  public URI atSchemaLocation;
  @BsonProperty("type")
  public String atType;

  
}

