package functional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Yevgeniy on 25.03.2017.
 */
public class myCollectors {

    public static void main(String[] args) {
//It doesn't work
/*       //corverted to List, Map etc.
        List<Person> filtered =
                persons
                        .stream
                        .filter(p -> p.name.startsWith("P"))
                        .collect(Collectors.toList());*/
    }

    public class Person {
        public String name;
        int id;

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

}
