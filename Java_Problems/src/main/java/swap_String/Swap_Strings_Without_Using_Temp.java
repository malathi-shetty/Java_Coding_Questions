package swap_String;

public class Swap_Strings_Without_Using_Temp {

	public static void main(String[] args) {
		
		String str1="abc";
		String str2="xyz";
		
		swapStrings(new StringBuilder (str1), new StringBuilder (str2));

	}

	private static void swapStrings(StringBuilder str1, StringBuilder str2) { //StringBuilder objects str1 and str2 are used instead of String because String objects are immutable in Java.
		
		System.out.println("Before Swapping: ");
		System.out.println(str1);
		System.out.println(str2);
		
		//Swap Strings
		str1.append(str2);// appends str2 to str1, so str1 now contains "abcxyz".
		str2 = new StringBuilder(str1.substring(0, str1.length()-str2.length())); //creates a new StringBuilder for str2 using the substring of str1 which represents the original str1.
		str1.delete(0, str2.length()); //deletes the substring that represents the original str1 from str1.
		
		
		System.out.println("After Swapping: ");
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
