package vowels_And_Consonants_Checker;

public class Vowel_And_Consonant_Checker_2_all_Except_Space {

	public static void main(String[] args) {
		
		String a = "Java Example_Test";		
		for(int i=0; i<a.length(); i++) // Loop through all indices
		{
			char ch = a.charAt(i);
			if(Character.isLetter(ch))// Check if the character is a letter
			{
				if(isVowel(ch))
				{
					System.out.println(ch + " at index " + i + " is a vowel. ");
				}else
				{
					System.out.println(ch + " at index " + i + " is a consonant. ");
				}
			}
		}
	}
	private static boolean isVowel(char ch) { // Method to check if a character is a vowel
	 // Convert character to lowercase to simplify comparison
		ch = Character.toLowerCase(ch);
		return ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u';
	}
}