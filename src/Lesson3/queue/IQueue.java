package Lesson3.queue;

public interface IQueue<E> {

    boolean insert(E value);

    E remove();

    E peekFront();

    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    boolean isFull();
}
