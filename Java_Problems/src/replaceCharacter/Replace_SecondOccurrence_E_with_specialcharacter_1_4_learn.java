package replaceCharacter;

public class Replace_SecondOccurrence_E_with_specialcharacter_1_4_learn {

	public static void main(String[] args) {
		String s = "BOOKR123R%";
	//	String s = "BOOKEEPER";
		char target = 'E';
		char replacement = '#';

		StringBuilder newobj = new StringBuilder();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char j = s.charAt(i);

			if (j == target) {
				count++;

				if (count == 2) {
					newobj.append(replacement);
					continue;
				}
			}
			newobj.append(j);
		}
		System.out.println(newobj.toString());
	}

}

/*
 * String s = "BOOKR123%R"; 
 * // Input string char target = 'R'; // Character to  replace
 * 
  char replacement = '#'; // Replacement character
 * 
 * StringBuilder newobj = new StringBuilder(); 
 * 
 * int count = 0; // Counter for occurrences of the target character
 * 
 * for (int i = 0; i < s.length(); i++) 
 * 
 * { char currentChar = s.charAt(i); // Get the current character
 * 
 * if (currentChar == target) { // If current character is the target 
 * 
 * count++;
 * 
 * if (count == 2) { // If it is the second occurrence
 * 
 * newobj.append(replacement); // Append the replacement character - Replace the second occurrence
 * 
 * continue; // Skip appending the original target character 
 * } } 
 * 
 * newobj.append(currentChar); // Append the current character (whether it's the target or not) 
 *  Append non-target characters or the first occurrence of the target
 * 
 * }
 * 
 * System.out.println(newobj.toString()); // Output the final string
 * 
 * 
 */
