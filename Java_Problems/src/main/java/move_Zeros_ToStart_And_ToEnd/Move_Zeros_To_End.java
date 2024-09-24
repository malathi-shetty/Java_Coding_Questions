package move_Zeros_ToStart_And_ToEnd;

public class Move_Zeros_To_End {

	public static void main(String[] args) {
		
		String str = "32400121200";
		String result = moveZerosToEnd(str);
		System.out.println("Output: " + result);

	}

	public static String moveZerosToEnd(String str) {
		
		 int n = str.length();
	        char[] chars = str.toCharArray();
	        int countNonZeros = 0;

	        // Count non-zero digits and move them to the front of the array
	        for (int i = 0; i < n; i++) {
	            if (chars[i] != '0') {
	                chars[countNonZeros++] = chars[i];
	            }
	        }

	        // Fill the remaining positions with zeros
	        while (countNonZeros < n) {
	            chars[countNonZeros++] = '0';
	        }

	        return new String(chars);
	    }

}
