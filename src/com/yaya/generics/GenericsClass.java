package com.yaya.generics;

/**
 * 泛型类
 * Created by Young on 2017/7/4.
 */
public class GenericsClass<T> {

    private T t;

    public void add(T t){
        this.t=t;
    }

    public T get(){
        return t;
    }

}
