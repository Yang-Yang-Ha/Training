package javaClasses;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous task name:" + Thread.currentThread().getName());
            }
        });
        System.out.println("Main task name:" + Thread.currentThread().getName());

        executorService.shutdown();//线程有序关闭，已有的运行将继续执行，当不会再接受新的任务
    }
}

/*
ExecutorService 的实现：
  ExecutorService是一个接口，它的实现类有ScheduledThreadPoolExecutor, ThreadPoolExecutor等，再java.util.concurrent包中
创建一个ExecutorService：
  1. 可以自己自定义一个
  2. 使用Executors进行实例化
ExecutorService的使用方法：
  有几种不同的方式让你将任务委托给ExecutorService：
  1. execute(Runnable)
  2. submit(Runnable)
  3. submit(Callable)
  4. invokeAny(...)
  5. invokeAll(...)
execute(Runnable)普通的一部执行
submit(Runnable)会返回一个Future，这个Future对象可以判断Runnable是否结束执行。
submit(Callable)与submit(Runnable)相似，可以获取到callable的返回值
invokeAny(...)接收一个包含Callable对象的集合作为参数，调用该方法不返回Future对象，而是返回集合中一个callable对象的结果
  并且无法保证调用之后的结果是哪个callable的，如果一个任务运行完毕或者抛出异常，方法会取消其他的callable的执行。
invokeAll(...)调用存在于参数集合中的所有callable对象，并且返回一个包含Future对象的集合。
shutdownNow():立刻关闭所有的任务
shutdown：不在接受任务，但会执行完已经委派的任务
 */