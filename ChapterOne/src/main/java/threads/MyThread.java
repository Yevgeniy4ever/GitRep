package threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + ": started");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("MyThread " + name + " : " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("MyThread: finished");
    }
}




/*    @Override
    public void run() {
        for(int i = 0; i <20; i ++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        //t.run();
    }*/


   /* private volatine boolean pleaseStop;
    @Override
    void run(){
        while(!pleaseStop){

            }
        }

    MyThread t = new MyThread;
    t.setStop(true);*/

/*
   @Override
    void run(){
       while(!Thread.currentThread().isInterrupted()){
           //do what you want to do!
       }
   }

   MyThread t = new MyThread;
    //подаем сигнал, просим остановиться
    t.interrupt();*/
