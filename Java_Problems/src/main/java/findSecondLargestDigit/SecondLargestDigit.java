package findSecondLargestDigit;

public class SecondLargestDigit {

	public static void main(String[] args) {
		// Second Largest Digit in a String:
		// For example, if the input is "str1025rts", you need to find and return the
		// digit 2.

		String input = "str1025rts";
		System.out.println("Second largest digit: " + findSecondLargestDigit(input));

	}

	public static int findSecondLargestDigit(String input) {
		// Create a variable to hold the largest and second largest digits.
		int largest = -1;
		int secondLargest = -1;

		// Iterate through each character of the string
		for (int i = 0; i < input.length(); i++) {
			// Check if the character is a digit
			if (Character.isDigit(input.charAt(i))) {
				// Get the digit as an integer
				int digit = Character.getNumericValue(input.charAt(i));

				// Update largest and second largest digits accordingly
				if (digit > largest) {
					secondLargest = largest;
					largest = digit;
				} else if (digit > secondLargest && digit < largest) {
					secondLargest = digit;
				}
			}
		}

		// Return the second largest digit
		return secondLargest;
	}

}

/*
 * 
 * Class and Method Declaration:
 * 
 * We define a public class called SecondLargestDigit. This is the container for
 * our code.
 * 
 * Inside the class, there's the main() method which is the entry point for the
 * program. This is where the program starts execution.
 * 
 * public static void main(String[] args) {
 * 
 * String input = "str1025rts";
 * 
 * System.out.println("Second largest digit: " + findSecondLargestDigit(input));
 * 
 * }
 * 
 * In main(), we initialize the input string "str1025rts".
 * 
 * Then, we call the method findSecondLargestDigit(input) to get the second
 * largest digit from the string and print the result.
 * 
 * Method to Find the Second Largest Digit: The method
 * findSecondLargestDigit(String input) takes a string as input and returns the
 * second largest digit found in it.
 * 
 * public static int findSecondLargestDigit(String input) {
 * 
 * int largest = -1, secondLargest = -1;
 * 
 * We initialize two integer variables:
 * 
 * largest is initially set to -1 (since all digits are non-negative, this
 * ensures that any digit in the string will be larger).
 * 
 * secondLargest is also set to -1 initially. These variables will hold the
 * largest and second largest digits as we process the string.
 * 
 * Iterating Over the String:
 * 
 * for (int i = 0; i < input.length(); i++) {
 * 
 * if (Character.isDigit(input.charAt(i))) {
 * 
 * int digit = Character.getNumericValue(input.charAt(i));
 * 
 * We loop through each character of the input string using a for loop (i goes
 * from 0 to the length of the string).
 * 
 * We use input.charAt(i) to get the character at index i.
 * 
 * Character.isDigit() checks if the character is a digit (i.e., a number from 0
 * to 9).
 * 
 * If the character is a digit, we convert it to an integer using
 * Character.getNumericValue().
 * 
 * Updating the Largest and Second Largest Digits:
 * 
 * if (digit > largest) {
 * 
 * secondLargest = largest;
 * 
 * largest = digit;
 * 
 * } else if (digit > secondLargest && digit < largest) {
 * 
 * secondLargest = digit;
 * 
 * }
 * 
 * Now that we have a valid digit, we need to update the values of largest and
 * secondLargest.
 * 
 * First condition (digit > largest):
 * 
 * If the current digit is larger than largest, we update secondLargest to hold
 * the previous largest, and then we update largest to the current digit.
 * 
 * Second condition (digit > secondLargest && digit < largest):
 * 
 * If the current digit is smaller than largest but still larger than
 * secondLargest, we update secondLargest to the current digit.
 * 
 * This ensures that after processing the string, largest holds the largest
 * digit and secondLargest holds the second largest digit found.
 * 
 * Returning the Result:
 * 
 * 
 * return secondLargest;
 * 
 * After the loop finishes processing all the characters in the string, we
 * return the value of secondLargest, which will be the second largest digit
 * found in the string.
 * 
 * Edge Cases:
 * 
 * If the string doesn't contain any digits or if there aren't enough distinct
 * digits to determine the second largest, secondLargest will still be -1. You
 * could improve the code by adding additional checks or returning a special
 * value (like -1 or -1 as an error signal) in such cases.
 * 
 * Example: string "str1025rts":
 * 
 * Characters in the string are processed as follows:
 * 
 * s, t, r: These are non-digit characters, so we skip them.
 * 
 * 1: It's a digit. So, we update largest = 1, secondLargest = -1.
 * 
 * 0: It's a digit. Since 0 is smaller than 1, we update secondLargest = 0 (no
 * change to largest).
 * 
 * 2: It's a digit. 2 is larger than 1, so we update largest = 2, secondLargest
 * = 1.
 * 
 * 5: It's a digit. 5 is larger than 2, so we update largest = 5, secondLargest
 * = 2.
 * 
 * r, t, s: These are non-digit characters, so we skip them.
 * 
 * At the end, the secondLargest digit is 2.
 * 
 */
