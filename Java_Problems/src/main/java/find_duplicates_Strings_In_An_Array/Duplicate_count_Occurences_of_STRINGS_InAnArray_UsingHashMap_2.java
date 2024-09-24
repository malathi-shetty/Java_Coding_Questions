package find_duplicates_Strings_In_An_Array;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_count_Occurences_of_STRINGS_InAnArray_UsingHashMap_2 {

	public static void main(String[] args) {
		String s = "This is an Example";

		HashMap<Character, Integer> newobj = new HashMap<Character, Integer>();

		char[] a = s.toCharArray();
		for (char c : a) {
			if (c != ' ') {  // Skip spaces
				if (newobj.containsKey(c)) {
					newobj.put(c, newobj.get(c) + 1);
				} else {
					newobj.put(c, 1);
				}
			}
		}

		// Display the counts
		for (Map.Entry<Character, Integer>  entry : newobj.entrySet()) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}

	}

}
