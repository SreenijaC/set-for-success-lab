package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicateTest {

    @Test
    void testEmptyList() {
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> result = RemoveDuplicate.removeDuplicates(input);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void testSingleItem() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> result = RemoveDuplicate.removeDuplicates(input);
        assertEquals(Arrays.asList(7), result);
    }

    @Test
    void testAllUnique() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<String> result = RemoveDuplicate.removeDuplicates(input);
        assertEquals(Arrays.asList("a", "b", "c"), result);
    }

    @Test
    void testWithStringDupes() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "apple", "banana"));
        ArrayList<String> result = RemoveDuplicate.removeDuplicates(input);
        assertEquals(Arrays.asList("apple", "banana"), result);
    }

    @Test
    void testWithIntegerDupes() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3));
        ArrayList<Integer> result = RemoveDuplicate.removeDuplicates(input);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    void testWithNullValues() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList(null, "Z", null, "Z"));
        ArrayList<String> result = RemoveDuplicate.removeDuplicates(input);
        assertEquals(Arrays.asList(null, "Z"), result); // order and null preserved
    }
}
