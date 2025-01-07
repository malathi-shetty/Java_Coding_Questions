package move_Zeros_ToStart_And_ToEnd;

public class Removing_Trailing_Zeros {

	public static void main(String[] args) {
		//  String input = "000";
	     String input = "12345000";  
	        // Remove trailing zeros using regex
	        String result = input.replaceAll("0+$", "");
	        
	     // If the result is empty, set it to "0" (for cases where the string was just zeros)
	        if (result.isEmpty()) {
	            result = "0";
	        }
	        
	        System.out.println("Result after removing trailing zeros: " + result);
	   

	}

}

/*

Explanation:

Regex 0+$: This pattern matches one or more zeros (0+) at the end of the string ($).

replaceAll("0+$", "") removes all trailing zeros.

Example Output:

For input "12345000", the output will be:

12345

*/