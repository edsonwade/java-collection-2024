package code.with.vanilson.collection.lists.implementation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListImpTest {

    // Removing duplicates from a list with null elements
    @Test
    public void test_removing_duplicates_from_list_with_null_elements() {
        // Given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, null, 2, null, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, null, 2, 3));

        // When
        ArrayList<Integer> result = Api.removeDuplicateIntegerOnArrayList(numbers);

        // Then
        assertEquals(expected, result);
    }

}