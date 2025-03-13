package mergeArrays;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {

		/*
		 * Merge Two Arrays: For instance, if you have arr1 = {5, 3, 2} and arr2 = {9,
		 * 0, 1},
		 * 
		 * the task is to merge them into one array, resulting in {5, 3, 2, 9, 0, 1}.
		 */
		// Define the two input arrays
		int[] arr1 = { 5, 3, 2 };
		int[] arr2 = { 9, 0, 1 };

		// Call the mergeArrays method and store the result
		int[] mergedArray = mergeArrays(arr1, arr2);

		// Print the merged array
		System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}

	// Method to merge two arrays
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		// Create a new array with a size equal to the sum of the lengths of both arrays
		int[] merged = new int[arr1.length + arr2.length];

		// Copy elements of the first array into the merged array
		System.arraycopy(arr1, 0, merged, 0, arr1.length);

		// Copy elements of the second array into the merged array, starting after the
		// last index of arr1
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

		// Return the merged array
		return merged;

	}

}

/*
 * 
 * To merge two arrays in Java, we can follow a simple approach by creating a
 * new array that can accommodate the elements of both input arrays. Then, we
 * copy the elements of both arrays into the new array.
 * 
 * Steps:
 * 
 * Create a new array: The size of this new array should be the sum of the
 * lengths of both input arrays.
 * 
 * Copy elements from the first array into the new array.
 * 
 * Copy elements from the second array into the new array.
 * 
 * Return or print the merged array.
 * 
 * 
 * Input Arrays:
 * 
 * We define two arrays arr1 = {5, 3, 2} and arr2 = {9, 0, 1}.
 * 
 * Merging Logic:
 * 
 * The method mergeArrays(int[] arr1, int[] arr2) is designed to merge both
 * arrays.
 * 
 * We first create a new array merged with a size equal to the sum of the
 * lengths of arr1 and arr2: arr1.length + arr2.length.
 * 
 * We then use System.arraycopy() to copy the elements of arr1 into the new
 * merged array starting at index 0, and the elements of arr2 starting from
 * index arr1.length.
 * 
 * Printing the Result:
 * 
 * We use Arrays.toString(merged) to print the merged array in a readable
 * format.
 * 
 * Output:
 * 
 * For the input arrays:
 * 
 * 
 * int[] arr1 = {5, 3, 2};
 * 
 * int[] arr2 = {9, 0, 1};
 * 
 * The output will be:
 * 
 * Merged Array: [5, 3, 2, 9, 0, 1]
 * 
 */
