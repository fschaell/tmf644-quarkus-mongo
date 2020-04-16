package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileSpecificationCharacteristicEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.PartyPrivacyProfileSpecificationCharacteristic;

@Mapper(componentModel = "cdi", uses={SpecificationCharacteristicValueMapper.class})
public interface PartyPrivacyProfileSpecificationCharacteristicMapper {

    PartyPrivacyProfileSpecificationCharacteristic map(PartyPrivacyProfileSpecificationCharacteristicEntity partyPrivacyProfileSpecificationCharacteristicEntity);
    PartyPrivacyProfileSpecificationCharacteristicEntity map(PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecificationCharacteristic);

}
