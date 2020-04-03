package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.ReferenceEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.PartyPrivacyProfileSpecificationRef;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:17+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class PartyPrivacyProfileSpecificationRefMapperImpl implements PartyPrivacyProfileSpecificationRefMapper {

    @Override
    public PartyPrivacyProfileSpecificationRef map(ReferenceEntity referenceEntity) {
        if ( referenceEntity == null ) {
            return null;
        }

        PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecificationRef = new PartyPrivacyProfileSpecificationRef();

        partyPrivacyProfileSpecificationRef.setId( referenceEntity.id );
        partyPrivacyProfileSpecificationRef.setHref( referenceEntity.href );
        partyPrivacyProfileSpecificationRef.setName( referenceEntity.name );
        partyPrivacyProfileSpecificationRef.setAtBaseType( referenceEntity.atBaseType );
        partyPrivacyProfileSpecificationRef.setAtSchemaLocation( referenceEntity.atSchemaLocation );
        partyPrivacyProfileSpecificationRef.setAtType( referenceEntity.atType );
        partyPrivacyProfileSpecificationRef.setAtReferredType( referenceEntity.atReferredType );

        return partyPrivacyProfileSpecificationRef;
    }

    @Override
    public ReferenceEntity map(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecificationRef) {
        if ( partyPrivacyProfileSpecificationRef == null ) {
            return null;
        }

        ReferenceEntity referenceEntity = new ReferenceEntity();

        referenceEntity.id = partyPrivacyProfileSpecificationRef.getId();
        referenceEntity.href = partyPrivacyProfileSpecificationRef.getHref();
        referenceEntity.name = partyPrivacyProfileSpecificationRef.getName();
        referenceEntity.atBaseType = partyPrivacyProfileSpecificationRef.getAtBaseType();
        referenceEntity.atSchemaLocation = partyPrivacyProfileSpecificationRef.getAtSchemaLocation();
        referenceEntity.atType = partyPrivacyProfileSpecificationRef.getAtType();
        referenceEntity.atReferredType = partyPrivacyProfileSpecificationRef.getAtReferredType();

        return referenceEntity;
    }
}
