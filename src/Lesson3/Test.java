package Lesson3;

import Lesson3.deque.DequeImpl;
import Lesson3.deque.IDeque;
import Lesson3.queue.IQueue;
import Lesson3.queue.QueueImpl;
import Lesson3.stack.IStack;
import Lesson3.stack.StackImpl;

import java.util.Stack;

public class Test {



    public static void main(String[] args) {
        System.out.println("1. Реализовать рассмотренные структуры данных в консольных программах.");
        System.out.println("Stack");
        System.out.println("--------");
        testStack();
        System.out.println("--------");
        System.out.println("Queue");
        System.out.println("--------");
        testQueue();
        System.out.println("--------");
        System.out.println("2. Создать программу, которая переворачивает вводимые строки (читает справа налево).");
        String s = "abcd";
        stringReverse(s);
        System.out.println("--------");
        System.out.println("3. Создать класс для реализации дека.");
        testDeque();
    }

//    1. Реализовать рассмотренные структуры данных в консольных программах.
    private static void testStack() {
        IStack<Integer> stack = new StackImpl<>(5);
        System.out.println("Add value 1: " + addToStack(stack, 1));
        System.out.println("Add value 2: " + addToStack(stack, 2));
        System.out.println("Add value 3: " + addToStack(stack, 3));
        System.out.println("Add value 4: " + addToStack(stack, 4));
        System.out.println("Add value 5: " + addToStack(stack, 5));
        System.out.println("Add value 6: " + addToStack(stack, 6));

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack top: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static boolean addToStack(IStack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }

    private static void testQueue() {
        IQueue<Integer> queue = new QueueImpl<>(5);
        System.out.println(queue.insert(3));
        System.out.println(queue.insert(5));
        System.out.println(queue.insert(1));
        System.out.println(queue.insert(2));
        System.out.println(queue.insert(6));
        System.out.println(queue.insert(4));

        System.out.println("Queue peek: " + queue.peekFront());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is full: " + queue.isFull());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

//    2. Создать программу, которая переворачивает вводимые строки (читает справа налево).

    private static void stringReverse(String string){
        IStack<Character> s = new StackImpl<>(string.length());
        for (int i = 0; i < string.length(); i++) {
            s.push(string.charAt(i));
        }
        while ( !s.isEmpty() ) {
            System.out.print(s.pop());
        }
        System.out.println();

        if (true) {
            return;
        }
    }

//    3. Создать класс для реализации дека.

    private static void testDeque(){
    IDeque<Integer> deq = new DequeImpl<>(6);

//    insertRight(deq, 1);
        deq.insertRight(1);
        deq.insertRight(2);
        deq.insertRight(3);
        deq.insertRight(4);
        deq.insertLeft(5);
        deq.insertLeft(6);
        deq.removeLeft();
        deq.removeRight();

        while (!deq.isEmpty()) {
            System.out.println(deq.removeLeft());
        }
}

}
