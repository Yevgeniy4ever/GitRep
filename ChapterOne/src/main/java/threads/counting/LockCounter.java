package threads.counting;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public class LockCounter implements Counter {
    private long val;

    @Override
    public long inc() {
        return val++;
    }

    public long incUnsafe() {
        return val++;
    }

    @Override
    public long getVal() {
        return val;
    }
}
