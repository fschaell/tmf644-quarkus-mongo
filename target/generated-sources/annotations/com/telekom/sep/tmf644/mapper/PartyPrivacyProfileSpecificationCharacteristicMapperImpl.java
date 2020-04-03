package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileSpecificationCharacteristicEntity;
import com.telekom.sep.tmf644.repository.entity.RoleSpecificationEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.openapitools.model.PartyPrivacyProfileSpecificationCharacteristic;
import org.openapitools.model.RoleSpecification;
import org.openapitools.model.SpecificationCharacteristicValue;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class PartyPrivacyProfileSpecificationCharacteristicMapperImpl implements PartyPrivacyProfileSpecificationCharacteristicMapper {

    @Inject
    private TimePeriodMapper timePeriodMapper;
    @Inject
    private RoleSpecificationMapper roleSpecificationMapper;

    @Override
    public PartyPrivacyProfileSpecificationCharacteristic map(PartyPrivacyProfileSpecificationCharacteristicEntity partyPrivacyProfileSpecificationCharacteristicEntity) {
        if ( partyPrivacyProfileSpecificationCharacteristicEntity == null ) {
            return null;
        }

        PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecificationCharacteristic = new PartyPrivacyProfileSpecificationCharacteristic();

        partyPrivacyProfileSpecificationCharacteristic.setId( partyPrivacyProfileSpecificationCharacteristicEntity.id );
        partyPrivacyProfileSpecificationCharacteristic.setCriticalityLevel( partyPrivacyProfileSpecificationCharacteristicEntity.criticalityLevel );
        partyPrivacyProfileSpecificationCharacteristic.setDescription( partyPrivacyProfileSpecificationCharacteristicEntity.description );
        partyPrivacyProfileSpecificationCharacteristic.setName( partyPrivacyProfileSpecificationCharacteristicEntity.name );
        partyPrivacyProfileSpecificationCharacteristic.setPrivacyType( partyPrivacyProfileSpecificationCharacteristicEntity.privacyType );
        partyPrivacyProfileSpecificationCharacteristic.setPrivacyUsagePurpose( partyPrivacyProfileSpecificationCharacteristicEntity.privacyUsagePurpose );
        partyPrivacyProfileSpecificationCharacteristic.setAllowedRole( roleSpecificationEntityListToRoleSpecificationList( partyPrivacyProfileSpecificationCharacteristicEntity.allowedRole ) );
        List<SpecificationCharacteristicValue> list1 = partyPrivacyProfileSpecificationCharacteristicEntity.partyPrivacyProfileSpecCharacteristicValue;
        if ( list1 != null ) {
            partyPrivacyProfileSpecificationCharacteristic.setPartyPrivacyProfileSpecCharacteristicValue( new ArrayList<SpecificationCharacteristicValue>( list1 ) );
        }
        partyPrivacyProfileSpecificationCharacteristic.setValidFor( timePeriodMapper.map( partyPrivacyProfileSpecificationCharacteristicEntity.validFor ) );
        partyPrivacyProfileSpecificationCharacteristic.setAtBaseType( partyPrivacyProfileSpecificationCharacteristicEntity.atBaseType );
        partyPrivacyProfileSpecificationCharacteristic.setAtSchemaLocation( partyPrivacyProfileSpecificationCharacteristicEntity.atSchemaLocation );
        partyPrivacyProfileSpecificationCharacteristic.setAtType( partyPrivacyProfileSpecificationCharacteristicEntity.atType );

        return partyPrivacyProfileSpecificationCharacteristic;
    }

    @Override
    public PartyPrivacyProfileSpecificationCharacteristicEntity map(PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecificationCharacteristic) {
        if ( partyPrivacyProfileSpecificationCharacteristic == null ) {
            return null;
        }

        PartyPrivacyProfileSpecificationCharacteristicEntity partyPrivacyProfileSpecificationCharacteristicEntity = new PartyPrivacyProfileSpecificationCharacteristicEntity();

        partyPrivacyProfileSpecificationCharacteristicEntity.id = partyPrivacyProfileSpecificationCharacteristic.getId();
        partyPrivacyProfileSpecificationCharacteristicEntity.criticalityLevel = partyPrivacyProfileSpecificationCharacteristic.getCriticalityLevel();
        partyPrivacyProfileSpecificationCharacteristicEntity.description = partyPrivacyProfileSpecificationCharacteristic.getDescription();
        partyPrivacyProfileSpecificationCharacteristicEntity.name = partyPrivacyProfileSpecificationCharacteristic.getName();
        partyPrivacyProfileSpecificationCharacteristicEntity.privacyType = partyPrivacyProfileSpecificationCharacteristic.getPrivacyType();
        partyPrivacyProfileSpecificationCharacteristicEntity.privacyUsagePurpose = partyPrivacyProfileSpecificationCharacteristic.getPrivacyUsagePurpose();
        partyPrivacyProfileSpecificationCharacteristicEntity.allowedRole = roleSpecificationListToRoleSpecificationEntityList( partyPrivacyProfileSpecificationCharacteristic.getAllowedRole() );
        List<SpecificationCharacteristicValue> list1 = partyPrivacyProfileSpecificationCharacteristic.getPartyPrivacyProfileSpecCharacteristicValue();
        if ( list1 != null ) {
            partyPrivacyProfileSpecificationCharacteristicEntity.partyPrivacyProfileSpecCharacteristicValue = new ArrayList<SpecificationCharacteristicValue>( list1 );
        }
        partyPrivacyProfileSpecificationCharacteristicEntity.validFor = timePeriodMapper.map( partyPrivacyProfileSpecificationCharacteristic.getValidFor() );
        partyPrivacyProfileSpecificationCharacteristicEntity.atBaseType = partyPrivacyProfileSpecificationCharacteristic.getAtBaseType();
        partyPrivacyProfileSpecificationCharacteristicEntity.atSchemaLocation = partyPrivacyProfileSpecificationCharacteristic.getAtSchemaLocation();
        partyPrivacyProfileSpecificationCharacteristicEntity.atType = partyPrivacyProfileSpecificationCharacteristic.getAtType();

        return partyPrivacyProfileSpecificationCharacteristicEntity;
    }

    protected List<RoleSpecification> roleSpecificationEntityListToRoleSpecificationList(List<RoleSpecificationEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleSpecification> list1 = new ArrayList<RoleSpecification>( list.size() );
        for ( RoleSpecificationEntity roleSpecificationEntity : list ) {
            list1.add( roleSpecificationMapper.map( roleSpecificationEntity ) );
        }

        return list1;
    }

    protected List<RoleSpecificationEntity> roleSpecificationListToRoleSpecificationEntityList(List<RoleSpecification> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleSpecificationEntity> list1 = new ArrayList<RoleSpecificationEntity>( list.size() );
        for ( RoleSpecification roleSpecification : list ) {
            list1.add( roleSpecificationMapper.map( roleSpecification ) );
        }

        return list1;
    }
}
