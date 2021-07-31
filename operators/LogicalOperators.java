package operators;

public class LogicalOperators {

	public static void main(String[] args) {

		int no = 36;
		
		if (no >= 1 && no <= 100) {
			System.out.println("Number lies in the range");
		}

		int grade = 11;

		if (!(grade == 10 || grade == 12)) {
			System.out.println("You cannot give board exams");
		}

	}

}
