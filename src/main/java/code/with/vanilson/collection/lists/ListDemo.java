package code.with.vanilson.collection.lists;

import java.util.*;

/**
 * ListDemo
 *
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

        LinkedList<String> orders = new LinkedList<>();
        orders.add("Apple");
        orders.add("Banana");
        orders.add("Cherry");
        System.out.println(orders);
        // add the new order to the list and print the list
        orders.addFirst("Orange");
        orders.addLast("Mango();");
        System.out.println(orders);
        // remove the first and the last element in list
        orders.removeFirst();
        orders.removeLast();
        System.out.println(orders);

        List numbers = new ArrayList();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);
        System.out.println("Original List: " + numbers);

        /**
         * Collections is the helper class for Collection interface
         */
        // Sorting list according
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Reversing list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // Searching for an element in the list
        int index = numbers.indexOf(5);
        System.out.println("Index of 5: " + index);

        // Sorting list according to custom comparator
        orders.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("Sorted List (custom comparator): " + orders);

        // Searching for an element in the list
        index = orders.indexOf("Banana");
        System.out.println("Index of Banana: " + index);

        // Removing an element from
        System.out.println(orders);

        // Reverse the list
        Collections.reverse(orders);
        System.out.println(orders);

        // Clearing the list
        orders.clear();
        System.out.println(orders);

        /**
         * Sorting algorithms
         * Comparable and Comparator
         */

        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Kilimanjaro", 5895));
        mountains.add(new Mountain("Everest", 8848));
        mountains.add(new Mountain("Mount Tambourine", 3776));
        mountains.add(new Mountain("Angel Falls", 1100));

        Collections.sort(mountains);
        var results = mountains
                .stream()
                .map(Mountain::getName)
                .toList();
        // print results after ordering them
        results.forEach(System.out::println);
        //Anonymous new Comparator<Mountain>() can be replaced with lambda
        Comparator<Mountain> comparator = new Comparator<Mountain>() {

            @Override
            public int compare(Mountain o1, Mountain o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };

        Collections.sort(mountains, comparator);

        var result2 = mountains
                .stream()
                .map(Mountain::getName)
                .toList();
        result2.forEach(System.out::println);

        // replacing with lambda
        Comparator<Mountain> comparators = (o1, o2) -> o2.getName().compareTo(o1.getName());
        Collections.sort(mountains, comparators);
        var result3 = mountains.stream()
                .map(Mountain::getName)
                .toList();
        result3.forEach(System.out::println);

    }

}