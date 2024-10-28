package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arraysarray_Coding_Questions_Assignment_Missing_Element_in_the_Array;

public class Array_Coding_Questions_Assignment_Missing_Element_in_the_Array {

	public static void main(String[] args) {
		// Missing Element in the Array

		//Finding Missing Element Using Sum Formula
		
		 int[] a = {1, 2, 4, 5, 6}; // Example array with a missing number

	        int n = 6; // The maximum number in the expected sequence
	        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
	        int actualSum = 0;

	        // Calculate the sum of the elements in the array
	        for (int num : a) {
	            actualSum += num;
	        }

	        // The missing number is the difference
	        int missingNumber = expectedSum - actualSum;
	        System.out.println("Missing element: " + missingNumber); // Output: 3
	}

}
