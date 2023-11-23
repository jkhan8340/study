package com.example.study.a6th;

public class HeapSort implements Sort {

    public void sort(int[] arr) {
        int n = arr.length;

        // 힘구성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapSort(arr, n, i);
        }

        // 힙에서 요소 하나씩 꺼내서 정렬
        for (int i = n - 1; i >= 0; i--) {
            // 현재 루트 끝으로 이동
            Sort.swap(arr, 0, i);

            // 맥스 힙호출
            heapSort(arr, i, 0);
        }
    }

    private void heapSort(int[] arr, int n, int i) {
        int largest = i; // 가장 큰수를 루트로 초기화
        int left = 2 * i + 1; // left = 2*i + 1 = 왼쪽 노드 위치
        int right = 2 * i + 2; // right = 2*i + 2 = 오른쪽 노드 위치

        // 왼쪽 자식이 루트보다 큰경우
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 오른쪽 자식이 루트보다 큰경우
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 가장큰수가 루트가 아닌경우
        if (largest != i) {
            Sort.swap(arr, i, largest);

            // 하위 트리 재구성
            heapSort(arr, n, largest);
        }
    }

}
