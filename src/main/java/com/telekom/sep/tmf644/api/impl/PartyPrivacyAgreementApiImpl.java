package com.telekom.sep.tmf644.api.impl;

import com.telekom.sep.tmf644.mapper.PartyPrivacyAgreementMapper;
import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyAgreementEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import org.bson.types.ObjectId;
import org.openapitools.api.PartyPrivacyAgreementApi;
import org.openapitools.api.PartyPrivacyProfileApi;
import org.openapitools.model.*;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.List;

public class PartyPrivacyAgreementApiImpl implements PartyPrivacyAgreementApi {

    @Inject
    private PartyPrivacyAgreementMapper privacyAgreementMapper;



    @Override
    public Response createPartyPrivacyAgreement(@Valid PartyPrivacyAgreementCreate partyPrivacyAgreement) {

        PartyPrivacyAgreementEntity entity = privacyAgreementMapper.map(partyPrivacyAgreement);
        entity.persist();

        return Response.ok().build();
    }

    @Override
    public Response deletePartyPrivacyAgreement(@PathParam("id") String id) {
        PartyPrivacyAgreementEntity entity = PartyPrivacyAgreementEntity.findById(new ObjectId(id));
        entity.delete();

        return Response.ok().build();
    }

    @Override
    public Response listPartyPrivacyAgreement(@QueryParam("fields") String fields, @QueryParam("offset") Integer offset, @QueryParam("limit") Integer limit) {
        List<PartyPrivacyAgreement> result = privacyAgreementMapper.map(PartyPrivacyAgreementEntity.listAll());
        return Response.ok().entity(result).build();
    }

    @Override
    public Response patchPartyPrivacyAgreement(@PathParam("id") String id, @Valid PartyPrivacyAgreementUpdate partyPrivacyAgreement) {
        PartyPrivacyAgreementEntity entity = privacyAgreementMapper.map(partyPrivacyAgreement);
        entity.id = new ObjectId(id);
        entity.update();
        return Response.ok().build();
    }

    @Override
    public Response retrievePartyPrivacyAgreement(@PathParam("id") String id, @QueryParam("fields") String fields) {
         PartyPrivacyAgreement agreement = privacyAgreementMapper.map((PartyPrivacyAgreementEntity) PartyPrivacyAgreementEntity.findById(new ObjectId(id)));

        return Response.ok().entity(agreement).build();
    }
}
