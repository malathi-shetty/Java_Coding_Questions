package array_Coding_Questions_Assignment_Reverse_ArrayList_having_strings;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_ArrayList_having_strings {

	public static void main(String[] args) {
		// Reverse the ArrayList having strings

		// Sample ArrayList of strings
		ArrayList<String> stringList = new ArrayList<>();
		Collections.addAll(stringList, "Apple", "Banana", "Cherry", "Date", "Elderberry");

		// Print original ArrayList
		System.out.print("Original ArrayList: ");
		System.out.println(stringList);

		// Reverse the ArrayList
		reverseArrayList(stringList);

		// Print reversed ArrayList
		System.out.print("Reversed ArrayList: ");
		System.out.println(stringList);
	}

	// Method to reverse an ArrayList
	public static void reverseArrayList(ArrayList<String> list) {
		Collections.reverse(list);

	}

}

/*
 * 
 * To reverse an ArrayList that contains strings in Java, you can use the
 * Collections.reverse() method, just like with an ArrayList of integers.
 * 
 * ArrayList Initialization: An ArrayList named stringList is created and
 * populated with several string values (e.g., "Apple", "Banana", etc.) using
 * Collections.addAll().
 * 
 * Print Original ArrayList: The original contents of stringList are printed.
 * 
 * Reverse the ArrayList: The reverseArrayList method is called, which uses
 * Collections.reverse(list) to reverse the order of the elements in the
 * ArrayList.
 * 
 * Print Reversed ArrayList: Finally, the contents of the reversed ArrayList are
 * printed.
 * 
 * Output Example
 * 
 * Original ArrayList: [Apple, Banana, Cherry, Date, Elderberry]
 * 
 * Reversed ArrayList: [Elderberry, Date, Cherry, Banana, Apple]
 * 
 */