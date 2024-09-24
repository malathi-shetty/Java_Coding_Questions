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
		
		String str = "madam"; // nitin, naman, radar
		//String str = "malathi";
		String org_str = str;
		String rev = "";		
		int len = str.length();	
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+ str.charAt(i);
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