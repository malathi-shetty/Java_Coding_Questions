package whiteSpace;

public class Remove_White_Spaces_in_a_String_1 {

	public static void main(String[] args) {
		
		String str ="   Java     programming     selenium      automation    ";
		System.out.println("Before Removing the white Spaces: " + str);
		
		//to remove space using regular expression
		 String result = str.replaceAll("\\s+", "");
		
		System.out.println("After Removing the white Spaces: " + result);
	}
}

/*

\\s+ is a regular expression that matches one or more whitespace characters (spaces, tabs, newlines, etc.).

replaceAll("\\s+", "") replaces all whitespace characters with an empty string (effectively removing them).

*/

/*

Before Removing the white Spaces:    Java     programming     selenium      automation   
 
After Removing the white Spaces: Javaprogrammingseleniumautomation

*/