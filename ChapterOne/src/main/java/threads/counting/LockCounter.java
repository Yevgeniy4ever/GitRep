package threads.counting;

import java.util.Objects;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public class LockCounter implements Counter {

    private final Object objLock = new Object();
    private long counter;

    @Override
    public synchronized long inc() {
        return counter++;
    }

    public long incUnsafe() {
        return counter++;
    }

    public long inc_() {
        synchronized (objLock) {
            return counter++;
        }
    }

/*    public long incSafe(){
        return counter++;
    }*/

    @Override
    public long getVal() {
        return counter;
    }
}
