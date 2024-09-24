package replaceCharacter;

public class Replace_SecondOccurrence_E_with_specialcharacter_1_6 {

	public static void main(String[] args) {

		String s = "BOOKEEPER";
		StringBuilder sb = new StringBuilder(s);

		// Replace the character at index 5 with '#'
		sb.setCharAt(5, '#');

		// Print the modified StringBuilder
		System.out.println(sb.toString());

	}

}

/*
 * Initialization:
 * 
 * String s = "BOOKEEPER"; initializes the original string. 
 * 
 * StringBuilder sb = new StringBuilder(s); creates a StringBuilder instance with the original
 * string. 
 * 
 * Replacing a Character:
 * 
 * sb.setCharAt(5, '#'); replaces the character at index 5 with '#'. 
 * 
 * Note: Indexing is zero-based, so index 5 refers to the sixth character in the
 * string, which is 'E'. 
 * 
 * Output:
 * System.out.println(sb.toString()); converts the StringBuilder to a string and
 * prints the modified result. 
 * 
 * Result : Given the original string "BOOKEEPER" and replacing the character at index 5:
 * 
 * The character 'E' at index 5 is replaced by '#'. The final string will be  "BOOKE#PER".
 * 
 */