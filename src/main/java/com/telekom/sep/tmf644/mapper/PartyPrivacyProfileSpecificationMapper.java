package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileSpecificationEntity;
import org.bson.types.ObjectId;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.*;

import java.util.List;

@Mapper(componentModel = "cdi", uses={PartyPrivacyProfileSpecificationCharacteristicMapper.class})
public interface PartyPrivacyProfileSpecificationMapper {

    @Mapping( target="id", expression = "java( partyPrivacyProfileSpecificationEntity.id.toString() )")
    PartyPrivacyProfileSpecification map(PartyPrivacyProfileSpecificationEntity partyPrivacyProfileSpecificationEntity);


    @Mapping( target="id", expression = "java( new org.bson.types.ObjectId(partyPrivacyProfileSpecification.getId()) )")
    PartyPrivacyProfileSpecificationEntity map(PartyPrivacyProfileSpecification partyPrivacyProfileSpecification);

    PartyPrivacyProfileSpecificationEntity map(PartyPrivacyProfileSpecificationCreate partyPrivacyProfileSpecification);

    PartyPrivacyProfileSpecificationEntity map(PartyPrivacyProfileSpecificationUpdate partyPrivacyProfileSpecification);

    List<PartyPrivacyProfileSpecification> map(List<PartyPrivacyProfileSpecificationEntity> partyPrivacyProfileSpecificationEntities);

}
