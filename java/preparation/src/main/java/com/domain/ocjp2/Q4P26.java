package com.domain.ocjp2;

public class Q4P26 {
    public static void main(String args[]) {
        I i1 = new C();
        I i2 = new B();
        C a = new C();
        System.out.println(i1 instanceof I);
        System.out.println(i2 instanceof B);
        System.out.println(a instanceof I);
    }
}

interface I {
}

class C implements I {
}

class B implements I {
}
// true true true