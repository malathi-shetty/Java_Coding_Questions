package remove_duplicates_Strings_In_An_Array;

import java.util.HashSet;

public class Remove_duplicates_from_String_4_HashSet_learn {

	public static void main(String[] args) {
		 String s = "acccbbbddd";
	        char[] a = s.toCharArray();
	        HashSet<Character> set = new HashSet<>();
	        HashSet<Character> dup = new HashSet<>();

	        for (char c : a) {
	            // If add returns false, it means the character is a duplicate
	            if (!set.add(c)) {
	            	dup.add(c); // Store duplicates
	            }
	        }

	        // Print unique characters
	        System.out.println("Unique characters: " + set);
	        // Print duplicates
	        System.out.println("Duplicate characters: " + dup);
	    


	}

}

/* Output:

Unique characters: [a, b, c, d]

Duplicate characters: [b, c, d]

*/