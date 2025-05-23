package reverse_A_String_Different_Ways;

public class Complete_character_reversal_String_2 {

	public static void main(String[] args) {
		// Logic 3: Using Character Array
		// separate each character & then store it into a character array

	//	String s = "Testing";
		String s = "Java coding questions";
		System.out.println("s: " + s);
		char[] a = s.toCharArray(); // T- 0, e -1, s-2, t-3,i-4, n-5, g-6
		String rev = "";

		int len = a.length; // 7
		System.out.println("Length of the Character: " + len);

		for (int i = len - 1; i >= 0; i--) // 6 5 4 3 2 1 0 -1(come out of the loop)
		{
			rev = rev + a[i]; // g n i t s e T
	
		}

		System.out.println("Reverse String is: " + rev);
	}
}

/*output: 
 * 
 * s: Java coding questions
Length of the Character: 21
Reverse String is: snoitseuq gnidoc avaJ

 */

/**
 * rev = rev + a[i]; // g n i t s e T
 * 
 * /* Different ways to write output in above line // System.out.println(a[i]);
 * // print 1 character in 1 line // System.out.print(a[i]); // print in same
 * line just as we print the output in line 22 // System.out.println("Reverse :
 * " + rev);// if u want to check step by step print with the previous text
 * 
 * // toCharArray(); - a method to convert string into into multiple characters
 * // store into character array char a[]
 * 
 * 
 * for (int i = len - 1; i >= 0; i--) // 6 5 4 3 2 1 0 -1(come out of the loop)
		{
			rev = rev + a[i]; // h e y 
   1st loop: "" = "" + y
   2nd loop: y = e + e
   3rd loop: ye = ye + h
    4th loop: yeh -- out of the loop
		}

 * 
 */