package string_to_Integer_Conversion;

public class String_to_Integer_Conversion_without_Using_Inbuilt_Integer_parseInt {

	public static void main(String[] args) {
		// Convert String to Integer without Using Inbuilt Integer.parseInt()
		
		 String str = "-12345";
	        int num = stringToInt(str);
	        System.out.println("Converted integer: " + num);
	}
	
	 public static int stringToInt(String str) {
	        int result = 0;
	        int sign = 1;
	        int i = 0;

	        // Handle negative numbers
	        if (str.charAt(0) == '-') {
	            sign = -1;
	            i = 1;  // start from the second character
	        }

	        // Traverse the string and convert each character to integer
	        for (; i < str.length(); i++) {
	            // Get the digit by subtracting '0' from the character
	            int digit = str.charAt(i) - '0';
	            result = result * 10 + digit;
	        }

	        return result * sign;
	    }

}
