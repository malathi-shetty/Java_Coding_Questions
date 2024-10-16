package find_duplicates_Strings_In_An_Array;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_duplicates_from_String_2 {

	public static void main(String[] args) {
		// remove the duplicates from the string?? acccbbbddd and then arrange in ascending order
		
		 String s = "acccbbbddd";

	        // Use a HashSet to store unique characters
	        HashSet<Character> Set = new HashSet<>();

	        // Add characters to the HashSet
	        for (char c : s.toCharArray()) {
	        	Set.add(c);
	        }

	        // Convert HashSet to char array
	        char[] unique = new char[Set.size()];
	        int count = 0;
	        for (char c : Set) {
	        	unique[count++] = c;
	        
	        }

	        // Sort the unique characters
	        Arrays.sort(unique);

	        // Convert sorted char array back to string
	        String result = new String(unique);

	        System.out.println(result);

	}

}

/*
 * 
 * HashSet: A HashSet is used to store unique characters from the input string.

Loop through Characters: Each character from the string is added to the HashSet, automatically handling duplicates.

Convert to Array: The unique characters from the HashSet are copied to a character array.

Sort and Output: The character array is sorted and then converted back to a string for the final output.

*/
