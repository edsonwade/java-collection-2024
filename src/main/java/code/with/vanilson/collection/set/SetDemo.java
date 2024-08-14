package code.with.vanilson.collection.set;

import java.util.*;

/**
 * SetDemo
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-14
 */

public class SetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Set<String>> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Add elements to the TreeSet
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        // Add elements to the LinkedHashSet
        linkedHashSet.add(new HashSet<>(Arrays.asList("Apple", "Banana")));
        linkedHashSet.add(new HashSet<>(Arrays.asList("Cherry", "Durian")));
        linkedHashSet.add(new HashSet<>(Arrays.asList("Cherry", "Durian")));

        // Display the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Display the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Check if an element exists in the HashSet
        System.out.println("Is 'Apple' in HashSet? " + hashSet.contains("Apple"));

        // Check if an element exists in the TreeSet
        System.out.println("Is 1 in TreeSet? " + treeSet.contains(1));

        // Check if an element exists in the LinkedHashSet
        System.out.println("Is 'Check' in LinkedHashSet? " + linkedHashSet.contains(hashSet));

        // Display the HashSet
        System.out.println("HashSet: " + hashSet);

        // Remove an element from the HashSet
        hashSet.remove("Banana");

        // Display the updated HashSet
        System.out.println("Updated HashSet: " + hashSet);

        // Create an EnumSet
        Set<E> enumSet = EnumSet.of(E.A, E.B, E.C);

        // Display the EnumSet
        System.out.println("EnumSet: " + enumSet);

        // Check if an element exists in the EnumSet
        System.out.println("Is A in EnumSet? " + enumSet.contains(E.A));
    }

}

enum E {
    A,
    B,
    C
}

/**
 * Set is a collection implementation that allows multiple objects to be set at once and returns a single object
 * Does not allow duplicate entries in the collection
 * that contains the set of objects that should be returned in the returned collection object.
 * <p>
 * HashSet does not maintain any order and does not allow duplicate elements.
 * HashSet does not allow null values.
 * <p>
 * TreeSet does not allow null and ordered values to be returned in the returned collection object.
 * TreeSet allows multiple types of elements.
 * TreeSet allows you to use any Comparable type as the element type.
 * LinkedHashSet is a collection implementation that allows multiple objects to be set at once and returns a single
 * object
 * LinkedHashSet maintains the order of elements and allows duplicate elements.
 * LinkedHashSet allows null values.
 * EnumSet is a collection implementation that allows multiple objects to be set at once and returns a single object
 * EnumSet does not maintain any order and does not allow duplicate elements.
 * EnumSet does not allow null values.
 * EnumSet allows multiple types of elements.
 */

/**
 * HashSet does not maintain any order and does not allow duplicate elements.
 * HashSet does not allow null values.
 */

/**
 * TreeSet does not allow null and ordered values to be returned in the returned collection object.
 * TreeSet allows multiple types of elements.
 * TreeSet allows you to use any Comparable type as the element type.
 */

/** LinkedHashSet is a collection implementation that allows multiple objects to be set at once and returns a single
 object
 *LinkedHashSet maintains the order of elements and allows duplicate elements.
 * LinkedHashSet allows null values.
 */

/** EnumSet is a collection implementation that allows multiple objects to be set at once and returns a single object
 * EnumSet does not maintain any order and does not allow duplicate elements.
 * EnumSet does not allow null values.
 * EnumSet allows multiple types of elements.
 */