package com.example.study.a5th;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class ListTest {

    @Test
    public void test() {
        int n = 10;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.addFirst(i);
        }

        for (int i = 0; i < n; i++) {
            list.addLast(i);
        }

        // O(1)
        list.add(1, 1000);
        list.pop();

        assert list.getFirst() == 1000;
    }
}
