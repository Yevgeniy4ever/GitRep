package threads.counting;

/**
 * Created by Yevgeniy on 20.03.2017.
 */
public class CounterTest {


    public static void main(String[] args) {
        testCounter();
    }

    public static void testCounter() {
        final int threadNum = 2;
        Counter counter = new SimpleCounter();
        //Counter counter = new AtomicCounter();
        //LockCounter counter = new LockCounter();
        Thread[] threads = new Thread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            Thread thread = new Sequencer(counter);
            threads[i] = thread;
            thread.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Threads: %d\nCounter: %d", threadNum, counter.getVal());
    }

    public static void testSafeUnsafe() {

        final int threadNum = 2;
        /*Counter counter = new SimpleCounter();*/
        //Counter counter = new AtomicCounter();
        LockCounter counter = new LockCounter();
        Thread[] threads = new Thread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            Thread thread = new Sequencer(counter);
            threads[i] = thread;
            thread.start();
        }

        Thread unsafe = new UnsafeSequencer(counter);
        unsafe.start();

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    static class Sequencer extends Thread {
        private Counter counter;

        public Sequencer() {

        }

        public Sequencer(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                counter.inc();
            }
        }
    }

    static class UnsafeSequencer extends Thread {
        private LockCounter counter;

        public UnsafeSequencer(LockCounter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                counter.incUnsafe();
            }
        }
    }
}
