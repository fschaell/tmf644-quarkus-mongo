package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.openapitools.model.PartyPrivacyProfile;
import org.openapitools.model.RelatedParty;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PartyPrivacyProfileMapperTest {


        private PartyPrivacyProfileMapper mapper
                = Mappers.getMapper(PartyPrivacyProfileMapper.class);
        @Test
        public void givenSourceToDestination_whenMaps_thenCorrect() {
            PartyPrivacyProfile simpleSource = new PartyPrivacyProfile();
            simpleSource.setId("5e957c10e3701d792517d437");
            simpleSource.setName("SourceName");
            simpleSource.setDescription("SourceDescription");
            simpleSource.setAgreedByParty(new RelatedParty(){

                @Override
                public RelatedParty href(String href) {
                    return super.href("http://relatedParty");
                }

                @Override
                public RelatedParty name(String name) {
                    return super.name("partyName");
                }

                @Override
                public RelatedParty role(String role) {
                    return super.role("partyRole");
                }
            });


            PartyPrivacyProfileEntity destination = mapper.map(simpleSource);
            assertEquals(simpleSource.getName(), destination.name);
            assertEquals(simpleSource.getDescription(),
                    destination.description);
            assertEquals(simpleSource.getAgreedByParty().getName(),
                    destination.agreedByParty.name);


            //and return
            simpleSource = mapper.map(destination);
            assertEquals(simpleSource.getName(), destination.name);
            assertEquals(simpleSource.getDescription(),
                    destination.description);
            assertEquals(simpleSource.getId(),
                    destination.id.toString());

        }


}



