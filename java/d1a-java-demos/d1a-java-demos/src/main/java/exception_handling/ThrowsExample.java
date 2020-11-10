package exception_handling;


class Test2 {
	int value = 10;
}

public class ThrowsExample {
	public static void main(String[] args) {
		ThrowsExample throwsExample = new ThrowsExample();
		try
		{
		throwsExample.method2();
		} catch(NullPointerException e){
			System.out.println("main "  + e);
		}
		System.out.println("Finishing");
	}

	public void method1() {
		Test2 test = null;
		System.out.println("method1 begin");
		// test = new Test1();
		System.out.println(test.value);
		System.out.println("method1 end");
	}

	public void method2()  throws NullPointerException{
      
		System.out.println("method2 begin");
		try {
			method1();
		} catch (NullPointerException e) {
			System.out.println("exception handled " + e.getMessage());
			//rethrowing the exception
			throw e;
		}
		System.out.println("method2 end");
	}

}
