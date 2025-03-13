package rearrangeArray;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		// Input array
		int[] arr = { 2, 0, 4, 0, 3, 0, 5, 0 };

		// Rearrange the array
		rearrangeArray(arr);

		// Print the result
		System.out.println("Rearranged Array: " + Arrays.toString(arr));
	}

	public static void rearrangeArray(int[] arr) {
		// Create two arrays to store even and odd numbers
		int[] even = new int[arr.length];
		int[] odd = new int[arr.length];
		int evenIndex = 0, oddIndex = 0;

		// Traverse through the array
		for (int num : arr) {
			if (num % 2 == 0) {
				even[evenIndex++] = num; // Add even numbers to 'even' array
			} else {
				odd[oddIndex++] = num; // Add odd numbers to 'odd' array
			}
		}

		// Combine even and odd arrays back into the original array
		for (int i = 0; i < evenIndex; i++) {
			arr[i] = even[i]; // Copy even numbers
		}
		for (int i = 0; i < oddIndex; i++) {
			arr[evenIndex + i] = odd[i]; // Copy odd numbers
		}

	}

}

/*
 * Rearrange Array: Given [2, 0, 4, 0, 3, 0, 5, 0], rearrange it so all even
 * numbers come first and odd numbers last, like [0,0,0,0,2,4,3,5]. (Since no
 * explanation was given, I assumed this approach.
 * 
 * Another possible way could be moving all 0s to the left and non-zeros to the
 * right.)
 * 
 * 
 * To rearrange the array such that all even numbers come first and odd numbers
 * come last, you can implement an approach where you iterate through the array
 * and separate the even and odd numbers. This can be done in various ways, but
 * the simplest approach is to iterate through the array, collect the even and
 * odd numbers into two separate lists, and then concatenate them.
 * 
 * Here’s a step-by-step approach:
 * 
 * Steps:
 * 
 * Traverse through the given array.
 * 
 * Separate even numbers (including zero) into one list and odd numbers into
 * another list.
 * 
 * Concatenate the even list followed by the odd list.
 * 
 * Update the original array with the rearranged result.
 * 
 * Input Array: We start with an input array, for example [2, 0, 4, 0, 3, 0, 5,
 * 0].
 * 
 * Separate Even and Odd Numbers:
 * 
 * We create two temporary arrays, even[] and odd[], to store even and odd
 * numbers respectively.
 * 
 * We use two indices (evenIndex and oddIndex) to keep track of where the next
 * even or odd number should be placed in the respective arrays.
 * 
 * Traversing the Array:
 * 
 * We loop through the original array, check if a number is even or odd, and add
 * it to the appropriate array.
 * 
 * Rebuilding the Original Array:
 * 
 * Once we have the even and odd numbers separated, we copy the even numbers
 * back into the original array.
 * 
 * Then, we copy the odd numbers starting from the index where the even numbers
 * ended.
 * 
 * Output:
 * 
 * After the array is rearranged, the result is printed, showing all even
 * numbers first, followed by all odd numbers.
 * 
 * Example:
 * 
 * For the input array: [2, 0, 4, 0, 3, 0, 5, 0]:
 * 
 * Even numbers: 2, 0, 4, 0, 0, 0
 * 
 * Odd numbers: 3, 5
 * 
 * After rearranging, the result will be:
 * 
 * 
 * Rearranged Array: [2, 0, 4, 0, 0, 0, 3, 5]
 * 
 * Edge Cases:
 * 
 * Empty Array: If the input array is empty, the code will handle it properly
 * and simply return an empty array.
 * 
 * No Even or No Odd Numbers: If the array contains only even or only odd
 * numbers, the code will still work and return the array in the correct order
 * (all even or all odd).
 * 
 * All Zeroes: Since zero is considered an even number, zeroes will be placed in
 * the "even" section.
 */