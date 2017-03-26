package functional;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Yevgeniy on 25.03.2017.
 */
public class InstanceStream {
    public static void main(String[] args) {
        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("b1", "b2", "b3")
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(1, 4)
                .forEach(System.out::println);

        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }
}
