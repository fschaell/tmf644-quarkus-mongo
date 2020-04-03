package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileCharacteristicEntity;
import com.telekom.sep.tmf644.repository.entity.RelatedPartyEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.openapitools.model.PartyPrivacyProfileCharacteristic;
import org.openapitools.model.RelatedParty;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class PartyPrivacyProfileCharacteristicMapperImpl implements PartyPrivacyProfileCharacteristicMapper {

    @Inject
    private RelatedPartyMapper relatedPartyMapper;

    @Override
    public PartyPrivacyProfileCharacteristic map(PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicEntity) {
        if ( partyPrivacyProfileCharacteristicEntity == null ) {
            return null;
        }

        PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic = new PartyPrivacyProfileCharacteristic();

        partyPrivacyProfileCharacteristic.setId( partyPrivacyProfileCharacteristicEntity.id );
        partyPrivacyProfileCharacteristic.setName( partyPrivacyProfileCharacteristicEntity.name );
        partyPrivacyProfileCharacteristic.setPrivacyUsagePurpose( partyPrivacyProfileCharacteristicEntity.privacyUsagePurpose );
        partyPrivacyProfileCharacteristic.setValueType( partyPrivacyProfileCharacteristicEntity.valueType );
        partyPrivacyProfileCharacteristic.setRelatedParty( relatedPartyEntityListToRelatedPartyList( partyPrivacyProfileCharacteristicEntity.relatedParty ) );
        partyPrivacyProfileCharacteristic.setAtBaseType( partyPrivacyProfileCharacteristicEntity.atBaseType );
        partyPrivacyProfileCharacteristic.setAtSchemaLocation( partyPrivacyProfileCharacteristicEntity.atSchemaLocation );
        partyPrivacyProfileCharacteristic.setAtType( partyPrivacyProfileCharacteristicEntity.atType );

        return partyPrivacyProfileCharacteristic;
    }

    @Override
    public PartyPrivacyProfileCharacteristicEntity map(PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic) {
        if ( partyPrivacyProfileCharacteristic == null ) {
            return null;
        }

        PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicEntity = new PartyPrivacyProfileCharacteristicEntity();

        partyPrivacyProfileCharacteristicEntity.id = partyPrivacyProfileCharacteristic.getId();
        partyPrivacyProfileCharacteristicEntity.name = partyPrivacyProfileCharacteristic.getName();
        partyPrivacyProfileCharacteristicEntity.privacyUsagePurpose = partyPrivacyProfileCharacteristic.getPrivacyUsagePurpose();
        partyPrivacyProfileCharacteristicEntity.valueType = partyPrivacyProfileCharacteristic.getValueType();
        partyPrivacyProfileCharacteristicEntity.relatedParty = relatedPartyListToRelatedPartyEntityList( partyPrivacyProfileCharacteristic.getRelatedParty() );
        partyPrivacyProfileCharacteristicEntity.atBaseType = partyPrivacyProfileCharacteristic.getAtBaseType();
        partyPrivacyProfileCharacteristicEntity.atSchemaLocation = partyPrivacyProfileCharacteristic.getAtSchemaLocation();
        partyPrivacyProfileCharacteristicEntity.atType = partyPrivacyProfileCharacteristic.getAtType();

        return partyPrivacyProfileCharacteristicEntity;
    }

    protected List<RelatedParty> relatedPartyEntityListToRelatedPartyList(List<RelatedPartyEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RelatedParty> list1 = new ArrayList<RelatedParty>( list.size() );
        for ( RelatedPartyEntity relatedPartyEntity : list ) {
            list1.add( relatedPartyMapper.map( relatedPartyEntity ) );
        }

        return list1;
    }

    protected List<RelatedPartyEntity> relatedPartyListToRelatedPartyEntityList(List<RelatedParty> list) {
        if ( list == null ) {
            return null;
        }

        List<RelatedPartyEntity> list1 = new ArrayList<RelatedPartyEntity>( list.size() );
        for ( RelatedParty relatedParty : list ) {
            list1.add( relatedPartyMapper.map( relatedParty ) );
        }

        return list1;
    }
}
