public class FunctionalInterfaceEx {
   public static void main(String[] args) {
      // Greeting greeting = (String message) -> {System.out.println(message);}; 
      // Greeting greeting = (message) -> {System.out.println(message);};
      // Greeting greeting = (message) -> System.out.println(message);  
      Greeting greeting = message -> System.out.println(message);  
      greeting.greet("Welcome");
   }
}
@FunctionalInterface
interface Greeting{
   //abstract method
   public void greet(String message);
   // public void greets(String message);
}