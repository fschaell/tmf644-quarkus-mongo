package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.PartyPrivacyRoleSpecificationEntity;
import com.telekom.sep.tmf644.repository.entity.ReferenceEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.openapitools.model.AgreementSpecificationRef;
import org.openapitools.model.PartyPrivacyRoleSpecification;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:17+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class PartyPrivacyRoleSpecificationMapperImpl implements PartyPrivacyRoleSpecificationMapper {

    @Inject
    private AgreementSpecificationRefMapper agreementSpecificationRefMapper;

    @Override
    public PartyPrivacyRoleSpecification map(PartyPrivacyRoleSpecificationEntity partyPrivacyRoleSpecificationEntity) {
        if ( partyPrivacyRoleSpecificationEntity == null ) {
            return null;
        }

        PartyPrivacyRoleSpecification partyPrivacyRoleSpecification = new PartyPrivacyRoleSpecification();

        partyPrivacyRoleSpecification.setDescription( partyPrivacyRoleSpecificationEntity.description );
        partyPrivacyRoleSpecification.setName( partyPrivacyRoleSpecificationEntity.name );
        partyPrivacyRoleSpecification.setAgreementSpecification( referenceEntityListToAgreementSpecificationRefList( partyPrivacyRoleSpecificationEntity.agreementSpecification ) );
        partyPrivacyRoleSpecification.setAtBaseType( partyPrivacyRoleSpecificationEntity.atBaseType );
        partyPrivacyRoleSpecification.setAtSchemaLocation( partyPrivacyRoleSpecificationEntity.atSchemaLocation );
        partyPrivacyRoleSpecification.setAtType( partyPrivacyRoleSpecificationEntity.atType );

        return partyPrivacyRoleSpecification;
    }

    @Override
    public PartyPrivacyRoleSpecificationEntity map(PartyPrivacyRoleSpecification partyPrivacyRoleSpecification) {
        if ( partyPrivacyRoleSpecification == null ) {
            return null;
        }

        PartyPrivacyRoleSpecificationEntity partyPrivacyRoleSpecificationEntity = new PartyPrivacyRoleSpecificationEntity();

        partyPrivacyRoleSpecificationEntity.description = partyPrivacyRoleSpecification.getDescription();
        partyPrivacyRoleSpecificationEntity.name = partyPrivacyRoleSpecification.getName();
        partyPrivacyRoleSpecificationEntity.agreementSpecification = agreementSpecificationRefListToReferenceEntityList( partyPrivacyRoleSpecification.getAgreementSpecification() );
        partyPrivacyRoleSpecificationEntity.atBaseType = partyPrivacyRoleSpecification.getAtBaseType();
        partyPrivacyRoleSpecificationEntity.atSchemaLocation = partyPrivacyRoleSpecification.getAtSchemaLocation();
        partyPrivacyRoleSpecificationEntity.atType = partyPrivacyRoleSpecification.getAtType();

        return partyPrivacyRoleSpecificationEntity;
    }

    protected List<AgreementSpecificationRef> referenceEntityListToAgreementSpecificationRefList(List<ReferenceEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<AgreementSpecificationRef> list1 = new ArrayList<AgreementSpecificationRef>( list.size() );
        for ( ReferenceEntity referenceEntity : list ) {
            list1.add( agreementSpecificationRefMapper.map( referenceEntity ) );
        }

        return list1;
    }

    protected List<ReferenceEntity> agreementSpecificationRefListToReferenceEntityList(List<AgreementSpecificationRef> list) {
        if ( list == null ) {
            return null;
        }

        List<ReferenceEntity> list1 = new ArrayList<ReferenceEntity>( list.size() );
        for ( AgreementSpecificationRef agreementSpecificationRef : list ) {
            list1.add( agreementSpecificationRefMapper.map( agreementSpecificationRef ) );
        }

        return list1;
    }
}
