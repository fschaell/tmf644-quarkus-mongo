package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.ReferenceEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.AgreementSpecificationRef;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class AgreementSpecificationRefMapperImpl implements AgreementSpecificationRefMapper {

    @Override
    public AgreementSpecificationRef map(ReferenceEntity referenceEntity) {
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

    @Override
    public ReferenceEntity map(AgreementSpecificationRef agreementSpecificationRef) {
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
}
