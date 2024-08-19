package find_Unique_Characters_In_A_String;

import java.util.HashSet;

public class Unique_Characters_In_A_String {

	public static void main(String[] args) {
		
		String s ="abbbcddd";
		
		// Unique Characters in a string
		HashSet<Character> newobj1 = new HashSet();
		for(char i: s.toCharArray())
		{
			newobj1.add(i);
		}
		System.out.println(newobj1);
	}
}