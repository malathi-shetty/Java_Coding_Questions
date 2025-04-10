package SwapFirstLastDigit_of_a_number;

public class SwapFirstLastDigit_2_Using_StringManipulation {

	public static void main(String[] args) {
		// Test cases
		int num = -12345; // Test with a negative number
		// You can change the test case below for testing other numbers
		// int num = 12345;
		// int num = 34567;
		// int num = 121;
		// int num = 987654321;
		// int num = 100;
		// int num = 23;
		// int num = 7;
		// int num = -5;

		System.out.println("num: " + num);
		int result = reverseFirstAndLastDigit(num);
		System.out.println("Result: " + result); // Expected Output: -52341 (for input -12345)
	}

	public static int reverseFirstAndLastDigit(int num) {
		// Handle the case for single-digit numbers
		if (num < 10 && num > -10) {
			return num; // No change needed for single-digit numbers
		}

		// Handle the negative number case
		boolean isNegative = num < 0;

		// If the number is negative, make it positive for easier manipulation
		if (isNegative) {
			num = -num;
		}

		// Convert number to string for easier manipulation
		String numStr = Integer.toString(num);

		// Get the first and last digits
		char firstDigit = numStr.charAt(0);
		char lastDigit = numStr.charAt(numStr.length() - 1);

		// Swap the first and last digits
		StringBuilder newobj = new StringBuilder(numStr);
		newobj.setCharAt(0, lastDigit);
		newobj.setCharAt(numStr.length() - 1, firstDigit);

		// Convert the swapped string back to an integer
		int swappedNum = Integer.parseInt(newobj.toString());

		// If the original number was negative, apply the negative sign back
		if (isNegative) {
			swappedNum = -swappedNum;
		}

		return swappedNum;
	}

}

/*output:
 * 
 * num: -12345
Result: -52341
 */

/*
 * 
 * 
 * This Java code is designed to reverse the first and last digits of an
 * integer, without converting the entire number to a string in order to
 * manipulate it directly.
 * 
 * 1. Main Method:
 * 
 * public static void main(String[] args) {
 * 
 * int num = -12345; // Test with a negative number
 * 
 * int result = reverseFirstAndLastDigit(num);
 * 
 * System.out.println("Result: " + result); // Expected Output: -52341 (for
 * input -12345)
 * 
 * }
 * 
 * num is initialized as -12345 to test the functionality. You can change the
 * value of num to test with different numbers.
 * 
 * The reverseFirstAndLastDigit(num) method is called to reverse the first and
 * last digits.
 * 
 * The result is printed using System.out.println.
 * 
 * 2. The reverseFirstAndLastDigit Method:
 * 
 * public static int reverseFirstAndLastDigit(int num) {
 * 
 * if (num < 10 && num > -10) {
 * 
 * return num; // No change needed for single-digit numbers
 * 
 * }
 * 
 * Single-Digit Case:
 * 
 * If num is a single-digit number (i.e., it’s between -9 and 9), no change is
 * needed, so the method returns num directly.
 * 
 * 3. Handling Negative Numbers:
 * 
 * boolean isNegative = num < 0;
 * 
 * if (isNegative) {
 * 
 * num = -num; // Make the number positive for easier manipulation
 * 
 * }
 * 
 * Negative Number Check:
 * 
 * If num is negative, a flag (isNegative) is set to true.
 * 
 * The number is then converted to a positive value by using num = -num, which
 * simplifies the manipulation of the digits. We'll later apply the negative
 * sign back if needed.
 * 
 * 4. Converting the Number to a String:
 * 
 * String numStr = Integer.toString(num);
 * 
 * String Conversion:
 * 
 * The number num (now positive) is converted to a string (numStr). This allows
 * easier manipulation of individual digits.
 * 
 * 5. Extracting the First and Last Digits:
 * 
 * char firstDigit = numStr.charAt(0);
 * 
 * char lastDigit = numStr.charAt(numStr.length() - 1);
 * 
 * First and Last Digits:
 * 
 * The first digit is extracted using charAt(0), which gives the character at
 * the first position of the string.
 * 
 * The last digit is extracted using charAt(numStr.length() - 1), which gives
 * the character at the last position.
 * 
 * 6. Swapping the First and Last Digits:
 * 
 * StringBuilder newobj = new StringBuilder(numStr);
 * 
 * newobj.setCharAt(0, lastDigit);
 * 
 * newobj.setCharAt(numStr.length() - 1, firstDigit);
 * 
 * StringBuilder for Modification:
 * 
 * A StringBuilder is created from numStr, as it allows mutable operations
 * (changing characters) while a String is immutable.
 * 
 * The characters at the first and last positions are swapped using the
 * setCharAt method.
 * 
 * 7. Converting the Modified String Back to an Integer:
 * 
 * int swappedNum = Integer.parseInt(newobj.toString());
 * 
 * Parsing to Integer:
 * 
 * The modified string (with swapped digits) is converted back to an integer
 * using Integer.parseInt().
 * 
 * 8. Reapplying the Negative Sign if Needed:
 * 
 * if (isNegative) {
 * 
 * swappedNum = -swappedNum;
 * 
 * }
 * 
 * If the original number was negative, the negative sign is reapplied by
 * multiplying the swappedNum by -1.
 * 
 * 9. Returning the Result:
 * 
 * return swappedNum;
 * 
 * }
 * 
 * The final result, with the first and last digits swapped (and negative sign
 * reapplied if the number was originally negative), is returned.
 * 
 * Key Points:
 * 
 * The program works with both negative and positive numbers.
 * 
 * Single-digit numbers remain unchanged.
 * 
 * The approach uses string manipulation (StringBuilder) to swap the digits, but
 * only the first and last digits are swapped, not the entire number.
 * 
 * 
 * 
 * 
 */