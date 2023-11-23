package com.example.study.a6th;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {

    private static final int[] expectedArray = new int[]{1, 2, 4, 6, 7, 8, 11, 13, 22};

    @Test
    public void test_selection_sort() {
        int[] a = new int[]{22, 2, 8, 4, 11, 6, 7, 13, 1};
        Sort selectionSort = new SelectionSort();
        selectionSort.sort(a);
        assert Arrays.equals(a, expectedArray);
    }

    @Test
    public void test_insert_sort() {
        int[] a = new int[]{22, 2, 8, 4, 11, 6, 7, 13, 1};
        Sort insertSort = new InsertSort();
        insertSort.sort(a);
        assert Arrays.equals(a, expectedArray);
    }

    @Test
    public void test_bubble_sort() {
        int[] a = new int[]{22, 2, 8, 4, 11, 6, 7, 13, 1};
        Sort insertSort = new BubbleSort();
        insertSort.sort(a);
        assert Arrays.equals(a, expectedArray);
    }

    @Test
    public void test_merge_sort() {
        int[] a = new int[]{22, 2, 8, 4, 11, 6, 7, 13, 1};
        Sort mergeSort = new MergeSort();
        mergeSort.sort(a);
        assert Arrays.equals(a, expectedArray);
    }

    @Test
    public void test_quick_sort() {
        int[] a = new int[]{22, 2, 8, 4, 11, 6, 7, 13, 1};
        Sort mergeSort = new QuickSort();
        mergeSort.sort(a);
        assert Arrays.equals(a, expectedArray);
    }

    @Test
    public void test_heap_sort() {
        int[] a = new int[]{2, 22, 8, 4, 11, 6, 7, 1, 13};
        Sort heapSort = new HeapSort();
        heapSort.sort(a);
        assert Arrays.equals(a, expectedArray);
    }
}