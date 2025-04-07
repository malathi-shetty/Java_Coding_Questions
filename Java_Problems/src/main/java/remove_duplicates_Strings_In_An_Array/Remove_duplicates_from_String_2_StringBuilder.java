package remove_duplicates_Strings_In_An_Array;

import java.util.LinkedHashSet;

public class Remove_duplicates_from_String_2_StringBuilder  {
//Write a Java program to remove duplicates from given String str1 = "automation" : o/p: "automin" ?
	
	public static void main(String[] args) {
		 String s = "automation";
	        String result = removeDuplicates(s);
	        System.out.println("Output: " + result);

	}

	public static String removeDuplicates(String s) {
		 // Create a LinkedHashSet to store characters without duplicates
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Iterate over the string and add characters to the set
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }

        // Convert the set back to a string
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}

/*
 * 
 * LinkedHashSet: The LinkedHashSet is used to store characters without duplicates. It also maintains the order of insertion, which is important to retain the order of the characters as in the original string.

StringBuilder: After adding all characters to the LinkedHashSet, we use a StringBuilder to construct the resultant string by appending characters in the order they were added.

Output:
For the input str1 = "automation", the program will output:

Output: automin

This result removes the duplicate characters 'a' and 'o' from the original string, leaving the first occurrence of each character.

*/
 

