package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class FuzzyFinderTest {
    
    @Test
    void testLinearSearchOnSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = generator.sortedRainbowFuzzies();
        int index = finder.linearSearch(list);
        assertTrue(index >= 0);
        assertEquals("gold", list.get(index).color);
    }

    @Test
    void testBinarySearchOnSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = generator.sortedRainbowFuzzies();
        int index = finder.binarySearch(list);
        assertTrue(index >= 0);
        assertEquals("gold", list.get(index).color);
    }
    
    @Test
    void testLinearSearchOnRandomList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = generator.randomizedRainbowFuzzies();
        int index = finder.binarySearch(list);
        assertTrue(index == -1 || !list.get(index).color.equals("gold"));
    }
}
