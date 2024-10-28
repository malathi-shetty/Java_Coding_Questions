package string_Capitalization;

public class String_Capitalization_Using_StringBuilder {

	public static void main(String[] args) {
		// Write Code to convert String a="i love programming" to a="I Love Programming"

		// Convert string to title case
		String a = "i love programming";
		a = capitalize(a);
		System.out.println(a); // Output: I Love Programming
	}

	// Method to capitalize the first letter of each word
	public static String capitalize(String s) {
		String[] words = s.split(" ");
		StringBuilder newobj = new StringBuilder();

		for (String word : words) {
			if (word.length() > 0) {
				newobj.append(Character.toUpperCase(word.charAt(0)));
				newobj.append(word.substring(1)).append(" ");
			}
		}

		return newobj.toString().trim();
	}
}