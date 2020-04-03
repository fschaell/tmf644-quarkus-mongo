package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.SpecificationCharacteristicValueEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.SpecificationCharacteristicValue;

@Mapper(componentModel = "cdi", uses = {TimePeriodMapper.class})
public interface SpecificationCharacteristicValueMapper {

    SpecificationCharacteristicValue map(SpecificationCharacteristicValueEntity specificationCharacteristicValueEntity);
    SpecificationCharacteristicValueEntity map(SpecificationCharacteristicValue specificationCharacteristicValue);
}
