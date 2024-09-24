package replaceCharacter;

public class Replace_SecondOccurrence_E_with_specialcharacter_1_learn {

	public static void main(String[] args) {

		String s = "BOOKEEPER";
		
		StringBuilder newobj = new StringBuilder();
		char target = 'E';
		char replacement = '#';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char j = s.charAt(i); // all the characters

			if (j == target) {
				count++;

				if (count == 2) {
			//		if (count == 3) { // if replacement done in 3rd
					newobj.append(replacement);
				} else {
					newobj.append(j);
				}
			} else {
				newobj.append(j);
			}
		}
		System.out.println(newobj);
	}
}

/*
 * Book: You have the string "BOOKEEPER".
 * 
 * Two: You want to replace the second occurrence of 'E'.
 * 
 * Pairs: Keep a count of occurrences. When count reaches 2, it’s time to
 * replace with the special character.
 * 
 * Special Characters: Replace 'E' (second occurrence) with '#'.
 * 
 * So, following these steps in your code:
 * 
 * Initialize: Start with an empty StringBuilder and a counter.
 * 
 * Iterate: Loop through each character in the string.
 * 
 * Count Occurrences: Increase the count whenever the target character is
 * encountered.
 * 
 * Replace: When the count reaches 2, replace the character with the special
 * character.
 * 
 * Append: Append each character (whether replaced or not) to the StringBuilder.
 * 
 */