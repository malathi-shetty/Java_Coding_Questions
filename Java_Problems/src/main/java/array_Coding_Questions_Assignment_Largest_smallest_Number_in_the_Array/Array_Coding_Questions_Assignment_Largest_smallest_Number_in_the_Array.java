package array_Coding_Questions_Assignment_Largest_smallest_Number_in_the_Array;

public class Array_Coding_Questions_Assignment_Largest_smallest_Number_in_the_Array {

	public static void main(String[] args) {
		// Largest smallest Number in the Array

		int[] num = { 3, 5, 1, 8, 2, -4, 7 }; // Sample array
		
		 // Print the original array
        System.out.print("Numbers in the array: ");
        for (int numbers : num) {
            System.out.print(numbers + " ");
        }
        System.out.println(); // New line for better formatting

		int max = findLargest(num);
		int min = findSmallest(num);

	
		System.out.println("Largest number: " + max);
		System.out.println("Smallest number: " + min);

	}

	public static int findLargest(int[] a) {
		int max = a[0]; // Assume the first element is the largest

		for (int num : a) {
			if (num > max) {
				max = num; // Update max if current number is larger
			}
		}

		return max;
	}

	public static int findSmallest(int[] b) {
		int min = b[0]; // Assume the first element is the smallest

		for (int num : b) {
			if (num < min) {
				min = num; // Update min if current number is smaller
			}
		}

		return min;
	}

}

/*
 * 
 * Array Initialization: The array numbers contains some integer values.
 * 
 * Finding Largest: The findLargest method iterates through the array and keeps
 * track of the maximum value found.
 * 
 * Finding Smallest: The findSmallest method does the same for the minimum
 * value.
 * 
 * Output: Finally, the largest and smallest numbers are printed.
 * 
 * Notes:
 * 
 * Ensure the array is not empty to avoid ArrayIndexOutOfBoundsException.
 * 
 */