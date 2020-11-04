package com.yaya.proxy.staticMode;

/**
 * 客户类
 * Created by Stephen Young on 2017/7/13.
 */
public class Client {

    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.dealTask("query");
    }
}
