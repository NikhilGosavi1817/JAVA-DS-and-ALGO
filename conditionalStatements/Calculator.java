package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter the operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(operation) {
		case '+':
			result = a+b;
			System.out.println("Addition is "+ result);
			break;
		case '-':
			result = a-b;
			System.out.println("Subtraction is "+ result);
			break;
		case '*':
			result = a*b;
			System.out.println("Multiplication is "+ result);
			break;
		case '/':
			result = a/b;
			System.out.println("Division is "+ result);
			break;
		default:
			System.out.println("Invalid operation");
		}
	}

}
