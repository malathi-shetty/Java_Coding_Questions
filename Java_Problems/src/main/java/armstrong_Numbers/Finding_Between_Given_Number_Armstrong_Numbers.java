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
				// sum = sum + Math.pow(digit, 3);
				sum += (digit * digit * digit);
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
 * 153: Digits: 1, 5, 3 Calculation: 1^3 + 5^3 +3^3 = 1+125+27=153 370: Digits:
 * 3, 7, 0 Calculation: 3^3 +7^3 +0^3 = 27+343+0=370 371: Digits: 3, 7, 1
 * Calculation: 3^3 + 7^3 + 1^3 = 27+343+1=371 407: Digits: 4, 0, 7 Calculation:
 * 4^3 + 0^3 + 7^3 = 64+0+343=407
 * 
 * *******
 * 
 * Range Definition:
 * 
 * Two variables, start and end, are initialized to 100 and 999, respectively.
 * This specifies that the program will check all three-digit numbers.
 * 
 * Loop Through the Range:
 * 
 * A for loop iterates over each number i from start to end (100 to 999).
 * 
 * Processing Each Number:
 * 
 * Inside the loop, the current number i is assigned to the variable num for
 * processing.
 * 
 * A sum variable is initialized to zero to accumulate the sum of the cubes of
 * the digits.
 * 
 * Calculating the Sum of Cubes:
 * 
 * A while loop continues as long as num is not zero:
 * 
 * The last digit of num is obtained using num % 10.
 * 
 * Instead of using Math.pow(digit, 3), the code now calculates the cube of the
 * digit manually by multiplying the digit by itself three times: digit * digit
 * * digit, and adds this to sum.
 * 
 * The last digit is then removed from num using integer division by 10 (num =
 * num / 10).
 * 
 * Check for Armstrong Condition:
 * 
 * After computing the sum of the cubes of the digits, the program checks if
 * this sum is equal to the original number i.
 * 
 * If they are equal, the number i is printed as it is an Armstrong number.
 * 
 * 
 */