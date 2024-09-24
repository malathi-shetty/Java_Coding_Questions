package practice_Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Simple_Exercise_17 {

	public static void main(String[] args) {
		// LargestUniqueNumber

		/*
		 * Given an array of integers, find the largest number that does not have any
		 * duplicates in the array. 
		 * 
		 * Example: Input: arr = [4, 3, 2, 7, 3, 4, 8] 
		 * 
		 * Output:  8
		 * 
		 *  Explanation: The unique numbers are [2, 7, 8], and the largest among them is 8.
		 * 
		 */

		int[] a = { 4, 3, 2, 7, 3, 4, 8 };
		System.out.println(findLargestUniqueNumber(a)); // Output: 8

	}

	public static int findLargestUniqueNumber(int[] a) {
		// Step 1: Count occurrences using HashMap - Build the occurrence count
		// Count how many times each number appears. This is done using a HashMap where
		// the keys are the numbers and the values are their counts.
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : a) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		// Step 2: Find the largest unique number - Identify & Locate the largest unique number.
	
		// Check the HashMap for numbers that appear exactly once. If a number is
		// unique, compare it with the current largest unique number.
		int largestUnique = Integer.MIN_VALUE;
		boolean foundUnique = false;

		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 1) { // Check if the number is unique
				foundUnique = true;
				if (entry.getKey() > largestUnique) {
					largestUnique = entry.getKey(); // Update largest unique number
				}
			}
		}

		// Find and handle the case where no unique number is found by throwing an exception.

		if (!foundUnique) {
			throw new NoSuchElementException("No unique number found in the array.");
		}

		// Launch or return the result, which is the largest unique number
		return largestUnique;

	}

}

/*
 * 
 * To find the largest number in an array that does not have any duplicates, you
 * can follow these steps:
 **
 * 
 * 
 * Count Occurrences: Create & Use a HashMap to count how many
 * times(occurrences) each number appears in the array.
 * 
 * Find Unique Numbers: Extract numbers from the HashMap & Iterate through the
 * HashMap to find numbers that appear exactly once.
 * 
 * Locate Largest Unique: Determine the maximum/largest number among those that
 * are unique.
 ****
 * 
 * 
 * - Count how many times each number appears. This is done using a HashMap
 * where the keys are the numbers and the values are their counts.
 * 
 * - Check the HashMap for numbers that appear exactly once. If a number is
 * unique, compare it with the current largest unique number.
 * 
 * - Find and handle the case where no unique number is found by throwing an
 * exception.
 * 
 * - Launch or return the result, which is the largest unique number.
 *******
 * 
 * 
 * find the largest unique number in an array, follow these steps:
 * 
 * Count the occurrences of each number.
 * 
 * Check which numbers are unique (occur exactly once).
 * 
 * Find the largest among those unique numbers.
 * 
 * Launch the result or handle the case where no unique number exists.
 * 
 */