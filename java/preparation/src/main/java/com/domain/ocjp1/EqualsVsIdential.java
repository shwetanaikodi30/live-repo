package com.domain.ocjp1;

public class EqualsVsIdential {
   public static void main(String[] args) {
      String t1 = "Tanvi";
      String t2 = "Tanvi";
      String t3 = new String("Tanvi");
      String t4 = t3;
      System.out.println(t1 == t2);
      System.out.println(t1.equals(t2));
      System.out.println(t1 == t3);
      System.out.println(t4 == t3);

      String text1 = new String("apple");
      String text2 = new String("apple");
      //identical object are always equals
      System.out.println(text1 == text1);

      //equal objects but not identical.
      //since two strings are different object result should be false
      boolean result = text1 == text2;
      System.out.println("Comparing two strings with == operator: " + result);
            
      //since strings contains same content , equals() should return true
      result = text1.equals(text2);
      System.out.println("Comparing two Strings with same content using equals method: " + result);
            
      text2 = text1;
      //since both text2 and text1d reference variable are pointing to same object
      //"==" should return true
      result = (text1 == text2);
      System.out.println("Comparing two reference pointing to same String with == operator: " + result);
  
      }
}
