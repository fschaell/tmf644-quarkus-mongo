package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementRefEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.AgreementRef;

@Mapper(componentModel = "cdi")
public interface AgreementRefMapper {
  AgreementRef map (AgreementRefEntity referenceEntity);
  AgreementRefEntity map(AgreementRef agreementRef);

}
