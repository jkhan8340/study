package com.example.study.a6th;

public class SelectionSort implements Sort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int selectionNumber = arr[i];
            int changeIndex = -1;
            for (int j = i + 1; j < arr.length; j++) {
                int compareNumber = arr[j];
                if (selectionNumber > compareNumber) {
                    changeIndex = j;
                    selectionNumber = compareNumber;
                }
            }
            if (changeIndex > 0) {
                Sort.swap(arr, i, changeIndex);
            }
        }
    }

}
