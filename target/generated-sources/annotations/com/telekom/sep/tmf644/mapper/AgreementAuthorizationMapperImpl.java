package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementAuthorizationEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.AgreementAuthorization;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:17+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class AgreementAuthorizationMapperImpl implements AgreementAuthorizationMapper {

    @Override
    public AgreementAuthorization map(AgreementAuthorizationEntity agreementAuthorizationEntity) {
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

    @Override
    public AgreementAuthorizationEntity map(AgreementAuthorization agreementAuthorization) {
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
}
