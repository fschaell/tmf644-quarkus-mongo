package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyAgreementRefEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileCharacteristicEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileSpecificationRefEntity;
import com.telekom.sep.tmf644.repository.entity.RelatedPartyEntity;
import com.telekom.sep.tmf644.repository.entity.TimePeriodEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.openapitools.model.PartyPrivacyAgreementRef;
import org.openapitools.model.PartyPrivacyProfile;
import org.openapitools.model.PartyPrivacyProfileCharacteristic;
import org.openapitools.model.PartyPrivacyProfileCreate;
import org.openapitools.model.PartyPrivacyProfileSpecificationRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-26T08:33:50+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14 (AdoptOpenJDK)"
)
@ApplicationScoped
public class PartyPrivacyProfileMapperImpl implements PartyPrivacyProfileMapper {

    @Override
    public PartyPrivacyProfile map(PartyPrivacyProfileEntity partyPrivacyProfileEntity) {
        if ( partyPrivacyProfileEntity == null ) {
            return null;
        }

        PartyPrivacyProfile partyPrivacyProfile = new PartyPrivacyProfile();

        partyPrivacyProfile.setId( map( partyPrivacyProfileEntity.id ) );
        partyPrivacyProfile.setHref( partyPrivacyProfileEntity.href );
        partyPrivacyProfile.setCreationDate( partyPrivacyProfileEntity.creationDate );
        partyPrivacyProfile.setDescription( partyPrivacyProfileEntity.description );
        partyPrivacyProfile.setName( partyPrivacyProfileEntity.name );
        partyPrivacyProfile.setStatus( partyPrivacyProfileEntity.status );
        partyPrivacyProfile.setAgreedByParty( map( partyPrivacyProfileEntity.agreedByParty ) );
        partyPrivacyProfile.setAgreement( map( partyPrivacyProfileEntity.agreement ) );
        partyPrivacyProfile.setApplicableForParty( map( partyPrivacyProfileEntity.applicableForParty ) );
        partyPrivacyProfile.setPartyPrivacyProfileCharacteristic( partyPrivacyProfileCharacteristicEntityListToPartyPrivacyProfileCharacteristicList( partyPrivacyProfileEntity.partyPrivacyProfileCharacteristic ) );
        partyPrivacyProfile.setPartyPrivacyProfileSpecification( map( partyPrivacyProfileEntity.partyPrivacyProfileSpecification ) );
        partyPrivacyProfile.setValidFor( map( partyPrivacyProfileEntity.validFor ) );
        partyPrivacyProfile.setAtBaseType( partyPrivacyProfileEntity.atBaseType );
        partyPrivacyProfile.setAtSchemaLocation( partyPrivacyProfileEntity.atSchemaLocation );
        partyPrivacyProfile.setAtType( partyPrivacyProfileEntity.atType );

        return partyPrivacyProfile;
    }

    @Override
    public PartyPrivacyProfileEntity map(PartyPrivacyProfile partyPrivacyProfile) {
        if ( partyPrivacyProfile == null ) {
            return null;
        }

        PartyPrivacyProfileEntity partyPrivacyProfileEntity = new PartyPrivacyProfileEntity();

        partyPrivacyProfileEntity.id = map( partyPrivacyProfile.getId() );
        partyPrivacyProfileEntity.href = partyPrivacyProfile.getHref();
        partyPrivacyProfileEntity.creationDate = partyPrivacyProfile.getCreationDate();
        partyPrivacyProfileEntity.description = partyPrivacyProfile.getDescription();
        partyPrivacyProfileEntity.name = partyPrivacyProfile.getName();
        partyPrivacyProfileEntity.status = partyPrivacyProfile.getStatus();
        partyPrivacyProfileEntity.agreedByParty = map( partyPrivacyProfile.getAgreedByParty() );
        partyPrivacyProfileEntity.agreement = map( partyPrivacyProfile.getAgreement() );
        partyPrivacyProfileEntity.applicableForParty = map( partyPrivacyProfile.getApplicableForParty() );
        partyPrivacyProfileEntity.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristicListToPartyPrivacyProfileCharacteristicEntityList( partyPrivacyProfile.getPartyPrivacyProfileCharacteristic() );
        partyPrivacyProfileEntity.partyPrivacyProfileSpecification = map( partyPrivacyProfile.getPartyPrivacyProfileSpecification() );
        partyPrivacyProfileEntity.validFor = map( partyPrivacyProfile.getValidFor() );
        partyPrivacyProfileEntity.atBaseType = partyPrivacyProfile.getAtBaseType();
        partyPrivacyProfileEntity.atSchemaLocation = partyPrivacyProfile.getAtSchemaLocation();
        partyPrivacyProfileEntity.atType = partyPrivacyProfile.getAtType();

        return partyPrivacyProfileEntity;
    }

