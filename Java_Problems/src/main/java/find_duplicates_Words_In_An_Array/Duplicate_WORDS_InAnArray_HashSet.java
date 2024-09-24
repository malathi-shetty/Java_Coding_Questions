package find_duplicates_Words_In_An_Array;

import java.util.HashSet;

public class Duplicate_WORDS_InAnArray_HashSet {

	public static void main(String[] args) {

	//	String s = "Malathi Shetty Shetty"; // Example string with duplicate words
		String s = "I am a student student for testing testing learning learning Java Selenium Java Selenium"; 
		
        String[] words = s.split(" "); // Split string into words based on spaces
        
        HashSet<String> set = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        
        
        for (String word : words) {
            if (!set.add(word)) { // If word is already in uniqueWords set
                duplicates.add(word); // Add it to duplicates set
            }
        }
        
        System.out.println("Duplicate words in the string:");
        for (String duplicate : duplicates) {
            System.out.println(duplicate);
        }
		

	}

}
