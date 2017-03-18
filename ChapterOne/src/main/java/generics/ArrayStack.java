package generics;

import java.util.Objects;

/**
 * Created by Developer on 3/18/2017.
 */
public class ArrayStack<E> implements Stack<E> {
    private Object[] elements;
    private int capacity;
    private int size;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        size = 0;
        elements = new Object[capacity];
    }

    @Override
    public void push(E element) throws StackException {
        if (isFull()) {
            throw new StackException("Stack overflow");
        }
        elements[size] = element;
        size++;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }
}
