package string_Comparison;

public class String_Comparison {

	public static void main(String[] args) {

		// Create a string literal
		String a = "ABC";
		// Create a new string object
		String b = new String("ABC");
		// Create another string literal
		String c = "ABC";

		// Comparing strings
		System.out.println("a == b: " + (a == b)); // False
		System.out.println("a.equals(b): " + a.equals(b)); // True
		System.out.println("a == c: " + (a == c)); // True
		System.out.println("a.equals(c): " + a.equals(c)); // True

	}

}

/*
 * 
 * String a = "ABC";: This creates a string literal in the string pool.
 * 
 * String b = new String("ABC");: This creates a new string object in memory,
 * distinct from the string pool.
 * 
 * Now, let's evaluate each comparison:
 * 
 * Comparisons
 * 
 * a == b:
 * 
 * False: This compares the references. a points to the string pool, while b is
 * a new object in memory.
 * 
 * a.equals(b):
 * 
 * True: This compares the actual content of the strings. Both contain "ABC".
 * 
 * c = "ABC";:
 * 
 * c is another string literal, which points to the same object in the string
 * pool as a.
 * 
 * a == c:
 * 
 * True: Both a and c point to the same string literal in the string pool.
 * 
 * a.equals(c):
 * 
 * True: This compares the contents, and both strings are "ABC".
 * 
 * Summary of Results
 * 
 * a == b: False
 * 
 * a.equals(b): True
 * 
 * a == c: True
 * 
 * a.equals(c): True
 * 
 * a == b evaluates to false because a and b reference different objects.
 * 
 * a.equals(b) evaluates to true because the contents of both strings are the
 * same.
 * 
 * a == c evaluates to true because both a and c reference the same string
 * literal in the string pool.
 * 
 * a.equals(c) evaluates to true because the contents of both strings are the
 * same.
 * 
 */