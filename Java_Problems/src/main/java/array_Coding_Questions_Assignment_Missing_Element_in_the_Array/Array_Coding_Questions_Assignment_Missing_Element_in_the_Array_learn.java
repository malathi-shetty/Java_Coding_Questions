package array_Coding_Questions_Assignment_Missing_Element_in_the_Array;

public class Array_Coding_Questions_Assignment_Missing_Element_in_the_Array_learn {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 7, 8, 9, 10 }; // 6 is missing

		int sum1 = 0;
		for (int num : a) {
			sum1 += num; // Calculate the sum of elements in the array
		}
		System.out.println("Sum of elements in the array: " + sum1);

		// Dynamically find the maximum number in the array
		int maxNumber = 0;
		for (int num : a) {
			if (num > maxNumber) {
				maxNumber = num; // Find the maximum number in the array
			}
		}

//or	//	int maxNumber = 10; // Change this based on the problem or calculate dynamically

		int expectedSum = maxNumber * (maxNumber + 1) / 2; // Formula for sum of first n natural numbers
		System.out.println("Sum of total elements from 1 to " + maxNumber + ": " + expectedSum);

		int missingNumber = expectedSum - sum1; // Calculate the missing number
		System.out.println("Missing number is: " + missingNumber);
	}
}

/*
 * 
 * The actual sum of the numbers in the array:
 * 
 * Array: {1, 2, 3, 4, 5, 7, 8, 9, 10}
 * 
 * Calculating step-by-step:
 * 
 * 1+2=3
 * 
 * 3+3=6
 * 
 * 6+4=10
 * 
 * 10+5=15
 * 
 * 15+7=22
 * 
 * 22+8=30
 * 
 * 30+9=39
 * 
 * 39+10=49
 * 
 * So, the actual sum is 49.
 * 
 * the Missing Number Calculation
 * 
 * Actual Sum:
 * 
 * The sum of the elements in the array is 49.
 * 
 * Expected Sum:
 * 
 * The expected sum for numbers 1 through 10 is still calculated using the
 * formula:
 * 
 * expectedSum = 10 × ( 10 + 1) / 2 = 10 × 11 / 2 = 55
 * 
 * Finding the Missing Number:
 * 
 * The missing number can be found by subtracting the actual sum from the
 * expected sum:
 * 
 * missingNumber = expectedSum − actualSum = 55 − 49 = 6
 * 
 * 
 * Summary
 * 
 * The missing number in the array {1, 2, 3, 4, 5, 7, 8, 9, 10} is 6.
 * 
 * Output:
 * 
 * Sum of elements in the array: 49
 * 
Sum of total elements from 1 to 10: 55

Missing number is: 6

 * 
 */