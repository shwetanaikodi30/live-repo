package exception_handling;

public class ArithmeticExceptionDemo {
 public static void main(String[] args) {
	int i = 100;
	int result = 0;
	System.out.println("Dividing by zero");
	try {
		result = i/10;
	}
	//  catch (ArithmeticException e) {
	// 	System.out.println(e.getMessage());
	// }
	catch (RuntimeException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Executes");
	System.out.println(result);
}
}
