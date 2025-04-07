package palindrome_String;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// A Palindrome String is a String that remains the same when its characters are reversed.
		// Madam ; Radar ; Naman ; Nitin
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String str =sc.next(); //  Or String str =sc.nextLine();
	*/ 
		// OR String str = "madam";
		
		String s = "madam"; // nitin, naman, radar
		System.out.println("String: " + s);
		//String str = "malathi";
		String org_str = s;
		System.out.println("org_str: " + org_str);
		String rev = "";		
		int len = s.length();	
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+ s.charAt(i);
		}
		System.out.println("Reverse String: " + rev);
		
		/*// 1st way to compare
		if(org_str == rev)
		{
			System.out.println(org_str + " is a Palindrome");
		}else
		{
			System.out.println(org_str + " is Not a Palindrome");
		}
		*/
		// OR // 2nd way to compare
	/*	if(org_str.equals(rev))
		{
			System.out.println(org_str + " is a Palindrome");
		}else
		{
			System.out.println(org_str + " is Not a Palindrome");
		}
	*/
		// OR // 3rd way to compare
		if(org_str.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println(org_str + " is a Palindrome");
		}else
		{
			System.out.println(org_str + " is Not a Palindrome");
		}
	}
}