package com.domain.ocjp2;

import java.io.IOException;

public class Q12P23 extends A {
   public void method() throws Exception {
      System.out.println("Subclass");
   }

   public static void main(String args[]) throws Exception {
      A a = new A();
      a.method();
      a = new Q12P23();
      a.method();
   }
}

class A {
   public void method() throws IOException {
      System.out.println("Superclass");
   }
}// compile error