package com.domain.ocjp2;

public class Q6P26 implements I {
    int k = 1;

    public static void main(String args[]) {
        System.out.println(k);
    }
}

interface I {
    int k = 0;
}
// compile error