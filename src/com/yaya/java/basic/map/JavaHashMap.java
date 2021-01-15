package basic.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

    HashMap<String, String> nameMap = new HashMap<>();

    public JavaHashMap() {
        nameMap.put("MiddleName", "Young");
        nameMap.put("FirstName", "Stephen");
        nameMap.put("Surname", "Yang");
    }

    public void hashMapMethod() {
        nameMap.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }

    public void comparingByKey() {
        nameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(this::printEntry);
    }

    public void comparingByKeyInDescendingOrder() {
        nameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(this::printEntry);
    }

    public void comparingByValue() {
        nameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(this::printEntry);
    }

    public void comparingByValueInDescendingOrder() {
        nameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(this::printEntry);
    }

    private void printEntry(Map.Entry<String, String> nameEntry) {
        System.out.println(nameEntry.getKey() + ": " + nameEntry.getValue());

    }
}
