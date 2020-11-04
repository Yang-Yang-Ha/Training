package com.yaya.basic;

import java.util.Arrays;

public class JavaArray {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    int[] myNum = {10, 20, 30, 40};

    public void printIntArray() {
        for (int i : myNum) {
            System.out.println(i);
        }
    }

    public void printStringArray() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    /*
    Arrays.sort use "insertion sort" algorithm to sort the object
     */
    public void sortArray() {
        Arrays.sort(cars);
        printStringArray();
    }
}
