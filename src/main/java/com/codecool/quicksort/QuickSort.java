package com.codecool.quicksort;

import java.util.List;

public class QuickSort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */
    public void sort(List<Integer> toSort) {
        // Illegal condition
        if (toSort == null) throw new IllegalArgumentException();
        // Stopping condition
        if (toSort.size() == 1 || toSort.size() == 0) return;

        // Choosing the last item as pivot
        int pivot = toSort.get(toSort.size()-1);
        int pivotLocation = toSort.size()-1;
        // Starting element checking from the beginning of the list
        int index = 0;
        // Checking elements until reaching the pivot
        while (index != pivotLocation) {
            // If the element we are checking is greater than the pivot
            if (toSort.get(index) > pivot) {
                // If the index is the same element as the one in front of the pivot in the list, we only need to swap
                // index with pivot, otherwise we need to move 3 elements in the list: index to the place of the pivot,
                // the pivot is moved forward in the list, and the element in front of the pivot is moved to the
                // original place of the index element
                Integer temp = toSort.get(index);
                if(pivotLocation-1 != index){
                    toSort.set(index, toSort.get(pivotLocation-1));
                }
                toSort.set(pivotLocation - 1, pivot);
                toSort.set(pivotLocation, temp);
                pivotLocation--;
            }
            // Otherwise, move the index to the next element
            else {
                index++;
            }
        }
        sort(toSort.subList(0, pivotLocation));
        sort(toSort.subList(pivotLocation + 1, toSort.size()));
    }
}
