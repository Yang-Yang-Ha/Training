package com.yaya.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {
//        printData();
//        maximum();
//        genericsClass();
        typeWildcard();
    }

    private static void printData() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        String[] stringArray = {"a", "b", "c", "d", "e", "f"};

        System.out.println("整型数组元素为:");
        GenericsMethod.printArray(intArray); // 传递一个整型数组

        System.out.println("\n双精度型数组元素为:");
        GenericsMethod.printArray(doubleArray); // 传递一个双精度型数组

        System.out.println("\n字符型数组元素为:");
        GenericsMethod.printArray(stringArray); // 传递一个字符型数组
    }

    private static void maximum() {
        System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, GenericsMethod.maximum(3, 4, 5));

        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, GenericsMethod.maximum(6.6, 8.8, 7.7));

        System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear",
                "apple", "orange", GenericsMethod.maximum("pear", "apple", "orange"));
    }

    private static void genericsClass() {
        GenericsClass<String> stringBox=new GenericsClass<>();
        stringBox.add("Stephen Young");
        GenericsClass<Integer> integerBox=new GenericsClass<>();
        integerBox.add(10);

        System.out.printf("整形值为：%d \n\n",integerBox.get());
        System.out.printf("字符串为：%s \n",stringBox.get());

    }

    private static void typeWildcard() {
        List<String> name=new ArrayList<>();
        List<Integer> age=new ArrayList<>();
        List<Number> number=new ArrayList<>();

        name.add("Stephen Young");
        age.add(18);
        number.add(354);

        GenericsMethod.getData(name);
        GenericsMethod.getData(age);
        GenericsMethod.getData(number);
    }
}
