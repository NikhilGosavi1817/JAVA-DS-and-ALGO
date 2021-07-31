package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 18, b = 10, c = 12;
		int result;
		
		if (a > b) {
			if (a > c) {
				result = a;
			}
			else {
				result = c;
			}
		}
		else {
			if (b > c) {
				result = b;
			}
			else {
				result = c;
			}
		}
		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println("max of 3 nos is "+result);

	}

}
