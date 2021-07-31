package conditionalStatements;
import java.util.Scanner;
public class IfElseIfClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		if(no <= 10) {
			System.out.println("Number is less than or equal to 10");
		}
		else if(no > 10 && no <= 20) {
			System.out.println("Number lies between 10-20");
		}
		else if(no > 20 && no <= 30) {
			System.out.println("Number lies between 20-30");
		}
		else {
			System.out.println("Number is greater than 30");
		}
		
		int a = 20, b = 10;
		int c = a > b ? a : b;
		System.out.println("Max of both nos is " + c);
	}

}
