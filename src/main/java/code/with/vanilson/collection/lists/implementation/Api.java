package code.with.vanilson.collection.lists.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Api
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-15
 */
public class Api {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(1, 23, 23, 4, 5, 7, 8, 9, 4, 4, 2, 1));

        System.out.println(" new list elements using for loop " + removeDuplicateIntegerArrayList(elements));
        System.out.println("\n");
        System.out.println(" using foreach " + removeDuplicateIntegerOnArrayList(elements));
        System.out.println("\n");
        System.out.println(
                "  using hashset that is the best approach " + removeDuplicateIntegerOnArrayListWithSet(elements));
    }

    /**
     * This function removes duplicate integers from an ArrayList of integers.
     *
     * @param numbers The ArrayList of integers from which to remove duplicates.
     *                It is assumed that the input ArrayList is not null.
     * @return A new ArrayList of integers that contains only unique elements from the input ArrayList.
     * The order of elements in the new ArrayList may not be the same as the input ArrayList.
     * If the input ArrayList is null, a NullPointerException will be thrown.
     * <p>
     * The function uses a nested loop to compare each element in the input ArrayList with all other elements.
     * If a duplicate is found, it is not added to the new ArrayList.
     * This approach has a time complexity of O(n^2) due to the nested loop.
     */

    // Other methods:
    public static ArrayList<Integer> removeDuplicateIntegerArrayList(ArrayList<Integer> numbers) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (!uniqueNumbers.contains(numbers.get(i))) {
                uniqueNumbers.add(numbers.get(i));
            }
        }
        return uniqueNumbers;
    }

    /**
     * This function removes duplicate integers from an ArrayList of integers.
     *
     * @param numbers The ArrayList of integers from which to remove duplicates.
     * @return A new ArrayList of integers that contains only unique elements from the input ArrayList.
     * <p>
     * The function uses a nested loop to compare each element in the input ArrayList with all other elements.
     * If a duplicate is found, it is not added to the new ArrayList.
     * This approach has a time complexity of O(n^2) due to the nested loop.
     * <p>
     * An alternative approach is to use a HashSet to store unique elements.
     * This approach has a time complexity of O(n) as it only requires a single pass through the input ArrayList.
     * However, using a HashSet may not preserve the original order of elements in the ArrayList.
     */
    public static ArrayList<Integer> removeDuplicateIntegerOnArrayList(ArrayList<Integer> numbers) {
        ArrayList<Integer> newArrayValues = new ArrayList<>();

        for (Integer number : numbers) {
            if (!newArrayValues.contains(number)) {
                newArrayValues.add(number);
            }
        }
        return newArrayValues;
    }

    /**
     * This function removes duplicate integers from an ArrayList of integers using a HashSet.
     *
     * @param numbers The ArrayList of integers from which to remove duplicates.
     * @return A new ArrayList of integers that contains only unique elements from the input ArrayList.
     * <p>
     * The function uses a HashSet to store unique elements. This approach has a time complexity of O(n) as it only requires a single pass through the input ArrayList.
     * However, using a HashSet may not preserve the original order of elements in the ArrayList.
     * @throws NullPointerException If the input ArrayList is null.
     */
    public static ArrayList<Integer> removeDuplicateIntegerOnArrayListWithSet(ArrayList<Integer> numbers) {
        // Using HashSet to remove duplicates
        if (numbers == null) {
            throw new NullPointerException("Input ArrayList cannot be null");
        }
        var uniqueNumbers = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbers);
    }

}