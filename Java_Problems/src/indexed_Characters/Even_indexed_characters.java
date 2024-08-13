package indexed_Characters;

public class Even_indexed_characters {

	public static String evenIndexedCharacters(String s) {
		StringBuilder evenIndices = new StringBuilder();

		for (int i = 0; i < s.length(); i += 2) {
			evenIndices.append(s.charAt(i));
		}
		return evenIndices.toString();
	}

	public static void main(String[] args) {
		String input = "Hello, World!";
		String result = evenIndexedCharacters(input);

		System.out.println("Even-Indexed Characters: " + result);
		// Output: Hlo ol!
	}
}