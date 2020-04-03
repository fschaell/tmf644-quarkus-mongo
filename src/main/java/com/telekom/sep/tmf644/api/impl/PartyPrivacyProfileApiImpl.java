package com.telekom.sep.tmf644.api.impl;

import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import org.bson.types.ObjectId;
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
        return Response.ok().build();
    }

    public Response deletePartyPrivacyProfile(@PathParam("id") String id) {

        PartyPrivacyProfileEntity.findById(new ObjectId(id)).delete();

        return Response.ok().build();
    }

    public Response listPartyPrivacyProfile(@QueryParam("fields") String fields, @QueryParam("offset") Integer offset, @QueryParam("limit") Integer limit) {

        return Response.ok().entity(privacyProfileMapper.map(PartyPrivacyProfileEntity.listAll())).build();
    }

    public Response patchPartyPrivacyProfile(@PathParam("id") String id,@Valid PartyPrivacyProfileUpdate partyPrivacyProfile) {

        PartyPrivacyProfileEntity entity = privacyProfileMapper.map(partyPrivacyProfile);
        entity.id = new ObjectId(id);
        entity.update();
        return Response.ok().build();
    }

    public Response retrievePartyPrivacyProfile(@PathParam("id") String id,@QueryParam("fields")  String fields) {
        PartyPrivacyProfile profile = privacyProfileMapper.map((PartyPrivacyProfileEntity) PartyPrivacyProfileEntity.findById(new ObjectId(id)));
        return Response.ok().entity(profile).build();
    }



}
