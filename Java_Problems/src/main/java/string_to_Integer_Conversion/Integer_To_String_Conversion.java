package string_to_Integer_Conversion;

public class Integer_To_String_Conversion {
	public static void main(String[] args) {
		int number = -123; // Example input
		String result = intToString(number);
		System.out.println(result); // Output: "-123"
	}

	public static String intToString(int num) {
		// Handle zero explicitly
		if (num == 0) {
			return "0";
		}

		StringBuilder sb = new StringBuilder();
		boolean isNegative = num < 0;

		// Work with the absolute value
		int absNum = Math.abs(num);

		// Extract digits and build the string in reverse
		while (absNum > 0) {
			char digit = (char) ('0' + (absNum % 10)); // Get the last digit
			sb.append(digit);
			absNum /= 10; // Remove the last digit
		}

		// If the number was negative, append the '-' sign
		if (isNegative) {
			sb.append('-');
		}

		// Reverse the string since we built it backwards
		return sb.reverse().toString();
	}

}
