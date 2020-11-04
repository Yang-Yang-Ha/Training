package com.yaya.basic.collection.list;

import java.util.Stack;

public class JavaStack {

    public void stackMethod() {
        Stack<String> stack = new Stack<>();
        stack.push("Stephen");
        stack.push("Young");
        stack.peek();
        stack.forEach(System.out::println);
        stack.pop();
        stack.forEach(System.out::println);
    }
}
