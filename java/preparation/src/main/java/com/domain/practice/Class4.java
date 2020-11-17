package com.domain.practice;

import java.util.ArrayList;
class Test2 {
   //instance method
    static void tests() {
        System.out.println("Hi");
    }
}
class Fest extends Test2 {
   //cannot hide base method
    static void tests() {
        System.out.println("Bye");
    }
}
public class Class4 {
   
    public static void main(String[] args) { // line 4
     Test2 obj = new Test2();
     obj.tests();
    }
   }
