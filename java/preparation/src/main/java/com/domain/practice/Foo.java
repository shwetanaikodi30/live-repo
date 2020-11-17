package com.domain.practice;
class Foo{
   //methods directly inside class can be static
   // static int x = 0;
   public static void main(String args[]){
   System.out.println(func());
   // System.out.println(func1());
   }
   static int func(){
      // variables inside function cannot be static.
     // static int x = 0;
     int x= 0;
      return ++x;
    }   
    static void func1(){
      // variables inside function cannot be static.
     // static int x = 0;
     int x= 0;
      // return ++x;
    }   
}
