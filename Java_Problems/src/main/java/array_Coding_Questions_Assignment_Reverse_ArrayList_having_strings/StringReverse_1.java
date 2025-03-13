package array_Coding_Questions_Assignment_Reverse_ArrayList_having_strings;

public class StringReverse_1 {

	public static void main(String[] args) {
		String str = "Hello, World!"; // You can modify the string here
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        String reversed = ""; // Initialize an empty string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character from the end to the beginning
        }
        return reversed;

	}

}
