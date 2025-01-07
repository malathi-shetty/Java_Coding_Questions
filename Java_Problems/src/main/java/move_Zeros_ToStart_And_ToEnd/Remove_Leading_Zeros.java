package move_Zeros_ToStart_And_ToEnd;

public class Remove_Leading_Zeros {

	public static void main(String[] args) {
String num = "00012345";
        
        // Remove leading zeros using regex
        String result = num.replaceFirst("^0+", "");
        
        // If the input string was all zeros, we should return a single "0"
        if (result.isEmpty()) {
            result = "0";
        }
        
        System.out.println("Result after removing leading zeros: " + result);

	}

}


/*

Explanation:

Regex ^0+: This pattern matches one or more (+) zeros (0) at the beginning (^) of the string.

replaceFirst("^0+", "") replaces the matched leading zeros with an empty string.

If the result is an empty string (which happens if the input consists only of zeros), we explicitly set it to "0" to avoid an empty result.

Example Outputs:

For input "00012345", the output will be "12345".

For input "0000", the output will be "0".

This method will efficiently handle any string with leading zeros.

*/