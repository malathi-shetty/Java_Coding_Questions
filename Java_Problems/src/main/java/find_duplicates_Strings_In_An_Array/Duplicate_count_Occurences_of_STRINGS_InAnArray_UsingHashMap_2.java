package find_duplicates_Strings_In_An_Array;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_count_Occurences_of_STRINGS_InAnArray_UsingHashMap_2 {

	public static void main(String[] args) {
		String s = "This is an Example";

		HashMap<Character, Integer> newobj = new HashMap<Character, Integer>();

		char[] a = s.toCharArray();
		for (char c : a) {
			if (c != ' ') { // Skip spaces
				if (newobj.containsKey(c)) {
					newobj.put(c, newobj.get(c) + 1);
				} else {
					newobj.put(c, 1);
				}
			}
		}

		// Display the counts
		for (Map.Entry<Character, Integer> entry : newobj.entrySet()) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
	}
}

/*
 * 
 * Output:
 * 
 * p ==> 1 
 * a ==> 2 
 * s ==> 2 
 * T ==> 1 
 * E ==> 1 
 * e ==> 1 
 * h ==> 1 
 * x ==> 1 
 * i ==> 2 
 * l ==> 1 
 * m ==> 1 
 * n ==> 1
 * 
 */