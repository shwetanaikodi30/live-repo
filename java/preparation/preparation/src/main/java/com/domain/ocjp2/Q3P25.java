package com.domain.ocjp2;

public class Q3P25 {
    static void method(Object obj) {
        System.out.println("StringBuffer");
    }

    static void method(String str) {
        System.out.println("String");
    }

    static void method(Test t) {
        System.out.println("Test");
    }

    public static void main(String args[]) {
        method(null);
    }
}
