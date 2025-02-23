package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.HashSet;

public class Duplicates_in_the_Array_Using_HashSet_learn {

	// Duplicates in the Array

	// This method leverages a HashSet to track set elements. If an element is
	// already in the set, it is a duplicate.

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 1, 2, 6 };

		findDuplicates(a);

	}

	public static void findDuplicates(int[] a) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : a) {
			if (!set.add(num)) {
				duplicates.add(num);
			}
		}

		System.out.println("Duplicates: " + duplicates);

	}
}
/*
 * A HashSet is a collection that does not allow duplicate elements.
 * 
 * An integer array a is defined with the elements { 1, 2, 3, 4, 5, 1, 2, 6 }.
 * This array contains some duplicate values (1 and 2).
 * 
 * The findDuplicates(a) method is called with this array to find and print the
 * duplicates.
 * 
 * Two HashSet objects are created:
 * 
 * set: This will keep track of the unique elements encountered in the array.
 * 
 * duplicates: This will store the elements that appear more than once (the
 * duplicates).
 * 
 * The for loop iterates through each element (num) in the array a.
 * 
 * The set.add(num) method attempts to add the current element (num) to the set.
 * 
 * If the element is not already in the set (i.e., it is unique), it will be
 * added and add() will return true.
 * 
 * If the element is already in the set (i.e., it is a duplicate), add() will
 * return false, and the code inside the if block will execute. This adds the
 * duplicate element to the duplicates set.
 * 
 * Printing the Duplicates:
 * 
 * System.out.println("Duplicates: " + duplicates);
 * 
 * After the loop finishes, the duplicates set contains all the duplicate values
 * found in the array.
 * 
 * The program prints out the duplicates.
 * 
 * Output:
 * 
 * For the given array { 1, 2, 3, 4, 5, 1, 2, 6 }, the program will print:
 * 
 * Duplicates: [1, 2]
 * 
 * Key Points:
 * 
 * The HashSet ensures that only unique values are stored in the set, and
 * duplicate values are efficiently identified when they attempt to be added
 * again.
 * 
 * The duplicates set stores only the elements that appeared more than once in
 * the original array.
 * 
 * The method operates with time complexity of O(n) where n is the number of
 * elements in the array, due to the efficient operations of the HashSet
 * (average time complexity for add() is O(1)).
 * 
 * This is a simple yet effective way to find duplicates in an array using a
 * HashSet
 * 
 */