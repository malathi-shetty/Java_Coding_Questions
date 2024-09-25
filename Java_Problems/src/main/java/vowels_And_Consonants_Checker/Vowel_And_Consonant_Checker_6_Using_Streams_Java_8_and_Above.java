package vowels_And_Consonants_Checker;

import java.util.Scanner;

public class Vowel_And_Consonant_Checker_6_Using_Streams_Java_8_and_Above {

	//JDK issue
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

	//	long vowelsCount = input.chars().filter(ch -> "AEIOUaeiou".indexOf(ch) != -1).count();
	//	long consonantsCount = input.chars().filter(ch -> Character.isLetter(ch) && "AEIOUaeiou".indexOf(ch) == -1)
	//			.count();

	//	System.out.println("Vowels: " + vowelsCount);
	//	System.out.println("Consonants: " + consonantsCount);
	}
}

/*
 *         // Count vowels and consonants using streams
        long vowelsCount = input.chars()
                                 .filter(ch -> VOWELS.indexOf(ch) != -1)
                                 .count_Number_of_Words_in_a_String();
        
        long consonantsCount = input.chars()
                                     .filter(ch -> Character.isLetter(ch) && VOWELS.indexOf(ch) == -1)
                                     .count_Number_of_Words_in_a_String();
 * */