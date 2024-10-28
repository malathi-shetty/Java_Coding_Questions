package array_Coding_Questions_Assignment_Reverse_ArrayList_having_strings;

public class Reverse_Array_having_strings {

	public static void main(String[] args) {
		// Reverse String Array
		// Sample array of strings
		String[] fruits = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };

		// Print original array
		System.out.print("Original Array: ");
		printArray(fruits);

		// Reverse the array
		reverseArray(fruits);

		// Print reversed array
		System.out.print("Reversed Array: ");
		printArray(fruits);
	}

	// Method to reverse an array of strings
	public static void reverseArray(String[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			// Swap elements
			String temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

	// Method to print the array
	public static void printArray(String[] array) {
		for (String fruit : array) {
			System.out.print(fruit + " ");
		}
		System.out.println(); // New line for better formatting
	}

}

/*
 * 
 * Array Initialization:
 * 
 * String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
 * 
 * An array of strings named fruits is initialized with several fruit names.
 * 
 * Print Original Array:
 * 
 * System.out.print("Original Array: ");
 * 
 * printArray(fruits);
 * 
 * The printArray method is called to display the contents of the original
 * array.
 * 
 * Reverse the Array:
 * 
 * reverseArray(fruits);
 * 
 * The reverseArray method is called to reverse the elements of the fruits
 * array.
 * 
 * Reversal Logic:
 * 
 * In the reverseArray method, two pointers (left and right) are used:
 * 
 * left starts at the beginning (index 0).
 * 
 * right starts at the end (last index).
 * 
 * The elements at these indices are swapped until the pointers meet or cross
 * each other.
 * 
 * String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
 * 
 * Step-by-Step Execution
 * 
 * Initial State:
 * 
 * left = 0 (points to "Apple")
 * 
 * right = 4 (points to "Elderberry")
 * 
 * Array: ["Apple", "Banana", "Cherry", "Date", "Elderberry"]
 * 
 * First Iteration:
 * 
 * Condition: left < right (0 < 4) is true.
 * 
 * Swap:
 * 
 * temp = array[left] = "Apple"
 * 
 * array[left] (which is "Apple") is swapped with array[right] (which is
 * "Elderberry").
 * 
 * Array after swap: ["Elderberry", "Banana", "Cherry", "Date", "Apple"]
 * 
 * Update pointers:
 * 
 * left = 1
 * 
 * right = 3
 * 
 * Second Iteration:
 * 
 * Condition: left < right (1 < 3) is true.
 * 
 * Swap:
 * 
 * temp = array[left] = "Banana"
 * 
 * array[left] (which is "Banana") is swapped with array[right] (which is
 * "Date").
 * 
 * Array after swap: ["Elderberry", "Date", "Cherry", "Banana", "Apple"]
 * 
 * Update pointers:
 * 
 * left = 2
 * 
 * right = 2
 * 
 * Termination:
 * 
 * Now the condition left < right (2 < 2) is false, so the loop exits.
 * 
 * The array has been fully reversed.
 * 
 * Final Result
 * 
 * The final state of the array is:
 * 
 * ["Elderberry", "Date", "Cherry", "Banana", "Apple"]
 * 
 * Summary of the Process
 * 
 * The method uses two pointers (left and right) to swap elements from both ends
 * of the array, moving towards the center.
 * 
 * For each iteration, it:
 * 
 * Swaps the elements at the left and right indices.
 * 
 * Increments left and decrements right.
 * 
 * The loop continues until the two pointers meet or cross each other, resulting
 * in a reversed array.
 * 
 * 
 * 
 * 
 * 
 * 
 * Print Reversed Array:
 * 
 * System.out.print("Reversed Array: ");
 * 
 * printArray(fruits);
 * 
 * The reversed array is printed using the same printArray method.
 * 
 * Output Example
 * 
 * Original Array: Apple Banana Cherry Date Elderberry Reversed Array:
 * Elderberry Date Cherry Banana Apple
 * 
 * 
 */