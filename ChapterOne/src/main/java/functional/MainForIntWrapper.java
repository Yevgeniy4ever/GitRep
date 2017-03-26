package functional;

/**
 * Created by Yevgeniy on 25.03.2017.
 */
public class MainForIntWrapper {


    public static void main(String[] args) {
        IntWrapper intWrapper = new IntWrapper();
        intWrapper.setOperation(new IntWrapper.Monad<String>() {
            @Override
            public String apply(String s) {
                System.out.println("apply String");
                return "++".substring(1);
            }
        }).setNum(new IntWrapper.Monad<Integer>() {
            @Override
            public Integer apply(Integer s) {
                System.out.println("apply Integer");
                return s + 1;
            }
        })
                .calculate(3);
    }
}