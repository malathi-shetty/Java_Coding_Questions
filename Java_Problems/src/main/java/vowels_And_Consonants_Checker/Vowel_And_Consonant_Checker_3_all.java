package vowels_And_Consonants_Checker;

public class Vowel_And_Consonant_Checker_3_all {

	public static void main(String[] args) {

		String a = "Java Example_Test@123$sasa978 78";

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (Character.isLetter(ch)) {
				if (isVowel(ch)) {
					System.out.println(ch + " at index " + i + " is a vowel.");
				} else {
					System.out.println(ch + " at index " + i + " is a consonants.");
				}
			} else if (ch == ' ') {
				System.out.println("Space at index: " + i);
			} else if (Character.isDigit(ch)) {
				System.out.println("Digit '" + ch + "' at index " + i);
			} else {
				System.out.println("Special character '" + ch + "' at index " + i);
			}
		}

	}

	private static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}