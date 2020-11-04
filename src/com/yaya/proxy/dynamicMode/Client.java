package com.yaya.proxy.dynamicMode;

/**
 * 动态代理客户端
 * Created by Young on 2017/7/14.
 */
public class Client {

    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler();
        Subject instance = proxyHandler.newProxyHandler(Subject.class);

        System.out.println(instance.doSomething("proxy"));
    }

}

/*
动态代理相关的知识：
动态代理于静态代理的区别：
1. 动态代理可以代理不同的对象，而静态代理只能处理单一的对象，当需要处理新的对象
   的时候，就需要新建一个代理类。
2. 减小了代码量。
 */
