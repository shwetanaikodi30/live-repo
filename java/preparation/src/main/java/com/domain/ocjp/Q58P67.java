package com.domain.ocjp;
//If base method throws exception the derived should throw the exception
//If base method throws no exception the derived should throw no exception.
//The overriding method should throw the same exception as the base class or its derived classes.
//The overriding method cannot throw a parent exception to the excpetion thrown in the base class.
public class Q58P67 {
    public static void main(String args[]) {
    }

    protected void demo() {
    }
    protected void demo1()  throws Exception{
    }

    protected void demo2()  throws NullPointerException{
    }
    // end of Parent class
}

class Child2 extends Q58P67 {
    // public void demo() throws Exception {
    // }
    protected void demo1()  throws NullPointerException{
    }
    protected void demo2()  throws Exception{
    }
}
// Compiler object for demo() method of a Child class, "Exception
// java.lang.Exception in
// throws clause of void Child.demo() is not compatible with void
// Parent.demo()."