package find_duplicates_Strings_In_An_Array;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		removeDuplicateChar("input: My name is John");

	}

	public static void removeDuplicateChar(String s) {
		StringBuilder result = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				result.append(c);
			}
		}
		System.out.println("After removing duplicates: " + result.toString());
	}

}
