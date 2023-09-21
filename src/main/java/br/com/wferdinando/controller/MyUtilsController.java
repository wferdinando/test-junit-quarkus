package br.com.wferdinando.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.com.wferdinando.service.MyUtilsService;

@Path("/util")
public class MyUtilsController {

    @Inject
    MyUtilsService utilsService;

    @GET
    @Path("/validate/prime/{number}")
    public Response verifyPrimeNumber(@PathParam("number") int number) {
        try {
            return Response.ok(utilsService.isPrimeNumber(number)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("/count/{text}")
    public Response verifyTextSize(@PathParam("text") String text) {
        try {
            return Response.ok(utilsService.countCharacters(text)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}
