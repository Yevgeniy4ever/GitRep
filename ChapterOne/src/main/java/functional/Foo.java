package functional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevgeniy on 25.03.2017.
 */
public class Foo {
    String name;
    List<Bar> bars = new ArrayList<>();

    Foo(String name) {
        this.name = name;
    }
}
