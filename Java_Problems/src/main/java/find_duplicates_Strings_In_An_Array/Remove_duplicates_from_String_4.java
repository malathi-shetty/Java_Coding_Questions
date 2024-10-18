package find_duplicates_Strings_In_An_Array;

import java.util.HashSet;

public class Remove_duplicates_from_String_4 {

	public static void main(String[] args) {
		 String s = "acccbbbddd";
	        char[] a = s.toCharArray();
	        HashSet<Character> uniqueChars = new HashSet<>();
	        HashSet<Character> duplicates = new HashSet<>();

	        for (char c : a) {
	            // If add returns false, it means the character is a duplicate
	            if (!uniqueChars.add(c)) {
	                duplicates.add(c); // Store duplicates
	            }
	        }

	        // Print unique characters
	        System.out.println("Unique characters: " + uniqueChars);
	        // Print duplicates
	        System.out.println("Duplicate characters: " + duplicates);
	    


	}

}