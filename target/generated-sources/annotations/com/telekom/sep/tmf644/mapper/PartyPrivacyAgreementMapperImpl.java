package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementAuthorizationEntity;
import com.telekom.sep.tmf644.repository.entity.AgreementItemEntity;
import com.telekom.sep.tmf644.repository.entity.AgreementTermOrConditionEntity;
import com.telekom.sep.tmf644.repository.entity.CharacteristicEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyAgreementEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileCharacteristicEntity;
import com.telekom.sep.tmf644.repository.entity.ReferenceEntity;
import com.telekom.sep.tmf644.repository.entity.RelatedPartyEntity;
import com.telekom.sep.tmf644.repository.entity.TimePeriodEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.openapitools.model.AgreementAuthorization;
import org.openapitools.model.AgreementItem;
import org.openapitools.model.AgreementRef;
import org.openapitools.model.AgreementSpecificationRef;
import org.openapitools.model.AgreementTermOrCondition;
import org.openapitools.model.Characteristic;
import org.openapitools.model.PartyPrivacyAgreement;
import org.openapitools.model.PartyPrivacyAgreementCreate;
import org.openapitools.model.PartyPrivacyAgreementUpdate;
import org.openapitools.model.PartyPrivacyProfileCharacteristic;
import org.openapitools.model.PartyPrivacyProfileRef;
import org.openapitools.model.ProductOfferingRef;
import org.openapitools.model.ProductRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-30T18:01:22+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14 (AdoptOpenJDK)"
)
@ApplicationScoped
public class PartyPrivacyAgreementMapperImpl implements PartyPrivacyAgreementMapper {

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

