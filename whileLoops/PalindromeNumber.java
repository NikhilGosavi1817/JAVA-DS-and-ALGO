package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = n;
		int reverse = 0;

		while (temp > 0) {
			int lastDigit = temp % 10;
			temp = temp / 10;
			reverse = reverse * 10 + lastDigit;
		}
		if (reverse == n) {
			System.out.println(reverse + " is palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}

	}

}
