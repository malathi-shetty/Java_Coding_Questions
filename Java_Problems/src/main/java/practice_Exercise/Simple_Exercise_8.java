package practice_Exercise;

public class Simple_Exercise_8 {

	public static void main(String[] args) {
		int number = 12345;
		int sum = String.valueOf(number).chars().map(Character::getNumericValue).filter(n -> n % 2 != 0).sum();
		System.out.println("Sum of digits: " + sum);
	}

}

/*
 * "Convert the Number" to a string for easy digit extraction.
 * 
 * The integer 12345 is converted to the string "12345"
 *
 * String.valueOf(number).chars() "Characters Stream" - Convert the string to a
 * stream of character codes.
 * 
 * String.valueOf(number) gives "12345", and .chars() creates a stream of
 * integer values representing the character codes of these digits.
 * 
 * .map(Character::getNumericValue)
 * 
 * "Map to Numeric" - Transform each character code to its digit value.
 * 
 * Character::getNumericValue converts each character code (e.g., 49 for '1', 50
 * for '2') to its respective digit (e.g., 1, 2).
 * 
 * .filter(n -> n % 2 != 0) "Filter Odd" - Keep only the odd digits.
 * 
 * n % 2 != 0 filters out even digits, leaving only odd ones (e.g., 1, 3, 5).
 * 
 * .sum(); "Sum Up" - Calculate the sum of the odd digits.
 * 
 * .sum() adds up all the remaining odd digits.
 * 
 * System.out.println("Sum of digits: " + sum); prints the total sum of the odd
 * digits.
 * 
 * 
 * Convert the Number to a string. --> String.valueOf(number) - This converts
 * the integer 12345 to the string "12345".
 * 
 * Characters Stream: Get a stream of character codes. --> .chars() This method
 * returns an IntStream of the ASCII values of the characters in the string. For
 * "12345", the stream would have values 49, 50, 51, 52, 53.
 * 
 * Map to Numeric: Convert codes to digits. --> .map(Character::getNumericValue)
 * 
 * Character::getNumericValue takes each ASCII value and converts it back to the
 * corresponding digit:
 * 
 * 49 (ASCII for '1') → 1
 * 
 * 50 (ASCII for '2') → 2
 * 
 * 51 (ASCII for '3') → 3
 * 
 * 52 (ASCII for '4') → 4
 * 
 * 53 (ASCII for '5') → 5
 * 
 * So the stream now contains 1, 2, 3, 4, 5.
 * 
 * Filter Odd: Keep only odd digits. --> .filter(n -> n % 2 != 0) This keeps
 * only the odd digits (1, 3, 5).
 * 
 * Sum Up: Calculate the sum of these odd digits. --> .sum()
 * 
 * Adds these filtered digits together to get 1 + 3 + 5 = 9.
 * 
 * Print the Sum: Display the result.
 * 
 * In the given code snippet, for the number 12345, the odd digits are 1, 3, and
 * 5.
 * 
 * Their sum is 1 + 3 + 5 = 9, so the output is Sum of digits: 9.
 * 
 * 
 * For the number 12345:
 * 
 * Convert 12345 to "12345". The stream of characters is 49, 50, 51, 52, 53.
 * Convert to digits: 1, 2, 3, 4, 5. Filter odd digits: 1, 3, 5. Sum them: 1 + 3
 * + 5 = 9. So the final output is Sum of digits: 9.
 * 
 */