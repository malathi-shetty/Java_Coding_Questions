package alphaNumeric;

import java.util.Arrays;

public class AlphaNumeric_1_learn {

	public static void main(String[] args) {

		// 1) Input is aBcA1bC2 output should be abcABC12

		String input = "aBcA1bC2";
		String Output = caseAlphaNum(input);
		System.out.println(Output); // abcABC12

	}

	public static String caseAlphaNum(String s) {
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();
		StringBuilder digits = new StringBuilder();

		for (char ch : s.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowerCase.append(ch);
			} else if (Character.isUpperCase(ch)) {
				upperCase.append(ch);
			} else if (Character.isDigit(ch)) {
				digits.append(ch);
			}
		}

		// Convert to char Arrays, sort, and convert back to strings

		char[] lc = lowerCase.toString().toCharArray();
		char[] uc = upperCase.toString().toCharArray();

		Arrays.sort(lc);
		Arrays.sort(uc);

		return new String(lc) + new String(uc) + digits.toString();
	}
}

/*
 * 
 * Sorting: After collecting lowercase and uppercase characters, the code
 * converts them to character arrays, sorts them, and then converts them back to
 * strings.
 * 
 * Final Concatenation: Finally, it concatenates the sorted lowercase letters,
 * sorted uppercase letters, and the original digits.
 * 
 * This Java program takes an input string that contain mixed case letters
 * and digits and transforms it into a specific output format. Here's a
 * breakdown of how it works:
 * 
 * Program Overview:
 * 
 * Input: The program processes a string, such as aBcA1bC2.
 * 
 * Output: It produces a string where all lowercase letters appear first (in
 * sorted order), followed by uppercase letters (also in sorted order), and then
 * the digits in the order they appear. For the given input, the output will be
 * abcABC12.
 * 
 ********* Main Components: *********
 * 
 * 1. main Method
 * 
 * This is the entry point of the program.
 * 
 * It initializes a string input with the value "aBcA1bC2".
 * 
 * It calls the caseAlphaNum method to process the string and store the result
 * in Output.
 * 
 * Finally, it prints the output.
 * 
 * 2. caseAlphaNum Method
 * 
 * Parameters: It accepts a single string s.
 * 
 * Return Type: It returns a formatted string.
 * 
 * Steps in the Method:
 * 
 * StringBuilders: Three StringBuilder objects are created to hold lowercase
 * letters (lowerCase), uppercase letters (upperCase), and digits (digits).
 * 
 * Character Classification: The method iterates over each character in the
 * input string using a for-each loop.
 * 
 * It checks each character using:
 * 
 * Character.isLowerCase(ch): Adds it to lowerCase if it's a lowercase letter.
 * 
 * Character.isUpperCase(ch): Adds it to upperCase if it's an uppercase letter.
 * 
 * Character.isDigit(ch): Adds it to digits if it's a digit.
 * 
 * Sorting: The contents of the StringBuilder for lowercase and uppercase
 * characters are converted to character arrays (lc and uc).
 * 
 * These arrays are sorted using Arrays.sort().
 *
 * Final Concatenation: The method constructs the final output by concatenating
 * the sorted lowercase characters, sorted uppercase characters, and the
 * original digits, which are appended as they were collected.
 * 
 * Return Value: The resulting string is returned to the caller.
 * 
 * Summary In summary, this program systematically organizes a mixed string of
 * characters into a specified format, ensuring that lowercase letters come
 * first (sorted), followed by uppercase letters (sorted), and finally digits
 * (in their original order). The use of StringBuilder for efficient string
 * manipulation and sorting ensures that the output meets the requirements.
 * 
 */