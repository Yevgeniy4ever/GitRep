package generics;

import java.util.Collection;
import java.util.EmptyStackException;

/**
 * Created by Developer on 3/18/2017.
 */
public interface Stack<E> {

    void push(E element) throws StackException;

    E peek();

    int getSize();

    boolean isEmpty();

    boolean isFull();

    void pushAll(Collection<? extends E> src) throws StackException;

    void popAll(Collection<? super E> dst) throws StackException;

}
