package com.domain.ocjp1;

public class StaticVsInstance {
   //overloading static methods
   public static void foo() { 
      System.out.println("Test.foo() called "); 
  } 
  public static void foo(int a) {  
      System.out.println("Test.foo(int) called "); 
  } 

  public  void foo1() { 
   System.out.println("Test.foo1() called "); 
} 
public  void foo1(int a) {  
   System.out.println("Test.foo1(int) called "); 
} 
  public static void main(String args[]) 
  {  
   //static methods
   StaticVsInstance.foo(); 
   StaticVsInstance.foo(10); 
   foo(); 
   foo(10); 

   //Instance methods
   StaticVsInstance staticVsInstance = new StaticVsInstance();
   staticVsInstance.foo1();
   staticVsInstance.foo1(100);

   Base.display();
   Derived.display();
  } 
}

/* Java program to show that if static method is redefined by 
   a derived class, then it is not overriding. */
  
// Superclass 
class Base { 
      
   // Static method in base class which will be hidden in subclass  
   public static void display() { 
       System.out.println("Static or class method from Base"); 
   } 
   
    // Non-static method which will be overridden in derived class  
    public void print()  { 
        System.out.println("Non-static or Instance method from Base"); 
   } 
} 
 
// Subclass 
class Derived extends Base { 
     
   // This method hides display() in Base 
   // @Override 
   public static void display() { 
        System.out.println("Static or class method from Derived"); 
   } 
     
   // This method overrides print() in Base 
   @Override 
   public void print() { 
        System.out.println("Non-static or Instance method from Derived"); 
  } 
} 