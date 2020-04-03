package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.RelatedPartyEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.RelatedParty;

@Mapper(componentModel = "cdi")
public interface RelatedPartyMapper {
    RelatedParty map(RelatedPartyEntity relatedPartyEntity);
    RelatedPartyEntity map(RelatedParty relatedParty);
}
