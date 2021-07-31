package nestedForLoops;

import java.util.Scanner;

public class PatternQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int rows = 2 * n - 1;
		int a = 2;

		for (int i = 1; i <= rows; i++) {
			if (i <= n) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print("  ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 1; j <= n - i + a; j++) {
					System.out.print("  ");
				}
				for (int k = 1; k <= rows - i + 1; k++) {
					System.out.print("* ");
				}
				a=a+2;
			}
			System.out.println();
			
		}

	}

}
