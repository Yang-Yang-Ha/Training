package com.yaya.basic.collection.set.sortedset;

import java.util.TreeSet;

public class JavaTreeSet {
    public void treeSetMethod() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Stephen");
        treeSet.add("Young");
        treeSet.add("Yang");
        treeSet.forEach(System.out::println);
    }
}
