
package com.domain.practice;

public class Demo{
   public static void main(String[] args) {
      Parent parent = new Parent(10, 10.10);

   }
}
class Parent {
   //final variable should be initailzed while declaring
   //or in constructor
   final int MAXIMUM;
   final  double PI;
      public Parent(int max, double pi){
      MAXIMUM = max;
      PI = pi;
   }
   // public void disp(){
   //    MAXIMUM = 200;
   // }
   // public Parent(double pi){
   //    PI = pi;
   // }
   // public Parent(int max){
   //    MAXIMUM = max;
   // }
   // public Parent(int max, double pi){
   //    MAXIMUM = max;
   //    PI = pi;
   // }
   // public Parent(double pi){
   //    PI = pi;
   // }
}
// public class Demo { 
//        public static void main(String[] args) {
//            Parent t = new Parent();
//            System.out.println(t.x + " " + t.y);
//        }
//    }

// }
// class Parent{
//            final int MAXIMUM;
//            final double PI;
//            public parent(int max) {
//                MAXIMUM = max;
//            }
//            public parent(double pi) {
//                PI = pi;
//            }
// }