package check_Leap_Year;

import java.util.Scanner;

public class Check_Leap_Year {

	public static void main(String[] args) {
		// Write a program to check whether the year is leap or not.
		
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Ask the user to enter a year
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		// Check whether the year is a leap year or not
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

		// Close the scanner object
		scanner.close();
	}

}

/*
 * 
 * The program checks if a given year is a leap year or not.
 * 
 * Leap Year Definition: A leap year is a year that has 366 days instead of the
 * usual 365 days. This happens every 4 years, but there are some exceptions:
 * 
 * A year is a leap year if it is divisible by 4.
 * 
 * However, if it is divisible by 100, it is not a leap year, unless it is also
 * divisible by 400.
 * 
 * Scanner scanner = new Scanner(System.in);
 * 
 * This creates a scanner that allows the program to read input from the user.
 * 
 * b) Prompting the User to Enter a Year:
 * 
 * System.out.print("Enter a year: ");
 * 
 * int year = scanner.nextInt();
 * 
 * The program asks the user to input a year, and it stores the user's input in
 * a variable called year.
 * 
 * c) Checking If the Year is a Leap Year:
 * 
 * if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
 * 
 * System.out.println(year + " is a leap year.");
 * 
 * } else {
 * 
 * System.out.println(year + " is not a leap year.");
 * 
 * }
 * 
 * The program checks if the entered year follows the rules for being a leap
 * year:
 * 
 * First condition: (year % 4 == 0 && year % 100 != 0)
 * 
 * This checks if the year is divisible by 4 but not divisible by 100. If this
 * is true, the year is a leap year.
 * 
 * Second condition: (year % 400 == 0)
 * 
 * If the year is divisible by 400, it is definitely a leap year.
 * 
 * If either of these conditions is true, the program prints that the year is a
 * leap year. Otherwise, it prints that the year is not a leap year.
 * 
 * d) Closing the Scanner:
 * 
 * scanner.close();
 * 
 * This closes the scanner when the program is done, which is good practice to
 * release system resources. 3. Example:
 * 
 * If the user inputs 2024, the program will check:
 * 
 * 2024 is divisible by 4, but not by 100.
 * 
 * So, 2024 is a leap year.
 * 
 * If the user inputs 1900, the program will check:
 * 
 * 1900 is divisible by 4 and by 100, but not by 400.
 * 
 * So, 1900 is not a leap year.
 * 
 * In Summary:
 * 
 * The program asks for a year.
 * 
 * It checks if that year is a leap year using a set of rules.
 * 
 * Then it prints whether the year is a leap year or not.
 * 
 * 
 */
