package CollectionFrameworks.MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        table.replace("ind", "Indonesia");
        System.out.println(table);

        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        //get all the entries from map
        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("Entries : "+ entrySet);
        

    }
}
