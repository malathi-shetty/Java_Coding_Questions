package find_Second_Smallest_of_3_Numbers_in_an_array;

public class Second_Smallest_Number {

	public static void main(String[] args) {
		// find Second Smallest Number in an Array

		int[] a = { 12, 13, 5, 7, 19, 2, 3 };
		// int[] a = {5, 5, 5, 5}; // Edge Case
		// Ensure the array has at least two elements
		if (a.length < 2) {
			System.out.println("Array must have at least two elements");
			return;
		}

		// Initialize the smallest and second smallest with maximum value
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		// Traverse the array once to find the second smallest
		for (int num : a) {
			if (num < smallest) {
				// Update second smallest and smallest
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				// Update second smallest only if it's greater than smallest
				secondSmallest = num;
			}
		}

		// Check if second smallest is still Integer.MAX_VALUE, meaning there wasn't a
		// valid second smallest
		if (secondSmallest == Integer.MAX_VALUE) {
			System.out.println("No second smallest number found");
		} else {
			System.out.println("The second smallest number is: " + secondSmallest);
			System.out.println("The smallest number is: " + smallest);
		}
	}

}

/*
 * 
 * 
 * Initialization:
 * 
 * smallest and secondSmallest are initially set to Integer.MAX_VALUE, ensuring
 * that any number from the array will be smaller than these values.
 * 
 * Single Traversal:
 * 
 * We iterate through the array just once using a for-each loop.
 * 
 * When we find a new smallest number, we update secondSmallest to hold the
 * previous smallest value.
 * 
 * When we find a number greater than smallest but smaller than secondSmallest,
 * we update secondSmallest.
 * 
 * 
 * Check if a second smallest exists: If no second smallest is found, it means
 * all elements in the array are the same or there is only one element.
 * 
 * smallest: This will store the smallest number in the array.
 * 
 * secondSmallest: This will store the second smallest number, which will be
 * updated whenever a smaller number is found.
 * 
 * Edge Case:
 * 
 * If the array contains only one unique number or all numbers are the same,
 * secondSmallest will remain as Integer.MAX_VALUE. We handle this by checking
 * if secondSmallest was updated and outputting a message accordingly.
 * 
 * If the array has less than two elements or all elements are the same, the
 * program will print "No second smallest number found".
 * 
 * Example Output:
 * 
 * For the input array {12, 13, 5, 7, 19, 2, 3}, the output will be:
 * 
 * The second smallest number is: 3
 * 
 * 
 * 
 * 
 */