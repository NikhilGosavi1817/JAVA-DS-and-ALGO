package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of 1st array: ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();

		System.out.println("Enter the dimensions of 2nd array: ");
		int rows2 = sc.nextInt();
		int columns2 = sc.nextInt();

		int a[][] = new int[rows][columns];
		int b[][] = new int[rows2][columns2];
		if (columns == rows2) {
			System.out.println("Enter the array a: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println("Enter the array b: ");
			for (int i = 0; i < rows2; i++) {
				for (int j = 0; j < columns2; j++) {
					b[i][j] = sc.nextInt();
				}
			}

			int c[][] = new int[rows][columns2];

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns2; j++) {
					for (int k = 0; k < columns; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}

			System.out.println("Addition of two arrys is c:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns2; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		} else { 
			System.out.println("columns of array a is not equal to rows of array b");
		}
	}
}
