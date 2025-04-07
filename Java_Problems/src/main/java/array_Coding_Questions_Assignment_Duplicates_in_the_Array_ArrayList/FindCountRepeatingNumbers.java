package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindCountRepeatingNumbers {

    public static void main(String[] args) {
        // Test cases with different edge cases
        int[] a = {1, 2, 3, 2, 4, 5, 4}; // Duplicate elements
        // int[] a = {}; // Empty array
        // int[] a = {5}; // Array with one element
        // int[] a = {1, 1, 1, 1}; // Array with all duplicates
        // int[] a = {1, 2, 3, 4}; // Array with no duplicates
        printRepeatingNumbers(a);
    }

    private static void printRepeatingNumbers(int[] a) {
    	
    	 // Print the input array for better understanding
        System.out.println("Original Input Array: " + Arrays.toString(a));
     // Sort the array first
        Arrays.sort(a);
        System.out.println("\nSorted Input Array: " + Arrays.toString(a));
        
        
        if (a.length == 0) {
            System.out.println("Array is empty. No duplicates found.");
            return;
        }

        // Use a map to store the frequency of each number
        Map<Integer, Integer> newobj = new HashMap<>();

        // Loop through the array and count occurrences
        for (int i = 0; i < a.length; i++) {
        	newobj.put(a[i], newobj.getOrDefault(a[i], 0) + 1);
        }

        // Print the frequencies of all Numbers
        System.out.println("\nFrequency of Numbers:");
        for (Map.Entry<Integer, Integer> mapEntry : newobj.entrySet()) {
            System.out.println("Number " + mapEntry.getKey() + " appears " + mapEntry.getValue() + " times");
        }
        //or
        // Print the map for reference
        System.out.println("\nFrequency map: " + newobj);

        // Now, print the keys (numbers) that are repeated (value > 1) // print the duplicates (only those numbers where frequency > 1)
        boolean foundDuplicate = false;
        
        System.out.println("\nDuplicates found:");
        for (Map.Entry<Integer, Integer> mapEntry : newobj.entrySet()) {
            if (mapEntry.getValue() > 1) {
                System.out.println("Duplicate Found - Number: " + mapEntry.getKey() + " appears " + mapEntry.getValue() + " times");
                foundDuplicate = true;
            }
        }

        // If no duplicates were found
        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }
}
