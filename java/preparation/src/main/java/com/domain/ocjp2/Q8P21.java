package com.domain.ocjp2;

public class Q8P21 {
    public static void main(String args[]) throws Exception {
        Q8P21 t = new Q8P21();
        t.method();
        System.out.println("Print");
    }

    public void method() {
        try {
            throw new Exception();
        } catch (Exception e) {
        }
    }
}
// print