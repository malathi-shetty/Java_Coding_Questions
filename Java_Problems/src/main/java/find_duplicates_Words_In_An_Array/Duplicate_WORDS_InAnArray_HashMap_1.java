package find_duplicates_Words_In_An_Array;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_WORDS_InAnArray_HashMap_1 {
	
	//Find each word occurrence from given string in string java

	public static void main(String[] args) {
		String str = "Alice is girl Girl and Bob is boy bOY";
		Map<String, Integer> newobj = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
			if (newobj.containsKey(word))
				newobj.put(word, newobj.get(word) + 1);
			else
				newobj.put(word, 1);
		}
	//	System.out.println(newobj);
		// Display the counts
				for (Map.Entry<String, Integer> entry : newobj.entrySet()) {
					System.out.println(entry.getKey() + " ==> " + entry.getValue());
	}

}
}