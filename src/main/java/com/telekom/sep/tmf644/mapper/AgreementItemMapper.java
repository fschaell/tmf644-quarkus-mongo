package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.AgreementItemEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.AgreementItem;

@Mapper(componentModel = "cdi", uses = {ProductRefMapper.class,ProductOfferingRefMapper.class,AgreementTermOrConditionMapper.class})
public interface AgreementItemMapper {

    AgreementItem map(AgreementItemEntity agreementItemEntity);
    AgreementItemEntity map(AgreementItem agreementItem);
}
