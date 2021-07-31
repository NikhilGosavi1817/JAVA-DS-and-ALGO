package conditionalStatements;
import java.util.Scanner;
public class SwitchCaseStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int daysOfWeek = sc.nextInt();  

		switch (daysOfWeek) {
		case 1:
			System.out.println("Bicep, Tricep, Cardio");
			break;
		case 2:
			System.out.println("Chest, Shoulder, Abs");
			break;
		case 3:
			System.out.println("Back, Bicep, Cardio");
			break;
		case 4:
			System.out.println("Shoulder, Chest, Abs");
			break;
		case 5:
			System.out.println("Tricep, Back, Crossfit");
			break;
		case 6:
			System.out.println("Legs");
			break;
		case 7:
			System.out.println("Abs, Rest");
			break;
		default:
			System.out.println("Home Workout");
		}
		
		System.out.println("Enter rating");
		int rating = sc.nextInt();
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Rating is Bad");
			break;
		case 3:
			System.out.println("Rating is Average");
			break;
		case 4:
		case 5:
			System.out.println("Rating is Good");
			break;
		default:
			System.out.println("Rating is Invalid");
		}

	}

}
