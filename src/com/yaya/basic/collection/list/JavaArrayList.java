package com.yaya.basic.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class JavaArrayList {

    ArrayList<Integer> numbers = new ArrayList<>();

    public JavaArrayList() {
        numbers.add(30);
        numbers.add(2);
        numbers.add(49);
        numbers.add(23);
        numbers.add(32);
        numbers.add(2);
        numbers.add(29);
        numbers.add(38);
        numbers.add(15);
    }

    public void arrayListMethod() {
        numbers.forEach(System.out::println);
    }

    public void arrayListCompare() {
        numbers.sort(Comparator.comparingInt(integer -> integer));
        numbers.forEach(System.out::println);
    }

    public void loopRemove() {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.remove(i);
        }
        System.out.println("numbers size: " + numbers.size());
    }

    public void iteratorRemove() {
        Iterator<Integer> integerIterator = numbers.listIterator();
        while (integerIterator.hasNext()) {
            Integer next = integerIterator.next();
            System.out.println("content: " + next);
            integerIterator.remove();
        }
        System.out.println("numbers size: " + numbers.size());
    }
}
