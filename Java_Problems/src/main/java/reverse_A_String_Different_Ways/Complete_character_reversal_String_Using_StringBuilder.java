package reverse_A_String_Different_Ways;

public class Complete_character_reversal_String_Using_StringBuilder {

	public static void main(String[] args) {
		
		String original = "Testing questions";
		System.out.println("original: " + original);
		StringBuilder reversed = new StringBuilder(original).reverse();
		System.out.println("StringBuilder: " + reversed.toString());
	}
}

/*

original: Testing questions
StringBuilder: snoitseuq gnitseT

*/