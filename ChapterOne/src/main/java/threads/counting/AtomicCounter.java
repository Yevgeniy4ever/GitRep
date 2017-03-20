package threads.counting;

/**
 * Created by Yevgeniy on 20.03.2017.
 */
public class AtomicCounter implements Counter {

    private long val;

    @Override
    public long inc() {
        return val++;
    }

    @Override
    public long getVal() {
        return val;
    }
}
