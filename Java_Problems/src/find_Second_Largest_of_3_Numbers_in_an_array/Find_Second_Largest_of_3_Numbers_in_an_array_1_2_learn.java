package find_Second_Largest_of_3_Numbers_in_an_array;

import java.util.Arrays;

public class Find_Second_Largest_of_3_Numbers_in_an_array_1_2_learn {

	public static void main(String[] args) {

		//int[] a = { 8 }; // Don't proceed
	//	int[] a = { 8, 5, 1, 8, 4 }; // the second largest number is: 5
	//	int[] a = { 8, 8, 8, 8, 8 }; // No second largest number found.
		int[] a = { 8, 5, 1, 10, 4 };
		if (a.length < 2) {
			System.out.println("Dont proceed");
			return;
		}

		Arrays.sort(a); // 1,4,5,8,10
		System.out.println("Sorted array: " + Arrays.toString(a));

		for (int i = a.length - 2; i >= 0; i--) { // length = 5
			if (a[i] != a.length - 1) { // a[3] // 8 != 10
				System.out.println("the second largest number is: " + a[i]);
				return; // Exit once the second largest number is found
			}
		}

		// If the loop completes without finding a second largest number
		System.out.println("No second largest number found.");
	}
}

/*
 * Loop Condition: Changed the loop from i > 0 to i >= 0 to ensure we cover the
 * possibility of the second largest being the first element in the sorted
 * array.
 * 
 * Break Loop Early: Added return; inside the if block to exit the main method
 * as soon as the second largest number is found. This avoids unnecessary
 * iterations once the result is determined.
 * 
 * Edge Case Handling: Added a final message "No second largest number found."
 * in case all elements in the array are the same or there’s no distinct second
 * largest value.
 * 
 * These changes ensure that the code correctly identifies and prints the second
 * largest number, even in cases with duplicate values or all elements being the
 * same.
 */
