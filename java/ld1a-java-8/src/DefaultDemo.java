class DefaultDemo implements MyInterface{
public static void main(String[] args) {
    DefaultDemo defaultDemo = new DefaultDemo();
    defaultDemo.defualtMethod();
    defaultDemo.abstractMethod("abstract method overridden");
}
    @Override
    public void abstractMethod(String str) {
      System.out.println(str);
    }

    public void defualtMethod(){  
        System.out.println("Newly added default method overridden");  
    }  
}

interface MyInterface{  
    /* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
    default void defualtMethod(){  
        System.out.println("Newly added default method");  
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