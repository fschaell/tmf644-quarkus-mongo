package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.openapitools.model.RelatedParty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * A characteristic for an instantiated party profile, where the value indicates the allowed use of the characteristic
 **/
public class PartyPrivacyProfileCharacteristicEntity {

  @BsonProperty("id")
  public String id;
  public String name;
  public String privacyUsagePurpose;
  public String valueType;
  public List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
  public String value;
  @BsonProperty("baseType")
  public String atBaseType;
  @BsonProperty("schemaLocation")
  public URI atSchemaLocation;
  @BsonProperty("type")
  public String atType;


}

