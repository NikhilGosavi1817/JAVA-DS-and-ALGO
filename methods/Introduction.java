package methods;

public class Introduction {

	public static void main(String[] args) {

		int firstNumber = 32;
		int secondNumber = 89;

		int result = maxOf(firstNumber, secondNumber);
		System.out.println(result);
		maxOf(3);
		sayHi();
	}

	static int maxOf(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}
	
	static void maxOf(float a) {
		System.out.println(a);
	}

}
