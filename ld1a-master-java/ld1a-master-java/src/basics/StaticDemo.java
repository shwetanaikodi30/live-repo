class StaticDemo{
   public static void main(String args[]){
      //directly accessed with classname 
      //System.out.println(Test.variable);
      Test.staticMethod();
   }
}
class Test{
   static {
         System.out.println("This is a static block!");
   }
   static {
      System.out.println("This is a static block1!");
}
static {
   System.out.println("This is a static block2!");
}
   public static String variable ="test variable";
   static void staticMethod(){
      System.out.println(variable);
      System.out.println("test method");
   }
}  