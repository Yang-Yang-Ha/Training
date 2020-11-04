package com.yaya.basic.collection.queue.deque;

import java.util.ArrayDeque;

public class JavaArrayDeque {

    public void arrayDequeMethod() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Young");
        arrayDeque.addFirst("Stephen");
        arrayDeque.addLast("Yang");

        System.out.println("peek: " + arrayDeque.peek());
        System.out.println("peek First: " + arrayDeque.peekFirst());
        System.out.println("peek Last: " + arrayDeque.peekLast());
        printTheDeque(arrayDeque);

        System.out.println("poll: " + arrayDeque.poll());
        System.out.println("poll First: " + arrayDeque.pollFirst());
        System.out.println("poll Last: " + arrayDeque.pollLast());
        printTheDeque(arrayDeque);
    }

    private void printTheDeque(ArrayDeque<String> arrayDeque) {
        System.out.println("Print all the elements");
        arrayDeque.forEach(System.out::println);
    }
}
