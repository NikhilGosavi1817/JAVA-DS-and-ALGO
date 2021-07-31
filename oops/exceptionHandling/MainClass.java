package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
//		try {
//			int a = 8, b = 0;
//
//			int c = a / b;
//
//			int a[] = new int[5];
//			System.out.println(a[6]);
//
//			System.out.println(c);
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage() + " exception occurred in code");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage() + " exception occurred in code");
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage() + " exception occurred in code");
//		} finally {
//			System.out.println("sorry");
//		}
//
//		System.out.println("very important");

		fun1();
	}

	static void fun1() {
		int a = 8, b = 5;
		int c = a / b;
		System.out.println(c);
		
//		boolean isDanger=true;
//		if (isDanger) {
//			throw new ArrayIndexOutOfBoundsException("danger was coming");
//		}
		try {
			
		Thread.sleep(300);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger=true;
		if (isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger was coming");
		}
	}
}
