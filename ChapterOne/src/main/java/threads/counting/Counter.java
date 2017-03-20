package threads.counting;

/**
 * Created by Yevgeniy on 19.03.2017.
 */
public interface Counter {
    long inc();

    long getVal();
}

/*class Counter {
    long counter = 0;
    long inc() {
        return counter ++;
    }
}*/
