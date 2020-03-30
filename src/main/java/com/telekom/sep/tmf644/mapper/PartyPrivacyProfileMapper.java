package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.*;
import org.bson.types.ObjectId;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.*;

@Mapper(componentModel = "cdi")
public interface PartyPrivacyProfileMapper {

     PartyPrivacyProfile map(PartyPrivacyProfileEntity partyPrivacyProfileEntity);

    // @Mapping(target="")
     PartyPrivacyProfileEntity map(PartyPrivacyProfile partyPrivacyProfile);


     PartyPrivacyProfileEntity map(PartyPrivacyProfileCreate partyPrivacyProfileCreate);

     RelatedParty map (RelatedPartyEntity relatedPartyEntity);
     RelatedPartyEntity map (RelatedParty relatedParty);

     PartyPrivacyAgreementRef map (PartyPrivacyAgreementRefEntity partyPrivacyAgreementRefEntity);
     PartyPrivacyAgreementRefEntity map (PartyPrivacyAgreementRef partyPrivacyAgreementRef);

     PartyPrivacyProfileCharacteristic map (PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicEntity);
     PartyPrivacyProfileCharacteristicEntity map (PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic);

     PartyPrivacyProfileSpecificationRef map(PartyPrivacyProfileSpecificationRefEntity partyPrivacyProfileSpecificationRefEntity);
     PartyPrivacyProfileSpecificationRefEntity map(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecificationRef);

     String map(ObjectId id);
     ObjectId map(String id);

     TimePeriod map (TimePeriodEntity timePeriodEntity);
     TimePeriodEntity map (TimePeriod timePeriod);


}
