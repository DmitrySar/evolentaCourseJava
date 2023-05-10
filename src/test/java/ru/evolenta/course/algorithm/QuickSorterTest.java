package ru.evolenta.course.algorithm;

import static org.junit.jupiter.api.Assertions.*;

class QuickSorterTest {
    private final QuickSorter quickSorter = new QuickSorter();

    @org.junit.jupiter.api.Test
    void sort() {
        int[] numbers = {-1, 1000, 900, 700, -2, 0, 78, Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] result = {Integer.MIN_VALUE, -2, -1, 0, 78, 700, 900, 1000, Integer.MAX_VALUE};
        assertArrayEquals(result, quickSorter.sort(numbers));
    }
}