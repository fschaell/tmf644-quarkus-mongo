package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyAgreementEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileSpecificationEntity;
import com.telekom.sep.tmf644.repository.entity.TimePeriodEntity;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.openapitools.model.*;

import java.util.List;

@Mapper(componentModel = "cdi", uses = {TimePeriodMapper.class, PartyPrivacyProfileSpecificationCharacteristicMapper.class, RelatedPartyMapper.class, ProductOfferingRefMapper.class, PartyPrivacyRoleSpecificationMapper.class})
public interface PartyPrivacyProfileSpecificationMapper {

    PartyPrivacyProfileSpecification map(PartyPrivacyProfileSpecificationEntity partyPrivacyProfileSpecificationEntity);

    PartyPrivacyProfileSpecificationEntity map(PartyPrivacyProfileSpecification partyPrivacyProfileSpecification);

    String map(ObjectId objectId);
    ObjectId map(String id);
}
