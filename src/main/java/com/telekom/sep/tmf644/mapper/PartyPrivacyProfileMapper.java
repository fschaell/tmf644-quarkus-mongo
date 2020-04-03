package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.*;
import org.bson.types.ObjectId;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.*;

import java.util.List;

@Mapper(componentModel = "cdi",uses = {RelatedPartyMapper.class,PartyPrivacyProfileCharacteristicMapper.class,PartyPrivacyProfileSpecificationRefMapper.class,PartyPrivacyAgreementRefMapper.class})
public interface PartyPrivacyProfileMapper {

    PartyPrivacyProfile map(PartyPrivacyProfileEntity partyPrivacyProfileEntity);

    PartyPrivacyProfileEntity map(PartyPrivacyProfile partyPrivacyProfile);

    PartyPrivacyProfileEntity map(PartyPrivacyProfileCreate partyPrivacyProfileCreate);

    PartyPrivacyProfileEntity map(PartyPrivacyProfileUpdate partyPrivacyProfile);

    String map(ObjectId objectId);
    ObjectId map(String id);
}
