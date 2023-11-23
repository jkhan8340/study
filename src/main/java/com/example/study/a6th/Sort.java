package com.example.study.a6th;

public interface Sort {
    void sort(int[] arr);

    static void swap(int [] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
