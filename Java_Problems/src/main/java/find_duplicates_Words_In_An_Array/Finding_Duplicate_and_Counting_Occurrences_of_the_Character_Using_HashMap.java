package find_duplicates_Words_In_An_Array;

import java.util.HashMap;
import java.util.Map;

public class Finding_Duplicate_and_Counting_Occurrences_of_the_Character_Using_HashMap  {

	//JDK issues
	
	public static void main(String[] args) {
		  String input = "programming";
		  DuplicatescountCharacterOccurrences(input);
	    }

	    public static void DuplicatescountCharacterOccurrences(String str) {
	        HashMap<Character, Integer> charCountMap = new HashMap<>();

	        // Count occurrences
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Print all character counts
	        System.out.println("Character counts are:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
	        }
	        
	        System.out.println(" ");
	     // Find duplicates
	        System.out.println("Duplicate characters are:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
	            }
	        }
	}

}
