package reverse_A_String_Different_Ways;

public class Complete_character_reversal_String_4 {

	public static void main(String[] args) {
		
		String s = "Java coding questions";
		System.out.println("s: " + s);
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) // i--= 3 characters; i-- =2; i-- = 1; i-- = 0
		{
			rev = rev + s.charAt(i); // DCBA
		}
		System.out.println("Reverse String is: " + rev);
	}
}

/*
 * output
 * 
 * s: Java coding questions
 * 
Reverse String is: snoitseuq gnidoc avaJ

 */

/*
 * 	//Approach: Using + (String Concatenation) operator
			// String - ABCD
			// length - 4 - 4 times i have to iterate & extract character from string 
			 * & will add it into another variable rev
			 *
			// extract & concatenate characters - DCBA - depends on length of string
		
		// Two way: one is length 
		// other is charAt method -- str.charAt(0); gives u first character - A & so on - 1: B, 2: C, 3: D
			
 * 
 */