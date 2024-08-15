package code.with.vanilson.collection.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

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
        HashMap countries = new HashMap();
        HashMap<String, String> countries2 = new HashMap<>();
        Map languages = new HashMap<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "julian");
        map.put(1, "vani"); // print the second key value
        map.put(2, "sonia");
        map.put(3, "sonia");

        // Add key-value pairs
        countries.put("USA", "Washington D.C.");
        countries.put("Canada", "Ottawa");
        countries.put("Portugal", "Lisbon"); // overwrites the previous value

        // Add key-value pairs
        countries2.put("Japan", "monkish");
        countries2.put("Brazil", "Rio Grande"); // overwrites the previous value
        countries2.put("Angola", "Luanda"); // overwrites the previous value
       // add key values
        languages.put(1, "English");
        languages.put(2, "Spanish");
        languages.put(3, "French");
        languages.put(4, "Portuguese");

        // Get the country
        System.out.println("Country in USA: " + countries.get("USA"));
        System.out.println("Country in Canada: " + countries.get("Canada"));
        // get the country
        System.out.println("Country in Portugal: " + countries.get("Portugal"));
        System.out.println("Country in Brazil: " + countries2.get("Brazil"));

        // Check if a key exists
        System.out.println("Key Canada exists: " + countries.containsKey("Canada"));

        // Get the value of a key
        System.out.println("Value for key USA: " + countries.get("USA"));

        // Check if a value exists
        System.out.println("Value Washington D.C. exists: " + countries.containsValue("Washington D.C."));

        // Get the size of the map
        System.out.println("Size of countries: " + countries.size());
        System.out.println("Size of countries2: " + countries2.size());

        // Check if the map is empty
        System.out.println("Countries is empty: " + countries.get("Angola"));

        //check if the content value exists
        for (int i = 0; i < languages.size(); i++){
            if(languages.containsValue(("Spanish"))){
                System.out.println("Value  exists: " + i + " : " + languages.get(i));
            }
        }
        System.out.println("Value Luanda exists: " + languages.containsKey("Angola"));


        // Print the map
        System.out.println("Countries: " + countries);
        System.out.println("Countries (2): " + countries2);

        // Iterate over the map
        System.out.println("Map entries:");
        for (Object country : countries.keySet()) {
            System.out.println("Key: " + country + ", Value: " + countries.get(country));
        }

        // Iterate over the map using entrySet

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check if a key exists
        System.out.println("Key 1 exists: " + map.containsKey(1));

        // Get the value of a key
        System.out.println("Value for key 2: " + map.get(2));

        // Remove a key-value pair
        map.remove(3);

        // Check if a key exists after removal
        System.out.println("Key 3 exists after removal: " + map.containsKey(3));

        TreeMap<Integer, String> planets= new TreeMap<Integer, String>();
        Map<String, String> englishSpanish= new HashMap<>(9);
        planets.put(3, "Mercury");
        planets.put(2, "Venus");
        planets.put(1, "Earth");

        englishSpanish.put("dog","perro");
        englishSpanish.put("cat","gato");
        englishSpanish.put("bird","pájaro");
        englishSpanish.put("mouse","ratón");

        System.out.println("planets " + planets.keySet());
        System.out.println("english " + englishSpanish.keySet());

        System.out.println("Sorted planets " + planets.entrySet());
        System.out.println("Sorted english " + englishSpanish.entrySet());

        System.out.println("First planet: " + planets.firstEntry());
        System.out.println("Last planet: " + planets.lastEntry());


        System.out.println("First planet key: " + planets.firstKey());
        System.out.println("Last planet key: " + planets.lastKey());





    }
}