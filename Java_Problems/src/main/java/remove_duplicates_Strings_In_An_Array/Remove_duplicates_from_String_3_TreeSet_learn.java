package remove_duplicates_Strings_In_An_Array;

import java.util.TreeSet;

public class Remove_duplicates_from_String_3_TreeSet_learn {

	//This class uses a TreeSet to automatically sort characters and identify duplicates.
	public static void main(String[] args) {
		 String s = "acccbbbddd";
	        char[] a = s.toCharArray();
	        TreeSet<Character> set = new TreeSet<>(); // Automatically Sorted unique characters
	        TreeSet<Character> duplicates = new TreeSet<>(); // Sorted duplicates

	        for (char c : a) {
	            // If add returns false, it means the character is a duplicate
	            if (!set.add(c)) {
	                duplicates.add(c); // Store duplicates
	            }
	        }

	        // Print unique characters
	        System.out.println("Unique characters: " + set);
	        // Print duplicates
	        System.out.println("Duplicate characters: " + duplicates);


	}

}
