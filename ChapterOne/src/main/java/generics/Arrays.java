package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Developer on 3/18/2017.
 */
public class Arrays {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
/*        List<Objects> objs = strs;*/

        List lst = strs;
    }
}
