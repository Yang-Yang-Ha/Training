package reflection;

import java.io.Serializable;

/**
 * 反射用到的类
 * Created by Stephen Young on 2017/7/4.
 */
public class ReflectionClass implements Serializable,Comparable<String> {

    private String name;
    private int age;

    public ReflectionClass() {
    }

    public ReflectionClass(String name) {
        this.name = name;
    }

    public ReflectionClass(int age) {
        this.age = age;
    }

    public ReflectionClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name + "  " + age + "]";
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
