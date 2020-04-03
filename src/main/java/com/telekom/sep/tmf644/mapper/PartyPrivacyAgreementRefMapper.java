package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyAgreementRefEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.PartyPrivacyAgreementRef;
@Mapper(componentModel = "cdi")
public interface PartyPrivacyAgreementRefMapper {
    PartyPrivacyAgreementRef map(PartyPrivacyAgreementRefEntity referenceEntity);
    PartyPrivacyAgreementRefEntity map(PartyPrivacyAgreementRef partyPrivacyAgreementRef);
}
