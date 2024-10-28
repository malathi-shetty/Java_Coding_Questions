package array_Coding_Questions_Assignment_Smallest_Number_in_the_Array;

public class Smallest_Number_in_the_Array {

	public static void main(String[] args) {
		int[] numbers = { 3, 5, 1, 8, 2, -4, 7 };

		try {
			int smallest = findSmallest(numbers);
			System.out.println("Smallest number: " + smallest);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	// Method to find the smallest number in an array
	public static int findSmallest(int[] a) {
		// Check if the array is empty
		if (a.length == 0) {
			throw new IllegalArgumentException("Array cannot be empty.");
		}

		// Initialize smallest to the maximum possible integer value
		int smallest = Integer.MAX_VALUE;

		// Iterate through the array to find the smallest number
		for (int num : a) {
			if (num < smallest) {
				smallest = num; // Update smallest
			}
		}

		return smallest;

	}

}

/*
 * 
 * Check for Empty Array:
 * 
 * The method first checks if the array is empty and throws an
 * IllegalArgumentException if it is. This is important to avoid errors when
 * trying to access elements of an empty array.
 * 
 * Initialization:
 * 
 * The variable smallest is initialized to Integer.MAX_VALUE, which is the
 * largest possible integer value. This ensures that any number in the array
 * will be smaller during the first comparison.
 * 
 * Iteration:
 * 
 * The method then iterates through each number in the array:
 * 
 * If the current number is smaller than smallest, it updates smallest to the
 * current number.
 * 
 * Return Value:
 * 
 * After processing all numbers, the method returns the smallest number found.
 * 
 * Example Walkthrough
 * 
 * Let’s use the array {3, 5, 1, 8, 2, -4, 7}.
 * 
 * Initial State:
 * 
 * smallest = Integer.MAX_VALUE (initially).
 * 
 * Iterations:
 * 
 * Processing 3:
 * 
 * Update: smallest = 3.
 * 
 * Processing 5:
 * 
 * No change.
 * 
 * Processing 1:
 * 
 * Update: smallest = 1.
 * 
 * Processing 8:
 * 
 * No change.
 * 
 * Processing 2:
 * 
 * No change.
 * 
 * Processing -4:
 * 
 * Update: smallest = -4.
 * 
 * Processing 7:
 * 
 * No change.
 * 
 * Final Value:
 * 
 * smallest = -4.
 * 
 * Output
 * 
 * The output will be:
 * 
 * Smallest number: -4
 * 
 * Edge Cases
 * 
 * If the array contains only one element, that element will be the smallest.
 * 
 * If the array contains duplicate numbers, the smallest number will still be
 * identified correctly.
 * 
 * 
 */
