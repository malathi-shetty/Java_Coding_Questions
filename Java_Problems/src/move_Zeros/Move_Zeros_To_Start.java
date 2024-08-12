package move_Zeros;

public class Move_Zeros_To_Start {



	    public static String moveZerosToFront(String str) {//Declares a public static method moveZerosToFront that takes a string str as input and returns a string.
	        StringBuilder result = new StringBuilder(); // Initializes a StringBuilder named result, which will be used to build the output string efficiently.
	        int countZeros = 0;//Initializes an integer countZeros to keep track of the number of zeros encountered in the input string str.

	        // Count zeros and build result string with zeros at the beginning
	        for (int i = 0; i < str.length(); i++) { //Iterates through each character of the input string str.
	            if (str.charAt(i) == '0') { //Iterate through each character in the string str. - Checks if the current character str.charAt(i) is '0'.
	                countZeros++; //Yes, If the character is '0', increment countZeros.
	            } else {
	                result.append(str.charAt(i)); //If no (i.e., the character is not '0'), appends the character to the result StringBuilder.
	            }
	        }

	        // Append zeros at the beginning
	        for (int i = 0; i < countZeros; i++) { //Iterates countZeros times.
	            result.insert(0, '0'); //After counting zeros and appending non-zero digits to result, append countZeros number of '0's to the beginning of result.
	        //Inserts '0' at the beginning of the result StringBuilder (result.insert(0, '0') effectively moves each zero encountered in the original string to the front).
	        }

	        return result.toString();//Converts the result StringBuilder to a string using toString() and returns it as the output of the method moveZerosToFront.
	    

	}
		public static void main(String[] args) {
			 String str = "32400121200";
		        String result = moveZerosToFront(str); //Convert the StringBuilder result to a string using toString() and return it as the final output.
		        System.out.println("Output: " + result);
		    }

}
