package com.domain;

class ActorNotFoundException extends RuntimeException{
   String message;
   ActorNotFoundException(String message) {
      this.message = message;
   } 
}