package reflection;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Developer on 4/7/2017.
 */
public class Test implements Serializable, Cloneable{

    private int field;

    public Test(){

    }

    public Test(Object field){}

        @Deprecated
        protected static void method(String[] params){
        }

        public void foo(){
        System.out.println("FOO");
    }

        @Override
        public String toString(){
            return "Test{" +
                    "field=" + field +
                    '}';
        }
    }

    public class Reflect{
        public static void main(String[] args) throws Exception {
            Class clazz = Test.class;
            Test test = (Test) clazz.newInstance();

            clazz.getConstructors();

            Method method = clazz.getMethod("foo");
            System.out.println(method.toString());
            method.invoke(test);

            Field field0 = clazz.getDeclaredField("field");
            field0.setAccessible(true);
            field0.set(test, 100);
            System.out.println(test);

            Package pack = clazz.getPackage();
            System.out.println("package " + pack.getName() + ";");

            int modifiers = clazz.getModifiers();
            System.out.print(getModifiers(modifiers));

            System.out.print("class " + clazz.getSimpleName() + " ");

            System.out.print("extends " + clazz.getSuperclass().getSimpleName() + " ");

            Class[] interfaces = clazz.getInterfaces();
            for (int i = 0, size = interfaces.length; i < size; i++) {
                System.out.print(i == 0 ? "implements " : ". ");
                System.out.print(interfaces[i].getSimpleName());
            }
            System.out.println(" {");

            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields){
                System.out.println("\t" + getModifiers(field.getModifiers()) +
                );
            }
    }
}
