package vowels_And_Consonants_Checker;


import java.util.HashSet;
import java.util.Set;

public class Vowel_And_Consonant_Checker_8_Using_HashSet {

	public static void main(String[] args) {
		String input = "Java Example";
		
		Set<Character> vowels = new HashSet<>();
		for(char c: "aeiou".toCharArray())
		{
			vowels.add(c);
		}
		
		for(int i=0; i<input.length(); i++)
		{
			char ch = Character.toLowerCase(input.charAt(i));
			if(vowels.contains(ch))
			{
				System.out.println(ch + " at index " + i + " is a vowel.");
			}else
			{
				System.out.println(ch + " at index " + i + " is a consonant.");
			}
		}
	}
}