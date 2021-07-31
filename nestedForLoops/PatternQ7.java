package nestedForLoops;

import java.util.Scanner;

public class PatternQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, num = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			System.out.print(num + " ");
			for (int k = 2; k <= a; k++) {
				System.out.print(0 + " ");
			}
			if(i<=1) {
				System.out.print(" ");
			}
			else {
			for (int l = i; l <= i; l++) {
				System.out.print(num + " ");
			}}
			a = a + 2;
			System.out.println();
			num++;
		}

	}

}
