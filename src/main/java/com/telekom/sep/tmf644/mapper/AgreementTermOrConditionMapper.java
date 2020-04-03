package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementTermOrConditionEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.AgreementTermOrCondition;

@Mapper(componentModel = "cdi",uses = {TimePeriodMapper.class})
public interface AgreementTermOrConditionMapper {

    AgreementTermOrCondition map(AgreementTermOrConditionEntity agreementTermOrConditionEntity);
    AgreementTermOrConditionEntity map(AgreementTermOrCondition agreementTermOrCondition);
}
