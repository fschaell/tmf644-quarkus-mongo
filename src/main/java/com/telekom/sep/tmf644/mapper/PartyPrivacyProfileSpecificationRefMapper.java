package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileSpecificationRefEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.PartyPrivacyProfileSpecificationRef;

@Mapper(componentModel = "cdi")
public interface PartyPrivacyProfileSpecificationRefMapper {

    PartyPrivacyProfileSpecificationRef map(PartyPrivacyProfileSpecificationRefEntity referenceEntity);
    PartyPrivacyProfileSpecificationRefEntity map(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecificationRef);
}
