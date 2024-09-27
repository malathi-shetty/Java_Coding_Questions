package count_Numbers_Alphabets_in_the_String;

public class Count_Numbers_Alphabets_in_the_String_individual_numbers {

	public static void main(String[] args) {

		// Counting Individual Digits: To count each digit separately (like 2, 3, 2, 5,
		// 2, 4), then the count is 6.

		String s = "23sdsdf 25sfs 24 wdsf";
		int count = countDigits(s);
		System.out.println("Total number of individual digits in the string: " + count);
	}

	public static int countDigits(String s) {
		int count = 0;

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				count++; // Increment for each digit found
			}
		}

		return count;

	}

}
