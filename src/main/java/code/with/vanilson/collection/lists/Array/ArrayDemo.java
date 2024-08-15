package code.with.vanilson.collection.lists.Array;

import java.util.Arrays;

/**
 * ArrayDemo
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-15
 */
public class ArrayDemo {

    public static void main(String[] args) {
        // Create an array of integers - primitive types
        int[] numbers = {1, 2, 3, 4, 5};
        int[] number = new int[5]; // if we print this from memory, we have gone have 0,0,0,0,0
        int[] nums = {0};
        int[] anotherNumbers = new int[]{1, 2, 34, 13, 84, 45, 4, 100, 34};
        int anotherNumber[] = new int[]{1, 2, 3, 4, 5};
        // different way to declare an array

        //Object
        String[] instruments = new String[]{"hello", "world", " ", " mauro"};
        String[] instrument = new String[3]; // that is how it looks ins memory if note assigns anyValue [null, null,

        // Print the values
        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("number : " + Arrays.toString(number));
        System.out.println("number : " + Arrays.toString(nums));
        System.out.println("anotherNumbers: " + Arrays.toString(anotherNumbers));
        System.out.println("anotherNumber: " + Arrays.toString(anotherNumber));
        System.out.println("instruments: " + Arrays.toString(instruments));
        for (String names : instruments) {
            Arrays.sort(names.toCharArray());
            System.out.print(names + ",");
        }
        // foreach only for Arrays and Objects
        for (Integer n : numbers) {
            System.out.print(n + ", ");
        }
        System.out.println("\n");
        System.out.println("instrument: " + Arrays.toString(instrument));

        //sorting the arrays
        Arrays.sort(anotherNumbers);
        System.out.println("after sorting the arrays" + Arrays.toString(anotherNumbers));

        // searching in arrays using
        // binary search only works with ordering arrays.

        int[] fibArray = {12, 1, 2, 13, 6, 5, 4, 3, 452, 23};
        // first, we need to order the array, because binary search only works with ordering arrays.
        Arrays.sort(fibArray);
        System.out.println("ordered the fibArray" + Arrays.toString(fibArray));
        int index = Arrays.binarySearch(fibArray, 13);
        System.out.println("Index of 13 in fibArray: " + index);

        // Creating a copy of an array
        int[] copiedArray = Arrays.copyOf(anotherNumbers, anotherNumbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Creating a new array with a specific value
        int[] newArray = Arrays.copyOf(numbers, 10);
        Arrays.fill(newArray, 10);
        System.out.println("New array filled with 10: " + Arrays.toString(newArray));

        // Resizing an array
        int[] resizedArray = Arrays.copyOf(numbers, 15);
        System.out.println("Resized array: " + Arrays.toString(resizedArray));

        // Dimensional Array Matrix -2 D
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrix: " + Arrays.deepToString(matrix));

        // Multidimensional Array -3D
        int[][][] threeDMatrix = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        System.out.println("3D Matrix: " + Arrays.deepToString(threeDMatrix));

        String[][] westCoatsCitiesGrouped = new String[][]
                {
                        {"Austin", "San Antonio", "San Diego"},
                        {"Boston", "New York", "Chicago"},
                        {"Dallas", "Houston", "Fort Worth"},
                        {"Los Angeles", "San Francisco", "Seattle"},
                        {"Philadelphia", "Pittsburgh", "Cleveland"}
                };
        for (int i = 0; i < westCoatsCitiesGrouped.length; i++) {
            for (int j = 0; j < westCoatsCitiesGrouped[i].length; j++) {
                System.out.println(westCoatsCitiesGrouped[i][j] + ",");
            }

        }
        //Better way to use String through loop
//        for(String[] westCoast: westCoatsCitiesGrouped){
//            for(String city: westCoast){
//                System.out.print(city + " ");
//            }
//            System.out.println();
//        }

    }

}