package org.test;

/**
 * Created by Developer on 3/30/2017.
 */
import javax.ws.rs.*;
@Path("hello")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String getHelloText() {
        return "Hello, World!";
    }

    @GET
    @Produces("text/html")
    public String getHelloHtml() {
        return "<html>"
                + "<head><title>Hello</title></head>"
                + "<body>Hello, World!</body>"
                + "</html>";
    }
}
