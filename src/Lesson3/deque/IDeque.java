package Lesson3.deque;

import Lesson3.queue.IQueue;

public interface IDeque<E> extends IQueue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}
