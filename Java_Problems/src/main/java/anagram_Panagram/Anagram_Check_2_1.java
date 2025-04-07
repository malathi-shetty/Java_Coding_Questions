package anagram_Panagram;

import java.util.Arrays;

public class Anagram_Check_2_1 {
	
	 public static void main(String[] args) {
	        String str1 = "tomato";
	        String str2 = "matoto";

	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	        // If lengths are different, they can't be anagrams
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert both strings to character arrays
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();

	        // Sort both arrays
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Compare the sorted arrays
	        return Arrays.equals(charArray1, charArray2);
	    }

}

/*
 * 
 * Length Check: First, we check if the lengths of the two strings are equal. If they're not, the strings can't be anagrams.

Convert to Character Arrays: The strings are converted to character arrays.

Sort Arrays: The arrays are sorted in lexicographical order.

Compare Arrays: If the sorted character arrays are identical, the strings are anagrams; otherwise, they're not.

Output for the given strings:

For the input str1 = "tomato" and str2 = "matoto", the program will print:

tomato and matoto are anagrams.

*/
