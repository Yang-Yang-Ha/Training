package com.yaya.basic.collection.list;

import java.util.ArrayList;
import java.util.Comparator;

public class JavaArrayList {

    public void arrayListMethod() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(29);
        numbers.add(38);
        numbers.add(15);
        numbers.forEach(System.out::println);
    }

    public void arrayListCompare() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(2);
        numbers.add(49);
        numbers.add(23);
        numbers.add(32);
        numbers.sort(Comparator.comparingInt(integer -> integer));
        numbers.forEach(System.out::println);
    }
}
