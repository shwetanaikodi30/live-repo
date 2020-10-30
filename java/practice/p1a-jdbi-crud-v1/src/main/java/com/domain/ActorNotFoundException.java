package com.domain;
// public class ActorNotFoundException extends Exception{
public class ActorNotFoundException extends RuntimeException{
   // public ActorNotFoundException(){
   //    System.out.println("Actor Not Found");
   // }
   public ActorNotFoundException(String message){
      super(message);
   }
}
