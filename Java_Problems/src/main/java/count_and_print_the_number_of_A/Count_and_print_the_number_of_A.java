package count_and_print_the_number_of_A;

import java.util.Scanner;

public class Count_and_print_the_number_of_A {

	public static void main(String[] args) {
		// write a program to count and print the number of 'A's in a given string java
		
		// counts and prints the number of occurrences of the letter 'A' (both uppercase and lowercase) in a given string.
		
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user for input
	        System.out.print("Enter a string: ");
	        String s = scanner.nextLine(); //Amazing apples are always available.
	        
	        // Call the method to count 'A's
	        int count = countA(s);
	        
	        // Print the result
	        System.out.println("Number of 'A's: " + count);
	        
	        // Close the scanner
	        scanner.close();
	    }
	    
	    // Method to count 'A's in a string
	    public static int countA(String s) {
	        int count = 0;
	        for (char c : s.toCharArray()) {
	            if (c == 'A' || c == 'a') {
	                count++;
	            }
	        }
	        return count;
		

	}

}


/*

Scanner Class: Used to take input from the user.

Input Prompt: The program asks the user to enter a string.

Counting Method: The countAs method iterates over each character in the string, checking if it is 'A' or 'a' and increments the count accordingly.

Output: Finally, the program prints the total count of 'A's found in the string.

*/