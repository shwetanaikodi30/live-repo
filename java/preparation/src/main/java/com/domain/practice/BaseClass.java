package com.domain.practice;

class BaseClass{
   public BaseClass() {
       System.out.println("Base");
   }
   public static void main(String[] args) {
      System.out.println("Original");
   }
   // public static int main(String agrument []) {
   //    System.out.println("Original");
   //    return 0;
   // }
   public static void main(String args) {
      System.out.println("normal with string");
   }
   public static void main(int args) {
      System.out.println("normal with int");
   }
}

