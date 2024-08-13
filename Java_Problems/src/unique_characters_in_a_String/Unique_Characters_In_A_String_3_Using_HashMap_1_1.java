package unique_characters_in_a_String;

import java.util.HashMap;

public class Unique_Characters_In_A_String_3_Using_HashMap_1_1 {

	public static void main(String[] args) {
		String s = "hello world!";
		System.out.println("Unique Characters: " + findUniqueCharacters(s));

	}

	public static String findUniqueCharacters(String str) {
		HashMap<Character, Integer> charCount = new HashMap<>();
		int count =1;
		 // Count occurrences of each character
		for(int i=0; i<str.length(); i++)
		{
			 char c = str.charAt(i); // Get the character at index i
			if(!charCount.containsKey(c)) 
			{
				charCount.put(c, count);
			}else
			{
				charCount.put(c,charCount.get(c)+1);
			}
			
		}
		
		 // Build a string of unique characters
        StringBuilder uniqueChars = new StringBuilder();
        
		for(Character c:charCount.keySet())
		{
			 if (charCount.get(c) == 1) { // Check if the character appears exactly once
	                uniqueChars.append(c);
	 }
		}	
		return uniqueChars.toString(); // Return unique characters
	}
}

/*
 * A loop iterates through each character in the input string.
If a character is not already in the charCount map, it adds the character with an initial count of 1.
If the character is already in the map, it increments its count.

A StringBuilder named uniqueChars is used to collect characters that appear exactly once.
Another loop iterates through the keys (characters) in the charCount map. If a character's count is 1, 
it is appended to uniqueChars.
Return Value: The method returns the string of unique characters.


 * Input String: "hello world!" contains the following characters:

h: 1 time
e: 1 time
l: 3 times
o: 2 times
(space): 1 time
w: 1 time
r: 1 time
d: 1 time
!: 1 time
Unique Characters: The characters that appear exactly once in the input string are h, e, (space), w, r, d, and !.
*/
