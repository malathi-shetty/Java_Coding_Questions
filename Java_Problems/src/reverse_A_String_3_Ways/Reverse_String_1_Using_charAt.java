package reverse_A_String_3_Ways;

public class Reverse_String_1_Using_charAt {

	public static void main(String[] args) {
		
		//Logic 1: Using + (String Concatenation) operator
			// String - ABCD
			// length - 4 - 4 times i have to iterate & extract character from string & will add it into another variable rev
			// extract & concatenate characters - DCBA - depends on length of string
		
		// Two way: one is length 
		// other is charAt method -- str.charAt(0); gives u first character - A & so on - 1: B, 2: C, 3: D
				
		String str = "ABCD";
		String rev = "";
		
		int len = str.length(); // 4 characters
		System.out.println("Length of the Character: " + len);
		
		for(int i=len-1; i>=0; i--) // i--= 3 characters; i-- =2; i-- = 1; i-- = 0
		{
			rev = rev + str.charAt(i); // DCBA
		}
		System.out.println("Reverse String is: " + rev);

	}

}