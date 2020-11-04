package com.yaya.proxy.staticMode;

/**
 * 代理类，实现了代理接口
 * Created by Stephen Young on 2017/7/13.
 */
public class ProxySubject implements Subject {

    private Subject delegate;

    public ProxySubject(Subject delegate) {
        this.delegate = delegate;
    }

    @Override
    public void dealTask(String name) {
        long startTime = System.currentTimeMillis();
        delegate.dealTask(name);
        long endTime = System.currentTimeMillis();
        System.out.println("执行任务耗时：" + (endTime - startTime) + "毫秒");
    }
}
