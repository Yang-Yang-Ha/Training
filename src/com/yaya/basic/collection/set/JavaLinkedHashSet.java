package com.yaya.basic.collection.set;

import java.util.LinkedHashSet;

public class JavaLinkedHashSet {

    public void linkedHashSetMethod() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Stephen");
        linkedHashSet.add("Young");
        linkedHashSet.add("Yang");
        linkedHashSet.add("Young");
        linkedHashSet.forEach(System.out::println);
    }
}
