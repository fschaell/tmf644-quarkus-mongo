package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileRefEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.PartyPrivacyProfileRef;

@Mapper(componentModel = "cdi")
public interface PartyPrivacyProfileRefMapper {

    PartyPrivacyProfileRef map(PartyPrivacyProfileRefEntity referenceEntity);
    PartyPrivacyProfileRefEntity map(PartyPrivacyProfileRef partyPrivacyProfileRef);
}
