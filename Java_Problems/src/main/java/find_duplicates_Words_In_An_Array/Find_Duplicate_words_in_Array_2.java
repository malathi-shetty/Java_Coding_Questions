package find_duplicates_Words_In_An_Array;

public class Find_Duplicate_words_in_Array_2 {

	public static void main(String[] args) {
		String string = "Java is a programming language. Java is widely used in software Testing";
		String[] words = string.toLowerCase().split(" ");  // Split by whitespace
		String word = "java";
		int occurrences = 0;
		for (int i = 0; i < words.length; i++)
			if (words[i].equals(word))
				occurrences++;
		System.out.println("Occurrences of " + word + ": " + occurrences);

	}

}