    @Override
    public PartyPrivacyProfileEntity map(PartyPrivacyProfileCreate partyPrivacyProfileCreate) {
        if ( partyPrivacyProfileCreate == null ) {
            return null;
        }

        PartyPrivacyProfileEntity partyPrivacyProfileEntity = new PartyPrivacyProfileEntity();

        partyPrivacyProfileEntity.creationDate = partyPrivacyProfileCreate.getCreationDate();
        partyPrivacyProfileEntity.description = partyPrivacyProfileCreate.getDescription();
        partyPrivacyProfileEntity.name = partyPrivacyProfileCreate.getName();
        partyPrivacyProfileEntity.status = partyPrivacyProfileCreate.getStatus();
        partyPrivacyProfileEntity.agreedByParty = map( partyPrivacyProfileCreate.getAgreedByParty() );
        partyPrivacyProfileEntity.agreement = map( partyPrivacyProfileCreate.getAgreement() );
        partyPrivacyProfileEntity.applicableForParty = map( partyPrivacyProfileCreate.getApplicableForParty() );
        partyPrivacyProfileEntity.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristicListToPartyPrivacyProfileCharacteristicEntityList( partyPrivacyProfileCreate.getPartyPrivacyProfileCharacteristic() );
        partyPrivacyProfileEntity.partyPrivacyProfileSpecification = map( partyPrivacyProfileCreate.getPartyPrivacyProfileSpecification() );
        partyPrivacyProfileEntity.validFor = map( partyPrivacyProfileCreate.getValidFor() );
        partyPrivacyProfileEntity.atBaseType = partyPrivacyProfileCreate.getAtBaseType();
        partyPrivacyProfileEntity.atSchemaLocation = partyPrivacyProfileCreate.getAtSchemaLocation();
        partyPrivacyProfileEntity.atType = partyPrivacyProfileCreate.getAtType();

        return partyPrivacyProfileEntity;
    }

    @Override
    public RelatedParty map(RelatedPartyEntity relatedPartyEntity) {
        if ( relatedPartyEntity == null ) {
            return null;
        }

        RelatedParty relatedParty = new RelatedParty();

        relatedParty.setId( relatedPartyEntity.id );
        relatedParty.setHref( relatedPartyEntity.href );
        relatedParty.setName( relatedPartyEntity.name );
        relatedParty.setRole( relatedPartyEntity.role );
        relatedParty.setAtBaseType( relatedPartyEntity.atBaseType );
        relatedParty.setAtSchemaLocation( relatedPartyEntity.atSchemaLocation );
        relatedParty.setAtType( relatedPartyEntity.atType );
        relatedParty.setAtReferredType( relatedPartyEntity.atReferredType );

        return relatedParty;
    }

    @Override
    public RelatedPartyEntity map(RelatedParty relatedParty) {
        if ( relatedParty == null ) {
            return null;
        }

        RelatedPartyEntity relatedPartyEntity = new RelatedPartyEntity();

        relatedPartyEntity.id = relatedParty.getId();
        relatedPartyEntity.href = relatedParty.getHref();
        relatedPartyEntity.name = relatedParty.getName();
        relatedPartyEntity.role = relatedParty.getRole();
        relatedPartyEntity.atBaseType = relatedParty.getAtBaseType();
        relatedPartyEntity.atSchemaLocation = relatedParty.getAtSchemaLocation();
        relatedPartyEntity.atType = relatedParty.getAtType();
        relatedPartyEntity.atReferredType = relatedParty.getAtReferredType();

        return relatedPartyEntity;
    }

