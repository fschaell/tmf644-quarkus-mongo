package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.*;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.openapitools.model.*;

import java.util.List;

@Mapper(componentModel = "cdi",uses = {AgreementAuthorizationMapper.class,AgreementItemMapper.class,TimePeriodMapper.class,AgreementSpecificationRefMapper.class,CharacteristicMapper.class,RelatedPartyMapper.class,PartyPrivacyProfileRefMapper.class,PartyPrivacyProfileCharacteristicMapper.class, AgreementRefMapper.class})
public interface PartyPrivacyAgreementMapper {


    PartyPrivacyAgreementEntity map(PartyPrivacyAgreementCreate partyPrivacyAgreement);

    PartyPrivacyAgreement map(PartyPrivacyAgreementEntity partyPrivacyAgreementEntity);

    PartyPrivacyAgreementEntity map(PartyPrivacyAgreementUpdate partyPrivacyAgreement);

    String map(ObjectId objectId);


}

