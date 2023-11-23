package com.example.study.a6th;

public class HeapSort implements Sort {

    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapSort(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            Sort.swap(arr, 0, i);

            heapSort(arr, i, 0);
        }
    }

    private void heapSort(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            Sort.swap(arr, i, largest);
            heapSort(arr, n, largest);
        }
    }

}
