package powerOfTwo;

public class PowerOfTwo_2 {
	public static boolean isPowerOfTwo(int n) {
		// A number is a power of two if it's greater than 0 and has only one '1' bit
		return n > 0 && (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		int n1 = 8;
		int n2 = 3;

		System.out.println(isPowerOfTwo(n1)); // Output: true
		System.out.println(isPowerOfTwo(n2)); // Output: false

	}

}

/*
 * 
 * To determine if a given integer n is a power of 2, you can use the following
 * Java code. The idea is that a number is a power of 2 if and only if it has
 * exactly one '1' bit in its binary representation. In other words, for a power
 * of 2, n & (n - 1) will be 0, as long as n is positive.
 * 
 * Explanation:
 * 
 * n > 0: Ensures that the number is positive, since 0 and negative numbers
 * can't be powers of 2.
 * 
 * n & (n - 1) == 0: This bitwise operation checks if there is exactly one 1 bit
 * in the binary representation of n. For example:
 * 
 * 8 in binary is 1000 and 8 - 1 is 0111. 1000 & 0111 equals 0000, which is 0,
 * so 8 is a power of 2.
 * 
 * 3 in binary is 0011 and 3 - 1 is 0010. 0011 & 0010 equals 0010, which is not
 * 0, so 3 is not a power of 2.
 * 
 * Output:
 * 
 * For n = 8, the output is true, and for n = 3, the output is false.
 * 
 */