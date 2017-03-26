package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.Optional.ofNullable;

/**
 * Created by Yevgeniy on 25.03.2017.
 */
public class MyFlatMap {
    //Using for multilevel creating of instance Используется для выравнивания двухуровневой схемы. Будет 3 Фуу.

    public static void main(String[] args) {
        List<Foo> foos = new ArrayList<>();
        //create foos
        IntStream.range(1, 4)
                .forEach(i -> foos.add(new Foo("Foo" + i)));
        //create bars
        foos.forEach(f ->
                IntStream
                        .range(1, 4)
                        .forEach(i -> f.bars.add(new Bar("Bar" + i + " <-" + f.name))));

        foos.stream()
                .flatMap(f -> f.bars.stream())
                .forEach(b -> System.out.println(b.name));

/*        Outer2 outer = new Outer2();
        if (outer !=null && outer.nested != null && outer.nested.inner !=null){
            System.out.println(outer.nested.inner.foo);
        }*/
                /*Outer2 outer = new Outer2();*/
        Optional.of(new Outer2())
                .flatMap(o -> ofNullable(o.nested))
                .flatMap(n -> ofNullable(n.inner))
                .flatMap(i -> ofNullable(i.foo))
                .ifPresent(System.out::println);

    }


}
