package generics;

import java.util.Collection;
import java.lang.Object;
import java.util.List;


/**
 * Created by Developer on 3/18/2017.
 */
public class ArrayStack<E> implements Stack<E> {
    private Object[] elements;
    private int capacity;
    private int size;

    public static void main(String[] args) throws StackException {
        ArrayStack<Integer> ints = new ArrayStack<>(10);
        ints.push(10);
        ints.push(12);

/*
        List<Number> nums = new ArrayList<>();
*/
        List<Integer> nums = new java.util.Arrays.asList(1, 2, 3);

        //Stack -> Coll(int -> number)
/*        ints.popAll(nums);*/
        //Coll -> Stack()
        ints.push(nums);
    }

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

    public E peek(){
        return null;
    }

    @Override
    public int getSize(){
        return 0;
    }



    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    @Override
    public void pushAll(Collection<E> src) throws StackException{

    }
    @Override
    public void popAll(Collection <? super E> dst) throws StackException{

    }
}
