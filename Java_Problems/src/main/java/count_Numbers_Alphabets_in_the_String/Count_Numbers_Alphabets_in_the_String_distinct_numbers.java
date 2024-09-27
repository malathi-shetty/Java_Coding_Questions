package count_Numbers_Alphabets_in_the_String;

public class Count_Numbers_Alphabets_in_the_String_distinct_numbers {

	public static void main(String[] args) {
		// Count Numbers in this String s="23sdsdf 25sfs 24 wdsf"
		// Counting Unique Numbers: To count distinct numbers, like
		// 23, 25, and 24, then the count is 3

		String s = "23sdsdf 25sfs 24 wdsf";
		int count = countNum(s);
		System.out.println("Number of integers in the string: " + count);

	}

	public static int countNum(String s) {
		int count = 0;
		boolean num = false;

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				if (!num) {
					count++;
					num = true; // Start of a new number
				}
			} else {
				num = false; // Reset for non-digit characters
			}
		}

		return count;
	}
}

/*
 * 
 * Character Iteration: The code iterates over each character in the string
 * using toCharArray().
 * 
 * Digit Check: It checks if the character is a digit using Character.isDigit().
 * 
 * Counting Logic: A boolean flag num is used to determine when a new number
 * starts. If it encounters a digit and num is false, it increments the count
 * and sets num to true. If it encounters a non-digit, it resets num.
 * 
 * 
 * The numbers in this string are 23, 25, and 24.
 * 
 * So, there are 3 numbers in the string.
 * 
 */