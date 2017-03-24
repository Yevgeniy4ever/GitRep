package functional;

/**
 * Created by Developer on 3/24/2017.
 */
public class Outer {
    Inner inner = new Inner();
/*    HelloWorld hello = anonymous();*/

    @FunctionalInterface
    interface HelloWorld2{
        public void greet();
    }

    interface HelloWorld{
        public void greet();
    }

    interface TestWorld{
         void strange();
    }

    void anonymous(){
        HelloWorld greeting = new HelloWorld() {

            @Override
            public void greet() {
                System.out.println("HelloWorld");
            }
        };

            TestWorld test = new TestWorld() {
                @Override
                public void strange() {
                        System.out.println("Strange");
                    }

                };
            System.out.println(test.getClass().getName());
            System.out.println(greeting.getClass().getName());
        }

        static class Inner{
        int b = 0;
        int localInt = 1;

            public Inner(){

            }

        void localMethod(){

            class Local {

                public Local(Inner inner) {
                    outerLocalInt = inner.localInt;
                }

                int outerLocalInt;
                int localInt = 2;

            }

            Local local = new Local(this);
            int LocalInt = local.localInt;
            this.localInt = 10;

        }

        }
}

