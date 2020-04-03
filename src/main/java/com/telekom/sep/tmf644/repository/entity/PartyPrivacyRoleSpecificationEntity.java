package com.telekom.sep.tmf644.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.model.AgreementSpecificationRef;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * A PartyPrivacyRoleSpecification represents a specification of a role defined in the context of a given privacy spesification, such as Customer, User.
 **/
public class PartyPrivacyRoleSpecificationEntity {
  
  public String description;
  public String name;
  public List<AgreementSpecificationRefEntity> agreementSpecification = new ArrayList<AgreementSpecificationRefEntity>();
  public String atBaseType;
  public URI atSchemaLocation;
  public String atType;

  
}

