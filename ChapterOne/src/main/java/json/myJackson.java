package json;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Developer on 3/27/2017.
 */
public class myJackson {
    public static void main(String[] args) throws IOException {
        Place place = new Place();
        place.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setPlace(place);

        // convert to json
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(human);
        System.out.println("json " + jsonString); // print "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman = mapper.readValue(jsonString, Human.class);
        newHuman.say(); // print "Hi , World!"
    }
}
