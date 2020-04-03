package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.SpecificationCharacteristicValueEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.openapitools.model.SpecificationCharacteristicValue;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class SpecificationCharacteristicValueMapperImpl implements SpecificationCharacteristicValueMapper {

    @Inject
    private TimePeriodMapper timePeriodMapper;

    @Override
    public SpecificationCharacteristicValue map(SpecificationCharacteristicValueEntity specificationCharacteristicValueEntity) {
        if ( specificationCharacteristicValueEntity == null ) {
            return null;
        }

        SpecificationCharacteristicValue specificationCharacteristicValue = new SpecificationCharacteristicValue();

        specificationCharacteristicValue.setIsDefault( specificationCharacteristicValueEntity.isDefault );
        specificationCharacteristicValue.setRangeInterval( specificationCharacteristicValueEntity.rangeInterval );
        specificationCharacteristicValue.setRegex( specificationCharacteristicValueEntity.regex );
        specificationCharacteristicValue.setUnitOfMeasure( specificationCharacteristicValueEntity.unitOfMeasure );
        specificationCharacteristicValue.setValueFrom( specificationCharacteristicValueEntity.valueFrom );
        specificationCharacteristicValue.setValueTo( specificationCharacteristicValueEntity.valueTo );
        specificationCharacteristicValue.setValueType( specificationCharacteristicValueEntity.valueType );
        specificationCharacteristicValue.setValidFor( timePeriodMapper.map( specificationCharacteristicValueEntity.validFor ) );
        specificationCharacteristicValue.setValue( specificationCharacteristicValueEntity.value );
        specificationCharacteristicValue.setAtBaseType( specificationCharacteristicValueEntity.atBaseType );
        specificationCharacteristicValue.setAtSchemaLocation( specificationCharacteristicValueEntity.atSchemaLocation );
        specificationCharacteristicValue.setAtType( specificationCharacteristicValueEntity.atType );

        return specificationCharacteristicValue;
    }

    @Override
    public SpecificationCharacteristicValueEntity map(SpecificationCharacteristicValue specificationCharacteristicValue) {
        if ( specificationCharacteristicValue == null ) {
            return null;
        }

        SpecificationCharacteristicValueEntity specificationCharacteristicValueEntity = new SpecificationCharacteristicValueEntity();

        specificationCharacteristicValueEntity.isDefault = specificationCharacteristicValue.getIsDefault();
        specificationCharacteristicValueEntity.rangeInterval = specificationCharacteristicValue.getRangeInterval();
        specificationCharacteristicValueEntity.regex = specificationCharacteristicValue.getRegex();
        specificationCharacteristicValueEntity.unitOfMeasure = specificationCharacteristicValue.getUnitOfMeasure();
        specificationCharacteristicValueEntity.valueFrom = specificationCharacteristicValue.getValueFrom();
        specificationCharacteristicValueEntity.valueTo = specificationCharacteristicValue.getValueTo();
        specificationCharacteristicValueEntity.valueType = specificationCharacteristicValue.getValueType();
        specificationCharacteristicValueEntity.validFor = timePeriodMapper.map( specificationCharacteristicValue.getValidFor() );
        specificationCharacteristicValueEntity.value = specificationCharacteristicValue.getValue();
        specificationCharacteristicValueEntity.atBaseType = specificationCharacteristicValue.getAtBaseType();
        specificationCharacteristicValueEntity.atSchemaLocation = specificationCharacteristicValue.getAtSchemaLocation();
        specificationCharacteristicValueEntity.atType = specificationCharacteristicValue.getAtType();

        return specificationCharacteristicValueEntity;
    }
}
