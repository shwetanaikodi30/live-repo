package exception_handling;

public class HandledException {
 public static void main(String[] args) {
	int i = 100;
	int result = 0;
	System.out.println("Dividing by zero");
	try {
		System.out.println("before exception");
		// result = i/0;
		result = i/10;
		System.out.println("skipped!");
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e);	
	}
	System.out.println("will execute");
	System.out.println(result);
}
}
