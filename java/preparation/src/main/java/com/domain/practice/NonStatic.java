package com.domain.practice;

public class NonStatic {
   static int a=18;
   int nonstatica = 100;
   public static void show() {
      NonStatic nonStatic = new NonStatic();
       System.out.println("Age  " + nonStatic.nonstatica);
       System.out.println("Age  " + a);
   }
   public static void main(String[] args) {
       new NonStatic().show();
   }

}