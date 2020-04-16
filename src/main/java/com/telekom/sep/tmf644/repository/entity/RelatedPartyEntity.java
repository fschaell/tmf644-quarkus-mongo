package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.codecs.pojo.annotations.BsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;


/**
 * Related Entity reference. A related party defines party or party role linked to a specific entity.
 **/
public class RelatedPartyEntity {

  @BsonProperty("id")
  public String id;
  public String href;
  public String name;
  public String role;
  @BsonProperty("baseType")
  public String atBaseType;
  @BsonProperty("schemaLocation")
  public URI atSchemaLocation;
  @BsonProperty("type")
  public String atType;
  @BsonProperty("referredType")
  public String atReferredType;

  
}

