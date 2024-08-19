package array_Of_integer_numbers_and_an_integer_target;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array_Of_integer_numbers_and_an_integer_target {

	public static void main(String[] args) {
		/*
		 * Given an array of integer nums and an integer target, return the indices of
		 * the two numbers such that they add up to the target. Example: Input: nums =
		 * [3, 2, 4] target = 6 Output: [1, 2] Explanation: Because nums[1] + nums[2] ==
		 * 6, we return [1, 2].
		 */
		// Create an instance of TwoSum class
		Array_Of_integer_numbers_and_an_integer_target ai = new Array_Of_integer_numbers_and_an_integer_target(); // We create an instance solution of
																		// Array_Of_integer_numbers.

		int[] nums = { 3, 2, 4 }; // Example input - Define example input nums = { 3, 2, 4 } and target = 6.
		int target = 6; // Example target

		// Call the Array_Of_integer_numbers method to find the indices of two numbers
		int[] result = ai.twoSum(nums, target);
		// Call ai.twoSum(nums, target) to find the indices of two numbers that add up
		// to target.

		// Print the result
		System.out.println(Arrays.toString(result));
		// Print the result using System.out.println(Arrays.toString(result)), which
		// prints [1, 2] indicating that nums[1] + nums[2] = 6.

	}

	public int[] twoSum(int[] nums, int target) { // twoSum method takes an array of integers nums and an integer target
													// as parameters.

		// Create a HashMap to store each number's index
		Map<Integer, Integer> map = new HashMap<>();
		// We create a HashMap<Integer, Integer> named map to store numbers (nums[i]) as
		// keys and their indices (i) as values.

		// Iterate through array
		for (int i = 0; i < nums.length; i++) // We start a for loop to go through each element of the nums array.
		{
			// Calculate the complement needed to reach the target
			int complement = target - nums[i];
			// For each element nums[i], calculate complement as target - nums[i].
			// This complement is the number we need to find in the array to reach the
			// target.

			// Check if complement exists in the HashMap - We check if map already contains
			// complement as a key using map.containsKey(complement).
			if (map.containsKey(complement)) {
				// If found, return the indices of the two numbers
				return new int[] { map.get(complement), i };
				// If complement exists in map, it means we've found the two numbers (nums[i]
				// and complement) that add up to target.
				// So, we return their indices [map.get(complement), i].
			}

			// Add the current number and its index o the Hashmap
			map.put(nums[i], i);
			// If complement doesn't exist in map, we add nums[i] to map with its index i
			// using map.put(nums[i], i).
			// This allows us to potentially find this number's complement later in the
			// array.

		}

		// If no solution is found, return an empty array
		return null;
		// If the loop completes without finding a solution (no pair of numbers adding
		// up to target), we return an empty array new int[0].
	}

}
