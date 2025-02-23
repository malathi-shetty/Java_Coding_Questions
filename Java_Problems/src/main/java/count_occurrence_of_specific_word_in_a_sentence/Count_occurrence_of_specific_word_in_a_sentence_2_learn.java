package count_occurrence_of_specific_word_in_a_sentence;

public class Count_occurrence_of_specific_word_in_a_sentence_2_learn {

	public static void main(String[] args) {

		// Program to count occurrence of specific word in a sentence

        // Input: Sentence
        String sentence = "Java is a versatile language. Java is widely used."; // Hardcoded sentence

        // Input: Word to count
        String word = "Java"; // Hardcoded word to search for

        // Normalize case by converting both the sentence and word to lowercase
        String lowerCaseSentence = sentence.toLowerCase();
        String lowerCaseWord = word.toLowerCase();

        // Split the sentence into words (tokenize)
        String[] words = lowerCaseSentence.split("\\W+"); // Splits by non-word characters (punctuation, spaces, etc.)

        // Count occurrences of the specific word
        int count = 0;
        for (String w : words) {
            if (w.equals(lowerCaseWord)) {
                count++;
            }
        }

        // Output the result
        System.out.println("The word \"" + word + "\" appears " + count + " time(s) in the sentence.");
    }

}
