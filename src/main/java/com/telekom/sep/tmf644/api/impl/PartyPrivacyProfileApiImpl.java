package com.telekom.sep.tmf644.api.impl;

import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.openapitools.api.PartyPrivacyProfileApi;
import org.openapitools.model.PartyPrivacyProfile;
import org.openapitools.model.PartyPrivacyProfileCreate;
import org.openapitools.model.PartyPrivacyProfileUpdate;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

public class PartyPrivacyProfileApiImpl implements PartyPrivacyProfileApi {

    @Inject
    private PartyPrivacyProfileMapper privacyProfileMapper;

    public Response createPartyPrivacyProfile(@Valid PartyPrivacyProfileCreate partyPrivacyProfile) {


        PartyPrivacyProfileEntity partyPrivacyProfileEntity = privacyProfileMapper.map(partyPrivacyProfile);

        partyPrivacyProfileEntity.persist();

        PartyPrivacyProfile profile = privacyProfileMapper.map(partyPrivacyProfileEntity);
        return Response.ok().entity("OK").build();
    }

    public Response deletePartyPrivacyProfile(@PathParam("id") String id) {

        PartyPrivacyProfileEntity.findById(id);
        return Response.ok().entity("magic!").build();
    }

    public Response listPartyPrivacyProfile(@QueryParam("fields") String fields, @QueryParam("offset") Integer offset, @QueryParam("limit") Integer limit) {
        return Response.ok().entity("magic!").build();
    }

    public Response patchPartyPrivacyProfile(@PathParam("id") String id,@Valid PartyPrivacyProfileUpdate partyPrivacyProfile) {
        return Response.ok().entity("magic!").build();
    }

    public Response retrievePartyPrivacyProfile(@PathParam("id") String id,@QueryParam("fields")    String fields) {

        PartyPrivacyProfileEntity entity = PartyPrivacyProfileEntity.find("name","PrivacyStatement").firstResult();


        PartyPrivacyProfile profile = privacyProfileMapper.map(PartyPrivacyProfileEntity.findById(id));
        return Response.ok().entity(profile).build();
    }



}
