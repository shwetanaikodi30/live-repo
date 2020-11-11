class StaticDemo implements MyInterface1{
public static void main(String[] args) {
    MyInterface1.staticMethod();
    // StaticDemo staticDemo = new StaticDemo();
    // staticDemo.staticMethod();
    // MyInterface1 interface1 = new StaticDemo();
    // interface1.staticMethod();
}
    @Override
    public void abstractMethod(String str) {
      System.out.println(str);
    }
}

interface MyInterface1{  
    /* This is a static method. Static method in interface is
     * similar to default method except that we cannot override 
     * them in the implementation classes.
     * Similar to default methods, we need to implement these methods
     * in implementation classes so we can safely add them to the 
     * existing interfaces.
     */
    static void staticMethod(){  
        System.out.println("Newly added static method");  
    }  

    // void concreteMethod(){  
    //     System.out.println("Newly added default method");  
    // }  

    /* Already existing public and abstract method
     * We must need to implement this method in 
     * implementation classes.
     */
    void abstractMethod(String str);  
}  