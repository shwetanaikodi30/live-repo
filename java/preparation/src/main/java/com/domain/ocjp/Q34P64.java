package com.domain.ocjp;

public class Q34P64 {
    public static void main(String args[]) {
        String s = null;
        String s1 = null;

        String t = "null";
        String t1 = "null";

        if (s == t) {
            System.out.println("s equal to t");
        } else {
            System.out.println("s not equal to t");
        }

        if (s == s1) {
            System.out.println("s equal to s1");
        } else {
            System.out.println("s not equal to s1");
        }

        if (t == t1) {
            System.out.println("t equal to t1");
        } else {
            System.out.println("t not equal to t1");
        }
    }
}
// option c :It compiles successfully and output "s not equal to t"