package find_Second_Largest_of_3_Numbers_in_an_array;

import java.util.Arrays;

public class Find_Second_Largest_of_Numbers_4 {

	public static void main(String[] args) {
		int[] a = { 18, 25, 31, 410, 504 };
		if (a.length < 2) {
			System.out.println("Invalid output");
			return;
		}

		Arrays.sort(a);
		System.out.println("Sorted array: " + Arrays.toString(a));

		// Initialize the second largest variable
		int secondLargest = Integer.MIN_VALUE;

		// Traverse from the end of the array to find the second largest
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] != a[a.length - 1]) {
				secondLargest = a[i];
				break; // No need to continue once we find the second largest
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No second largest number found.");
		} else {
			System.out.println("The second largest number is: " + secondLargest);
		}

	}

}

/*
 * Initialization of secondLargest: Added int secondLargest = Integer.MIN_VALUE;
 * to keep track of the second largest value found during the iteration.
 * 
 * Improved Loop Condition: Changed the loop to for (int i = a.length - 2; i >=
 * 0; i--) to handle the case where we need to check for values different from
 * the largest one (a[a.length - 1]).
 * 
 * Breaking the Loop: Added break; once the second largest value is found, as
 * there’s no need to continue checking once we have our result.
 * 
 * Handling Edge Cases: Added a check to ensure that if no valid second largest
 * number is found (i.e., all numbers are the same or not enough unique
 * numbers), it prints a message saying "No second largest number found."
 * 
 * With these adjustments, your code should correctly identify the second
 * largest number in the array and handle cases where duplicates might affect
 * the result.
 */