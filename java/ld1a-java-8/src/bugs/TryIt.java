package bugs;

public class TryIt {
   public static void main(String[] args) {
      TryIt tryIt = new TryIt();
      tryIt.method(1);
      System.out.println("Nothing");
   }

   public void method(int variable) {
      int i = 500;
      int x =  (i==10)?100:((i==20)?200:300);
      System.out.println(x);
      if(i==10){
      }
      else if(i==10){   
      }
      else {   
      }
   }
}
