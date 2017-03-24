package functional;

import java.util.*;

/**
 * Created by Developer on 3/24/2017.
 */
public class Lambda {



    @FunctionalInterface
    interface Converter<F, T>{
        T convert(F from);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i = 5; i < 50; i += 5) {
            list.add(i);
            i -= 3;
            list.add(i);
        }


        Something something = new Something();

        Converter<String, String> myConverter = something::startsWith;
        String myConverted = myConverter.convert("Java");
        System.out.println(myConverted);


        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);

        Converter<String, Integer> quest = Integer::valueOf;
        Integer questConverdet = quest.convert("Opa gangam style");

        Integer converted = converter.convert("123");

        System.out.println(converted);


        List<Integer> sortList = new ArrayList<>();

/*
        Collections.sort(list);
*/

        for(Integer in : list){
            System.out.println(in);
        }


        List<String> names = Arrays.asList("peter", "anna", "mike", "xena");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });




        Collections.sort(names, (String a, String b) -> a.compareTo(b));
        System.out.println(names);
/*        int k =10;
        System.out.println("1st: " + k);


        k -=5;
        System.out.println("2nd: " + k);


        k += 8;
        System.out.println("3rd: " + k);


        k = k++ + 5;
        System.out.println("4th: " + k);


        k = ++ k + 5;
        System.out.println("5th: " + k);*/

    }


}
