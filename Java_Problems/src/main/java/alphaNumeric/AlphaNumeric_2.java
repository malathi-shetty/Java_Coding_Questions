package alphaNumeric;

import java.util.Arrays;

public class AlphaNumeric_2 {

	public static void main(String[] args) {
		// Input is aBcA1bC2 output should be abcABC12
		String input = "aBcA1bC2";
		String output = caseAlphaNum(input);
		System.out.println(output); // Expected Output: abcABC12
	}

	public static String caseAlphaNum(String s) {
		String lowerCase = "";
		String upperCase = "";
		String digits = "";

		// Collect lowercase, uppercase, and digits separately
		for (char ch : s.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowerCase = lowerCase + ch; // Collect lowercase
			}
		}

		for (char ch : s.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				upperCase = upperCase + ch; // Collect uppercase
			}
		}

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				digits = digits + ch; // Collect digits
			}
		}

		// Sort each part
		char[] lowerArray = lowerCase.toCharArray();
		char[] upperArray = upperCase.toCharArray();
		char[] digitArray = digits.toCharArray();

		Arrays.sort(lowerArray);
		Arrays.sort(upperArray);
		Arrays.sort(digitArray);

		// Build the final result in correct order
		StringBuilder finalResult = new StringBuilder();
		finalResult.append(lowerArray); // Append sorted lowercase
		finalResult.append(upperArray); // Append sorted uppercase
		finalResult.append(digitArray); // Append sorted digits

		return finalResult.toString(); // Return final result
	}
}