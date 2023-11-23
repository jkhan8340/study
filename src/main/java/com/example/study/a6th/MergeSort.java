package com.example.study.a6th;

public class MergeSort implements Sort {

    public void sort(int[] arr) {
        int length = arr.length;
        partition(arr, 0, length - 1);
    }

    private void partition(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            partition(arr, left, mid);
            partition(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        int leftIndex = left;
        int rightIndex = mid + 1;
        int tempIndex = left;

        while(leftIndex <= mid && rightIndex <= right) {
            if(arr[leftIndex] <= arr[rightIndex]) {
                temp[tempIndex++] = arr[leftIndex++];
            } else {
                temp[tempIndex++] = arr[rightIndex++];
            }
        }

        while(leftIndex <= mid) {
            temp[tempIndex++] = arr[leftIndex++];
        }

        while(rightIndex <= right) {
            temp[tempIndex++] = arr[rightIndex++];
        }

        if (right + 1 - left >= 0) {
            System.arraycopy(temp, left, arr, left, right + 1 - left);
        }
    }

}
