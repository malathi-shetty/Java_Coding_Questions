package array_Coding_Questions_Assignment_Common_elements_in_both_the_Arrays;

import java.util.HashSet;

public class Common_Single_Number_In_An_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7, 8 };
		HashSet newobj = new HashSet();

		// Iterate through the array
		for (int i = 0; i < a.length; i++) {

			// Try to add the current element to the HashSet
			if (newobj.add(a[i]) == false) // duplicate not able to add
			{
				System.out.println("Duplicate found: " + a[i]);
				System.out.println("Current HashSet: " + newobj);
			}

		}
		// Print the final state of the HashSet after the loop
		System.out.println("Final HashSet: " + newobj);
	}
}

/*
 * Duplicate Detection and Printing:
 * 
 * Inside the if block, if add(a[i]) returns false, it indicates that the
 * element is a duplicate. You print a message indicating the duplicate and then
 * print the current state of the HashSet. Final State of the HashSet:
 * 
 * After the loop has finished processing all elements, the final state of the
 * HashSet is printed. This shows the unique elements collected from the array.
 * 
 * Note: The exact order of elements in the HashSet may vary because HashSet
 * does not guarantee any specific order for its elements
 */