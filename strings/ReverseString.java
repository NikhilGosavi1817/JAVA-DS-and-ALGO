package strings;

import java.util.Scanner;

public class ReverseString {
	public static String reverseSentence(String inputString) {
		int i = inputString.length() - 1;
		String outputstring = "";

		while (i >= 0) {
			while (i >= 0 && inputString.charAt(i) == ' ')
				i--;
			if (i < 0)
				break;
			int j = i;
			while (i >= 0 && inputString.charAt(i) != ' ')
				i--;

			if (outputstring.isEmpty()) {
				outputstring = outputstring.concat(inputString.substring(i + 1, j + 1));
			} else {
				outputstring = outputstring.concat(" " + inputString.substring(i + 1, j + 1));
			}
		}

		return outputstring;
	}

	public static void main(String[] args) {
//		String a = "I love Java, the coffee";
//		String b[] = a.split("\\s");
//		String c = "";
//
//		for (int i = b.length - 1; i >= 0; i--) {
//			c = c + b[i] + " ";
//		}
//
//		System.out.println(c);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Input String :");

		String inputString = sc.nextLine();

		String outputString = reverseSentence(inputString);

		System.out.println(outputString);
	}

}
