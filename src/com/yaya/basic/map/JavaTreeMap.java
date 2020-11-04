package com.yaya.basic.map;

import java.util.TreeMap;

public class JavaTreeMap {
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    public JavaTreeMap() {
        treeMap.put(184, "Hello");
        treeMap.put(100, "Stephen");
        treeMap.put(105, "Hi");
        treeMap.put(102, "Young");
        treeMap.put(103, "Yang");
        treeMap.put(101, "Yang");
    }

    public void treeMapMethod() {
        treeMap.remove(101);
        treeMap.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }

    public void manipulateMethod() {
        System.out.println("headMap:" + treeMap.headMap(101, true));
        System.out.println("tailMap:" + treeMap.tailMap(101, true));
        System.out.println("subMap:" + treeMap.subMap(101, true, 105, true));
    }
}
