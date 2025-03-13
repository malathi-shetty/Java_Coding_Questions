package rearrangeArray;

import java.util.Arrays;

public class RearrangeArray_4 {

	public static void main(String[] args) {
		// Input array
		int[] arr = { 2, 4, 0, 0, 0, 0, 3, 5 };

		// Rearrange the array
		rearrangeArray(arr);

		// Print the result
		System.out.println("Rearranged Array: " + Arrays.toString(arr));
	}

	public static void rearrangeArray(int[] arr) {
		int n = arr.length;

		// Variables to store counts for even, odd, and zero elements
		int[] evens = new int[n];
		int[] zeros = new int[n];
		int[] odds = new int[n];

		int evenIndex = 0, zeroIndex = 0, oddIndex = 0;

		// Traverse through the array
		for (int num : arr) {
			if (num == 0) {
				zeros[zeroIndex++] = num; // Store zeroes
			} else if (num % 2 == 0) {
				evens[evenIndex++] = num; // Store even numbers (non-zero)
			} else {
				odds[oddIndex++] = num; // Store odd numbers
			}
		}

		// Fill the result array starting with even numbers (non-zero), then zeroes,
		// then odd numbers
		int index = 0;

		// Place even numbers first
		for (int i = 0; i < evenIndex; i++) {
			arr[index++] = evens[i];
		}

		// Place zeroes in the middle
		for (int i = 0; i < zeroIndex; i++) {
			arr[index++] = zeros[i];
		}

		// Place odd numbers last
		for (int i = 0; i < oddIndex; i++) {
			arr[index++] = odds[i];
		}

	}

}
/*
 * 
 * Input Array: We start with an array like [2, 4, 0, 0, 0, 0, 3, 5].
 * 
 * Separate the Numbers:
 * 
 * We create three separate arrays:
 * 
 * evens[] to store non-zero even numbers.
 * 
 * zeros[] to store the zeroes.
 * 
 * odds[] to store the odd numbers.
 * 
 * Loop through the array:
 * 
 * For each element in the array, we classify it into one of the three
 * categories (zero, even, or odd) and place it in the respective array.
 * 
 * Rebuild the Original Array:
 * 
 * We start by placing all the even non-zero numbers first in the original
 * array.
 * 
 * Then, we place the zeroes in the middle.
 * 
 * Finally, we place all the odd numbers last in the array.
 * 
 * Output:
 * 
 * The array is printed after the rearrangement.
 * 
 * Example:
 * 
 * For the input array: [2, 4, 0, 0, 0, 0, 3, 5]
 * 
 * Even Numbers (non-zero): 2, 4
 * 
 * Zeroes: 0, 0, 0, 0
 * 
 * Odd Numbers: 3, 5
 * 
 * After rearranging, the output will be:
 * 
 * Rearranged Array: [2, 4, 0, 0, 0, 0, 3, 5]
 * 
 * Edge Cases:
 * 
 * Array with only zeroes: If the array contains only zeroes (e.g., [0, 0, 0]),
 * the result will be the same array [0, 0, 0] with no even or odd numbers.
 * 
 * Array with only even numbers: If the array contains only even numbers (e.g.,
 * [2, 4, 6]), the result will have all even numbers followed by zeroes (if any)
 * and then odd numbers (if any).
 * 
 * Array with only odd numbers: If the array contains only odd numbers, the
 * result will have only odd numbers, with zeroes placed in the middle (if any).
 * 
 * Array with no zeroes: If there are no zeroes, the even numbers will still
 * come first, followed by the odd numbers.
 * 
 * This approach ensures that:
 * 
 * Even numbers (non-zero) come first,
 * 
 * Zeroes are placed in the middle, and
 * 
 * Odd numbers come last.
 * 
 */