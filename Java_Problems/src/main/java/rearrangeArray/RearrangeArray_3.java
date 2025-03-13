package rearrangeArray;

import java.util.Arrays;

public class RearrangeArray_3 {

	public static void main(String[] args) {
		 // Input array
        int[] arr = {2, 4, 0, 0, 0, 0, 3, 5};

        // Rearrange the array
        rearrangeArray(arr);

        // Print the result
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;

        // Variables to store counts for even, odd, and zero elements
        int[] evens = new int[n];
        int[] odds = new int[n];
        int[] zeros = new int[n];

        int evenIndex = 0, oddIndex = 0, zeroIndex = 0;

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

        // Fill the result array starting with even numbers (non-zero), then odd numbers, then zeroes
        int index = 0;

        // Place even numbers first
        for (int i = 0; i < evenIndex; i++) {
            arr[index++] = evens[i];
        }

        // Place odd numbers next
        for (int i = 0; i < oddIndex; i++) {
            arr[index++] = odds[i];
        }

        // Place zeroes at the end
        for (int i = 0; i < zeroIndex; i++) {
            arr[index++] = zeros[i];
        }

	}

}
// Output: Rearranged Array: [2, 4, 3, 5, 0, 0, 0, 0]


/*
 * 
Input Array: We start with an array such as [2, 4, 0, 0, 0, 0, 3, 5].

Separate the Numbers:

We create three separate arrays:

evens[] to store the non-zero even numbers.

odds[] to store the odd numbers.

zeros[] to store the zeroes.

Loop through the array:

For each element in the array, we classify it into one of the three categories (zero, even, or odd) and place it in the respective array.

Rebuild the Original Array:

We start by placing all the even numbers first in the original array, then the odd numbers, and finally the zeroes.

Output:

The array is printed after the rearrangement.

Example:

For the input array: [2, 4, 0, 0, 0, 0, 3, 5]

Even Numbers (non-zero): 2, 4

Odd Numbers: 3, 5

Zeroes: 0, 0, 0, 0

After rearranging, the output will be:

Rearranged Array: [2, 4, 3, 5, 0, 0, 0, 0]

Edge Cases:

Array with only zeroes: If the array contains only zeroes, the result will be the same array, e.g., [0, 0, 0].

Array with only even or odd numbers: If the array contains only even numbers (e.g., [2, 4, 6]), the result will be the same with zeroes added at the end. Similarly, if there are only odd numbers, the zeroes will still be placed at the end.

Array with no zeroes: If there are no zeroes, only even and odd numbers will be rearranged.

This approach ensures that the zeroes are placed at the end of the array, after the even numbers (excluding zero), and finally followed by odd numbers, exactly as per your requirement.

*/
