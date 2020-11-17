package com.domain.practice;

public class Class1 {
   public static void main(String[] args) {
      try{
         int a=0;
         int b=20/a;
         System.out.println(b);
         }
         // System.out.println("Hi");
         catch(Exception e)
         {
            System.out.println(" ----------");
            System.out.println("error ");
         }
         // System.out.println("Hi");
         finally{
            System.out.println("finally block");
         }
         // finally{
         //    System.out.println("finally block");
         // }
   }
}
