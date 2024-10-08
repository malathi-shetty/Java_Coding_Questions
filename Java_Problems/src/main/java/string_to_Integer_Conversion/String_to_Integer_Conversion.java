package string_to_Integer_Conversion;

public class String_to_Integer_Conversion {

	// Implement a function to convert a string to an integer. Handle edge cases
	// like leading space and invalid input

	public static void main(String[] args) {
		String input = "   -42"; // input
		int result = myAtoi(input);
		System.out.println(result); // Output: -42
	}

	public static int myAtoi(String s) {
		int i = 0;
		int sign = 1;
		int total = 0;

		// Skip whitespace
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}

		// Check for sign
		if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
			sign = (s.charAt(i) == '-') ? -1 : 1;
			i++;
		}

		// Convert to integer
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			int digit = s.charAt(i) - '0';

			// Handle overflow manually
			if (total > (Integer.MAX_VALUE - digit) / 10) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			total = total * 10 + digit;
			i++;
		}

		return total * sign; // Return final integer
	}

}
