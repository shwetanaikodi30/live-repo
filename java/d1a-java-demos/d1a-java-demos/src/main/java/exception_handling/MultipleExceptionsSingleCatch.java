package exception_handling;

class Test50 {
	int value = 10;
}

public class MultipleExceptionsSingleCatch {
	public static void main(String[] args) {
		Test50 Test50 = null;
		// Test50 = new Test50();
		try {
			System.out.println(Test50.value);

		} catch (NullPointerException | ArithmeticException  | ArrayIndexOutOfBoundsException e) {

			// System.out.println(e.getClass());
			// System.out.println(e.getClass().getSimpleName());
			if (e.getClass().getSimpleName().equals("NullPointerException")) {
				System.out.println("NullPointerException occured  " + e);
			} else {
				System.out.println("Some other exception occured");
			}
		}
	}
}
