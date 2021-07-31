package nestedForLoops;

import java.util.Scanner;

public class PatternQ6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1, num=1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= a; k++) {
				System.out.print(num+" ");
				num++;
			}
			a=a+2;
			System.out.println();
			num=1;
		}

	}

}
