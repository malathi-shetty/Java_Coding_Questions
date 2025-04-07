package find_duplicates_CharacterCount_Replace;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Duplicates_CharacterCount_Replace {

	/*
	 * Given a string, count the occurrence of each character and replace
	 * duplicates:
	 * 
	 * - Input: "Automation"
	 * 
	 * - Output: "2u22m22i2n"
	 */

	public static void main(String[] args) {
		String input = "Automation";
		String output = CharacterCountReplace(input);
		System.out.println("Input: '" + input + "'");
		System.out.println("Output: '" + output + "'");
	}

	public static String CharacterCountReplace(String input) {
		// Create a map to store character frequencies
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Convert the input string to a char array
		char[] chars = input.toCharArray();

		// Count the frequency of each character (case-insensitive)
		for (char c : chars) {
			char lowerCaseChar = Character.toLowerCase(c);
			charCountMap.put(lowerCaseChar, charCountMap.getOrDefault(lowerCaseChar, 0) + 1);

		}

		// Build the result string
		StringBuilder result = new StringBuilder();
		for (char c : chars) {
			char lowerCaseChar = Character.toLowerCase(c);
			int count = charCountMap.get(lowerCaseChar);
			if (count > 1) {
				result.append(count);
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}
}

/*
 * 
 * we need to count the occurrences of each character in the string and replace
 * characters that occur more than once with the number of times they appear.
 * 
 * Here is the step-by-step approach:
 * 
 * Count the occurrence of each character in the string.
 * 
 * For characters that appear more than once, replace them with the number of
 * occurrences.
 * 
 * For characters that appear only once, retain the character itself.
 * 
 * HashMap: We use a HashMap to store the count of each character. The key is
 * the character, and the value is its count in the string.
 * 
 * Counting occurrences: We loop through the string and update the count for
 * each character.
 * 
 * Building the result: We then loop through the string again. If a character
 * appears more than once, we append its count to the result string. Otherwise,
 * we append the character itself.
 * 
 * Output: For the input string "Automation", the output will be:
 * 
 * Output: 2u22m22i2n
 * 
 * How the output is generated:
 * 
 * A occurs 1 time → remains as A.
 * 
 * u occurs 2 times → replaced by 2.
 * 
 * t occurs 2 times → replaced by 2.
 * 
 * o occurs 1 time → remains as o.
 * 
 * m occurs 1 time → remains as m.
 * 
 * a occurs 1 time → remains as a.
 * 
 * t occurs 2 times → replaced by 2.
 * 
 * i occurs 1 time → remains as i.
 * 
 * o occurs 1 time → remains as o.
 * 
 * n occurs 1 time → remains as n.
 * 
 * So, the final output is "2u22m22i2n".
 * 
 */