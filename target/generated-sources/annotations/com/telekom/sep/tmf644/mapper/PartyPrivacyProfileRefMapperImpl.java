package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.ReferenceEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.PartyPrivacyProfileRef;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:17+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class PartyPrivacyProfileRefMapperImpl implements PartyPrivacyProfileRefMapper {

    @Override
    public PartyPrivacyProfileRef map(ReferenceEntity referenceEntity) {
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

    @Override
    public ReferenceEntity map(PartyPrivacyProfileRef partyPrivacyProfileRef) {
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
}
