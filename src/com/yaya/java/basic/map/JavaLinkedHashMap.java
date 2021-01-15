package basic.map;

import java.util.LinkedHashMap;

public class JavaLinkedHashMap {

    public void linkedHashMapMethod() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("MiddleName", "Young");
        linkedHashMap.putIfAbsent("FirstName", "Stephen");
        linkedHashMap.put("Surname", "Yang");
        linkedHashMap.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}
