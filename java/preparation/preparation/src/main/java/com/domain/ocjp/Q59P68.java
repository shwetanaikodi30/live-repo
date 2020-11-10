package com.domain.ocjp;

public class Q59P68 {
    protected void demo() {
    }
} // end of Parent class

class Parent5 {
    protected void demo() {
    }
    protected float demo1() {
        return 0;
    }

    protected int demo2() {
        return 0;
    }

} // end of Parent class

class Child5 extends Parent5 {
        public void demo() {
        // return 0;
    }

    //fails
    // public int demo() {
    //     return 0;
    // }

    protected float demo1() {
        return 0;
    }

    // protected float demo2() {
    //     return 0;
    // }
}
// Compiler object for the method of a Child class, "Return type is not
// compatible with void
// Parent.demo()."