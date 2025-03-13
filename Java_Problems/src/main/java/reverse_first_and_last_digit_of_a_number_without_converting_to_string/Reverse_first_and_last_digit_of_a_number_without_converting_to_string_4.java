package reverse_first_and_last_digit_of_a_number_without_converting_to_string;

public class Reverse_first_and_last_digit_of_a_number_without_converting_to_string_4 {
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
	     //   int originalNum = num;

	        // Get the last digit
	        int lastDigit = num % 10;

	        // Find the number of digits
	        int numDigits = 0;
	        int temp = num;
	        while (temp != 0) {
	            temp /= 10;
	            numDigits++;
	        }

	        // Get the first digit by dividing the number by the appropriate place value
	        int firstDigit = num;
	        while (firstDigit >= 10) {
	            firstDigit /= 10;
	        }

	     // Remove the first and last digits from the original number
	        int middlePart = num % (int) Math.pow(10, numDigits - 1); // Removes first digit
	        middlePart /= 10;  // Removes the last digit

	        // Multiply powers of 10 without using Math.pow
	        int placeValue = 1;
	        for (int i = 1; i < numDigits; i++) {
	            placeValue *= 10;
	        }

	        // Construct the final number
	        int newNum = lastDigit * placeValue; // Place the last digit at the highest place value
	        newNum = newNum + middlePart * 10 + firstDigit; // Add the middle part and the first digit at the end

	        return newNum;
}
}