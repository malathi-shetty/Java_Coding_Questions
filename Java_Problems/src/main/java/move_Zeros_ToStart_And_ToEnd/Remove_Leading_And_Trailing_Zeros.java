package move_Zeros_ToStart_And_ToEnd;

public class Remove_Leading_And_Trailing_Zeros {

	public static void main(String[] args) {
		 String input = "0001203045000";
	        
	        // Remove leading zeros using regex
	        String result = input.replaceFirst("^0+", "");
	        
	        // Remove trailing zeros using regex
	        result = result.replaceAll("0+$", "");
	        
	        // If the result is empty, set it to "0" (for cases where the string was just zeros)
	        if (result.isEmpty()) {
	            result = "0";
	        }
	        
	        System.out.println("Result after removing leading and trailing zeros: " + result);
	    

	}

}

/*

Explanation:

Remove Leading Zeros:

input.replaceFirst("^0+", "") removes leading zeros. The ^ denotes the start of the string, and 0+ matches one or more zeros.

Remove Trailing Zeros:

result.replaceAll("0+$", "") removes trailing zeros. The $ denotes the end of the string, and 0+ matches one or more zeros at the end.

Handle Case of All Zeros:

If the result is empty (i.e., if the string consisted entirely of zeros), we assign "0" to avoid returning an empty string.

Example Outputs:

For input "00012345000", the output will be "12345".

For input "000000", the output will be "0".

For input "12345000", the output will be "12345".

This method efficiently handles both leading and trailing zeros in the string.

*/