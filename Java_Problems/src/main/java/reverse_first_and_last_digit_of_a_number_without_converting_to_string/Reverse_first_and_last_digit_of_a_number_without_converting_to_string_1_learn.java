package reverse_first_and_last_digit_of_a_number_without_converting_to_string;

public class Reverse_first_and_last_digit_of_a_number_without_converting_to_string_1_learn {

	public static int swapFirstLast(int num) {

		// Handle single digit number (positive or negative)
		if (num < 10 && num > -10) {
			return num; // No swapping needed for single digit numbers
		}

		boolean isNegative = num < 0; // Check if the number is negative
		if (isNegative) {
			num = -num; // Convert to positive for manipulation
		}

		int lastDigit = num % 10; // Extract last digit
		int temp = num;
		int count = 0;
		int firstDigit = 0;

		// Find the first digit and count the number of digits
		while (temp >= 10) {
			firstDigit = temp;
			temp /= 10;
			count++;
		}
		firstDigit = temp;
		count++; // Total number of digits

		// Remove first and last digit from the original number
		int middlePart = num % (int) Math.pow(10, count - 1); // Remove first digit
		middlePart /= 10; // Remove last digit

		// Construct new number with swapped first and last digits
		int newNum = lastDigit * (int) Math.pow(10, count - 1) + middlePart * 10 + firstDigit;
		// If the number was negative, reapply the negative sign
		if (isNegative) {
			newNum = -newNum;
		}

		return newNum;
	}

	public static void main(String[] args) {

		// int num = 12345;
		int num = -12345; // Test with a negative number

		// int num = 34567;
		// int num = 121;
		// int num = 987654321;
		// int num = 100;
		// int num = 23;
		// int num = 7;
		// int num = -5;
		System.out.println("Number before swapping first and last digit: " + num);

		int swappedNum = swapFirstLast(num);
		System.out.println("Number after swapping first and last digit: " + swappedNum);

	}

}

/*
 * 
 * This Java program swaps the first and last digits of a number without
 * converting it to a string. 
 * 
 * 1. swapFirstLast(int num) Method:
 * 
 * Step 1: Check for Single-Digit Numbers
 * 
 * if (num < 10 && num > -10) {
 * 
 * return num; // No swapping needed for single-digit numbers
 * 
 * }
 * 
 * The program first checks if the number is a single digit (between -9 and 9).
 * If it is, no swapping is necessary, and the number is returned as is.
 * 
 * Step 2: Handle Negative Numbers
 * 
 * boolean isNegative = num < 0;
 * 
 * if (isNegative) {
 * 
 * 
 * num = -num; // Convert to positive for manipulation
 * 
 * }
 * 
 * If the number is negative, a flag (isNegative) is set to true, and the number
 * is converted to a positive value to simplify the manipulation of digits.
 * 
 * Step 3: Extract the Last Digit
 * 
 * int lastDigit = num % 10; // Extract last digit
 * 
 * The last digit of the number is extracted using the modulo operation (num %
 * 10). This gives the remainder when dividing the number by 10, which is the
 * last digit.
 * 
 * Step 4: Find the First Digit and Count the Number of Digits
 * 
 * int temp = num;
 * 
 * int count = 0;
 * 
 * int firstDigit = 0;
 * 
 * while (temp >= 10) {
 * 
 * firstDigit = temp;
 * 
 * temp /= 10;
 * 
 * count++;
 * 
 * }
 * 
 * firstDigit = temp;
 * 
 * count++; // Total number of digits
 * 
 * A while loop is used to repeatedly divide the number (temp) by 10, stripping
 * off the last digit each time, until only the first digit remains.
 * 
 * The count variable keeps track of the number of digits in the number by
 * incrementing for each division by 10.
 * 
 * Step 5: Remove the First and Last Digit from the Number
 * 
 * int middlePart = num % (int) Math.pow(10, count - 1); // Remove first digit
 * 
 * middlePart /= 10; // Remove last digit
 * 
 * To remove the first digit, the number is divided by 10 raised to the power of
 * count - 1 (i.e., the number of digits minus one). This gives the part of the
 * number excluding the first digit.
 * 
 * Then, the last digit is removed by dividing the remaining number by 10.
 * 
 * Step 6: Reconstruct the New Number with Swapped Digits
 * 
 * int newNum = lastDigit * (int) Math.pow(10, count - 1) + middlePart * 10 +
 * firstDigit;
 * 
 * The new number is reconstructed by:
 * 
 * Placing the lastDigit in the most significant place, which is the leftmost
 * position (multiplied by 10^(count-1)).
 * 
 * Placing the middlePart (the remaining digits) in the middle, shifting it one
 * place to the left by multiplying by 10.
 * 
 * Placing the firstDigit in the least significant place (the ones place).
 * 
 * Step 7: Reapply the Negative Sign (if the number was negative)
 * 
 * if (isNegative) {
 * 
 * newNum = -newNum;
 * 
 * }
 * 
 * If the original number was negative, the negative sign is reapplied by
 * multiplying the new number by -1.
 * 
 * Step 8: Return the New Number
 * 
 * return newNum;
 * 
 * Finally, the reconstructed number with the first and last digits swapped is
 * returned.
 * 
 * 2. main(String[] args) Method:
 * 
 * public static void main(String[] args) { int num = -12345; // Test with a
 * negative number
 * 
 * System.out.println("Number before swapping first and last digit: " + num);
 * 
 * int swappedNum = swapFirstLast(num);
 * 
 * System.out.println("Number after swapping first and last digit: " +
 * swappedNum);
 * 
 * }
 * 
 * The program starts by defining a test number, num (in this case, -12345).
 * 
 * It prints the number before swapping the digits.
 * 
 * The swapFirstLast(num) method is called to perform the swap, and the
 * resulting number is printed.
 * 
 * Example:
 * 
 * For the input -12345:
 * 
 * Extracting Digits:
 * 
 * lastDigit = 5
 * 
 * firstDigit = 1
 * 
 * middlePart = 234 (the number with the first and last digits removed)
 * 
 * Reconstructing the Number:
 * 
 * newNum = lastDigit * 10^(5-1) + middlePart * 10 + firstDigit
 * 
 * newNum = 5 * 10000 + 234 * 10 + 1
 * 
 * newNum = 50000 + 2340 + 1 = 52341
 * 
 * Negative Sign Reapplied:
 * 
 * Since the original number was negative, the result is -52341.
 * 
 * Key Concepts and Explanation:
 * 
 * Modulo and Division:
 * 
 * The modulo (%) operation is used to extract digits from the number, while
 * division by 10 removes digits from the end.
 * 
 * Digit Counting:
 * 
 * The program counts the number of digits in the number to understand the
 * magnitude of the number and calculate the correct place values for
 * constructing the new number.
 * 
 * Handling Negative Numbers:
 * 
 * Negative numbers are converted to positive for easier manipulation and then
 * converted back to negative if needed.
 * 
 * Mathematical Rebuilding:
 * 
 * The new number is built using mathematical operations (Math.pow(10, n)) to
 * correctly place the first and last digits in the new positions.
 * 
 * Summary:
 * 
 * This program efficiently swaps the first and last digits of a number without
 * converting it to a string. It handles both negative and positive numbers, and
 * even single-digit numbers, ensuring the result is correct by manipulating the
 * number mathematically.
 * 
 * 
 */
