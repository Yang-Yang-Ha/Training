package generics;

/**
 * Generic Class
 */
public class GenericsClass<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void print() {
        System.out.println(t.toString());
    }

}
