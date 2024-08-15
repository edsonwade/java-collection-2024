package code.with.vanilson.collection.lists.implementation;

import java.lang.reflect.Array;
import java.util.*;

/**
 * ListImp
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-15
 */
public class ListImp {

    /**
     * ArrayList is a concrete class that implements list interface.
     * ArrayList is dynamically allocated differently from an array which has a fixed size.
     * This implementation is intended to be used in conjunction with the implementation of the interface methods in
     * the interface classes that implement List.
     * ArrayList has three types of operations that are:
     * Search, Insert and Remove
     * <p>
     * Search has time complexity in worst case performance O(N) linear, in best case performance O(1) constant
     * </p>
     * Insert → time complexity O(1) constant in the best case, and the worst case performance O(n) constant
     * every time a new element is added on an array list, behind the scenes a new array is created and the element
     * has a new position in the array.
     * </p>
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);  // posix 0
        numbers.add(2);  // posix 1
        numbers.add(4);  // posix 2
        numbers.add(23); // posix 3

        System.out.println(" before inserted numbers: " + numbers);
        numbers.add(3);
        System.out.println(" after inserted a new numbers: " + numbers);
        // inserted a new value in specific position on arrayList
        numbers.add(4, 23);
        numbers.add(2, 3);
        numbers.add(3, 4);
        System.out.println(" after inserted a new numbers in each specific positions: " + numbers);

        System.out.println("after removing last element: " + numbers.remove(numbers.size() - 1));
        System.out.println("after removing last element: " + numbers);

    }

}
