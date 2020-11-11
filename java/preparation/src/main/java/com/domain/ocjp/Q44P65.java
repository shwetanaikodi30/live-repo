package com.domain.ocjp;

public class Q44P65 {
    public static void main(String args[]) {
        demo();
    }

    public static void demo() {
        //The local variable shoud always be initialized before using it.
        String s[];
        //s=null;
        s = new String[2];
        if (s.equals(null)) {
            System.out.println("s is null");
        } else {
            System.out.println("s is not equal");
        }
    }
}
// Compile error produced, "variable s may not have been initialized.