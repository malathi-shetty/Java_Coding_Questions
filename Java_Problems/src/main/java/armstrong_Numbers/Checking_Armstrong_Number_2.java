package armstrong_Numbers;

import java.util.Scanner;

public class Checking_Armstrong_Number_2 {

	public static void main(String[] args) {
		//Armstrong number is a number that is equal to the sum of cubes of its digits.
		// 153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153

		// Scanner sc = new Scanner(System.in);
	      //  System.out.print("Enter a number to check if it is an Armstrong number: ");
	     //   int num = sc.nextInt(); // User input for the number to check
		
		int num = 153;// It is the number to check Armstrong
	        int sum = 0, lastDigit, temp = num; // Temporary variable to hold the original number

	        while (num > 0) {
	            lastDigit = num % 10; // Get the last digit
	            num = num / 10; // Remove the last digit
	            sum += (lastDigit * lastDigit * lastDigit); // Sum the cubes of the digits
	        }

	        // Check if the original number and the calculated sum are equal
	        if (temp == sum) {
	            System.out.println(temp + " is an Armstrong number.");
	        } else {
	            System.out.println(temp + " is not an Armstrong number.");
	        }

	     //   sc.close(); // Close the scanner to prevent resource leaks
	}

}
