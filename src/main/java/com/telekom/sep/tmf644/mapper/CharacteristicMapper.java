package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.CharacteristicEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.Characteristic;

@Mapper(componentModel = "cdi")
public interface CharacteristicMapper {

    Characteristic map(CharacteristicEntity characteristicEntity);
    CharacteristicEntity map(Characteristic characteristic);
}
