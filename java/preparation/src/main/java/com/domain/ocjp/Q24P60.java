package com.domain.ocjp;

public class Q24P60 {

   public static void main(String args[]) {
      int i, j = 0;
      // outer: for (i = 0; i < 2; i++) {
      for (i = 0; i < 2; i++) {
         System.out.println("outer" + i);
         for (j = i; j < 3; j++) {
            System.out.println("inner " + j);
            break;
            // continue;
            // continue outer;
         }
         System.out.println("i = " + i + " j = " + j);
      }
      System.out.println(i);
   }
}

// ANSWER IS OPTION C: none of the above