package move_Zeros_ToStart_And_ToEnd;

public class Move_Zeros_to_Start_End {

	public static void main(String[] args) {
		 String num = "0001203045000";
	        
	        // Count the number of zeros in the string
	        int zeroCount = 0;
	        StringBuilder nonZeroPart = new StringBuilder();
	        
	        // Traverse the string to separate zeros and non-zeros
	        for (char c : num.toCharArray()) {
	            if (c == '0') {
	                zeroCount++;
	            } else {
	                nonZeroPart.append(c);
	            }
	        }
	        
	        // Manually construct the string of zeros
	        StringBuilder zeros = new StringBuilder();
	        for (int i = 0; i < zeroCount; i++) {
	            zeros.append('0');
	        }
	        
	        // Append zeros to the end of the non-zero part
	        String result = nonZeroPart.toString() + zeros.toString();
	        System.out.println("Result after shifting zeros to the end: " + result);
	        
	      String result1 = zeros.toString() + nonZeroPart.toString();
	        System.out.println("Result before shifting zeros to the start: " + result1);
	       
	  /*      //Java 11 below 2 lines
	        String result = nonZeroPart.toString() + "0".repeat(zeroCount);
	        System.out.println("Result after shifting zeros to the end: " + result);
	        
	        String result1 = "0".repeat(zeroCount) + nonZeroPart.toString();
	        System.out.println("Result before shifting zeros to the start: " + result1);
	        
	       */
	}

}
