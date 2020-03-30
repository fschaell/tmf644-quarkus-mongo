package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.PartyPrivacyProfile;
import org.openapitools.model.PartyPrivacyProfileCreate;
import org.openapitools.model.PartyPrivacyProfileUpdate;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/partyPrivacyProfile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-03-24T20:10:32.539+01:00[Europe/Berlin]")
public interface PartyPrivacyProfileApi {

    @POST
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response createPartyPrivacyProfile(@Valid PartyPrivacyProfileCreate partyPrivacyProfile);

    @DELETE
    @Path("/{id}")
    @Produces({ "application/json;charset=utf-8" })
    Response deletePartyPrivacyProfile(@PathParam("id") String id);

    @GET
    @Produces({ "application/json;charset=utf-8" })
    Response listPartyPrivacyProfile(@QueryParam("fields")    String fields,@QueryParam("offset")    Integer offset,@QueryParam("limit")    Integer limit);

    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response patchPartyPrivacyProfile(@PathParam("id") String id,@Valid PartyPrivacyProfileUpdate partyPrivacyProfile);

    @GET
    @Path("/{id}")
    @Produces({ "application/json;charset=utf-8" })
    Response retrievePartyPrivacyProfile(@PathParam("id") String id,@QueryParam("fields")    String fields);
}
