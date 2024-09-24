package print_length_of_string_without_using_length_method;

public class Print_length_of_string_without_using_length_method_1_1 {

	public static void main(String[] args) {
		// // Calculate the length of the string without using the length() method

		String str = "Hello World!!";

		int length = 0;
		for (char c : str.toCharArray()) {
			length++;
		}
		System.out.println("Length of the string: " + length);

	}

}

/**
 * Convert the String to a Character Array: The str.toCharArray() method
 * converts the string into an array of characters. Iterate Through the Array:
 * The for loop iterates over each character in the array. Count Characters: For
 * each character, increment the length variable by 1.
 * 
 * This method counts the number of characters in the string by traversing each
 * character in the string and keeping a count, effectively providing the length
 * of the string without directly using the length() method.
 */