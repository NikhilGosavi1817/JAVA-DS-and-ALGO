package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		float result = 0;

		for (float i = 1; i <= n; i++) {
			result = result + 1 / i;
		}
		System.out.println(result);

		int m = sc.nextInt();

		float ans = 0;

		for (float j = 1; j <= m; j++) {
			if (j % 2 == 0) {
				ans = ans - 1 / j;
			} else {
				ans = ans + 1 / j;
			}

		}
		System.out.println(ans);
	}
}
