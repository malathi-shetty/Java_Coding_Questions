package vowels_And_Consonants_Checker;

import java.util.Scanner;

public class Vowel_And_Consonant_Checker_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		long vowelsCount = input.chars().filter(ch -> "AEIOUaeiou".indexOf(ch) != -1).count();
		long consonantsCount = input.chars().filter(ch -> Character.isLetter(ch) && "AEIOUaeiou".indexOf(ch) == -1)
				.count();

		System.out.println("Vowels: " + vowelsCount);
		System.out.println("Consonants: " + consonantsCount);
	}
}