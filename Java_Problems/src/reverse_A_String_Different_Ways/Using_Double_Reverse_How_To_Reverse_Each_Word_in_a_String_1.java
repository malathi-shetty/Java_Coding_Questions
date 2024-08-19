package reverse_A_String_Different_Ways;

public class Using_Double_Reverse_How_To_Reverse_Each_Word_in_a_String_1 {

	public static void main(String[] args) {

		String s = "Welcome To Java and Selenium"; // original string
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
		System.out.println(rev);
	}
}

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