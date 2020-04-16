package com.telekom.sep.tmf644.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.quarkus.jackson.ObjectMapperCustomizer;
import javax.inject.Singleton;

@Singleton
public class RegisterCustomModuleCustomizer implements ObjectMapperCustomizer {

    public void customize(ObjectMapper mapper) {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        //https://stackoverflow.com/questions/48781632/jackson-serialize-zoneddatetime-to-iso-8601-string
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
   }
}