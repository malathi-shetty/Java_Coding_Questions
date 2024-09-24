package vowels_And_Consonants_Checker;

import java.util.Scanner;

public class Vowel_And_Consonant_Checker_4_Using_Loops {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");//Java Example Test
		String input = scan.nextLine();
		
		int vowelsCount = 0;
		int consonantCount = 0;
		
		for(char ch: input.toCharArray())
		{
			if(Character.isLetter(ch)) 
			{
				if("AEIOUaeiou".indexOf(ch) != -1)
			{
				vowelsCount++;
			}else
			{
				consonantCount++;
			}
			}
		}
		System.out.println("Vowels: " + vowelsCount);
		System.out.println("Consonants: " + consonantCount);
	}
}

/*
 * 1. **Start**.
2. **Initialize a constant** `VOWELS` that contains all vowel characters (both uppercase and lowercase).
3. **Prompt the user** for input (a string).
4. **Read the input string** from the user.
5. **Initialize two counters**: `vowelsCount` and `consonantsCount` to zero.
6. **Loop through each character** in the input string:
   - **If the character is a letter**:
     - **Check if it is a vowel**:
       - If true, increment `vowelsCount`.
       - If false, increment `consonantsCount`.
7. **Output the results**:
   - Print the number of vowels.
   - Print the number of consonants.
8. **End**.


 //  private static final String VOWELS = "AEIOUaeiou";
 Step 5: Initialize counters
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Step 6: Loop through each character
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if the character is a letter
                if (VOWELS.indexOf(ch) != -1) { // Check if it is a vowel
                    vowelsCount++;
                } else {
                    consonantsCount++; // Increment consonants count_Number_of_Words_in_a_String
                }

*/