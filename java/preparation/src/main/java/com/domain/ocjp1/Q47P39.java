package com.domain.ocjp1;

public class Q47P39 {
    public static void main(String[] args) {
        Q47P39 ob1 = new Q47P39();
        Q47P39.m1();
        m1();
        ob1.m1();
        ob1.m2();

        //instance methods should be always called only with instance.
        // m2();
        // Q47P39.m2();

    }

    public void m2() {
        System.out.println("public void m2()");
        // static int i = 2;
        // System.out.println(i);
    }

    private static void m1() {
        System.out.println("private static void m1");
        // static int i = 1;
        // System.out.println("static methid"+i);
    }

}