package com.telekom.sep.tmf644.mapper;

import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;

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
            simpleSource.setName("SourceName");
            simpleSource.setDescription("SourceDescription");
            simpleSource.setAgreedByParty(new RelatedParty(){
                @Override
                public RelatedParty id(String id) {
                    return super.id("1234");
                }

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
            assertEquals(simpleSource.getAgreedByParty().getId(),
                    destination.agreedByParty.id);


            //and return
            simpleSource = mapper.map(destination);
            assertEquals(simpleSource.getName(), destination.name);
            assertEquals(simpleSource.getDescription(),
                    destination.description);

        }


}



