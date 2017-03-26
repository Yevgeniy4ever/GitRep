package functional;

import java.util.stream.Stream;

/**
 * Created by Yevgeniy on 25.03.2017.
 */
public class TerminateAndNonTerminate {
    public static void main(String[] args) {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {   //non terminate (Manad)
                    System.out.println("filter numero UNO: " + s);
                    return true;
                });

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> { //non terminate (Manad)
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s)); //terminate
    }
}
