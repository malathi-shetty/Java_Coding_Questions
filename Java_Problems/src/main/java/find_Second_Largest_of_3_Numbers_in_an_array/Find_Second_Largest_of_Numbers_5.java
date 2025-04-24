package find_Second_Largest_of_3_Numbers_in_an_array;

import java.util.Arrays;

public class Find_Second_Largest_of_Numbers_5 {

	public static void main(String[] args) {
		int[] a = { 8, 5, 1, 10, 4 };
	//	int[] a = { 8 }; // To check Invalid output
		if (a.length < 2) {
			System.out.println("Invalid output");
			return;
		}
		

		Arrays.sort(a);
		System.out.println("Sorted array: " + Arrays.toString(a));

		// Traverse from the end to find the second largest - Start checking from the
		// second-to-last element
		int i = a.length - 2;
		// Find the second largest number
		while (i >= 0 && a[i] == a.length - 1) {
			i--;
		}

		if (i >= 0) {
			System.out.println("The second largest number is: " + a[i]);
		} else {
			System.out.println("No second largest number found.");
		}

	}

}

/*
 * Loop Change: Replaced the for loop with a while loop. The for loop was not
 * correctly handling the case where all elements are the same or there was no
 * distinct second largest number.
 * 
 * Finding the Second Largest:
 * 
 * Start from the end of the sorted array and move backwards. Continue moving
 * backward until you find an element that is different from the largest element
 * (a[a.length - 1]). Condition Check: After the loop, if the index i is valid
 * (i.e., i >= 0), print the element at that index as the second largest.
 * Otherwise, print "No second largest number found."
 * 
 * 
 * 
 * Sorting: You sort the array to simplify the process of finding the largest
 * and second largest numbers.
 * 
 * Finding the Second Largest:
 * 
 * Start at the second-to-last index of the array (i = a.length - 2). Use a
 * while loop to move backwards through the array until you find an element that
 * is not equal to the largest element (a[a.length - 1]). Output:
 * 
 * If you find a valid index (i >= 0), print the element at that index as the
 * second largest. If you don’t find such an element (e.g., if all elements are
 * the same), output "No second largest number found."
 * 
 * This approach ensures that you correctly identify the second largest number
 * even if there are duplicates or all elements are the same.
 */