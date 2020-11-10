package exception_handling;

public class StackTraceEx {
	public static void main(String[] args) {
		StackTraceEx stackTraceEx = new StackTraceEx();
		stackTraceEx.m1();
	}

	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println("stack begin");
			e.printStackTrace();
			System.out.println("stack end");
		}

		m3();
	}

	public void m3() {
		System.out.println("m3");
	}
}
