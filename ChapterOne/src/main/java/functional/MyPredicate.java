package functional;

import java.util.function.Predicate;

/**
 * Created by Yevgeniy on 24.03.2017.
 */
public class MyPredicate {

    public static void main(String[] args) {

        MyLength<Integer, String> rop = (String str) -> str.length();
        Integer op = rop.num("opa");
        System.out.println(op);

        Predicate<String> predicate = (s) -> s.length() > 3;
        Boolean smt = predicate.equals("opa");
        System.out.println(smt);

        LovelyClass lovelyClass = new LovelyClass();

        MyLength<Integer, String> hope = lovelyClass::lovelyMethod;
        Integer looper = hope.num("2222");
        System.out.println(looper);

        MyLength<String, String> anon = (String a1) -> a1 + "rrrrrr";
        String gop = anon.num("aaaa");
        System.out.println(gop);

    }

    @FunctionalInterface
    interface MyLength<R, K> {
        R num(K str);


    }

    static class LovelyClass {
        int lovelyMethod(String k) {
            int b = k.length();
            return b + 2;
        }
    }

}
