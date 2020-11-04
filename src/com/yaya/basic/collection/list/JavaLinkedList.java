package com.yaya.basic.collection.list;

import java.util.LinkedList;

public class JavaLinkedList {

    public void linkedListMethod() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Stephen");
        linkedList.addFirst("Yang");
        linkedList.add("Young");
        linkedList.forEach(System.out::println);
    }

}
