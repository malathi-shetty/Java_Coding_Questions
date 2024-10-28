package array_Coding_Questions_Assignment_Merge_two_Arrays_and_create_new_Array;

import java.util.Arrays;

public class Array_Coding_Questions_Assignment_Merge_two_Arrays_and_create_new_Array_learn {

	public static void main(String[] args) {
		// Merge two Arrays and create new Array

		// Example arrays
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		// Merging the arrays
		int[] mergedArray = mergeArrays(array1, array2);

		// Printing the merged array
		System.out.println(Arrays.toString(mergedArray));
	}

	public static int[] mergeArrays(int[] array1, int[] array2) {
		// Create a new array with the combined length
		int[] mergedArray = new int[array1.length + array2.length];

		// Copy elements from the first array
		// System.arraycopy(Object Source Array, int Source Position, Object Destination
		// Array, int Destination Position, int length);

		System.arraycopy(array1, 0, mergedArray, 0, array1.length);

		// Copy elements from the second array
		// System.arraycopy(Object Source Array, int Source Position, Object Destination
		// Array, int Destination Position, int length);

		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		return mergedArray;

	}

}

/*
 * To merge two arrays in Java and create a new array, you can follow these
 * steps:
 * 
 * Create two arrays that you want to merge.
 * 
 * Create a new array with a size equal to the sum of the lengths of the two
 * arrays.
 * 
 * Copy the elements of the first array into the new array.
 * 
 * Copy the elements of the second array into the new array.
 * 
 * We define two integer arrays, array1 and array2.
 * 
 * The mergeArrays method creates a new array mergedArray with a length equal to
 * the sum of the two input arrays' lengths.
 * 
 * The System.arraycopy method is used to copy the elements from both arrays
 * into the new array efficiently.
 * 
 * Finally, we print the merged array using Arrays.toString.
 * 
 *******
 * 
 * 
 * 
 * System.arraycopy to copy elements from the two arrays into the merged array.
 * 
 * System.arraycopy Method
 * 
 * The System.arraycopy method is a native method in Java that allows you to
 * copy elements from one array to another. Its signature is:
 * 
 * 
 * public static void arraycopy(Object src, int srcPos, Object dest, int
 * destPos, int length)
 * 
 * src: The source array from which to copy.
 * 
 * srcPos: The starting position in the source array.
 * 
 * dest: The destination array where elements will be copied.
 * 
 * destPos: The starting position in the destination array.
 * 
 * length: The number of elements to copy.
 * 
 * Explanation of the Two Lines
 * 
 * 
 * Copying from the First Array:
 * 
 * System.arraycopy(array1, 0, mergedArray, 0, array1.length);
 * 
 * Source Array (array1): This is the array from which we want to copy elements.
 * 
 * Source Position (0): We start copying from the beginning of array1.
 * 
 * Destination Array (mergedArray): This is the array where we want to copy the
 * elements.
 * 
 * Destination Position (0): We start placing the copied elements at the
 * beginning of mergedArray.
 * 
 * Length (array1.length): We copy all the elements from array1. The length
 * specifies how many elements to copy, which in this case is the entire length
 * of array1.
 * 
 * 
 * Copying from the Second Array:
 * 
 * System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
 * 
 * 
 * Source Array (array2): We are now copying elements from array2.
 * 
 * Source Position (0): We start copying from the beginning of array2.
 * 
 * Destination Array (mergedArray): We are still copying into the same
 * mergedArray.
 * 
 * Destination Position (array1.length): This indicates where to start placing
 * the copied elements in mergedArray. Since we have already filled the first
 * part of mergedArray with elements from array1, we start adding array2's
 * elements right after the last element of array1.
 * 
 * Length (array2.length): We copy all the elements from array2.
 * 
 * Summary
 * 
 * The first line copies all elements from array1 into the beginning of
 * mergedArray.
 * 
 * The second line continues copying elements from array2 right after the last
 * element of array1 in mergedArray.
 * 
 * This results in mergedArray containing all elements from both arrays in the
 * order they were added: first from array1, then from array2.
 * 
 * 
 * 
 */