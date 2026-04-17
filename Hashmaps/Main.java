package Hashmaps;

import java.util.HashMap;

public class Main {
    static void main() {

        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("apple", 1.5);
        hashMap.put("orange", 0.75);
        hashMap.put("banana", 0.25);

        System.out.println(hashMap);

        if (hashMap.containsKey("apple")) {
            System.out.println(hashMap.get("apple"));
        } else {
            System.out.println("Key not found!");
        }
        System.out.println(hashMap.containsValue(0.25));
        System.out.println(hashMap.size());

        for (String key : hashMap.keySet()) {
            System.out.println(key + " : $" + hashMap.get(key));
        }
    }
}
