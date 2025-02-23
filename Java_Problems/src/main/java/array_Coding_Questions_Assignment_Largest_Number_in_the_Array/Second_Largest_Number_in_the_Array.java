package array_Coding_Questions_Assignment_Largest_Number_in_the_Array;

public class Second_Largest_Number_in_the_Array {

	public static void main(String[] args) {

		// Second Largest Number in the Array

		int[] num = { 3, 5, 1, 8, 2, -4, 7 };
		// int[] num = {3};
		// Print the original array
		System.out.print("Numbers in the array: ");
		for (int numbers : num) {
			System.out.print(numbers + " ");
		}
		System.out.println(); // New line for better formatting

		int secondLargest = findSecondLargest(num);

		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println("Second largest number: " + secondLargest);
		} else {
			System.out.println("Array does not have a second largest number.");
		}
	}

	// Method to find the second largest number in an array
	public static int findSecondLargest(int[] a) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : a) {
			if (num > largest) {
				secondLargest = largest; // Update second largest
				largest = num; // Update largest
			} else if (num > secondLargest && num < largest) {
				secondLargest = num; // Update second largest
			}
		}

		return secondLargest;

	}

}

/*
 * 
 * Array Initialization:
 * 
 * An array numbers is defined with some integer values.
 * 
 * Finding the Second Largest:
 * 
 * The findSecondLargest method initializes two variables:
 * 
 * largest and secondLargest are set to Integer.MIN_VALUE, which ensures any
 * number in the array will be larger.
 * 
 * The method iterates through the array:
 * 
 * If the current number (num) is greater than largest, it updates secondLargest
 * to the current value of largest, then updates largest to num.
 * 
 * If num is not greater than largest but is greater than secondLargest, it
 * updates secondLargest to num.
 * 
 * Handling Edge Cases:
 * 
 * After the loop, if secondLargest remains Integer.MIN_VALUE, it indicates that
 * there is no second largest number (for instance, in an array of all identical
 * elements).
 * 
 * Output:
 * 
 * The result is printed to the console.
 * 
 * Output Example
 * 
 * For the given array {3, 5, 1, 8, 2, -4, 7}, the output will be:
 * 
 * 
 * Second largest number: 7
 * 
 * Edge Cases
 * 
 * If the array contains only one element or all elements are the same, the
 * program will indicate that there is no second largest number. For example,
 * for the array {1}, the output would be:
 * 
 * Array does not have a second largest number.
 * 
 * Output:
 * 
 * Numbers in the array: 3 5 1 8 2 -4 7 
 * 
Second largest number: 7


 * 
 */
