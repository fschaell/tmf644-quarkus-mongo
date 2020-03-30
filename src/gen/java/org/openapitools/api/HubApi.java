package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.EventSubscription;
import org.openapitools.model.EventSubscriptionInput;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/hub")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-03-24T20:10:32.539+01:00[Europe/Berlin]")
public interface HubApi {

    @POST
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    Response registerListener(@Valid EventSubscriptionInput data);

    @DELETE
    @Path("/{id}")
    @Produces({ "application/json;charset=utf-8" })
    Response unregisterListener(@PathParam("id") String id);
}
