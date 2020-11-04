package com.yaya.reflection;

import java.lang.reflect.*;

/**
 * 反射运行类
 * Created by Stephen Young on 2017/7/4.
 */
public class ReflectionMain {

    public static void main(String[] args) {
//        normalInstance();
//        multiplyInstance();
//        newInstance();//通过class调用其它类中的构造函数
//        getConstructors();//获取到一个类的所有构造函数
//        getInterfaces();//获取到一个类实现的接口
//        getParent();//取得该类的父类
//        getMethodInfo();//获取一个方法的详细信息
//        getVariable();//获取一个类的属性
        callMethods();//调用反射获得类的方法
    }

    private static void callMethods() {
        Class<?> demo;
        try {
            demo = Class.forName("com.yaya.reflection.ReflectionClass");
            /*
            使用getDeclaredMethod可以获取到private方法，要访问时，使用setAccessible（true）
            而getMethod只能获取到public方法
             */
            Method method = demo.getDeclaredMethod("setName", String.class);//该方法可以获取到private方法，并使用
            method.setAccessible(true);
            Object o = demo.newInstance();
            method.invoke(o, "stephen Yang");
            Method method1 = demo.getDeclaredMethod("getName");
            method1.setAccessible(true);
            System.out.println(method1.invoke(o));
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void getVariable() {
        Class<?> demo;
        try {
            demo = Class.forName("com.yaya.reflection.ReflectionClass");
            System.out.println("===========本类属性,全局变量===========\n");
            Field[] declaredFields = demo.getDeclaredFields();//取得本类的全部属性
            printFields(declaredFields);
            System.out.println("======实现的接口或者父类的属性======");
            Field[] fields = demo.getFields();
            printFields(fields);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getMethodInfo() {
        Class<?> demo;
        try {
            demo = Class.forName("com.yaya.reflection.ReflectionClass");
            Method[] methods = demo.getMethods();
            for (Method method : methods) {
                Class<?> returnType = method.getReturnType();
                int temp = method.getModifiers();
                System.out.print("Modifier.toString:" + Modifier.toString(temp) + " \n");//方法钱的修饰词
                System.out.print("returnType.getName:" + returnType.getName() + "  \n");
                System.out.println("method.getName:" + method.getName() + " \n");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getParent() {
        Class<?> demo;
        try {
            demo = Class.forName("com.yaya.reflection.ReflectionClass");
            Class<?> parent = demo.getSuperclass();
            System.out.println(parent.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static void getInterfaces() {
        Class<?> demo;
        try {
            demo = Class.forName("com.yaya.reflection.ReflectionClass");
            Class<?>[] interfaces = demo.getInterfaces();
            for (Class<?> interfaze : interfaces) {
                System.out.println("实现的接口：" + interfaze.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getConstructors() {
        Class<?> demo;
        try {
            demo = Class.forName("com.yaya.reflection.ReflectionClass");
            Constructor<?>[] constructors = demo.getConstructors();//该方法获取到的构造参数是无序的。
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }
            Class<?>[] parameterTypes = constructors[0].getParameterTypes();//获取构造参数类型
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        } catch (ClassNotFoundException /*| IllegalAccessException | InstantiationException | InvocationTargetException*/ e) {
            e.printStackTrace();
        }
    }

    private static void newInstance() {
        Class<?> demo;
        try {
            demo = Class.forName("com.yaya.reflection.ReflectionClass");
            /*
            使用该方法时候要注意，一定要有空参数的工造方法，否则要传入对应的参数
            要不然就会报错
             */
            ReflectionClass reflectionClass = (ReflectionClass) demo.newInstance();
//            reflectionClass.setName("Stephen Young");
            reflectionClass.setAge(26);
            System.out.println(reflectionClass);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }


    private static void multiplyInstance() {
        Class<?> demo1;
        Class<?> demo2;
        Class<?> demo3;

        try {
            demo1 = Class.forName("com.yaya.reflection.ReflectionClass");
            System.out.println("类名称：" + demo1.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        demo2 = new ReflectionClass().getClass();
        demo3 = ReflectionClass.class;

        System.out.println("类名称：" + demo2.getName());
        System.out.println("类名称：" + demo3.getName());
    }

    private static void normalInstance() {
        ReflectionClass reflectionClass = new ReflectionClass();
        System.out.println(reflectionClass.getClass().getName());
    }

    private static void printFields(Field[] fields) {
        for (Field field : fields) {
            int modifier = field.getModifiers();
            String string = Modifier.toString(modifier);
            Class<?> type = field.getType();
            System.out.println(string + " " + type.getName() + " " + field.getName() + ";");

        }
    }
}
