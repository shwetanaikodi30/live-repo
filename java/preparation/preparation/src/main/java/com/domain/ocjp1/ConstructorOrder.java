package com.domain.ocjp1;

// static blocks from base to derived
// 
public class ConstructorOrder {
   public static void main(String[] args) {
      // Test test = new Test();
      // Test test1 = new Test(1);
      // Test test2 = new Test(1);
      Test1 test1 = new Test1();
   }
}

class Test {
   static {
      System.out.println("2 static");
   }
   static {
      System.out.println("1 static");
   }
   {
      System.out.println("2 instance");
   }
   {
      System.out.println("1 instance");
   }

   Test() {
      System.out.println("Base No argument constructor");
   }

   Test(int x) {
      System.out.println("ONE argument constructor");
   }
}

class Test1 extends Test {

   static {
      System.out.println("derived static");
   }
   {
      System.out.println("derived instance");
   }

   Test1() {
      System.out.println("Derived No argument constructor");
   }

   // Test(int x) {
   // System.out.println("ONE argument constructor");
   // }
}