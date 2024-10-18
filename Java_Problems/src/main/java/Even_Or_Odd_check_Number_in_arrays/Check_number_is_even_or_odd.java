package Even_Or_Odd_check_Number_in_arrays;

import java.util.Scanner;

public class Check_number_is_even_or_odd {

	public static void main(String[] args) {
		// write a program to determine if a number is even or odd

		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for a number
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Determine if the number is even or odd
		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}

		// Close the scanner
		scanner.close();
	}
}