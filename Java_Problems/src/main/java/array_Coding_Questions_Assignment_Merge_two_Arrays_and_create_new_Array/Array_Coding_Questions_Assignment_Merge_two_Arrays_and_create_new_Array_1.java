package array_Coding_Questions_Assignment_Merge_two_Arrays_and_create_new_Array;

import java.util.Arrays;

public class Array_Coding_Questions_Assignment_Merge_two_Arrays_and_create_new_Array_1 {

	public static void main(String[] args) {
		  int[] a1 = {1, 2, 3};
	        int[] a2 = {4, 5, 6};

	        // Create a new array to hold the merged values
	        int[] mergedArray = new int[a1.length + a2.length];

	        // Copy elements from the first array
	        for (int i = 0; i < a1.length; i++) {
	            mergedArray[i] = a1[i];
	        }

	        // Copy elements from the second array
	        for (int i = 0; i < a2.length; i++) {
	            mergedArray[a1.length + i] = a2[i];
	        }

	        // Print the merged array
	        System.out.println(Arrays.toString(mergedArray)); // Output: [1, 2, 3, 4, 5, 6]
	    

	}

}
/*

Looping: Instead of using System.arraycopy, the code uses simple for loops to copy elements.

Merging: The first loop copies elements from array1, and the second loop appends elements from array2.

Output: The merged array is printed using Arrays.toString().

*/