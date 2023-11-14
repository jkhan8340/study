package com.example.study.a5th;

import org.junit.jupiter.api.Test;

public class BigOTest {

    @Test
    public void test_10_n__2_plus_n() {
        // O(10(n^2) + n)
        int n = 10;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            count++;
        }

        assert count == 1010;
    }
}
