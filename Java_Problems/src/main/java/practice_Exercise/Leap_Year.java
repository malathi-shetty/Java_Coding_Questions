package practice_Exercise;

import java.util.Scanner;

public class Leap_Year {
	//WAP to find whether a year entered by the user is a leap year or not?

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt user for input
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Check if the year is a leap year
	        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	        // Output the result
	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	}

}
