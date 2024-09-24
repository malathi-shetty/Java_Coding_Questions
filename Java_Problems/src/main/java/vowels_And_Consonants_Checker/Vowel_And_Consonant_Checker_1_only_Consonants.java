package vowels_And_Consonants_Checker;

public class Vowel_And_Consonant_Checker_1_only_Consonants {

	public static void main(String[] args) {
		
		String a ="Java Example";
		//J  a  v  a     E  x  a  m  p  l  e
		//0  1  2  3  4  5  6  7  8  9 10 11
	
		for(int i =0; i<a.length(); i+=2 ) // Loop through even indices
		{
			char ch = a.charAt(i);
			if(isVowel(ch))
			{
				System.out.println(ch + " at index " + i + " is a vowel.");
            } else {
                System.out.println(ch + " at index " + i + " is a consonant.");
            }	
		}
	}

	// Method to check if a character is a vowel
	private static boolean isVowel(char ch) {
		 // Convert character to lowercase to simplify comparison
			ch = Character.toLowerCase(ch);
			return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';			
		}

}
