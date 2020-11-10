//Access specifiers
// most to least     private, default (no default keyword), protected, public
// Rule : The overriding method should have the same or higher level of accessibility.
// default : default, protected, public
// protected :  protected, public
// public :  public

//RULES WHEN overriding
//private methods are not overridden, no compilation error because new methods are created in the derived class.
//the access specifier should be equal or more accessible, but not less accessible.
//less accessibility produces compilation error.
//exception in base method should be in derived method too.
package com.domain.ocjp;

public class Q57P67 {
    public static void main(String args[]) {

    }

}

class Parent1 {
    // are not ovverridden in the derived class
    private void demo() throws Exception {
    }

    private void demo1() throws Exception {
    }

    // default : in inherting class it can be default, protected, public.
    void demo2() throws Exception {
    }

    // protected : in inherting class it can be protected, public.
    protected void demo3() throws Exception {
    }

    // public : in inherting class it can be public.
    public void demo4() throws Exception {
    }

        // public : in inherting class it can be public.
        public void demo5() throws Exception {
        }
} // end of Parent class

class Child1 extends Parent1 {
    // No overriding
    // @Override
    // method of the derived class
    private void demo() {
    }

    void demo1() throws Exception {
    }

    @Override
    void demo2() throws Exception {
    }

    @Override
    protected void demo3() throws Exception {
    }
    @Override
    public void demo4() throws Exception {
    }

    //the overriding method can have more exceptions thrown.
    @Override
    public void demo5() throws Exception,NullPointerException {
    }
    // @Override
    // public void demo4() throws Exception {
    // }
}
// Compiler object for demo() method of a Child class, "Inherited method is not
// compatible
// with void Parent.demo() throws Exception."

