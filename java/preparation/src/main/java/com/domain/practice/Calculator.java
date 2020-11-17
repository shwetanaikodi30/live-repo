package com.domain.practice;
public class Calculator {
   int num = 100;
   public void cal(int num) {
      // which expressions
      this.num = this.num / 10 * num;
   }
   public void printnum() {
      System.out.println(num);
   }
   public static void main(String[] args) {
      Calculator obj = new Calculator();
      obj.cal(2);
      obj.printnum();
   }
}
