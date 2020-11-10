package exception_handling;

public class ThrowExample {
	public static void main(String[] args) {
		System.out.println("Begin");
		Test3 test3 = new Test3();
//		throw test3;
		NullPointerException object = new NullPointerException();
		try {
			throw object;
		} catch (Exception e) {
			System.out.println("Handled NullPointerException");
		}
		System.out.println("End");
	}

}

class Test3{
	
}