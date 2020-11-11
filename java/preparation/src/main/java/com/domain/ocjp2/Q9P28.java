package com.domain.ocjp2;

public class Q9P28 {
    static int k = 1;
    static {
        k = k * 2;
    }
    {
        k = k * 2;
    }

    public static void main(String args[]) {
        System.out.println(k);
    }

}
// 2