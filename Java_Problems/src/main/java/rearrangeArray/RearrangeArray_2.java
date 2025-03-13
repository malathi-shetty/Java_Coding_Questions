package rearrangeArray;

import java.util.Arrays;

public class RearrangeArray_2 {

	public static void main(String[] args) {
		// Input array
        int[] arr = {2, 0, 4, 0, 3, 0, 5, 0};

        // Rearrange the array
        rearrangeArray(arr);

        // Print the result
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;

        // Count of zeroes
        int zeroCount = 0;

        // Two lists to store non-zero even and odd numbers
        int[] evens = new int[n];
        int[] odds = new int[n];
        int evenIndex = 0, oddIndex = 0;

        // Traverse through the array
        for (int num : arr) {
            if (num == 0) {
                zeroCount++; // Count zeroes
            } else if (num % 2 == 0) {
                evens[evenIndex++] = num; // Add even non-zero numbers
            } else {
                odds[oddIndex++] = num; // Add odd numbers
            }
        }

        // Fill the result array: start with zeroes
        int index = 0;
        for (int i = 0; i < zeroCount; i++) {
            arr[index++] = 0;
        }

        // Fill even numbers
        for (int i = 0; i < evenIndex; i++) {
            arr[index++] = evens[i];
        }

        // Fill odd numbers
        for (int i = 0; i < oddIndex; i++) {
            arr[index++] = odds[i];
        }

	}

}

// Output: Rearranged Array: [0, 0, 0, 0, 2, 4, 3, 5]

/*
 * 
 * Count Zeroes:

We count the number of zeroes (zeroCount) in the array. Zeroes need to come first in the result.

Separate Even and Odd Numbers:

We maintain two arrays, evens[] and odds[], to store non-zero even numbers and odd numbers respectively.

Fill the Original Array:

First, we fill the beginning of the original array with the zeroes.

Then, we copy the even numbers (non-zero) to the array.

Finally, we copy the odd numbers to the array.

Efficiency:

The time complexity of this approach is O(n), as we only loop through the array a few times (once for counting and categorizing the numbers, and once for copying them back into the array).

Example:

For the input array: [2, 0, 4, 0, 3, 0, 5, 0], the steps will be:

Count Zeroes: There are 4 zeroes.

Even Numbers (Non-zero): 2, 4.

Odd Numbers: 3, 5.

After the rearrangement, the output will be:

Rearranged Array: [0, 0, 0, 0, 2, 4, 3, 5]

Edge Cases:

Array with all zeroes: If the array consists only of zeroes (e.g., [0, 0, 0]), the result will be the same array [0, 0, 0].

Array with no zeroes: If there are no zeroes in the array, the even and odd numbers will be rearranged in the correct order with no zeroes at the start.

All even or all odd numbers: The code will still work for arrays that contain only even or only odd numbers. If all elements are zeroes, the result will still be zeroes.

This solution meets the requirement of having zeroes at the start, followed by even non-zero numbers, and then odd numbers.

*/
