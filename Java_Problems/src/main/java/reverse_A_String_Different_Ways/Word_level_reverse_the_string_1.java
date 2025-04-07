package reverse_A_String_Different_Ways;

public class Word_level_reverse_the_string_1 {

	public static void main(String[] args) {

		String s = "Welcome To Java and Selenium"; // original string
		System.out.println("s: " + s);
		String[] words = s.split(" "); // splitting string into multiple words

		String rev = "";
		for (String w : words) // Welcome
		{
			String revWords = "";

			for (int i = w.length() - 1; i >= 0; i--) // Welcome
			{
				revWords = revWords + w.charAt(i);
			}
			rev = rev + revWords + " "; // emocleW oT avaJ
		}
		System.out.println("rev: " + rev);
	}
}

/*Output:
 * 
 * s: Welcome To Java and Selenium
 * 
 * rev: emocleW oT avaJ dna muineleS 
 */

/*
 * Each word would be split first Then store them into a different array
 * variable i.e string array variable Inside the string array variable we have
 * to store three different words which are splitted from the single string
 * Apply inversion_Of_A_Sentence_Number string algorithm Need to extract each and every word & then
 * inversion_Of_A_Sentence_Number that particular word Now again add or combine these three different
 * words in single string
 * 
 * 
 */