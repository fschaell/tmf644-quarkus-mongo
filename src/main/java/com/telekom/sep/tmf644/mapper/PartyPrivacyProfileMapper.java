package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.*;
import org.bson.types.ObjectId;
import org.mapstruct.*;
import org.openapitools.model.*;

import java.util.List;

@Mapper(componentModel = "cdi",uses = {PartyPrivacyProfileCharacteristicMapper.class})
public interface PartyPrivacyProfileMapper {

    @Mapping( target="id", expression = "java( partyPrivacyProfileEntity.id.toString() )")
    PartyPrivacyProfile map(PartyPrivacyProfileEntity partyPrivacyProfileEntity);

    @Mapping( target="id", expression = "java( new org.bson.types.ObjectId(partyPrivacyProfile.getId()) )")
    PartyPrivacyProfileEntity map(PartyPrivacyProfile partyPrivacyProfile);



    PartyPrivacyProfileEntity map(PartyPrivacyProfileCreate partyPrivacyProfileCreate);

    PartyPrivacyProfileEntity map(PartyPrivacyProfileUpdate partyPrivacyProfile);

    List<PartyPrivacyProfile> map(List<PartyPrivacyProfileEntity> partyPrivacyProfileEntities);

    RelatedParty map(RelatedPartyEntity relatedPartyEntity);
    RelatedPartyEntity map(RelatedParty relatedParty);


    }
