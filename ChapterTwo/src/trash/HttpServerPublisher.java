package org.test.another;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

/**
 * A Camel Application
 */
public class HttpServerPublisher {

        private HttpServerPublisher() {
        }

        public static void main(String[] args)
                throws IOException {
            HttpServer server = HttpServerFactory.create(
                    "http://127.0.0.1/");
            server.start();
        }
}




    /**
     * A main() so we can easily run these routing rules in our IDE
     */



/*    public static void main(String... args) throws Exception {
        JerseyService service = new JerseyService();
        service.say();
        }
*/





