package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.CharacteristicEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.Characteristic;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:17+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class CharacteristicMapperImpl implements CharacteristicMapper {

    @Override
    public Characteristic map(CharacteristicEntity characteristicEntity) {
        if ( characteristicEntity == null ) {
            return null;
        }

        Characteristic characteristic = new Characteristic();

        characteristic.setName( characteristicEntity.name );
        characteristic.setValueType( characteristicEntity.valueType );
        characteristic.setValue( characteristicEntity.value );
        characteristic.setAtBaseType( characteristicEntity.atBaseType );
        characteristic.setAtSchemaLocation( characteristicEntity.atSchemaLocation );
        characteristic.setAtType( characteristicEntity.atType );

        return characteristic;
    }

    @Override
    public CharacteristicEntity map(Characteristic characteristic) {
        if ( characteristic == null ) {
            return null;
        }

        CharacteristicEntity characteristicEntity = new CharacteristicEntity();

        characteristicEntity.name = characteristic.getName();
        characteristicEntity.valueType = characteristic.getValueType();
        characteristicEntity.value = characteristic.getValue();
        characteristicEntity.atBaseType = characteristic.getAtBaseType();
        characteristicEntity.atSchemaLocation = characteristic.getAtSchemaLocation();
        characteristicEntity.atType = characteristic.getAtType();

        return characteristicEntity;
    }
}
