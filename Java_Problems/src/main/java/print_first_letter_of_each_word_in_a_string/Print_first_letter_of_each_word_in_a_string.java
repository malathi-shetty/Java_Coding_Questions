package print_first_letter_of_each_word_in_a_string;

public class Print_first_letter_of_each_word_in_a_string {

	public static void main(String[] args) {
		
		//Print first letter of each word in a string
		
		 String s = "This is a sample sentence";
	        
	        // Split the sentence into words using space as delimiter
	        String[] words = s.split(" ");
	        
	        // Loop through each word
	        for (String word : words) {
	            // Print the first letter of each word
	            System.out.println(word.charAt(0));

	}

}
}
	
	/*
	
	sentence.split(" ") splits the sentence into words based on spaces.
	
	word.charAt(0) extracts the first letter of each word.
	
	System.out.print(word.charAt(0)); prints each first letter without a newline, so they appear consecutively.
	
	*/