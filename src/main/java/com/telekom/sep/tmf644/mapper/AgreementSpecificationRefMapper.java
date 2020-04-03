package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementSpecificationRefEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.AgreementSpecificationRef;
@Mapper(componentModel = "cdi")
public interface AgreementSpecificationRefMapper {
    AgreementSpecificationRef map(AgreementSpecificationRefEntity referenceEntity);
    AgreementSpecificationRefEntity map(AgreementSpecificationRef agreementSpecificationRef);
}
