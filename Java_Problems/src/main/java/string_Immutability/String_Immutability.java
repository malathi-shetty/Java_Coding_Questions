package string_Immutability;

public class String_Immutability {

	public static void main(String[] args) {
		// Write a code in Java to prove that String objects are immutable
// In Java, String objects are immutable, which means once a String object is created, its value cannot be changed. 
		// If you try to modify a String, a new String object is created instead of
		// modifying the original one.

		// Create a String object
		String str = "Hello";

		// Print the original string
		System.out.println("Original String: " + str);

		// Attempt to modify the String by concatenation
		str = str.concat(" World");

		// Print the modified string
		System.out.println("Modified String: " + str);

		// Check if the original string was modified (it should not be)
		String originalString = "Hello";
		System.out.println("Original String after modification attempt: " + originalString);

		// Show that the original string is unchanged
		System.out.println("Is original string the same as modified string? " + (originalString == str));

	}

}

/*
 * 
 * Explanation:
 * 
 * We create a String object str and assign it the value "Hello".
 * 
 * We attempt to modify str by concatenating " World" to it using the concat()
 * method.
 * 
 * After calling concat(), we print the modified string.
 * 
 * We then print the original string again and check if it has been changed.
 * 
 * Finally, we compare the original string (originalString) with the modified
 * string (str) to demonstrate that the original string has not been changed.
 * 
 * Output:
 * 
 * Original String: Hello
 * 
 * Modified String: Hello World
 * 
 * Original String after modification attempt: Hello
 * 
 * Is original string the same as modified string? false
 ********
 * 
 * 
 * Key Points to Notice:
 * 
 * Original String Unchanged: The original string ("Hello") remains unchanged,
 * even though we attempted to modify it.
 * 
 * New String Created: The modified string ("Hello World") is a new object, not
 * the same as the original one.
 * 
 * == Comparison: The == operator checks whether the two string references point
 * to the same object. Since str and originalString refer to different objects,
 * the result is false.
 * 
 * This behavior proves that String objects are immutable in Java. When you try
 * to modify a string, a new string object is created, and the original string
 * remains unaffected.
 * 
 */