package com.example.study.a6th;

public class InsertSort implements Sort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertNumber = arr[i];
            int insertIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                int compareNumber = arr[j];
                if (insertNumber < compareNumber) {
                    arr[j + 1] = compareNumber;
                    insertIndex = j;
                }
            }
            arr[insertIndex] = insertNumber;
        }
    }

}
