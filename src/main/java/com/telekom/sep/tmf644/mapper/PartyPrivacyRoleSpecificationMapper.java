package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyRoleSpecificationEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.PartyPrivacyRoleSpecification;

@Mapper(componentModel = "cdi",uses = {AgreementSpecificationRefMapper.class})
public interface PartyPrivacyRoleSpecificationMapper {

    PartyPrivacyRoleSpecification map(PartyPrivacyRoleSpecificationEntity partyPrivacyRoleSpecificationEntity);
    PartyPrivacyRoleSpecificationEntity map(PartyPrivacyRoleSpecification partyPrivacyRoleSpecification);
}
