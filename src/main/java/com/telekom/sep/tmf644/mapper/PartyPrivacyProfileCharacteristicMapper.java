package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileCharacteristicEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.PartyPrivacyProfileCharacteristic;

@Mapper(componentModel = "cdi",uses = {RelatedPartyMapper.class})
public interface PartyPrivacyProfileCharacteristicMapper {

    PartyPrivacyProfileCharacteristic map(PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicEntity);
    PartyPrivacyProfileCharacteristicEntity map(PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic);

}
