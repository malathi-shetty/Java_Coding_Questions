package practice_Exercise;

public class Test18 {

	public static void main(String[] args) {
		int b = ~5;
		System.out.println(b);

	}

}

//output: -6

/*
 * 
 * int b = ~5;
 * 
 * The ~ operator is the bitwise NOT operator in Java, which inverts all the
 * bits of the number. For a given integer, it flips all the bits (changing 1s
 * to 0s and 0s to 1s).
 * 
 * For example, 5 in binary is:
 * 
 * 00000000 00000000 00000000 00000101 (32-bit representation)
 * 
 * When you apply ~5, it will flip the bits:
 * 
 * 11111111 11111111 11111111 11111010
 * 
 * This represents -6 in two's complement representation (how Java stores
 * negative numbers).
 * 
 * So, the value of b will be -6. When you run the program, it will print:
 * 
 * 
 * -6
 * 
 * To summarize:
 * 
 * ~5 results in -6, because the bitwise NOT of 5 inverts all the bits,
 * producing the negative equivalent in two's complement.
 * 
 * -----
 * 
 * Negative numbers are represented by inverting all the bits (bitwise NOT) of
 * the positive number, and then adding 1 to the result.
 * 
 * Step 1: Invert the Bits
 * 
 * Starting with 11111111 11111111 11111111 11111010, we invert all the bits:
 * 
 * 11111111 11111111 11111111 11111010 (original)
 * 
 * ------------------------------
 * 
 * 00000000 00000000 00000000 00000101 (inverted)
 * 
 * Step 2: Add 1 to the Inverted Number
 * 
 * Now, we add 1 to 00000000 00000000 00000000 00000101:
 * 
 * 
 * 00000000 00000000 00000000 00000101
 * 
 * + 1
 * 
 * ------------------------------
 * 
 * 00000000 00000000 00000000 00000110 (this is 6 in decimal)
 * 
 * So, the positive equivalent of 11111111 11111111 11111111 11111010 is 6.
 * 
 * Step 3: Conclusion
 * 
 * Since the original number had a leading 1, it represents -6 in two's
 * complement notation. This means the bit pattern 11111111 11111111 11111111
 * 11111010 is -6 in decimal.
 * 
 * Final Answer:
 * 
 * The binary representation 11111111 11111111 11111111 11111010 corresponds to
 * the decimal value -6 when interpreted using two's complement.
 * 
 * 
 * 
 * 
 */