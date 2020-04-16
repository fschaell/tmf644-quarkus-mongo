package com.telekom.sep.tmf644.api.impl;

import com.telekom.sep.tmf644.mapper.PartyPrivacyAgreementMapper;
import com.telekom.sep.tmf644.mapper.PartyPrivacyProfileMapper;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyAgreementEntity;
import com.telekom.sep.tmf644.repository.entity.PartyPrivacyProfileEntity;
import org.bson.types.ObjectId;
import org.openapitools.api.PartyPrivacyAgreementApi;
import org.openapitools.api.PartyPrivacyProfileApi;
import org.openapitools.model.*;
import org.openapitools.model.Error;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import java.util.List;

public class PartyPrivacyAgreementApiImpl implements PartyPrivacyAgreementApi {

    @Inject
    private PartyPrivacyAgreementMapper privacyAgreementMapper;

    @Context
    private UriInfo urlInfo;

    @Override
    public Response createPartyPrivacyAgreement(@Valid PartyPrivacyAgreementCreate partyPrivacyAgreement) {

        PartyPrivacyAgreementEntity entity = privacyAgreementMapper.map(partyPrivacyAgreement);
        entity.persist();

        UriBuilder uriBuilder = urlInfo.getAbsolutePathBuilder();
        uriBuilder.path(entity.id.toString());  // determine id of created PartyPrivacyProfile and append it to path
        // not set in DB but in GET request too
        entity.href = uriBuilder.build().toString();

        return Response.created(uriBuilder.build()).entity(privacyAgreementMapper.map(entity)).build();

    }

    @Override
    public Response deletePartyPrivacyAgreement(@PathParam("id") String id) {
        PartyPrivacyAgreementEntity entity = PartyPrivacyAgreementEntity.findById(new ObjectId(id));
        if (entity == null) {
            Error notFoundError = new Error();
            notFoundError.setMessage("Cannot find agreement with specified id");
            notFoundError.setCode(Response.Status.NOT_FOUND.toString());
            return Response.status(Response.Status.NOT_FOUND).entity(notFoundError).build();
        }

        //test if specification is used by profile
        List<PartyPrivacyProfileEntity> profiles = PartyPrivacyProfileEntity.findByPartyPrivacyAgreementId(entity.id.toString());
        if (profiles != null && profiles.size() > 0) {
            Error usedError = new Error();
            usedError.setMessage("Cannot delete agreement, because it is used by a profile");
            usedError.setCode(Response.Status.BAD_REQUEST.toString());
            return Response.status(Response.Status.BAD_REQUEST).entity(usedError).build();
        }

        entity.delete();

        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @Override
    public Response listPartyPrivacyAgreement(@QueryParam("fields") String fields, @QueryParam("offset") Integer offset, @QueryParam("limit") Integer limit) {
        List<PartyPrivacyAgreement> result = privacyAgreementMapper.map(PartyPrivacyAgreementEntity.listAll());
        return Response.ok().entity(result).build();
    }

    @Override
    public Response patchPartyPrivacyAgreement(@PathParam("id") String id, @Valid PartyPrivacyAgreementUpdate partyPrivacyAgreement) {
        PartyPrivacyAgreementEntity updateEntity = privacyAgreementMapper.map(partyPrivacyAgreement);
        updateEntity.id = new ObjectId(id);
        PartyPrivacyAgreementEntity entity = PartyPrivacyAgreementEntity.findById(updateEntity.id);
        if (entity == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        updateEntity.update();
        return Response.ok().entity(updateEntity).build();
    }

    @Override
    public Response retrievePartyPrivacyAgreement(@PathParam("id") String id, @QueryParam("fields") String fields) {
        PartyPrivacyAgreementEntity entity = PartyPrivacyAgreementEntity.findById(new ObjectId(id));

        if (entity == null) {
            Error notFoundError = new Error();
            notFoundError.setMessage("Cannot find agreement with specified id");
            notFoundError.setCode(Response.Status.NOT_FOUND.toString());

            return Response.status(Response.Status.NOT_FOUND).entity(notFoundError).build();
        }
        PartyPrivacyAgreement agreement = privacyAgreementMapper.map(entity);


        UriBuilder uriBuilder = urlInfo.getAbsolutePathBuilder();


        // not set in DB but in GET request too
        agreement.setHref(uriBuilder.build().toString());
        return Response.ok().entity(agreement).build();
    }
}
