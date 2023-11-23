package com.example.study.a1th;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void test() {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        assert a.equals(b);
    }


    static class Singleton {

        private static class SingletonHolder {
            private static final Singleton INSTANCE = new Singleton();
        }
        public static Singleton getInstance() {
            return SingletonHolder.INSTANCE;
        }
    }
}
