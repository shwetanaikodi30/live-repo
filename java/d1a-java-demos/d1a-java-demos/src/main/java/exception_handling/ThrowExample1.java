package exception_handling;

public class ThrowExample1 {
	public static void main(String[] args) {
		ThrowExample1 throwsExample = new ThrowExample1();
		throwsExample.method2();
	}

	public void method1() throws NullPointerException {
//	 public void method1()  {
		boolean error = true;
		System.out.println("method1 begin");
		//creating a null pointer exception
		NullPointerException object = new NullPointerException("Null Pointer Exception Occured");
		if (error == true) {
			throw object;
		}
		System.out.println("method1 end");
	}

	public void method2() {

		System.out.println("method2 begin");
		try {
			method1();
		} catch (NullPointerException e) {
			System.out.println("exception handled " + e.getMessage());
		}

		System.out.println("method2 end");
	}

}
