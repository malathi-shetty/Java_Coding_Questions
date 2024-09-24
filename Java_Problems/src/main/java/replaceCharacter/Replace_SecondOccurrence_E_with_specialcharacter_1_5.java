package replaceCharacter;

public class Replace_SecondOccurrence_E_with_specialcharacter_1_5 {

	public static void main(String[] args) {

		String s = "BOOKEEPER";
		StringBuilder newobj = new StringBuilder();
		char target = 'E';
		char replacement = '#';

		int count = 0;
		char[] a = s.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				count++;
				if (count == 2) {
					a[i] = replacement;
				}
			}
		}
		// Convert the character array back to a string
		String result = new String(a);
		System.out.println(result); // Print the modified string

	}

}

/*
 * Initialization:
 * 
 * String s = "BOOKEEPER"; is your original string. char target = 'E'; is the
 * character you want to replace. char replacement = '#'; is the character that
 * will replace the second occurrence of the target. Conversion to Array:
 * 
 * char[] a = s.toCharArray(); converts the string to a character array for
 * easier manipulation. Loop and Replacement:
 * 
 * Iterate through the character array with a for loop. Increment the count
 * whenever the target character is encountered. Replace the character at the
 * second occurrence with the replacement character. Construct Final String:
 * 
 * String result = new String(a); converts the modified character array back to
 * a string. System.out.println(result); prints the resulting string. Result
 * Given the string "BOOKEEPER" and replacing the second 'E':
 * 
 * The second occurrence of 'E' (which is at index 5) will be replaced by '#'.
 * The final string will be "BOOKE#PER".
 * 
 */