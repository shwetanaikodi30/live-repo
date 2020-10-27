package com.ecommerce;

import java.io.Console;

public class PasswordHiding {
   public static void main(String[] args) {
      Console cnsl = null;

      try {
         // creates a console object
         cnsl = System.console();

         // if console is not null
         if (cnsl != null) {
            // read password into the char array
            char[] pwd = cnsl.readPassword("Password: ");

            // prints
            for (char c : pwd) {
               System.out.print(c);
            }
         }

      } catch (Exception ex) {
         // if any error occurs
         ex.printStackTrace();
      }
   }
}