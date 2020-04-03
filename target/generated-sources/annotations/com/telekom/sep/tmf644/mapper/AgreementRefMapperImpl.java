package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.ReferenceEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.AgreementRef;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class AgreementRefMapperImpl implements AgreementRefMapper {

    @Override
    public AgreementRef map(ReferenceEntity referenceEntity) {
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

    @Override
    public ReferenceEntity map(AgreementRef agreementRef) {
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
}
