package exception_handling;

class Test {
	int value = 10;
}

public class MultipleExceptions {
	public static void main(String[] args) {
		Test test = null;
		 test = new Test();
		try {
			System.out.println(test.value);
			int dummy = test.value/0;
		} catch (NullPointerException e) {
			System.out.println("Test instance not created" + e);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic problem" + e);
		}
	}
}
