package find_Consecutive_Character_in_a_String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_number_of_groups_of_consecutive_characters_in_a_string {
	
	/*
	 * 
	 * Code to find number of groups of consecutive characters in a string?
	 * 
I/P: geekksforgggeeks => O/p: (ee, kk, ggg)

Lets see how many would solve this :-)

Approach: Loop through start to end.

Take a character and store the index in start

Now go further in the string until you find a diff char, keep incrementing the index

Once you find a different character, note down the index - end.

Print the substring from start - end.


	 */

	public static void main(String[] args) {
		 String input = "geekksforgggeeks";
	        List<String> groups = findConsecutiveGroups(input);
	        System.out.println(groups);
	    }

	    public static List<String> findConsecutiveGroups(String str) {
	    	 Set<String> Set = new HashSet<>(); // Use a Set to avoid duplicates
	        List<String> result = new ArrayList<>();
	        
	        int n = str.length();
	        if (n == 0) return result; // Return empty if the input is empty

	        int start = 0;

	        while (start < n) {
	            int end = start;

	            // Move end pointer until a different character is found
	            while (end < n && str.charAt(end) == str.charAt(start)) {
	                end++;
	            }

	            // If there are at least two consecutive characters, add to result, check for duplicates
	            String group = str.substring(start, end);
	            if (end - start > 1 && !Set.contains(group)) {
	                Set.add(group);
	                result.add(group);
	            }

	            // Move start pointer to end
	            start = end; // Move to the next different character
	        }

	        return result;
	}


	}

/*
Initialization: The findConsecutiveGroups method takes the input string and initializes an empty list to store the groups of consecutive characters.

Outer Loop: It loops through the string using a start pointer.

Inner Loop: A nested loop moves the end pointer until a different character is found.

Condition Check: If the length of the group (i.e., end - start) is greater than 1, it adds that substring to the result list.

Update Start: The start pointer is updated to the end position for the next iteration.

Output:

For the input string geekksforgggeeks, the output will be:

[ee, kk, ggg]
		
		*/

