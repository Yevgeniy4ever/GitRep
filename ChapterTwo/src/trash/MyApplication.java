package org.test;

/**
 * Created by Developer on 3/30/2017.
 */
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath(value = "/")
public class MyApplication extends ResourceConfig {

    public MyApplication () {
        packages("com.str.jersey.service");
    }
}