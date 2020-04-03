package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.ReferenceEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.PartyPrivacyAgreementRef;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class PartyPrivacyAgreementRefMapperImpl implements PartyPrivacyAgreementRefMapper {

    @Override
    public PartyPrivacyAgreementRef map(ReferenceEntity referenceEntity) {
        if ( referenceEntity == null ) {
            return null;
        }

        PartyPrivacyAgreementRef partyPrivacyAgreementRef = new PartyPrivacyAgreementRef();

        partyPrivacyAgreementRef.setId( referenceEntity.id );
        partyPrivacyAgreementRef.setHref( referenceEntity.href );
        partyPrivacyAgreementRef.setName( referenceEntity.name );
        partyPrivacyAgreementRef.setAtBaseType( referenceEntity.atBaseType );
        partyPrivacyAgreementRef.setAtSchemaLocation( referenceEntity.atSchemaLocation );
        partyPrivacyAgreementRef.setAtType( referenceEntity.atType );
        partyPrivacyAgreementRef.setAtReferredType( referenceEntity.atReferredType );

        return partyPrivacyAgreementRef;
    }

    @Override
    public ReferenceEntity map(PartyPrivacyAgreementRef partyPrivacyAgreementRef) {
        if ( partyPrivacyAgreementRef == null ) {
            return null;
        }

        ReferenceEntity referenceEntity = new ReferenceEntity();

        referenceEntity.id = partyPrivacyAgreementRef.getId();
        referenceEntity.href = partyPrivacyAgreementRef.getHref();
        referenceEntity.name = partyPrivacyAgreementRef.getName();
        referenceEntity.atBaseType = partyPrivacyAgreementRef.getAtBaseType();
        referenceEntity.atSchemaLocation = partyPrivacyAgreementRef.getAtSchemaLocation();
        referenceEntity.atType = partyPrivacyAgreementRef.getAtType();
        referenceEntity.atReferredType = partyPrivacyAgreementRef.getAtReferredType();

        return referenceEntity;
    }
}
