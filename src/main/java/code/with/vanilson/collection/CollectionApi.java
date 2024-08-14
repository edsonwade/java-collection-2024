package code.with.vanilson.collection;

import java.util.*;

/**
 * CollectionApi
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-14
 */
public class CollectionApi implements CollectApi<Object>, Cloneable {

    public CollectionApi() {
        // No-op constructor
    }

    @Override
    public List<Object> getCollection() {
        List<Object> result = new ArrayList<>();
        result.add("apple");
        result.add("banana");
        result.add("cherry");
        result.add("orange");

        return result.stream()
                .filter(s -> !s.equals("banana"))
                .toList();
    }

    @Override
    public Set<Object> removeElementInCollection() {
        Set<Object> result = new HashSet<>();
        result.add("apple");
        result.add("greasy");
        result.add("tomato");
        result.add("cherry");
        result.removeIf("apple"::equals);
        return result;
    }

    @Override
    public CollectionApi clone() {
        try {
            return (CollectionApi) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    /**
     * Main method to demonstrate usage of Java collection API
     * methods are implemented by the {@link Collection} class itself and should be used in your
     * application code to implement collection methods that are intended to be used in your application code that.
     *
     * @param args command line arguments
     */

    public static void main(String... args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("apple");
        collection.add("banana");
        collection.add("cherry");

        System.out.println("Original size: " + collection.size());
        System.out.println("Contains 'banana': " + collection.contains("banana"));
        System.out.println("Initial collection: " + collection);

        collection.remove("banana");
        System.out.println("After removing 'banana': " + collection);

        collection.removeIf("apple"::equals);

        System.out.println("After adding 'orange' at index 1: " + collection);

        System.out.println("After updating 'orange' at index 1 to 'kiwi': " + collection);
        System.out.println("Is collection empty: " + collection.isEmpty());

        System.out.println("Collection after removing 'orange' at index 1");
        CollectionApi collectionApi = new CollectionApi();
        System.out.println("after remove banana" + collectionApi.getCollection());
        System.out.println("after remove apple " + collectionApi.removeElementInCollection());

    }

}