package functional;

/**
 * Created by Yevgeniy on 25.03.2017.
 */
public class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
