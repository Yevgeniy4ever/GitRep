package org.test;

/**
 * Created by Developer on 3/30/2017.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/rest")
public class JerseyService {

    @GET
    @Path("/say")
    @Produces(MediaType.TEXT_PLAIN)
    public String say(){
        return "Wonderful!";
    }
}