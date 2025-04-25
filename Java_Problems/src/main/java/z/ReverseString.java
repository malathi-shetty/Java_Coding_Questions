package z;

public class ReverseString {

	public static void main(String[] args) {
		 String str = "Learning Java is fun";
	        String reversed = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i); // Add characters in reverse order
	        }

	        System.out.println("Original: " + str);
	        System.out.println("Reversed: " + reversed);
	    }

	}


