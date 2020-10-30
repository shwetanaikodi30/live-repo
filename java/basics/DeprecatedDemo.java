public class DeprecatedDemo {
   public static void main(String[] args) {
      MyThread myThread = new MyThread();
      myThread.start();
      try {
         // System.out.println("Unzipping File");
         Thread.sleep(1000);
      } catch (InterruptedException exception) {
         System.out.println("Interrupted Exception!");
      }
   myThread.stop();
   }
}

class MyThread extends Thread {
   public void run() {
      System.out.println("Starting Unzip operation");
      for (int i = 0; i < 5; i++) {
         // critical task
         try {
            // System.out.println("Unzipping File");
            Thread.sleep(1000);
         } catch (InterruptedException exception) {
            System.out.println("Interrupted Exception!");
         }
      }
      System.out.println("Completed!!!");
   }
}