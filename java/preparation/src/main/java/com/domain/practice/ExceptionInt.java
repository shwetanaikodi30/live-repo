package com.domain.practice;

class ExceptionInt{
   public static void main(String args[])
   {
   try{
   throw 10;
   }
   catch(int e)
   {
   System.out.println("Got the Exception" +e);
   }
   }
   
