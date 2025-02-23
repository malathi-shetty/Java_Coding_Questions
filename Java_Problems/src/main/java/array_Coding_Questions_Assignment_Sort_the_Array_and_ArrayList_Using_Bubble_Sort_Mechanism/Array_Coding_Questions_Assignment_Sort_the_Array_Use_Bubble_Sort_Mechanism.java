package array_Coding_Questions_Assignment_Sort_the_Array_and_ArrayList_Using_Bubble_Sort_Mechanism;

public class Array_Coding_Questions_Assignment_Sort_the_Array_Use_Bubble_Sort_Mechanism {

	// Sort the Array….Use Bubble Sort Mechanism

	// Main method to test the Bubble Sort implementation
	public static void main(String[] args) {

		int[] a = { 64, 34, 25, 90, 12, 22, 90, 11 };
		System.out.println("Original array:");
		printArray(a);

		bubbleSort(a);

		System.out.println("Sorted array:");
		printArray(a);

	}

	public static void bubbleSort(int[] a) {
		int n = a.length;
		boolean swapped;

		// Traverse through all array elements
		for (int i = 0; i < n - 1; i++) {
			swapped = false; // Track if a swap occurred

			// Last i elements are already sorted
			for (int j = 0; j < n - i - 1; j++) {
				// Compare adjacent elements
				if (a[j] > a[j + 1]) {
					// Swap if they are in the wrong order
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true; // Set swapped to true
				}
			}

			// If no elements were swapped, break the loop
			if (!swapped) {
				break;
			}
		}
	}

	public static void printArray(int[] a) {
		for (int value : a) {
			System.out.print(value + " ");
		}
		System.out.println();

	}
}

/*
 * The main method is the entry point of the program.
 * 
 * An array a is initialized with unsorted integers.
 * 
 * It prints the original array, calls the bubbleSort method to sort the array,
 * and then prints the sorted array.
 * 
 * 
 * Bubble Sort Method
 * 
 * The bubbleSort method takes an array of integers as input.
 * 
 * It determines the length of the array and initializes a boolean swapped to
 * track if any elements were swapped during each pass.
 * 
 * It uses two nested loops:
 * 
 * The outer loop runs through the array multiple times.
 * 
 * The inner loop compares adjacent elements and swaps them if they are in the
 * wrong order (i.e., if the earlier element is greater than the later one).
 * 
 * If no swaps occur in a full pass (indicating that the array is already
 * sorted), it breaks out of the loop early for efficiency.
 * 
 * 
 * Print Array Method
 * 
 * The printArray method takes an integer array and prints its elements.
 * 
 * It uses an enhanced for-loop to iterate through the array, printing each
 * element followed by a space.
 * 
 * 
 * Summary
 * 
 * The above program is a simple implementation of the Bubble Sort algorithm,
 * which sorts an array of integers in ascending order.
 * 
 * It includes methods for sorting and printing the array, with built-in
 * efficiency to stop early if the array becomes sorted before all passes are
 * completed.
 * 
 * 
 * Output:
 * 
 * Original array:
 * 
64 34 25 90 12 22 90 11 

Sorted array:

11 12 22 25 34 64 90 90 
 * 
 * 
 */
