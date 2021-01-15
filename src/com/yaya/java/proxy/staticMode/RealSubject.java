package proxy.staticMode;

/**
 * 真实执行任务的类，实现了代理接口
 * Created by Stephen Young on 2017/7/13.
 */
public class RealSubject implements Subject {

    @Override
    public void dealTask(String name) {
        System.out.println("正在执行的任务："+name);
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
