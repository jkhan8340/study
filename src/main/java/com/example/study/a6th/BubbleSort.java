package com.example.study.a6th;

public class BubbleSort implements Sort {

    // o(n^2)
    public void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int compareNumber = arr[j];
                int nextNumber = arr[j + 1];
                if (compareNumber > nextNumber) {
                    arr[j] = nextNumber;
                    arr[j + 1] = compareNumber;
                }
            }
        }
    }

}
