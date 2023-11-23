package com.example.study.a6th;

public class QuickSort implements Sort {

    // O(nlog₂n)
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivotData = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if(arr[j] < pivotData) {
                i++;
                Sort.swap(arr, i, j);
            }
        }

        Sort.swap(arr, i + 1, right);
        return i + 1;
    }

}