    @Override
    public PartyPrivacyAgreementRef map(PartyPrivacyAgreementRefEntity partyPrivacyAgreementRefEntity) {
        if ( partyPrivacyAgreementRefEntity == null ) {
            return null;
        }

        PartyPrivacyAgreementRef partyPrivacyAgreementRef = new PartyPrivacyAgreementRef();

        partyPrivacyAgreementRef.setId( partyPrivacyAgreementRefEntity.id );
        partyPrivacyAgreementRef.setHref( partyPrivacyAgreementRefEntity.href );
        partyPrivacyAgreementRef.setName( partyPrivacyAgreementRefEntity.name );
        partyPrivacyAgreementRef.setAtBaseType( partyPrivacyAgreementRefEntity.atBaseType );
        partyPrivacyAgreementRef.setAtSchemaLocation( partyPrivacyAgreementRefEntity.atSchemaLocation );
        partyPrivacyAgreementRef.setAtType( partyPrivacyAgreementRefEntity.atType );
        partyPrivacyAgreementRef.setAtReferredType( partyPrivacyAgreementRefEntity.atReferredType );

        return partyPrivacyAgreementRef;
    }

    @Override
    public PartyPrivacyAgreementRefEntity map(PartyPrivacyAgreementRef partyPrivacyAgreementRef) {
        if ( partyPrivacyAgreementRef == null ) {
            return null;
        }

        PartyPrivacyAgreementRefEntity partyPrivacyAgreementRefEntity = new PartyPrivacyAgreementRefEntity();

        partyPrivacyAgreementRefEntity.id = partyPrivacyAgreementRef.getId();
        partyPrivacyAgreementRefEntity.href = partyPrivacyAgreementRef.getHref();
        partyPrivacyAgreementRefEntity.name = partyPrivacyAgreementRef.getName();
        partyPrivacyAgreementRefEntity.atBaseType = partyPrivacyAgreementRef.getAtBaseType();
        partyPrivacyAgreementRefEntity.atSchemaLocation = partyPrivacyAgreementRef.getAtSchemaLocation();
        partyPrivacyAgreementRefEntity.atType = partyPrivacyAgreementRef.getAtType();
        partyPrivacyAgreementRefEntity.atReferredType = partyPrivacyAgreementRef.getAtReferredType();

        return partyPrivacyAgreementRefEntity;
    }

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

    @Override
    public PartyPrivacyProfileSpecificationRef map(PartyPrivacyProfileSpecificationRefEntity partyPrivacyProfileSpecificationRefEntity) {
        if ( partyPrivacyProfileSpecificationRefEntity == null ) {
            return null;
        }

        PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecificationRef = new PartyPrivacyProfileSpecificationRef();

        partyPrivacyProfileSpecificationRef.setId( partyPrivacyProfileSpecificationRefEntity.id );
        partyPrivacyProfileSpecificationRef.setHref( partyPrivacyProfileSpecificationRefEntity.href );
        partyPrivacyProfileSpecificationRef.setName( partyPrivacyProfileSpecificationRefEntity.name );
        partyPrivacyProfileSpecificationRef.setAtBaseType( partyPrivacyProfileSpecificationRefEntity.atBaseType );
        partyPrivacyProfileSpecificationRef.setAtSchemaLocation( partyPrivacyProfileSpecificationRefEntity.atSchemaLocation );
        partyPrivacyProfileSpecificationRef.setAtType( partyPrivacyProfileSpecificationRefEntity.atType );
        partyPrivacyProfileSpecificationRef.setAtReferredType( partyPrivacyProfileSpecificationRefEntity.atReferredType );

        return partyPrivacyProfileSpecificationRef;
    }

