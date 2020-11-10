package com.domain.ocjp1;

public class QM6P52 {
    public static void main(String[] args) {
        // option A
        // int x = 1;
        // float y = 1.0F;
        // if (x == y) {
        // System.out.println("Equal");
        // }

        // Option B
        // int x = 1;
        // Integer y = new Integer(1);
        // Integer y = x;
        // if (x == y) {
        // System.out.println("Equal");
        // }

        // Option C
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        // == check is the objects are identical ( same instance)
        if (x == y) {
            System.out.println("Equal but not identical");
        }

        if (x.equals(y)) {
            System.out.println("equals Equal");
        }

        x = y;
        if (x == y) {
            System.out.println("Equal and identical");
        }

        // Option D
        // String x = "1";
        // String y = "1";
        // if (x == y) {
        // System.out.println("Equal");
        // }
    }
}
