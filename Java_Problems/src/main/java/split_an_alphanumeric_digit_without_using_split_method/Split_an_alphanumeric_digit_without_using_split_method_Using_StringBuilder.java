package split_an_alphanumeric_digit_without_using_split_method;

public class Split_an_alphanumeric_digit_without_using_split_method_Using_StringBuilder {

	public static void main(String[] args) {
		String input = "Welcome234To567Java89Programming0@#!!";
		StringBuilder letters = new StringBuilder();
		StringBuilder digits = new StringBuilder();
		StringBuilder specialChars = new StringBuilder();

		// Iterate through each character in the string
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			// Check if the character is a letter
			if (Character.isLetter(ch)) {
				letters.append(ch);
			}
			// Check if the character is a digit
			else if (Character.isDigit(ch)) {
				digits.append(ch);
			}
			// If it's neither, consider it a special character
			else {
				specialChars.append(ch);
			}
		}

		// Output the results
		System.out.println("Letters: " + letters.toString());
		System.out.println("Digits: " + digits.toString());
		System.out.println("Special Characters: " + specialChars.toString());

	}

}

/*
 * 
 * StringBuilder: We use StringBuilder to build our letter and digit strings
 * efficiently.
 * 
 * Loop through the string: We iterate through each character in the input
 * string.
 * 
 * Character Checks: We use Character.isLetter() to check for letters and
 * Character.isDigit() for digits.
 * 
 * If it's neither, consider it a special character - specialChars.append(ch);
 * 
 * Append Characters: Depending on the check, we append the character to the
 * respective StringBuilder.
 * 
 * Output: Finally, we print the collected letters and digits.
 * 
 */