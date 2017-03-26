package functional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevgeniy on 25.03.2017.
 */
public class MyReduce {
    public static void main(String[] args) {

        //BigData
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(21, "Vinnie"));
        persons.add(new Person(32, "Greig"));

        persons
                .stream()
                .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
                .ifPresent(System.out::println);
    }
}
