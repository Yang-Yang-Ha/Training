package com.yaya.enumdemo;

public enum ColorEnum {
    /*
     *Enums' feature
     * Enum 常量隐式的加上了static和final，一旦被创建，无法修改
     * Enum 是线程 安全的
     * Enum 隐式的加上了values()方法，返回一个数组包含所有的Enum常量
     * 两个Enum常量可以使用==或者equals()方法比较
     * Enum 可以用在switch语句中
     * Enum 有自己的名称空间
     * Enum 可以实现Java接口
     * 可以在Enum中定义构造器
     *
     * 自我理解：
     * enum跟class, interface是统一等级的修饰符。它默认继承Enum，
     * 并且是线程安全的
     * 在使用Enum中的任何一个实例时，所有实例都会运行一边构造函数。
     */
    RED(0), GREEN(1), BLUE(2);

    private int mValue;

    ColorEnum(int value){
        System.out.println("I am ColorEnum's constructor");
        mValue=value;
    }

    public int getValue(){
        return mValue;
    }
}
