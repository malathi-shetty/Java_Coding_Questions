package replaceCharacter;

public class Replace_SecondOccurrence_E_with_specialcharacter_1_3 {

	public static void main(String[] args) {

		String s = "BOOKEEPER";
		StringBuilder sb = new StringBuilder(s);

		int k = sb.indexOf("E"); // Find the first occurrence of 'E'
		System.out.println("First occurrence index: " + k); // Should print 4

		// Find the second occurrence of 'E'
		int j = sb.indexOf("E", k + 1);
		System.out.println("Second occurrence index: " + j); // Should print 5

		int l = sb.indexOf("E", j + 1);
		System.out.println("Second occurrence index: " + l); // Should print 7
		
		// Replace the second occurrence of 'E' with '#'
		sb.setCharAt(j, '#');

		// Print the modified StringBuilder
		System.out.println(sb); // Should print "BOOKE#PER"

	}

}

/*
 * Finding Occurrences:
 * 
 * indexOf("E") returns the index of the first occurrence of 'E'.
 * 
 * indexOf("E", k + 1) searches for 'E' starting just after the first
 * occurrence, thus giving the index of the second occurrence. Replacement:
 * 
 * setCharAt(j, '#') changes the character at the index of the second occurrence
 * of 'E' to '#'.
 * 
 * Output:
 * 
 * The final StringBuilder will be "BOOKE#PER".
 * 
 * Output Details: First Occurrence Index: 4 Second Occurrence Index: 5 Final
 * String: "BOOKE#PER"
 * 
 */