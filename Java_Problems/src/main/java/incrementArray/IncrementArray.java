package incrementArray;

import java.util.Arrays;

public class IncrementArray {

	public static void main(String[] args) {
		// int[] arr = {9, 9, 9};
		int[] arr = { 1, 2, 9 };

		// Increment the number represented by the array
		int[] result = incrementArray(arr);

		// Print the result
		System.out.println("Incremented Array: " + Arrays.toString(result));
	}

	public static int[] incrementArray(int[] arr) {
		int n = arr.length;

		// Traverse the array from right to left
		for (int i = n - 1; i >= 0; i--) {
			// If the digit is less than 9, just add 1 and return
			if (arr[i] < 9) {
				arr[i]++;
				return arr;
			}

			// Otherwise, set the current digit to 0 and continue to the next left digit
			arr[i] = 0;
		}

		// If all digits are 9, we need to add a new digit at the front
		int[] newArr = new int[n + 1];
		newArr[0] = 1; // The result is 100...0
		return newArr;

	}

}

/*
 * Increment a Number Represented as an Array:
 * 
 * Consider an array like [1, 2, 9], which represents the number 129. When you
 * add one, the result should be [1, 3, 0].
 * 
 * Similarly, [9, 9, 9] should become [1, 0, 0, 0].
 ***
 * 
 * 
 * To increment a number represented as an array, you can follow these steps:
 * 
 * Start from the rightmost (least significant) digit and add 1.
 * 
 * If the result of the addition is less than 10, then you're done, and the
 * number is updated.
 * 
 * If the result is 10 (i.e., a carry), set the current position to 0 and move
 * to the next left position, repeating this process.
 * 
 * If you've processed all the digits and there's still a carry (like in the
 * case of [9, 9, 9]), you'll need to insert a new digit (1) at the beginning of
 * the array.
 * 
 * 
 * Input: We take an array arr as input where each element represents a digit of
 * a number. For example, the array [9, 9, 9] represents the number 999.
 * 
 * Loop from right to left: We start from the last index (n - 1) and move
 * leftwards. This is because we are adding 1 to the least significant digit
 * (rightmost).
 * 
 * Adding 1:
 * 
 * If the current digit is less than 9, we add 1 to it and return the updated
 * array. This is because no carry is needed.
 * 
 * If the current digit is 9, we set it to 0 (because adding 1 to 9 results in a
 * carry) and move to the next digit. Handling carry at the highest place:
 * 
 * If all digits are 9 (like in [9, 9, 9]), we will reach the end of the array,
 * and we need to add a new digit 1 at the start of the array (resulting in [1,
 * 0, 0, 0]).
 * 
 * Result: The final result is an array where the number has been incremented by
 * one.
 * 
 * Example: For the input [1, 2, 9]:
 * 
 * Start from the last element (9). Adding 1 makes it 10, so we set arr[2] = 0
 * and move to the next element.
 * 
 * 
 * Now, we add 1 to arr[1] (2 + 1 = 3), so the array becomes [1, 3, 0].
 * 
 * For the input [9, 9, 9]:
 * 
 * Start from the last element (9). Adding 1 makes it 10, so we set arr[2] = 0
 * and move to the next element.
 * 
 * Add 1 to arr[1] (9 + 1 = 10), so we set arr[1] = 0 and move to the next.
 * 
 * Add 1 to arr[0] (9 + 1 = 10), so we set arr[0] = 0.
 * 
 * Now all elements are 0, so we add a 1 at the start, resulting in [1, 0, 0,
 * 0].
 * 
 * Output:
 * 
 * For the input [9, 9, 9], the output will be:
 * 
 * Incremented Array: [1, 0, 0, 0]
 * 
 * For the input [1, 2, 9], the output will be:
 * 
 * Incremented Array: [1, 3, 0]
 * 
 * Edge Cases:
 * 
 * Single digit numbers: Arrays like [9] or [0] will work correctly.
 * 
 * For [9], it will become [10] (represented as [1, 0]).
 * 
 * For [0], it will become [1].
 * 
 * Empty array: In this problem, we assume the array will represent a valid
 * number, so an empty array would not be a valid input.
 * 
 * This method handles all cases of incrementing a number represented as an
 * array, including cases where the number overflows (like [9, 9, 9] becoming
 * [1, 0, 0, 0]).
 * 
 */
