package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;


/**
 * A RoleSpecification represents a specification of a role.
 **/
public class RoleSpecificationEntity {
  
  public String description;
  public String name;
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

  
}

