package powerOfTwo;

public class PowerOfTwo_1 {

	public static void main(String[] args) {
		int n = 8; // Example input

		// Check if the number is a power of 2
		boolean isPowerOfTwo = isPowerOfTwo(n);

		System.out.println(isPowerOfTwo); // Output will be 'true' for n = 8, 'false' for n = 3
	}

	// Method to check if a number is a power of 2
	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false; // Negative numbers and 0 can't be powers of 2
		}

		while (n % 2 == 0) {
			n /= 2; // Divide the number by 2
		}

		// If the number becomes 1, it was a power of 2
		return n == 1;

	}

}

/*
 * 
 * You can iteratively divide the number by 2. If the number becomes 1, it's a
 * power of 2; otherwise, it's not. The process stops as soon as the number
 * becomes odd and greater than 1.
 * 
 * Explanation:
 * 
 * Check if the number is less than or equal to 0: If the number is 0 or
 * negative, it can't be a power of 2.
 * 
 * While loop: The loop keeps dividing the number by 2 as long as it is
 * divisible by 2.
 * 
 * After the loop: If the number is reduced to 1, then it was a power of 2. If
 * it's anything else, it's not.
 * 
 * Example Runs:
 * 
 * For n = 8:
 * 
 * 8 ÷ 2 = 4
 * 
 * 4 ÷ 2 = 2
 * 
 * 2 ÷ 2 = 1
 * 
 * Since the number becomes 1, it's a power of 2, so the output is true.
 * 
 * For n = 3:
 * 
 * 3 is not divisible by 2, so the output is false.
 * 
 * Output:
 * 
 * For n = 8, the output will be true, and for n = 3, the output will be false.
 * 
 */