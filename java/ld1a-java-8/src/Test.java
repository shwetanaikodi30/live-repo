public class Test{

   public static void main(String[] args) {
  
    int i = 1; // for (init, test, incr or decr)
    for (; i <= 10; i++) {
     System.out.println("Inside Loop : " + i);
    }
    // outside loop
    System.out.println("Outside the Loop " + i);
  
    // Indefinite Loop
    for (;;) {
     // System.out.println("Inside Loop");
    }
   }
  }
