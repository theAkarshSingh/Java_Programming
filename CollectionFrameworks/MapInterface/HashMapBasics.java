package CollectionFrameworks.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    static void main() {

        Map<String, String> mapping = new HashMap<>();
        // Insertion
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United States");
        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "Brazil");
        System.out.println("Before : " + table);
        table.putAll(mapping);
        System.out.println("After : " + table);

        //Deletion
        table.remove("en");
        System.out.println(table);
        System.out.println(table.size());
        //table.clear();
        System.out.println(table);

        table.putIfAbsent("ind", "INDIA");
        System.out.println(table);

        System.out.println(table.getOrDefault("usa", "NONE"));

        System.out.println(table.containsKey("in"));
        System.out.println(table.containsKey("id"));

        System.out.println(table.containsValue("INDIA"));
        System.out.println(table.containsValue("UP"));

    }
}
