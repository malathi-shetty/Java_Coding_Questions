package reverse;

public class Reverse_a_String_toCharArray {

	public static void main(String[] args) {

		String s="Testing"; // gnitset
		
		char[] a = s.toCharArray(); // T- 0, e -1, s-2, t-3,i-4, n-5, g-6
		String rev="";
		
		for(int i=a.length-1; i>=0 ; i-- )
		{
			rev = rev+a[i];
			
			/* Different ways to write output
		//	System.out.println(a[i]); // print 1 character in 1 line
		//	System.out.print(a[i]); // print in same line just as we print the output in line 22			
		//	System.out.println("Reverse : " + rev);// if u want to check step by step print with the previous text
		 */
		 
		}
		
		System.out.println("Reverse String: " + rev);
	}
}
