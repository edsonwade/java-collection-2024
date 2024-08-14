package code.with.vanilson.collection.lists;


import java.util.*;

/**
 * ListDemo
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-14
 */

/**
 * List is an interface in Java, and it provides various methods to perform operations like adding, removing, and
 * searching elements.
 * It allows duplicate elements and maintains the insertion order.
 * The concrete classes implement list operations are ArrayList, LinkedList, Stack and Vector
 * List cannot be instantiated directly, the only way to instantiate it is through concrete classes.
 */

public class ListDemo {

    public static void main(String[] args) {
        // Creating a list
        List<String> list = new ArrayList<>(); // concrete class
        List<String> stringLinkedList = new LinkedList<>(); // concrete class
        List<Boolean> booleanStack = new Stack<>(); // concrete class
        List<Integer[]> vector = new Vector<>(); // concrete class


        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Adding elements to the linked list

        stringLinkedList.add("Mango");
        stringLinkedList.add("Strawberry");
        stringLinkedList.add("Tomato");

        // Printing the list
        System.out.println("Original List: " + list);

        // Printing the list
        System.out.println("Original LinkedList: " + stringLinkedList);

        // Removing an element from the list
        list.remove("Banana");

        // Printing the updated list
        System.out.println("Updated List: " + list);

        // Checking if an element exists in the list
        boolean containsBanana = list.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);
    }
}