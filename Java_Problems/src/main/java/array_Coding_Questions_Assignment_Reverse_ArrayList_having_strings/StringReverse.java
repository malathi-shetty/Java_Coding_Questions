package array_Coding_Questions_Assignment_Reverse_ArrayList_having_strings;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Hello, World!"; // You can modify the string here
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

	

}
