package basic.collection.set;

import java.util.HashSet;

public class JavaHashSet {

    public void hashSetMethod() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Stephen");
        hashSet.add("Young");
        hashSet.add("Yang");
        hashSet.add("Young");
        hashSet.forEach(System.out::println);
        hashSet.stream().sorted().forEach(System.out::println);
    }
}
