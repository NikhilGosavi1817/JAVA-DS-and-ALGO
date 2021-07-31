package loops;

public class ForLoops {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i = i + 1) {
			System.out.println("hello world " + i);
		}

		int sum = 0;
		int n = 5;
		for (int j = 1; j <= n; j++) {
			sum = sum + j;
		}
		System.out.println(sum);

		for (int k = 100; k >= 1; k--) {
			System.out.println(k);
		}

		int m = 8;
		for (int l = 1; l <= 10; l++) {
			System.out.println(m + " X " + l + " = " + m * l);
		}

		
	}

}
