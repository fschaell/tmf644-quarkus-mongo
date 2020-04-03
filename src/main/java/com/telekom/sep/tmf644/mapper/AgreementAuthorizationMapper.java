package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementAuthorizationEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.AgreementAuthorization;

@Mapper(componentModel = "cdi")
public interface AgreementAuthorizationMapper {

    AgreementAuthorization map(AgreementAuthorizationEntity agreementAuthorizationEntity);
    AgreementAuthorizationEntity map(AgreementAuthorization agreementAuthorization);
}
