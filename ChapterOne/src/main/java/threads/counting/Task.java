package threads.counting;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public class Task implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Task());
        Thread t1 = new Thread(new Task());
        t.start();
        t1.start();

/*        Timer timer = new Timer();
        final int k = 40;
        timer.schedule(new TimerTask(){
            @Override
            public void run() {

                System.out.println("I am there, soccer number " + k);
            }
            },
            6*1000);*/


    }

    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task is there " + i);
        }
    }
}
