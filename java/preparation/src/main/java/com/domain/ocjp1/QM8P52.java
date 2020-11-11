package com.domain.ocjp1;

public class QM8P52 {
    String x;

    public void testDemo(int n) {
        // y is not initialized
        String y = "";
        if (n > 0) {
            y = "Hello";
        }
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        QM8P52 test = new QM8P52();
        test.testDemo(2);
    }
}
// ans A
