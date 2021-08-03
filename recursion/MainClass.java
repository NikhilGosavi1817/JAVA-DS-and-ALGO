package recursion;

public class MainClass {

	public static void main(String[] args) {

		System.out.println(sum(1));
		System.out.println(pow(3, 10000));
		System.out.println(fastPow(3, 10000));
		System.out.println(path(3, 3));
	}

	static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);
	}

	static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * pow(a, b - 1);
	}

	static int fastPow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b % 2 == 0) {
			return fastPow(a * a, b / 2);
		}
		return a * fastPow(a, b - 1);
	}

	static int path(int m, int n) {
		if (n == 1 || m == 1) {
			return 1;
		}
		return path(m, n - 1) + path(m - 1, n);
	}

}
