package array_Coding_Questions_Assignment_Reverse_Array_and_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_ArrayList {

	public static void main(String[] args) {
		// Reverse_ArrayList

		// Sample ArrayList
		ArrayList<Integer> List = new ArrayList<>();
		Collections.addAll(List, 3, 5, 1, 8, 2, -4, 7);

		// Print original ArrayList
		System.out.print("Original ArrayList: ");
		System.out.println(List);

		// Reverse the ArrayList
		reverseArrayList(List);

		// Print reversed ArrayList
		System.out.print("Reversed ArrayList: ");
		System.out.println(List);
	}

	public static void reverseArrayList(ArrayList<Integer> list) {
		Collections.reverse(list);

	}

}

/*
 * 
 * To reverse an ArrayList in Java, you can use the Collections.reverse() method
 * 
 * ArrayList Initialization: An ArrayList named numberList is created and
 * populated with sample integers using Collections.addAll().
 * 
 * Reversal Logic: The reverseArrayList method uses Collections.reverse(list) to
 * reverse the elements of the ArrayList.
 * 
 * Printing: The original and reversed ArrayList are printed to the console.
 * 
 * Output:
 * 
 * Original ArrayList: [3, 5, 1, 8, 2, -4, 7]
 * 
Reversed ArrayList: [7, -4, 2, 8, 1, 5, 3]
 * 
 */