package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileCharacteristicEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import org.bson.types.ObjectId;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.PartyPrivacyProfile;
import org.openapitools.model.PartyPrivacyProfileCharacteristic;
import org.openapitools.model.PartyPrivacyProfileCreate;
import org.openapitools.model.PartyPrivacyProfileUpdate;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface PartyPrivacyProfileCharacteristicMapper {



    @InheritInverseConfiguration
    PartyPrivacyProfileCharacteristic map(PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicEntity);

    @Mapping( target="value", expression = "java( partyPrivacyProfileCharacteristic.getValue().toString() )")
    PartyPrivacyProfileCharacteristicEntity map(PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic);


    }
