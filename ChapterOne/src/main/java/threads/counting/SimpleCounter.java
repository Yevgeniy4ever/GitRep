package threads.counting;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public class SimpleCounter implements Counter {
    private long val;

    @Override
    public long inc() {
        return val++;
    }

    public long getVal() {
        return val;
    }

}
