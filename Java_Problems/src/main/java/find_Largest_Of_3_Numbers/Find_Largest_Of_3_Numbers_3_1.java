package find_Largest_Of_3_Numbers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Find_Largest_Of_3_Numbers_3_1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Prompting user to enter three numbers
	        System.out.println("Enter three numbers:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Number " + (i + 1) + ": ");
	            numbers.add(scanner.nextInt());
	        }

	        // Finding the largest number using Collections.max()
	        int largest = Collections.max(numbers);
	        System.out.println(largest + " is the largest number.");
	        
	        scanner.close(); // Close the scanner to avoid resource leak

	}

}
