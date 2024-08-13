package vowels_And_Consonants_Checker;

import java.util.Scanner;

public class Vowel_And_Consonant_Checker_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		int vowelsCount = input.length() - input.replaceAll("[AEIOUaeiou]", "").length();
		int consonantsCount = input.length()
				- input.replaceAll("[BCDFGJKLMNPQSTVXZHRWYbcdfghjklmnpqrstvwxyz]", "").length();

		System.out.println("Vowels: " + vowelsCount);
		System.out.println("Consonants: " + consonantsCount);
	}
}