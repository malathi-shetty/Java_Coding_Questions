package array_Coding_Questions_Assignment_Reverse_Array_and_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Array_And_ArrayList {

	public static void main(String[] args) {
		// Reverse Array And ArrayList

		// Sample array
		int[] numbers = { 3, 5, 1, 8, 2, -4, 7 };

		// Print original array
		System.out.print("Original Array: ");
		printArray(numbers);

		// Reverse the array
		reverseArray(numbers);
		System.out.print("Reversed Array: ");
		printArray(numbers);
		System.out.println();
		// Sample ArrayList
		ArrayList<Integer> numberList = new ArrayList<>();
		Collections.addAll(numberList, 3, 5, 1, 8, 2, -4, 7);

		// Print original ArrayList
		System.out.print("Original ArrayList: ");
		System.out.println(numberList);

		// Reverse the ArrayList
		reverseArrayList(numberList);
		System.out.print("Reversed ArrayList: ");
		System.out.println(numberList);
	}

	// Method to reverse an array
	public static void reverseArray(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			// Swap elements
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

	// Method to print the array
	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println(); // New line for better formatting
	}

	// Method to reverse an ArrayList
	public static void reverseArrayList(ArrayList<Integer> list) {
		Collections.reverse(list);
	}}

/*
 * 
 * Array Reversal:
 * 
 * The reverseArray method swaps elements from both ends of the array until it
 * reaches the middle.
 * 
 * ArrayList Reversal:
 * 
 * The reverseArrayList method utilizes Collections.reverse, which is a built-in
 * method to reverse an ArrayList.
 * 
 * Printing:
 * 
 * The printArray method is used to print the elements of the array in a
 * formatted way.
 * 
 * 
 * The Collections class is imported to use the reverse method, which simplifies
 * reversing an ArrayList.
 * 
 * 
 * System.out.print("Original Array: ");
 * 
 * printArray(numbers)
 * 
 * This prints "Original Array: " followed by the contents of the numbers array
 * by calling the printArray method.
 * 
 * 
 * reverseArray(numbers);
 * 
 * The reverseArray method is called to reverse the contents of the numbers
 * array.
 * 
 * After reversing, it prints "Reversed Array: " followed by the updated array.
 * 
 * 
 * An ArrayList named List is created, and sample values are added using
 * Collections.addAll().
 * 
 * System.out.println(List); This prints the original ArrayList.
 * 
 * reverseArrayList(List); The reverseArrayList method is called to reverse the
 * contents of numberList.
 * 
 * After reversing, it prints the reversed ArrayList.
 * 
 * Method to Reverse an Array:
 * 
 * 
 * public static void reverseArray(int[] array) {
 * 
 * int left = 0;
 * 
 * int right = array.length - 1;
 * 
 * while (left < right) {
 * 
 * // Swap elements
 * 
 * int temp = array[left];
 * 
 * array[left] = array[right];
 * 
 * array[right] = temp;
 * 
 * left++;
 * 
 * right--; }
 * 
 * }
 * 
 * This method takes an integer array as input and reverses it in place using a
 * two-pointer approach:
 * 
 * left starts from the beginning (0) and right from the end (last index).
 * 
 * It swaps elements at these indices until they meet in the middle.
 * 
 * 
 * int[] numbers = {3, 5, 1, 8, 2, -4, 7};
 * 
 * Initial State:
 * 
 * left = 0 (points to the first element, 3)
 * 
 * right = 6 (points to the last element, 7)
 * 
 * Array: [3, 5, 1, 8, 2, -4, 7]
 * 
 * First Iteration:
 * 
 * Swap array[left] and array[right]:
 * 
 * temp = array[0] = 3
 * 
 * array[0] (3) is swapped with array[6] (7).
 * 
 * Array after swap: [7, 5, 1, 8, 2, -4, 3]
 * 
 * Update pointers:
 * 
 * left = 1
 * 
 * right = 5
 * 
 * Second Iteration:
 * 
 * Now left points to 5 and right points to -4:
 * 
 * Swap array[left] and array[right]:
 * 
 * temp = array[1] = 5
 * 
 * array[1] (5) is swapped with array[5] (-4).
 * 
 * Array after swap: [7, -4, 1, 8, 2, 5, 3]
 * 
 * Update pointers:
 * 
 * left = 2
 * 
 * right = 4
 * 
 * Third Iteration:
 * 
 * Now left points to 1 and right points to 2:
 * 
 * Swap array[left] and array[right]:
 * 
 * temp = array[2] = 1
 * 
 * array[2] (1) is swapped with array[4] (2).
 * 
 * Array after swap: [7, -4, 2, 8, 1, 5, 3]
 * 
 * Update pointers:
 * 
 * left = 3
 * 
 * right = 3
 * 
 * Termination:
 * 
 * The loop condition left < right is now false (both point to the middle
 * element, 8).
 * 
 * The loop exits, and the array has been fully reversed.
 * 
 * Final Result
 * 
 * The final state of the array is:
 * 
 * 
 * [7, -4, 2, 8, 1, 5, 3]
 * 
 * Summary of the Process
 * 
 * The method uses two pointers (left and right) to swap elements from both ends
 * of the array, moving towards the center.
 * 
 * It continues swapping until the two pointers meet or cross each other,
 * effectively reversing the order of elements in the array.
 * 
 * The approach works in-place, meaning it does not require additional space
 * proportional to the size of the array, making it space-efficient.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Method to Print the Array:
 * 
 * public static void printArray(int[] array) {
 * 
 * for (int num : array) {
 * 
 * System.out.print(num + " ");
 * 
 * }
 * 
 * System.out.println(); // New line for better formatting
 * 
 * }
 * 
 * This method iterates through the array and prints each element followed by a
 * space.
 * 
 * A new line is printed at the end for better formatting.
 * 
 * Method to Reverse an ArrayList:
 * 
 * public static void reverseArrayList(ArrayList<Integer> list) {
 * 
 * Collections.reverse(list);
 * 
 * }
 * 
 * This method uses Collections.reverse(list) to reverse the elements of the
 * ArrayList efficiently.
 * 
 * Summary
 * 
 * The program first reverses a static array and prints the original and
 * reversed arrays.
 * 
 * It then creates an ArrayList, reverses it using a built-in method, and prints
 * both the original and reversed lists.
 * 
 * The use of methods keeps the code organized and reusable.
 * 
 */