package armstrong_Numbers;

public class Finding_Between_Given_Number_Armstrong_Numbers {

	public static void main(String[] args) {
		// also known as narcissistic numbers
		// An Armstrong number for a given number of digits is a number
		// that is equal to the sum of its own digits each raised to the power of the
		// number of digits.

		int start = 100, end = 999; // the loop iterates over all 3-digit numbers.

		for (int i = start; i <= end; i++) {
			int num = i;
			double sum = 0;
			while (num != 0) {
				int digit = num % 10;
				sum = sum + Math.pow(digit, 3);
				num = num / 10;
			}
			if (sum == i) {
				System.out.println(i + " ");
			}
		}
	}
}
/**
 * Math.pow(digit, 3) calculates the cube of the digit. Since we're working with
 * 3-digit numbers, we raise each digit to the power of 3. The sum accumulates
 * these cubes. num is then divided by 10 (integer division) to remove the last
 * digit, reducing the number until it becomes 0.
 * 
 * 
 * Each of these numbers equals the sum of its own digits each raised to the
 * power of 3. The code identifies these numbers by:
 * 
 * Looping through each number in the range. Calculating the sum of the cubes of
 * its digits. Comparing this sum to the original number. Printing the number if
 * it matches the sum. The process ensures that only the Armstrong numbers are
 * printed as output.
 * 
 * The output numbers (153, 370, 371, and 407) are the Armstrong numbers within
 * the range of 100 to 999.
 * 
 * 153: Digits: 1, 5, 3 Calculation: 1^3 + 5^3 +3^3  = 1+125+27=153 
 * 370: Digits: 3, 7, 0 Calculation: 3^3 +7^3 +0^3   = 27+343+0=370
 * 371: Digits: 3, 7, 1 Calculation: 3^3 + 7^3 + 1^3 = 27+343+1=371
 * 407: Digits: 4, 0, 7 Calculation: 4^3 + 0^3 + 7^3 = 64+0+343=407
 * 
 */