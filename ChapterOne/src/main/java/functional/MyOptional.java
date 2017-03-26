package functional;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import java.util.Optional;

/**
 * Created by Yevgeniy on 24.03.2017.
 */
public class MyOptional {


    public static void main(String[] args) {

        String h = null;
        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        optional = null;
        System.out.println(optional.isPresent());
        optional.of("Bye");
        System.out.println(optional.orElse("Goodbay"));


    }


    interface HelloWorld {
        @NotNull
        public String greet();

        @Nullable
        public String fredd();
    }
}
