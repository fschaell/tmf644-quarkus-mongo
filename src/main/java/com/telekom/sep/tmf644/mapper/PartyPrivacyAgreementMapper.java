package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.*;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import org.bson.types.ObjectId;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.openapitools.model.*;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface PartyPrivacyAgreementMapper {


    PartyPrivacyAgreementEntity map(PartyPrivacyAgreementCreate partyPrivacyAgreement);

    @Mapping( target="id", expression = "java( partyPrivacyAgreementEntity.id.toString() )")
    PartyPrivacyAgreement map(PartyPrivacyAgreementEntity partyPrivacyAgreementEntity);

    @Mapping( target="id", expression = "java( new org.bson.types.ObjectId(partyPrivacyAgreement.getId()) )")
    PartyPrivacyAgreementEntity map(PartyPrivacyAgreement partyPrivacyAgreement);


    PartyPrivacyAgreementEntity map(PartyPrivacyAgreementUpdate partyPrivacyAgreement);

    List<PartyPrivacyAgreement> map(List<PartyPrivacyAgreementEntity> partyPrivacyAgreementEntities);


}

