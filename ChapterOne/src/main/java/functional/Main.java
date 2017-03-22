package functional;

/**
 * Created by Developer on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        IntWrapper intwrapper = new IntWrapper();
        intwrapper.setOperation("+")
                .setNum(2)
                .calculate(3);

    }
}

