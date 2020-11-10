package exception_handling;

class Test1 {
	int value = 10;
}

public class NestedTryBlock {
	public static void main(String[] args) {
		Test1 test = null;
		test = new Test1();
		try {
			System.out.println("outer try begin");
			System.out.println(test.value);
			try {
				// int i = 200;
				// int result = i / 0;
				// System.out.println(result);
				int i = 0;
				if (i == 0) {
					ArithmeticException arithmeticException = new ArithmeticException();
					throw arithmeticException;
				}
				System.out.println("does this execute!");
			}
			// catch (ArithmeticException e) {
			// System.out.println("problem inner");
			// }
			catch (NullPointerException e) {
				System.out.println("problem inner");
			}
			System.out.println("outer try end");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic problem outer");
		} catch (NullPointerException e) {
			System.out.println("Test instance not created");
		}
	}
}
