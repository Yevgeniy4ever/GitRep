package threads.counting;

import threads.MyThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public class SimpleThread {
    public static void main(String[] args) throws Exception {
        inParallel();
/*        start();*/
    }

    static void inParallel() throws Exception {
        Thread t1 = new MyThread("inParallel");
        System.out.println("Starting thread");
            t1.start();
        t1.join();
/*
        t1.run();
*/
        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("Main thread finished");
    }


    static void start() {
        Thread t1 = new MyThread("simpleThread");
        System.out.println("Starting thread");
        t1.start();


        //System.out.println("ERROR: ");
    }

    static void join() throws Exception {
        Thread thread = new MyThread("JoinThread");
        System.out.println("Starting thread...");
        thread.start();
        System.out.println("Joining");
    }
}
