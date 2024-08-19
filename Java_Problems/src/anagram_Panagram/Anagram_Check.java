package anagram_Panagram;

import java.util.Arrays;

public class Anagram_Check {
	

		
		// Method to check if two strings are anagrams
	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove spaces and convert to lowercase
	        str1 = str1.replaceAll("\\s+", "").toLowerCase();
	        str2 = str2.replaceAll("\\s+", "").toLowerCase();

	        // If lengths are different, they cannot be anagrams
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert strings to character find_Maximum_And_Minimum_Values_in_arrays
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        // Sort character find_Maximum_And_Minimum_Values_in_arrays
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare sorted find_Maximum_And_Minimum_Values_in_arrays
	        return Arrays.equals(arr1, arr2);
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        // Check if they are anagrams
	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }

}
