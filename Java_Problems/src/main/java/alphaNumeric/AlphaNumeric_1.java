package alphaNumeric;

import java.util.Arrays;

public class AlphaNumeric_1 {

	public static void main(String[] args) {

		// 1) Input is aBcA1bC2 output should be abcABC12

		String input = "aBcA1bC2";
		String Output = caseAlphaNum(input);
		System.out.println(Output); // abcABC12

	}

	private static String caseAlphaNum(String s) {
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
 */