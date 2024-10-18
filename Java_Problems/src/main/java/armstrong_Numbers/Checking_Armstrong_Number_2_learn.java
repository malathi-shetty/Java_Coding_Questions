package armstrong_Numbers;

public class Checking_Armstrong_Number_2_learn {

	public static void main(String[] args) {

		int num = 153;// It is the number to check Armstrong
		int sum = 0; // sum will hold the sum of the cubes of the digits.
		int lastDigit, temp = num; // Temporary variable to hold the original number

		while (num > 0) {
			lastDigit = num % 10; // Get the last digit
			num = num / 10; // Remove the last digit from num using integer division
			sum += (lastDigit * lastDigit * lastDigit); // Sum the cubes of the digits
		}

		// Check if the original number and the calculated sum are equal
		if (temp == sum) { // After the loop, the program checks if the original number (temp) is equal to
							// the calculated sum
			System.out.println(temp + " is an Armstrong number.");
		} else {
			System.out.println(temp + " is not an Armstrong number.");
		}

		// sc.close(); // Close the scanner to prevent resource leaks
	}

}

//Armstrong number is a number that is equal to the sum of cubes of its digits.
// 153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number to check if it is an Armstrong number: ");
// int num = sc.nextInt(); // User input for the number to check

/*
 * Input:
 * 
 * Read a number (num) to check if it is an Armstrong number.
 * 
 * Initialize Variables:
 * 
 * Set sum to 0.
 * 
 * Create a temporary variable temp and assign it the value of num.
 * 
 * Process the Number:
 * 
 * While num is greater than 0:
 * 
 * Get the last digit of num by calculating lastDigit = num % 10.
 * 
 * Remove the last digit from num by updating num to num / 10.
 * 
 * Add the cube of lastDigit to sum: sum += (lastDigit * lastDigit * lastDigit).
 * 
 * Check Result:
 * 
 * If temp is equal to sum, then:
 * 
 * Print that temp is an Armstrong number.
 * 
 * Else:
 * 
 * Print that temp is not an Armstrong number.
 * 
 * 
 * Example for Number 153:
 * 
 * Input: num = 153
 * 
 * Process:
 * 
 * Last digit: 3, Remaining: 15, Sum: 27
 * 
 * Last digit: 5, Remaining: 1, Sum: 27 + 125 = 152
 * 
 * Last digit: 1, Remaining: 0, Sum: 152 + 1 = 153
 * 
 * Check: 153 == 153, so it is an Armstrong number.
 * 
 */