    @Override
    public PartyPrivacyProfileSpecificationRefEntity map(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecificationRef) {
        if ( partyPrivacyProfileSpecificationRef == null ) {
            return null;
        }

        PartyPrivacyProfileSpecificationRefEntity partyPrivacyProfileSpecificationRefEntity = new PartyPrivacyProfileSpecificationRefEntity();

        partyPrivacyProfileSpecificationRefEntity.id = partyPrivacyProfileSpecificationRef.getId();
        partyPrivacyProfileSpecificationRefEntity.href = partyPrivacyProfileSpecificationRef.getHref();
        partyPrivacyProfileSpecificationRefEntity.name = partyPrivacyProfileSpecificationRef.getName();
        partyPrivacyProfileSpecificationRefEntity.atBaseType = partyPrivacyProfileSpecificationRef.getAtBaseType();
        partyPrivacyProfileSpecificationRefEntity.atSchemaLocation = partyPrivacyProfileSpecificationRef.getAtSchemaLocation();
        partyPrivacyProfileSpecificationRefEntity.atType = partyPrivacyProfileSpecificationRef.getAtType();
        partyPrivacyProfileSpecificationRefEntity.atReferredType = partyPrivacyProfileSpecificationRef.getAtReferredType();

        return partyPrivacyProfileSpecificationRefEntity;
    }

    @Override
    public String map(ObjectId id) {
        if ( id == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public ObjectId map(String id) {
        if ( id == null ) {
            return null;
        }

        ObjectId objectId = new ObjectId();

        return objectId;
    }

    @Override
    public TimePeriod map(TimePeriodEntity timePeriodEntity) {
        if ( timePeriodEntity == null ) {
            return null;
        }

        TimePeriod timePeriod = new TimePeriod();

        timePeriod.setEndDateTime( timePeriodEntity.endDateTime );
        timePeriod.setStartDateTime( timePeriodEntity.startDateTime );

        return timePeriod;
    }

    @Override
    public TimePeriodEntity map(TimePeriod timePeriod) {
        if ( timePeriod == null ) {
            return null;
        }

        TimePeriodEntity timePeriodEntity = new TimePeriodEntity();

        timePeriodEntity.endDateTime = timePeriod.getEndDateTime();
        timePeriodEntity.startDateTime = timePeriod.getStartDateTime();

        return timePeriodEntity;
    }

    protected List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristicEntityListToPartyPrivacyProfileCharacteristicList(List<PartyPrivacyProfileCharacteristicEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<PartyPrivacyProfileCharacteristic> list1 = new ArrayList<PartyPrivacyProfileCharacteristic>( list.size() );
        for ( PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicEntity : list ) {
            list1.add( map( partyPrivacyProfileCharacteristicEntity ) );
        }

        return list1;
    }

    protected List<PartyPrivacyProfileCharacteristicEntity> partyPrivacyProfileCharacteristicListToPartyPrivacyProfileCharacteristicEntityList(List<PartyPrivacyProfileCharacteristic> list) {
        if ( list == null ) {
            return null;
        }

        List<PartyPrivacyProfileCharacteristicEntity> list1 = new ArrayList<PartyPrivacyProfileCharacteristicEntity>( list.size() );
        for ( PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic : list ) {
            list1.add( map( partyPrivacyProfileCharacteristic ) );
        }

        return list1;
    }

    protected List<RelatedParty> relatedPartyEntityListToRelatedPartyList(List<RelatedPartyEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RelatedParty> list1 = new ArrayList<RelatedParty>( list.size() );
        for ( RelatedPartyEntity relatedPartyEntity : list ) {
            list1.add( map( relatedPartyEntity ) );
        }

        return list1;
    }

    protected List<RelatedPartyEntity> relatedPartyListToRelatedPartyEntityList(List<RelatedParty> list) {
        if ( list == null ) {
            return null;
        }

        List<RelatedPartyEntity> list1 = new ArrayList<RelatedPartyEntity>( list.size() );
        for ( RelatedParty relatedParty : list ) {
            list1.add( map( relatedParty ) );
        }

        return list1;
    }
}
