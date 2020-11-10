package exception_handling;

public class ArrayIndexOutOfBoundsExceptionExample1 {
	public static void main(String[] args) {
		int num[] = { 23, 34, 223, 66, 678 };

		System.out.println(num[3]);

		try {
			System.out.println(num[5]);
		}
		// catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println(e.getMessage());
		// System.out.println(e);
		// }
		// catch (IndexOutOfBoundsException e) {
		// System.out.println(e.getMessage());
		// System.out.println(e);
		// }
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("will it execute!!!");
	}
}
