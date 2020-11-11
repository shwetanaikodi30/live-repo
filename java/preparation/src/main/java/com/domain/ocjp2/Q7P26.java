package com.domain.ocjp2;

public class Q7P26 implements I {
    int k = 1;
    static {
        k = k * 2;
    }
    {
        k = k * 2;
    }

    public static void main(String args[]) {
        Q7P26 t1 = new Q7P26();
        Q7P26 t2 = new Q7P26();
        System.out.println(t1.k);
        System.out.println(t2.k);
        System.out.println(k);
    }

}
// compilation error