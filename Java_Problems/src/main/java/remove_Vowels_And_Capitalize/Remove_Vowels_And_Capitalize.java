package remove_Vowels_And_Capitalize;

public class Remove_Vowels_And_Capitalize {
	/*
	 * Given a string, remove all vowels (both uppercase and lowercase) and
	 * capitalise the first letter of each word in the resulting string.
	 * 
	 * 𝐄𝐱𝐚𝐦𝐩𝐥𝐞:
	 * 
	 * 𝐈𝐧𝐩𝐮𝐭: "programming is fun"
	 * 
	 * 𝐎𝐮𝐭𝐩𝐮𝐭: "Prgrmmng S Fn"
	 * 
	 * 𝐄𝐱𝐩𝐥𝐚𝐧𝐚𝐭𝐢𝐨𝐧:
	 * 
	 * - Remove vowels: "prgrmmng s fn"
	 * 
	 * - Capitalize first letter of each word: "Prgrmmng S Fn"
	 */

	/*
	 * Solving this problem step by step by following these steps:
	 * 
	 * 1. Remove vowels from the string.
	 * 
	 * 2. Split the string into words.
	 * 
	 * 3. Capitalize the first letter of each word.
	 * 
	 * 4. Join the words back together.
	 */

	public static void main(String[] args) {
		String input = "programming is fun";
		String output = RemoveVowelsAndCapitalize(input);
		System.out.println(output);

	}

	public static String RemoveVowelsAndCapitalize(String input) {
		// Step1: Remove vowels
		String noVowels = input.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");

		// Step 2: Split the string into words
		String[] words = noVowels.split("\\s+");

		// Step 3: Capitalize the first letter of each word
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			if (!word.isEmpty()) {
				result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			}
		}

		// Step 4: Return the final string without extra space at the end

		return result.toString().trim();
	}

}

/*

replaceAll("[aeiouAEIOU]", "") removes all vowels (both lowercase and uppercase).

split("\\s+") splits the string by spaces into words.

For each word, we capitalize the first letter using Character.toUpperCase(word.charAt(0)) and append the rest of the word unchanged.

trim() removes any extra trailing space at the end of the final result.

Output:

For the input "programming is fun", the output will be:

Prgrmmng S Fn

*/