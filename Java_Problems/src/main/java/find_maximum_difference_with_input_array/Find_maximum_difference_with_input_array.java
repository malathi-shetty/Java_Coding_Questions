package find_maximum_difference_with_input_array;

public class Find_maximum_difference_with_input_array {

	public static void main(String[] args) {
		int[] a = { 23, 67, 1, 6, 97, 21, 7 };
		System.out.println("Maximum difference: " + findMaxDifference(a));
	}

	public static int findMaxDifference(int[] a) {
		if (a == null || a.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements.");
		}

		int min = a[0];
		int max = a[0];

		for (int num : a) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}

		return max - min;

	}

}

/*
 * 
 * To find the maximum difference between two elements in an array in Java, you
 * can follow these steps:
 * 
 * Identify the smallest and largest elements in the array.
 * 
 * Calculate the difference between the largest and smallest elements.
 * 
 * Input Array: The array is defined as arr = {23, 67, 1, 6, 97, 21, 7}.
 * 
 * Find Min and Max: The program iterates through the array to find the minimum
 * and maximum values.
 * 
 * Calculate Difference: Finally, it calculates the difference between the
 * maximum and minimum values and returns it.
 * 
 * This is because the maximum value is 97 and the minimum value is 1, so 97 - 1 = 96.
 * 
 * 
 ***
 * 
 * Main Method:
 * 
 * public static void main(String[] args) {
 * 
 * int[] arr = {23, 67, 1, 6, 97, 21, 7};
 * 
 * System.out.println("Maximum difference: " + findMaxDifference(arr)); }
 * 
 * The main method is the entry point of the program.
 * 
 * An integer array arr is initialized with the values {23, 67, 1, 6, 97, 21,  7}.
 * 
 * The method findMaxDifference(arr) is called, and its result is printed to the console.
 * 
 * Method to Find Maximum Difference:
 * 
 * public static int findMaxDifference(int[] arr) {
 * 
 * if (arr == null || arr.length < 2) {
 * 
 * throw new IllegalArgumentException("Array must contain at least two elements.");
 * 
 * }
 * 
 * This method takes an integer array as an argument and returns the maximum difference.
 * 
 * It first checks if the array is null or has fewer than two elements. If so,
 * it throws an IllegalArgumentException, ensuring the method can only operate on valid arrays.
 * 
 * Initialize Min and Max:
 * 
 * int min = arr[0];
 * 
 * int max = arr[0];
 * 
 * min and max are initialized to the first element of the array. This sets a  starting point for comparison.
 * 
 * Loop Through the Array:
 * 
 * for (int num : arr) {
 * 
 * if (num < min) {
 * 
 * min = num;
 * 
 * }
 * 
 * if (num > max) {
 * 
 * max = num;
 * 
 * }
 * 
 * }
 * 
 * This loop iterates over each element in the array (num).
 * 
 * For each element, it checks if num is less than the current min. If it is, min is updated to num.
 * 
 * Similarly, it checks if num is greater than the current max. If it is, max is updated to num.
 * 
 * By the end of the loop, min holds the smallest value and max holds the
 * largest value in the array.
 * 
 * Calculate and Return the Difference:
 * 
 * return max - min;
 * 
 * The method returns the difference between max and min, which is the maximum
 * difference between any two elements in the array.
 * 
 * Summary
 * 
 * The code efficiently finds the maximum difference in a single pass through
 * the array (O(n) time complexity).
 * 
 * It checks for valid input and handles edge cases.
 * 
 * The final output is printed in the main method, showing the maximum
 * difference found.
 * 
 * 
 * ***
 * 
 * Array Definition:
 * 
 * The array is defined using curly braces {} and contains a list of integers.
 * 
 * Each integer is separated by a comma.
 * 
 * Elements in the Array:
 * 
 * The array contains the following elements: 23 67 1 6 97 21 7
 * 
 * Indexing:
 * 
 * In Java, arrays are zero-indexed, meaning the first element is at index 0,
 * the second at index 1, and so on.
 * 
 * The indices for this array are as follows:
 * 
 * arr[0] = 23
 * 
 * arr[1] = 67
 * 
 * arr[2] = 1
 * 
 * arr[3] = 6
 * 
 * arr[4] = 97
 * 
 * arr[5] = 21
 * 
 * arr[6] = 7
 * 
 * Purpose of the Array:
 * 
 * This array can represent any collection of integer values. In the context of
 * the program, we want to find the maximum difference between any two elements.
 * 
 * The difference is calculated as the maximum value in the array minus the
 * minimum value.
 * 
 * 
 * Finding Maximum Difference
 * 
 * To find the maximum difference using this array, the program follows these
 * steps:
 * 
 * 
 * Identify the Minimum Value:
 * 
 * The smallest element in this array is 1 (at index 2).
 * 
 * Identify the Maximum Value:
 * 
 * The largest element in this array is 97 (at index 4).
 * 
 * Calculate the Difference:
 * 
 * The maximum difference is computed as:
 * 
 * Maximum Difference = Max Value − Min Value = 97 − 1 = 96
 * 
 * Maximum Difference=Max Value−Min Value=97−1=96
 * 
 * Conclusion
 * 
 * The array {23, 67, 1, 6, 97, 21, 7} is simply a collection of integers that
 * the program uses to demonstrate how to find the maximum difference between
 * its elements. The key takeaway is identifying the maximum and minimum values,
 * which allows for the calculation of the desired difference.
 * 
 * 
 * 
 * 
 * 
 * 
 */