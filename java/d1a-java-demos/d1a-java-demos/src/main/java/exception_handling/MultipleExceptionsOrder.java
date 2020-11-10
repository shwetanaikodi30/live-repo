package exception_handling;

class Test1 {
	int value = 10;
}

public class MultipleExceptionsOrder {
	public static void main(String[] args) {
		int num[] = { 23, 34, 223, 66, 678 };

		Test1 test = null;
		test = new Test1();
		try {
			System.out.println(num[30]);
			System.out.println(test.value);
			int dummy = test.value / 0;
		}
		// catch (Throwable e) {
		// System.out.println("Other Problem " + e);
		// }
		// Unreachable catch block for NullPointerException. It is already handled by
		// the catch block for RuntimeException
		catch (NullPointerException e) {
			System.out.println("Test instance not created" + e);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic problem" + e);
		}
		catch (RuntimeException e) {
			System.out.println("Other Problem " + e);
		} 
		// catch (Throwable e) {
		// 	System.out.println("Other Problem " + e);
		// }
	}
}