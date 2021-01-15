package generics;

import java.util.Locale;

/**
 * Generic Method
 */
public class GenericsMethod {

    public static <T> void printArray(T[] inputArray) {

        for (T item : inputArray) {
            System.out.println(item);
            System.out.printf(Locale.CHINA, "%s\n", item);
        }

        System.out.println();

    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}
