package com.yaya.io;

public class People {
    protected int age;
    protected String name;

    public People() {
        System.out.println("People");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