    @Override
    public ObjectId map(String id) {
        if ( id == null ) {
            return null;
        }

        ObjectId objectId = new ObjectId();

        return objectId;
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
    public PartyPrivacyAgreementEntity map(PartyPrivacyAgreementCreate partyPrivacyAgreement) {
        if ( partyPrivacyAgreement == null ) {
            return null;
        }

        PartyPrivacyAgreementEntity partyPrivacyAgreementEntity = new PartyPrivacyAgreementEntity();

        partyPrivacyAgreementEntity.agreementType = partyPrivacyAgreement.getAgreementType();
        partyPrivacyAgreementEntity.description = partyPrivacyAgreement.getDescription();
        partyPrivacyAgreementEntity.documentNumber = partyPrivacyAgreement.getDocumentNumber();
        partyPrivacyAgreementEntity.initialDate = partyPrivacyAgreement.getInitialDate();
        partyPrivacyAgreementEntity.name = partyPrivacyAgreement.getName();
        partyPrivacyAgreementEntity.statementOfIntent = partyPrivacyAgreement.getStatementOfIntent();
        partyPrivacyAgreementEntity.status = partyPrivacyAgreement.getStatus();
        partyPrivacyAgreementEntity.version = partyPrivacyAgreement.getVersion();
        partyPrivacyAgreementEntity.agreementAuthorization = agreementAuthorizationListToAgreementAuthorizationEntityList( partyPrivacyAgreement.getAgreementAuthorization() );
        partyPrivacyAgreementEntity.agreementItem = agreementItemListToAgreementItemEntityList( partyPrivacyAgreement.getAgreementItem() );
        partyPrivacyAgreementEntity.agreementPeriod = map( partyPrivacyAgreement.getAgreementPeriod() );
        partyPrivacyAgreementEntity.agreementSpecification = agreementSpecificationRefToReferenceEntity( partyPrivacyAgreement.getAgreementSpecification() );
        partyPrivacyAgreementEntity.associatedAgreement = agreementRefListToReferenceEntityList( partyPrivacyAgreement.getAssociatedAgreement() );
        partyPrivacyAgreementEntity.characteristic = characteristicListToCharacteristicEntityList( partyPrivacyAgreement.getCharacteristic() );
        partyPrivacyAgreementEntity.completionDate = map( partyPrivacyAgreement.getCompletionDate() );
        partyPrivacyAgreementEntity.engagedPartyRole = relatedPartyListToRelatedPartyEntityList( partyPrivacyAgreement.getEngagedPartyRole() );
        partyPrivacyAgreementEntity.partyPrivacyProfile = partyPrivacyProfileRefListToReferenceEntityList( partyPrivacyAgreement.getPartyPrivacyProfile() );
        partyPrivacyAgreementEntity.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristicListToPartyPrivacyProfileCharacteristicEntityList( partyPrivacyAgreement.getPartyPrivacyProfileCharacteristic() );
        partyPrivacyAgreementEntity.atBaseType = partyPrivacyAgreement.getAtBaseType();
        partyPrivacyAgreementEntity.atSchemaLocation = partyPrivacyAgreement.getAtSchemaLocation();
        partyPrivacyAgreementEntity.atType = partyPrivacyAgreement.getAtType();

        return partyPrivacyAgreementEntity;
    }

    @Override
    public PartyPrivacyAgreement map(PartyPrivacyAgreementEntity partyPrivacyAgreementEntity) {
        if ( partyPrivacyAgreementEntity == null ) {
            return null;
        }

        PartyPrivacyAgreement partyPrivacyAgreement = new PartyPrivacyAgreement();

        partyPrivacyAgreement.setId( map( partyPrivacyAgreementEntity.id ) );
        partyPrivacyAgreement.setHref( partyPrivacyAgreementEntity.href );
        partyPrivacyAgreement.setAgreementType( partyPrivacyAgreementEntity.agreementType );
        partyPrivacyAgreement.setDescription( partyPrivacyAgreementEntity.description );
        partyPrivacyAgreement.setDocumentNumber( partyPrivacyAgreementEntity.documentNumber );
        partyPrivacyAgreement.setInitialDate( partyPrivacyAgreementEntity.initialDate );
        partyPrivacyAgreement.setName( partyPrivacyAgreementEntity.name );
        partyPrivacyAgreement.setStatementOfIntent( partyPrivacyAgreementEntity.statementOfIntent );
        partyPrivacyAgreement.setStatus( partyPrivacyAgreementEntity.status );
        partyPrivacyAgreement.setVersion( partyPrivacyAgreementEntity.version );
        partyPrivacyAgreement.setAgreementAuthorization( agreementAuthorizationEntityListToAgreementAuthorizationList( partyPrivacyAgreementEntity.agreementAuthorization ) );
        partyPrivacyAgreement.setAgreementItem( agreementItemEntityListToAgreementItemList( partyPrivacyAgreementEntity.agreementItem ) );
        partyPrivacyAgreement.setAgreementPeriod( map( partyPrivacyAgreementEntity.agreementPeriod ) );
        partyPrivacyAgreement.setAgreementSpecification( referenceEntityToAgreementSpecificationRef( partyPrivacyAgreementEntity.agreementSpecification ) );
        partyPrivacyAgreement.setAssociatedAgreement( referenceEntityListToAgreementRefList( partyPrivacyAgreementEntity.associatedAgreement ) );
        partyPrivacyAgreement.setCharacteristic( characteristicEntityListToCharacteristicList( partyPrivacyAgreementEntity.characteristic ) );
        partyPrivacyAgreement.setCompletionDate( map( partyPrivacyAgreementEntity.completionDate ) );
        partyPrivacyAgreement.setEngagedPartyRole( relatedPartyEntityListToRelatedPartyList( partyPrivacyAgreementEntity.engagedPartyRole ) );
        partyPrivacyAgreement.setPartyPrivacyProfile( referenceEntityListToPartyPrivacyProfileRefList( partyPrivacyAgreementEntity.partyPrivacyProfile ) );
        partyPrivacyAgreement.setPartyPrivacyProfileCharacteristic( partyPrivacyProfileCharacteristicEntityListToPartyPrivacyProfileCharacteristicList( partyPrivacyAgreementEntity.partyPrivacyProfileCharacteristic ) );
        partyPrivacyAgreement.setAtBaseType( partyPrivacyAgreementEntity.atBaseType );
        partyPrivacyAgreement.setAtSchemaLocation( partyPrivacyAgreementEntity.atSchemaLocation );
        partyPrivacyAgreement.setAtType( partyPrivacyAgreementEntity.atType );

        return partyPrivacyAgreement;
    }

    @Override
    public PartyPrivacyAgreementEntity map(PartyPrivacyAgreementUpdate partyPrivacyAgreement) {
        if ( partyPrivacyAgreement == null ) {
            return null;
        }

        PartyPrivacyAgreementEntity partyPrivacyAgreementEntity = new PartyPrivacyAgreementEntity();

        partyPrivacyAgreementEntity.agreementType = partyPrivacyAgreement.getAgreementType();
        partyPrivacyAgreementEntity.description = partyPrivacyAgreement.getDescription();
        partyPrivacyAgreementEntity.documentNumber = partyPrivacyAgreement.getDocumentNumber();
        partyPrivacyAgreementEntity.initialDate = partyPrivacyAgreement.getInitialDate();
        partyPrivacyAgreementEntity.name = partyPrivacyAgreement.getName();
        partyPrivacyAgreementEntity.statementOfIntent = partyPrivacyAgreement.getStatementOfIntent();
        partyPrivacyAgreementEntity.status = partyPrivacyAgreement.getStatus();
        partyPrivacyAgreementEntity.version = partyPrivacyAgreement.getVersion();
        partyPrivacyAgreementEntity.agreementAuthorization = agreementAuthorizationListToAgreementAuthorizationEntityList( partyPrivacyAgreement.getAgreementAuthorization() );
        partyPrivacyAgreementEntity.agreementItem = agreementItemListToAgreementItemEntityList( partyPrivacyAgreement.getAgreementItem() );
        partyPrivacyAgreementEntity.agreementPeriod = map( partyPrivacyAgreement.getAgreementPeriod() );
        partyPrivacyAgreementEntity.agreementSpecification = agreementSpecificationRefToReferenceEntity( partyPrivacyAgreement.getAgreementSpecification() );
        partyPrivacyAgreementEntity.associatedAgreement = agreementRefListToReferenceEntityList( partyPrivacyAgreement.getAssociatedAgreement() );
        partyPrivacyAgreementEntity.characteristic = characteristicListToCharacteristicEntityList( partyPrivacyAgreement.getCharacteristic() );
        partyPrivacyAgreementEntity.completionDate = map( partyPrivacyAgreement.getCompletionDate() );
        partyPrivacyAgreementEntity.engagedPartyRole = relatedPartyListToRelatedPartyEntityList( partyPrivacyAgreement.getEngagedPartyRole() );
        partyPrivacyAgreementEntity.partyPrivacyProfile = partyPrivacyProfileRefListToReferenceEntityList( partyPrivacyAgreement.getPartyPrivacyProfile() );
        partyPrivacyAgreementEntity.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristicListToPartyPrivacyProfileCharacteristicEntityList( partyPrivacyAgreement.getPartyPrivacyProfileCharacteristic() );
        partyPrivacyAgreementEntity.atBaseType = partyPrivacyAgreement.getAtBaseType();
        partyPrivacyAgreementEntity.atSchemaLocation = partyPrivacyAgreement.getAtSchemaLocation();
        partyPrivacyAgreementEntity.atType = partyPrivacyAgreement.getAtType();

        return partyPrivacyAgreementEntity;
    }

    @Override
    public List<PartyPrivacyAgreement> map(List<PartyPrivacyAgreementEntity> partyPrivacyAgreementEntities) {
        if ( partyPrivacyAgreementEntities == null ) {
            return null;
        }

        List<PartyPrivacyAgreement> list = new ArrayList<PartyPrivacyAgreement>( partyPrivacyAgreementEntities.size() );
        for ( PartyPrivacyAgreementEntity partyPrivacyAgreementEntity : partyPrivacyAgreementEntities ) {
            list.add( map( partyPrivacyAgreementEntity ) );
        }

        return list;
    }

    protected AgreementAuthorizationEntity agreementAuthorizationToAgreementAuthorizationEntity(AgreementAuthorization agreementAuthorization) {
        if ( agreementAuthorization == null ) {
            return null;
        }

        AgreementAuthorizationEntity agreementAuthorizationEntity = new AgreementAuthorizationEntity();

        agreementAuthorizationEntity.date = agreementAuthorization.getDate();
        agreementAuthorizationEntity.signatureRepresentation = agreementAuthorization.getSignatureRepresentation();
        agreementAuthorizationEntity.state = agreementAuthorization.getState();
        agreementAuthorizationEntity.atBaseType = agreementAuthorization.getAtBaseType();
        agreementAuthorizationEntity.atSchemaLocation = agreementAuthorization.getAtSchemaLocation();
        agreementAuthorizationEntity.atType = agreementAuthorization.getAtType();

        return agreementAuthorizationEntity;
    }

    protected List<AgreementAuthorizationEntity> agreementAuthorizationListToAgreementAuthorizationEntityList(List<AgreementAuthorization> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementAuthorizationEntity> list1 = new ArrayList<AgreementAuthorizationEntity>( list.size() );
        for ( AgreementAuthorization agreementAuthorization : list ) {
            list1.add( agreementAuthorizationToAgreementAuthorizationEntity( agreementAuthorization ) );
        }

        return list1;
    }

    protected ReferenceEntity productRefToReferenceEntity(ProductRef productRef) {
        if ( productRef == null ) {
            return null;
        }

        ReferenceEntity referenceEntity = new ReferenceEntity();

        referenceEntity.id = productRef.getId();
        referenceEntity.href = productRef.getHref();
        referenceEntity.name = productRef.getName();
        referenceEntity.atBaseType = productRef.getAtBaseType();
        referenceEntity.atSchemaLocation = productRef.getAtSchemaLocation();
        referenceEntity.atType = productRef.getAtType();
        referenceEntity.atReferredType = productRef.getAtReferredType();

        return referenceEntity;
    }

    protected List<ReferenceEntity> productRefListToReferenceEntityList(List<ProductRef> list) {
        if ( list == null ) {
            return null;
        }

        List<ReferenceEntity> list1 = new ArrayList<ReferenceEntity>( list.size() );
        for ( ProductRef productRef : list ) {
            list1.add( productRefToReferenceEntity( productRef ) );
        }

        return list1;
    }

    protected ReferenceEntity productOfferingRefToReferenceEntity(ProductOfferingRef productOfferingRef) {
        if ( productOfferingRef == null ) {
            return null;
        }

        ReferenceEntity referenceEntity = new ReferenceEntity();

        referenceEntity.id = productOfferingRef.getId();
        referenceEntity.href = productOfferingRef.getHref();
        referenceEntity.name = productOfferingRef.getName();
        referenceEntity.atBaseType = productOfferingRef.getAtBaseType();
        referenceEntity.atSchemaLocation = productOfferingRef.getAtSchemaLocation();
        referenceEntity.atType = productOfferingRef.getAtType();
        referenceEntity.atReferredType = productOfferingRef.getAtReferredType();

        return referenceEntity;
    }

    protected List<ReferenceEntity> productOfferingRefListToReferenceEntityList(List<ProductOfferingRef> list) {
        if ( list == null ) {
            return null;
        }

        List<ReferenceEntity> list1 = new ArrayList<ReferenceEntity>( list.size() );
        for ( ProductOfferingRef productOfferingRef : list ) {
            list1.add( productOfferingRefToReferenceEntity( productOfferingRef ) );
        }

        return list1;
    }

    protected AgreementTermOrConditionEntity agreementTermOrConditionToAgreementTermOrConditionEntity(AgreementTermOrCondition agreementTermOrCondition) {
        if ( agreementTermOrCondition == null ) {
            return null;
        }

        AgreementTermOrConditionEntity agreementTermOrConditionEntity = new AgreementTermOrConditionEntity();

        agreementTermOrConditionEntity.id = agreementTermOrCondition.getId();
        agreementTermOrConditionEntity.description = agreementTermOrCondition.getDescription();
        agreementTermOrConditionEntity.validFor = map( agreementTermOrCondition.getValidFor() );
        agreementTermOrConditionEntity.atBaseType = agreementTermOrCondition.getAtBaseType();
        agreementTermOrConditionEntity.atSchemaLocation = agreementTermOrCondition.getAtSchemaLocation();
        agreementTermOrConditionEntity.atType = agreementTermOrCondition.getAtType();

        return agreementTermOrConditionEntity;
    }

    protected List<AgreementTermOrConditionEntity> agreementTermOrConditionListToAgreementTermOrConditionEntityList(List<AgreementTermOrCondition> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementTermOrConditionEntity> list1 = new ArrayList<AgreementTermOrConditionEntity>( list.size() );
        for ( AgreementTermOrCondition agreementTermOrCondition : list ) {
            list1.add( agreementTermOrConditionToAgreementTermOrConditionEntity( agreementTermOrCondition ) );
        }

        return list1;
    }

    protected AgreementItemEntity agreementItemToAgreementItemEntity(AgreementItem agreementItem) {
        if ( agreementItem == null ) {
            return null;
        }

        AgreementItemEntity agreementItemEntity = new AgreementItemEntity();

        agreementItemEntity.product = productRefListToReferenceEntityList( agreementItem.getProduct() );
        agreementItemEntity.productOffering = productOfferingRefListToReferenceEntityList( agreementItem.getProductOffering() );
        agreementItemEntity.termOrCondition = agreementTermOrConditionListToAgreementTermOrConditionEntityList( agreementItem.getTermOrCondition() );
        agreementItemEntity.atBaseType = agreementItem.getAtBaseType();
        agreementItemEntity.atSchemaLocation = agreementItem.getAtSchemaLocation();
        agreementItemEntity.atType = agreementItem.getAtType();

        return agreementItemEntity;
    }

    protected List<AgreementItemEntity> agreementItemListToAgreementItemEntityList(List<AgreementItem> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementItemEntity> list1 = new ArrayList<AgreementItemEntity>( list.size() );
        for ( AgreementItem agreementItem : list ) {
            list1.add( agreementItemToAgreementItemEntity( agreementItem ) );
        }

        return list1;
    }

    protected ReferenceEntity agreementSpecificationRefToReferenceEntity(AgreementSpecificationRef agreementSpecificationRef) {
        if ( agreementSpecificationRef == null ) {
            return null;
        }

        ReferenceEntity referenceEntity = new ReferenceEntity();

        referenceEntity.id = agreementSpecificationRef.getId();
        referenceEntity.href = agreementSpecificationRef.getHref();
        referenceEntity.description = agreementSpecificationRef.getDescription();
        referenceEntity.name = agreementSpecificationRef.getName();
        referenceEntity.atBaseType = agreementSpecificationRef.getAtBaseType();
        referenceEntity.atSchemaLocation = agreementSpecificationRef.getAtSchemaLocation();
        referenceEntity.atType = agreementSpecificationRef.getAtType();
        referenceEntity.atReferredType = agreementSpecificationRef.getAtReferredType();

        return referenceEntity;
    }

    protected ReferenceEntity agreementRefToReferenceEntity(AgreementRef agreementRef) {
        if ( agreementRef == null ) {
            return null;
        }

        ReferenceEntity referenceEntity = new ReferenceEntity();

        referenceEntity.id = agreementRef.getId();
        referenceEntity.href = agreementRef.getHref();
        referenceEntity.name = agreementRef.getName();
        referenceEntity.atBaseType = agreementRef.getAtBaseType();
        referenceEntity.atSchemaLocation = agreementRef.getAtSchemaLocation();
        referenceEntity.atType = agreementRef.getAtType();
        referenceEntity.atReferredType = agreementRef.getAtReferredType();

        return referenceEntity;
    }

    protected List<ReferenceEntity> agreementRefListToReferenceEntityList(List<AgreementRef> list) {
        if ( list == null ) {
            return null;
        }

        List<ReferenceEntity> list1 = new ArrayList<ReferenceEntity>( list.size() );
        for ( AgreementRef agreementRef : list ) {
            list1.add( agreementRefToReferenceEntity( agreementRef ) );
        }

        return list1;
    }

    protected CharacteristicEntity characteristicToCharacteristicEntity(Characteristic characteristic) {
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

    protected List<CharacteristicEntity> characteristicListToCharacteristicEntityList(List<Characteristic> list) {
        if ( list == null ) {
            return null;
        }

        List<CharacteristicEntity> list1 = new ArrayList<CharacteristicEntity>( list.size() );
        for ( Characteristic characteristic : list ) {
            list1.add( characteristicToCharacteristicEntity( characteristic ) );
        }

        return list1;
    }

    protected RelatedPartyEntity relatedPartyToRelatedPartyEntity(RelatedParty relatedParty) {
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

    protected List<RelatedPartyEntity> relatedPartyListToRelatedPartyEntityList(List<RelatedParty> list) {
        if ( list == null ) {
            return null;
        }

        List<RelatedPartyEntity> list1 = new ArrayList<RelatedPartyEntity>( list.size() );
        for ( RelatedParty relatedParty : list ) {
            list1.add( relatedPartyToRelatedPartyEntity( relatedParty ) );
        }

        return list1;
    }

    protected ReferenceEntity partyPrivacyProfileRefToReferenceEntity(PartyPrivacyProfileRef partyPrivacyProfileRef) {
        if ( partyPrivacyProfileRef == null ) {
            return null;
        }

        ReferenceEntity referenceEntity = new ReferenceEntity();

        referenceEntity.id = partyPrivacyProfileRef.getId();
        referenceEntity.href = partyPrivacyProfileRef.getHref();
        referenceEntity.name = partyPrivacyProfileRef.getName();
        referenceEntity.atBaseType = partyPrivacyProfileRef.getAtBaseType();
        referenceEntity.atSchemaLocation = partyPrivacyProfileRef.getAtSchemaLocation();
        referenceEntity.atType = partyPrivacyProfileRef.getAtType();
        referenceEntity.atReferredType = partyPrivacyProfileRef.getAtReferredType();

        return referenceEntity;
    }

    protected List<ReferenceEntity> partyPrivacyProfileRefListToReferenceEntityList(List<PartyPrivacyProfileRef> list) {
        if ( list == null ) {
            return null;
        }

        List<ReferenceEntity> list1 = new ArrayList<ReferenceEntity>( list.size() );
        for ( PartyPrivacyProfileRef partyPrivacyProfileRef : list ) {
            list1.add( partyPrivacyProfileRefToReferenceEntity( partyPrivacyProfileRef ) );
        }

        return list1;
    }

    protected PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicToPartyPrivacyProfileCharacteristicEntity(PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic) {
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

    protected List<PartyPrivacyProfileCharacteristicEntity> partyPrivacyProfileCharacteristicListToPartyPrivacyProfileCharacteristicEntityList(List<PartyPrivacyProfileCharacteristic> list) {
        if ( list == null ) {
            return null;
        }

        List<PartyPrivacyProfileCharacteristicEntity> list1 = new ArrayList<PartyPrivacyProfileCharacteristicEntity>( list.size() );
        for ( PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic : list ) {
            list1.add( partyPrivacyProfileCharacteristicToPartyPrivacyProfileCharacteristicEntity( partyPrivacyProfileCharacteristic ) );
        }

        return list1;
    }

    protected AgreementAuthorization agreementAuthorizationEntityToAgreementAuthorization(AgreementAuthorizationEntity agreementAuthorizationEntity) {
        if ( agreementAuthorizationEntity == null ) {
            return null;
        }

        AgreementAuthorization agreementAuthorization = new AgreementAuthorization();

        agreementAuthorization.setDate( agreementAuthorizationEntity.date );
        agreementAuthorization.setSignatureRepresentation( agreementAuthorizationEntity.signatureRepresentation );
        agreementAuthorization.setState( agreementAuthorizationEntity.state );
        agreementAuthorization.setAtBaseType( agreementAuthorizationEntity.atBaseType );
        agreementAuthorization.setAtSchemaLocation( agreementAuthorizationEntity.atSchemaLocation );
        agreementAuthorization.setAtType( agreementAuthorizationEntity.atType );

        return agreementAuthorization;
    }

    protected List<AgreementAuthorization> agreementAuthorizationEntityListToAgreementAuthorizationList(List<AgreementAuthorizationEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementAuthorization> list1 = new ArrayList<AgreementAuthorization>( list.size() );
        for ( AgreementAuthorizationEntity agreementAuthorizationEntity : list ) {
            list1.add( agreementAuthorizationEntityToAgreementAuthorization( agreementAuthorizationEntity ) );
        }

        return list1;
    }

    protected ProductRef referenceEntityToProductRef(ReferenceEntity referenceEntity) {
        if ( referenceEntity == null ) {
            return null;
        }

        ProductRef productRef = new ProductRef();

        productRef.setId( referenceEntity.id );
        productRef.setHref( referenceEntity.href );
        productRef.setName( referenceEntity.name );
        productRef.setAtBaseType( referenceEntity.atBaseType );
        productRef.setAtSchemaLocation( referenceEntity.atSchemaLocation );
        productRef.setAtType( referenceEntity.atType );
        productRef.setAtReferredType( referenceEntity.atReferredType );

        return productRef;
    }

    protected List<ProductRef> referenceEntityListToProductRefList(List<ReferenceEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductRef> list1 = new ArrayList<ProductRef>( list.size() );
        for ( ReferenceEntity referenceEntity : list ) {
            list1.add( referenceEntityToProductRef( referenceEntity ) );
        }

        return list1;
    }

    protected ProductOfferingRef referenceEntityToProductOfferingRef(ReferenceEntity referenceEntity) {
        if ( referenceEntity == null ) {
            return null;
        }

        ProductOfferingRef productOfferingRef = new ProductOfferingRef();

        productOfferingRef.setId( referenceEntity.id );
        productOfferingRef.setHref( referenceEntity.href );
        productOfferingRef.setName( referenceEntity.name );
        productOfferingRef.setAtBaseType( referenceEntity.atBaseType );
        productOfferingRef.setAtSchemaLocation( referenceEntity.atSchemaLocation );
        productOfferingRef.setAtType( referenceEntity.atType );
        productOfferingRef.setAtReferredType( referenceEntity.atReferredType );

        return productOfferingRef;
    }

    protected List<ProductOfferingRef> referenceEntityListToProductOfferingRefList(List<ReferenceEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductOfferingRef> list1 = new ArrayList<ProductOfferingRef>( list.size() );
        for ( ReferenceEntity referenceEntity : list ) {
            list1.add( referenceEntityToProductOfferingRef( referenceEntity ) );
        }

        return list1;
    }

    protected AgreementTermOrCondition agreementTermOrConditionEntityToAgreementTermOrCondition(AgreementTermOrConditionEntity agreementTermOrConditionEntity) {
        if ( agreementTermOrConditionEntity == null ) {
            return null;
        }

        AgreementTermOrCondition agreementTermOrCondition = new AgreementTermOrCondition();

        agreementTermOrCondition.setId( agreementTermOrConditionEntity.id );
        agreementTermOrCondition.setDescription( agreementTermOrConditionEntity.description );
        agreementTermOrCondition.setValidFor( map( agreementTermOrConditionEntity.validFor ) );
        agreementTermOrCondition.setAtBaseType( agreementTermOrConditionEntity.atBaseType );
        agreementTermOrCondition.setAtSchemaLocation( agreementTermOrConditionEntity.atSchemaLocation );
        agreementTermOrCondition.setAtType( agreementTermOrConditionEntity.atType );

        return agreementTermOrCondition;
    }

    protected List<AgreementTermOrCondition> agreementTermOrConditionEntityListToAgreementTermOrConditionList(List<AgreementTermOrConditionEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementTermOrCondition> list1 = new ArrayList<AgreementTermOrCondition>( list.size() );
        for ( AgreementTermOrConditionEntity agreementTermOrConditionEntity : list ) {
            list1.add( agreementTermOrConditionEntityToAgreementTermOrCondition( agreementTermOrConditionEntity ) );
        }

        return list1;
    }

    protected AgreementItem agreementItemEntityToAgreementItem(AgreementItemEntity agreementItemEntity) {
        if ( agreementItemEntity == null ) {
            return null;
        }

        AgreementItem agreementItem = new AgreementItem();

        agreementItem.setProduct( referenceEntityListToProductRefList( agreementItemEntity.product ) );
        agreementItem.setProductOffering( referenceEntityListToProductOfferingRefList( agreementItemEntity.productOffering ) );
        agreementItem.setTermOrCondition( agreementTermOrConditionEntityListToAgreementTermOrConditionList( agreementItemEntity.termOrCondition ) );
        agreementItem.setAtBaseType( agreementItemEntity.atBaseType );
        agreementItem.setAtSchemaLocation( agreementItemEntity.atSchemaLocation );
        agreementItem.setAtType( agreementItemEntity.atType );

        return agreementItem;
    }

    protected List<AgreementItem> agreementItemEntityListToAgreementItemList(List<AgreementItemEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementItem> list1 = new ArrayList<AgreementItem>( list.size() );
        for ( AgreementItemEntity agreementItemEntity : list ) {
            list1.add( agreementItemEntityToAgreementItem( agreementItemEntity ) );
        }

        return list1;
    }

    protected AgreementSpecificationRef referenceEntityToAgreementSpecificationRef(ReferenceEntity referenceEntity) {
        if ( referenceEntity == null ) {
            return null;
        }

        AgreementSpecificationRef agreementSpecificationRef = new AgreementSpecificationRef();

        agreementSpecificationRef.setId( referenceEntity.id );
        agreementSpecificationRef.setHref( referenceEntity.href );
        agreementSpecificationRef.setDescription( referenceEntity.description );
        agreementSpecificationRef.setName( referenceEntity.name );
        agreementSpecificationRef.setAtBaseType( referenceEntity.atBaseType );
        agreementSpecificationRef.setAtSchemaLocation( referenceEntity.atSchemaLocation );
        agreementSpecificationRef.setAtType( referenceEntity.atType );
        agreementSpecificationRef.setAtReferredType( referenceEntity.atReferredType );

        return agreementSpecificationRef;
    }

    protected AgreementRef referenceEntityToAgreementRef(ReferenceEntity referenceEntity) {
        if ( referenceEntity == null ) {
            return null;
        }

        AgreementRef agreementRef = new AgreementRef();

        agreementRef.setId( referenceEntity.id );
        agreementRef.setHref( referenceEntity.href );
        agreementRef.setName( referenceEntity.name );
        agreementRef.setAtBaseType( referenceEntity.atBaseType );
        agreementRef.setAtSchemaLocation( referenceEntity.atSchemaLocation );
        agreementRef.setAtType( referenceEntity.atType );
        agreementRef.setAtReferredType( referenceEntity.atReferredType );

        return agreementRef;
    }

    protected List<AgreementRef> referenceEntityListToAgreementRefList(List<ReferenceEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementRef> list1 = new ArrayList<AgreementRef>( list.size() );
        for ( ReferenceEntity referenceEntity : list ) {
            list1.add( referenceEntityToAgreementRef( referenceEntity ) );
        }

        return list1;
    }

    protected Characteristic characteristicEntityToCharacteristic(CharacteristicEntity characteristicEntity) {
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

    protected List<Characteristic> characteristicEntityListToCharacteristicList(List<CharacteristicEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Characteristic> list1 = new ArrayList<Characteristic>( list.size() );
        for ( CharacteristicEntity characteristicEntity : list ) {
            list1.add( characteristicEntityToCharacteristic( characteristicEntity ) );
        }

        return list1;
    }

    protected RelatedParty relatedPartyEntityToRelatedParty(RelatedPartyEntity relatedPartyEntity) {
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

    protected List<RelatedParty> relatedPartyEntityListToRelatedPartyList(List<RelatedPartyEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RelatedParty> list1 = new ArrayList<RelatedParty>( list.size() );
        for ( RelatedPartyEntity relatedPartyEntity : list ) {
            list1.add( relatedPartyEntityToRelatedParty( relatedPartyEntity ) );
        }

        return list1;
    }

    protected PartyPrivacyProfileRef referenceEntityToPartyPrivacyProfileRef(ReferenceEntity referenceEntity) {
        if ( referenceEntity == null ) {
            return null;
        }

        PartyPrivacyProfileRef partyPrivacyProfileRef = new PartyPrivacyProfileRef();

        partyPrivacyProfileRef.setId( referenceEntity.id );
        partyPrivacyProfileRef.setHref( referenceEntity.href );
        partyPrivacyProfileRef.setName( referenceEntity.name );
        partyPrivacyProfileRef.setAtBaseType( referenceEntity.atBaseType );
        partyPrivacyProfileRef.setAtSchemaLocation( referenceEntity.atSchemaLocation );
        partyPrivacyProfileRef.setAtType( referenceEntity.atType );
        partyPrivacyProfileRef.setAtReferredType( referenceEntity.atReferredType );

        return partyPrivacyProfileRef;
    }

    protected List<PartyPrivacyProfileRef> referenceEntityListToPartyPrivacyProfileRefList(List<ReferenceEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<PartyPrivacyProfileRef> list1 = new ArrayList<PartyPrivacyProfileRef>( list.size() );
        for ( ReferenceEntity referenceEntity : list ) {
            list1.add( referenceEntityToPartyPrivacyProfileRef( referenceEntity ) );
        }

        return list1;
    }

    protected PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristicEntityToPartyPrivacyProfileCharacteristic(PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicEntity) {
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

    protected List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristicEntityListToPartyPrivacyProfileCharacteristicList(List<PartyPrivacyProfileCharacteristicEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<PartyPrivacyProfileCharacteristic> list1 = new ArrayList<PartyPrivacyProfileCharacteristic>( list.size() );
        for ( PartyPrivacyProfileCharacteristicEntity partyPrivacyProfileCharacteristicEntity : list ) {
            list1.add( partyPrivacyProfileCharacteristicEntityToPartyPrivacyProfileCharacteristic( partyPrivacyProfileCharacteristicEntity ) );
        }

        return list1;
    }
}
