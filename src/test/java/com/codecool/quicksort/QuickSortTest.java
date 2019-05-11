package com.codecool.quicksort;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class QuickSortTest {

    @Test
    void sortingNullThrowsError() {
        QuickSort quickSort = new QuickSort();
        assertThrows(IllegalArgumentException.class, ()-> quickSort.sort(null));
    }

    @Test
    void sortingSimpleItemsWorks() {
        QuickSort quickSort = new QuickSort();

        List<Integer> toSort = Arrays.asList(5, 3, 1, 12, 9);
        quickSort.sort(toSort);

        List<Integer> expected = Arrays.asList(1, 3, 5, 9, 12);
        assertIterableEquals(expected, toSort);
    }

    @Test
    void sortingDuplicateItemsWorks() {
        QuickSort quickSort = new QuickSort();

        List<Integer> toSort = Arrays.asList(5, 3, 1, 5, 9);
        quickSort.sort(toSort);

        List<Integer> expected = Arrays.asList(1, 3, 5, 5, 9);
        assertIterableEquals(expected, toSort);
    }

    @Test
    void sortingOneItemWorks() {
        QuickSort quickSort = new QuickSort();

        List<Integer> toSort = Arrays.asList(2);
        quickSort.sort(toSort);

        List<Integer> expected = Arrays.asList(2);
        assertIterableEquals(expected, toSort);
    }

    @Test
    void sortingZeroItemWorks() {
        QuickSort quickSort = new QuickSort();

        List<Integer> toSort = new ArrayList<>();
        quickSort.sort(toSort);

        assertEquals(0, toSort.size());
    }

    @Test
    void sortingExampleFromVideo() {
        QuickSort quickSort = new QuickSort();

        List<Integer> toSort = Arrays.asList(7, 8, 7, 4, 10, 3, 5);
        List<Integer> expected = Arrays.asList(3, 4, 5, 7, 7, 8, 10);
        quickSort.sort(toSort);

        assertEquals(expected, toSort);
    }
}