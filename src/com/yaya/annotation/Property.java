package com.yaya.annotation;

/*
自定义注解

1.元注解：负责注解其他注解，Java5.0定义了4个标准的meta-annotation类型，
    a.@Target
        说明Annotation所修饰对象的范围，取值有：
            1.CONSTRUCTOR：用于描述构造函数
            2.FIELD：用于描述全局变量
            3.LOCAL_VARIABLE：用于描述局部变量
            4.METHOD：用于描述方法
            5.PACKAGE：用于描述包
            6.PARAMETER：用于描述参数
            7.TYPE：用于描述类，接口或enum声明
    b.@Retention
        定义了该Annotation被保留的时长。表示需要在什么级别保存该注解信息，即被描述的注解在什么范围内有效
        取值有:
            1.SOURCE:在源文件中有效（仅在文件保留）
            2.CLASS：在class文件中有效（即class保留）
            3.RUNTIME:在运行时有效（即运行时保留）
    c.@Document
        用于描述该Annotation是否被作为被标注的程序成员的公开API，因此可以被JavaDoc此类的工具文档化
        该meta-annotation是一个标记注解没有成员
    d.@Inherited
        该meta-annotation也是一个标记注解，阐述了某个被标记类型是被继承的。如果一个使用了@Inherited修饰的annotation被
        用于一个class，则这个annotation将被用于该class的子类
2.自定义注解
    注解参数支持的类型:
        1.所有基本类型
        2.string类型
        3.class类型
        4.enum类型
        5.annotation类型
        6.以上所有类型的数组
    Annotation类型里面的参数设定
        1.只能用public活默认修饰
        2.参数类型固定。就上面说的几种
注意：非基本类型的注解元素必须有默认值，要么在注解中指定，要么在使用时指定。

 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Property {

    String Name() default "Stephen";

    String Gender() default "male";

}
