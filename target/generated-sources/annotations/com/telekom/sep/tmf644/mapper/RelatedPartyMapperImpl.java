package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.repository.entity.RelatedPartyEntity;
import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import org.openapitools.model.RelatedParty;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T09:14:17+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@ApplicationScoped
public class RelatedPartyMapperImpl implements RelatedPartyMapper {

    @Override
    public RelatedParty map(RelatedPartyEntity relatedPartyEntity) {
        if ( relatedPartyEntity == null ) {
            return null;
        }

        RelatedParty relatedParty = new RelatedParty();

        relatedParty.setId( relatedPartyEntity.id );
        relatedParty.setHref( relatedPartyEntity.href );
        relatedParty.setName( relatedPartyEntity.name );
        relatedParty.setRole( relatedPartyEntity.role );
        relatedParty.setAtBaseType( relatedPartyEntity.atBaseType );
        relatedParty.setAtSchemaLocation( relatedPartyEntity.atSchemaLocation );
        relatedParty.setAtType( relatedPartyEntity.atType );
        relatedParty.setAtReferredType( relatedPartyEntity.atReferredType );

        return relatedParty;
    }

    @Override
    public RelatedPartyEntity map(RelatedParty relatedParty) {
        if ( relatedParty == null ) {
            return null;
        }

        RelatedPartyEntity relatedPartyEntity = new RelatedPartyEntity();

        relatedPartyEntity.id = relatedParty.getId();
        relatedPartyEntity.href = relatedParty.getHref();
        relatedPartyEntity.name = relatedParty.getName();
        relatedPartyEntity.role = relatedParty.getRole();
        relatedPartyEntity.atBaseType = relatedParty.getAtBaseType();
        relatedPartyEntity.atSchemaLocation = relatedParty.getAtSchemaLocation();
        relatedPartyEntity.atType = relatedParty.getAtType();
        relatedPartyEntity.atReferredType = relatedParty.getAtReferredType();

        return relatedPartyEntity;
    }
}
