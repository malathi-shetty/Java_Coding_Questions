package remove_duplicates_Strings_In_An_Array;

import java.util.HashSet;

public class Remove_Unique_duplicates_Characters_In_A_String_1_Using_a_HashSet {

	public static void main(String[] args) {
		String s = "programming";
		System.out.println("Unique Characters: " + findUniqueCharacters(s));
	}

	public static String findUniqueCharacters(String str) {
		HashSet<Character> uniqueChars = new HashSet<>();
		for(char c: str.toCharArray())
		{
			uniqueChars.add(c);
		}
		
		StringBuilder result = new StringBuilder();
		for(char c: uniqueChars)
		{
			result.append(c);
		}
		return result.toString();
	}

}
