package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.SpecificationCharacteristicValueEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.SpecificationCharacteristicValue;

@Mapper(componentModel = "cdi")
public interface SpecificationCharacteristicValueMapper {

    @Mapping( target="value", expression = "java( specificationCharacteristicValue.getValue().toString() )")
    SpecificationCharacteristicValueEntity map(SpecificationCharacteristicValue specificationCharacteristicValue);

    @InheritInverseConfiguration
    SpecificationCharacteristicValue map(SpecificationCharacteristicValueEntity specificationCharacteristicValueEntity);



}
