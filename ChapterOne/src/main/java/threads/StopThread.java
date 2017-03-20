package threads;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public class StopThread {

/*    ExecutorService pool = Executors.newFixedThreadPool(10);
    service.submit(new Runnable(...));*/

    public static void flagThread() {
        FlagThread flagThread = new FlagThread();
        flagThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.next();
        flagThread.stopThread();

    }

    public static void interuptThread() {
        Thread thread = new InterruptThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.next();
        thread.interrupt();
    }

    public static void dummyThread() {

        Thread thread = new DummyThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.next();
        thread.interrupt();
    }

    public static void main(String[] args) {
/*        dummyThread();*/
/*        flagThread();*/
        interuptThread();

    }

    static class DummyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("q");
/*                try {
                    System.out.println("Thread :: sleep()");
                    TimeUnit.SECONDS.sleep(1);
                }   catch (Exception ex){
                    ex.printStackTrace();
                }*/
            }
        }
    }

    static class InterruptThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Thread (Int) :: sleep()");
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class FlagThread extends Thread {
        private volatile boolean pleaseStop;

        @Override
        public void run() {
            while (!pleaseStop) {
                try {
                    System.out.println("Thread :: sleep()");
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        public void stopThread() {
            System.out.println("Stoppping ...");
            pleaseStop = true;
        }
    }


}



















