package array_Coding_Questions_Assignment_Smallest_Number_in_the_Array;

public class Third_Smallest_Number_in_the_Array {

	public static void main(String[] args) {
		int[] numbers = { 3, 5, 1, 8, 2, -4, 7 };

		int thirdSmallest = findThirdSmallest(numbers);

		if (thirdSmallest != Integer.MAX_VALUE) {
			System.out.println("Third smallest number: " + thirdSmallest);
		} else {
			System.out.println("Array does not have a third smallest number.");
		}
	}

	// Method to find the third smallest number in an array
	public static int findThirdSmallest(int[] a) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int thirdSmallest = Integer.MAX_VALUE;

		for (int num : a) {
			if (num < smallest) {
				thirdSmallest = secondSmallest; // Update third smallest
				secondSmallest = smallest; // Update second smallest
				smallest = num; // Update smallest
			} else if (num < secondSmallest && num > smallest) {
				thirdSmallest = secondSmallest; // Update third smallest
				secondSmallest = num; // Update second smallest
			} else if (num < thirdSmallest && num > secondSmallest) {
				thirdSmallest = num; // Update third smallest
			}
		}

		return thirdSmallest;
	}
}

/*
 * 
 * Initialization:
 * 
 * Set smallest, secondSmallest, and thirdSmallest to Integer.MAX_VALUE. This
 * ensures any number in the array will be smaller during the first comparison.
 * 
 * Iteration:
 * 
 * Loop through each number in the array:
 * 
 * If the number is smaller than smallest, update all three variables:
 * 
 * thirdSmallest gets the value of secondSmallest.
 * 
 * secondSmallest gets the value of smallest.
 * 
 * smallest is updated to the current number.
 * 
 * If the number is smaller than secondSmallest but larger than smallest, update
 * secondSmallest and thirdSmallest.
 * 
 * If the number is smaller than thirdSmallest but larger than secondSmallest,
 * just update thirdSmallest.
 * 
 * Return Value:
 * 
 * After processing all numbers, return thirdSmallest. If it remains
 * Integer.MAX_VALUE, it indicates that there aren't enough distinct numbers in
 * the array.
 * 
 * Example Walkthrough
 * 
 * Let’s use the array {3, 5, 1, 8, 2, -4, 7}.
 * 
 * Initial State:
 * 
 * smallest = Integer.MAX_VALUE
 * 
 * secondSmallest = Integer.MAX_VALUE
 * 
 * thirdSmallest = Integer.MAX_VALUE
 * 
 * Iterations:
 * 
 * Processing 3:
 * 
 * Update: smallest = 3.
 * 
 * Processing 5:
 * 
 * Update: secondSmallest = 5.
 * 
 * Processing 1:
 * 
 * Update: thirdSmallest = secondSmallest (5), secondSmallest = 3, smallest = 1.
 * 
 * Processing 8: No changes.
 * 
 * Processing 2:
 * 
 * Update: thirdSmallest = 3, secondSmallest = 2.
 * 
 * Processing -4:
 * 
 * Update: smallest = -4, secondSmallest = 1, thirdSmallest = 2.
 * 
 * Processing 7: No changes.
 * 
 * Final Values:
 * 
 * smallest = -4
 * 
 * secondSmallest = 1
 * 
 * thirdSmallest = 2
 * 
 * Output
 * 
 * The output will be:
 * 
 * 
 * Third smallest number: 2
 * 
 * Edge Cases
 * 
 * If the array contains fewer than three distinct numbers, thirdSmallest will
 * remain Integer.MAX_VALUE, and the output will indicate that there is no third
 * smallest number.
 * 
 */
