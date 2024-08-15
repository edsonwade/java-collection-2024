package code.with.vanilson.collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * MapDemo
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-15
 */
public class MapDemo {

    /**
     * Map is a paired key objects (key,value) that describe the values of the given map.
     * - The key cannot be duplicated
     * - The value can be duplicated
     * - The performance does not change even if the size is growing.
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "julian");
        map.put(1, "vani"); // print the second key value
        map.put(2, "sonia");
        map.put(3, "sonia");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}