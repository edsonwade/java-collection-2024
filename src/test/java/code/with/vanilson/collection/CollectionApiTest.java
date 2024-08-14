package code.with.vanilson.collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CollectionApiTest
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-14
 */
public class CollectionApiTest implements Serializable {

    @Serial
    private static final long serialVersionUID = 86834525811892189L;

    /**
     * Instance of the CollectionApi class used for testing.
     * This instance is initialized in the setUp() method.
     */
    CollectionApi testCollection = new CollectionApi();
    /**
     * List of objects used for testing.
     * This list is populated in the setUp() method with three string elements: "apple", "cherry", and "orange".
     */
    List<Object> objects = new ArrayList<>();

    /**
     * Sets up the initial state for testing the CollectionApi class.
     * This method populates the 'objects' list with three string elements: "apple", "cherry", and "orange".
     *
     * @since 2024-08-14
     */
    @BeforeEach
    void setUp() {
        objects.add("apple");
        objects.add("cherry");
        objects.add("orange");
    }

    @Test
    @DisplayName("testing objects")
    public void testRemoveElementFromGivenList() {
        // Get the current collection from the CollectionApi instance
        var actual = testCollection.getCollection();
        assertEquals(3, actual.size());
        assertEquals(objects, actual);
        assertEquals(objects.get(0), actual.get(0));

    }
}