package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;


/**
 * Describes a given characteristic of an object or entity through a name/value pair.
 **/
public class CharacteristicEntity {
  
  public String name;
  public String valueType;
  public Object value;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

  
}

