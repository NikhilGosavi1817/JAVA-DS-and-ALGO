package arrays;

import java.util.Scanner;

public class AverageOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Students: ");
		int n = sc.nextInt();
		int marks[] = new int[n];
		
		System.out.println("Enter the marks ");

		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}

		int average = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + marks[i];
		}
		average = sum / n;
		System.out.println("The Average is " + average);

	}

}
