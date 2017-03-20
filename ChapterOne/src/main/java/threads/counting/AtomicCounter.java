package threads.counting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Yevgeniy on 20.03.2017.
 */
public class AtomicCounter implements Counter {

    private AtomicLong val = new AtomicLong(0);

    @Override
    public long inc() {
        return val.getAndIncrement();
    }

    @Override
    public long getVal() {
        return val.get();
    }
}
