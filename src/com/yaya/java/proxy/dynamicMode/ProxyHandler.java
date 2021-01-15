package proxy.dynamicMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理操作类
 * Created by Young on 2017/7/14.
 */
public class ProxyHandler implements InvocationHandler {

    @SuppressWarnings("unchecked")
    <T> T newProxyHandler(Class<T> targetObject) {
/*        该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        根据传入的目标返回一个代理对象  */
        return (T) Proxy.newProxyInstance(targetObject.getClassLoader(),
                new Class[]{targetObject},
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // we control what happens when the method is called (invoked), we get all the necessary information
        System.out.println("invoking method " + method.getName() + " with arguments " + args[0]);
        // this next part is just to show how you can manipulate return value
        if (args[0] instanceof String) {
            return ((String) args[0]).toUpperCase();
        }
        return null;
    }
}
