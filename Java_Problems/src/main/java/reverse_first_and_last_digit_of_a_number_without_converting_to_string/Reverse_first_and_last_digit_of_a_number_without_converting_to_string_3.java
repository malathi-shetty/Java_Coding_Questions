package reverse_first_and_last_digit_of_a_number_without_converting_to_string;

public class Reverse_first_and_last_digit_of_a_number_without_converting_to_string_3 {

	public static void main(String[] args) {
		 int number = 12345;
	        int result = reverseFirstAndLastDigit(number);
	        System.out.println("Result: " + result);  // Output: 52341
	    }

	    public static int reverseFirstAndLastDigit(int num) {
	        // If the number is a single digit, return it as is
	        if (num < 10 && num > -10) {
	            return num;
	        }
	        
	        // Store the original number for later use
	        int originalNum = num;

	        // Get the last digit
	        int lastDigit = num % 10;

	        // Find the number of digits
	        int numDigits = 0;
	        while (num != 0) {
	            num /= 10;
	            numDigits++;
	        }

	        // Get the first digit by dividing the number by 10^(numDigits - 1)
	        int firstDigit = (int)(originalNum / Math.pow(10, numDigits - 1));

	        // Remove the first and last digits from the original number
	        int middlePart = originalNum % (int)Math.pow(10, numDigits - 1); // This removes the first digit
	        middlePart /= 10;  // This removes the last digit

	        // Combine the last digit at the first position and the first digit at the last position
	        int newNum = lastDigit * (int)Math.pow(10, numDigits - 1);  // Place the last digit at the highest place value
	        newNum = newNum + middlePart * 10 + firstDigit;  // Add the middle part and the first digit at the end
	        
	        return newNum;

}}
