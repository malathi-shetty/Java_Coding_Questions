package gcd_lcm;

public class Finding_Greatest_Common_Divisor {

	public static void main(String[] args) {
		
		int a = 12; // First number 
		int b =18;  // Second number
		
		 // To find GCD
		while(b != 0)
		{
			int temp = b;
			b = a % b; // Update b to the remainder of a divided by b
			a = temp;  // Update a to the previous value of b
		}
		System.out.println("GCD: " + a); // Output the result

	}

}

/*
 * Initial Setup: You start with two numbers, a and b.
Loop: You repeatedly replace a with b and b with a % b (the remainder when a is divided by b), until b becomes 0.
Result: When b is 0, a contains the GCD of the original a and b.

List the Factors:
Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18
The common factors are 1, 2, 3, and 6.

The greatest of these common factors is 6.

--------

- Start with 𝑎 = 12 and  𝑏 = 18.
- Divide 𝑎 by 𝑏 and find the remainder: 12 % 18 = 12 (because 12 is less than 18, so the remainder is 12).
	12 ÷ 18 = 0 (quotient)
	12 − ( 0 × 18 ) = 12 (remainder)
	Hence, 12 % 18 = 12.
- Replace a with b & b with the remaninder: a = 18, b = 12.
- Divide a by b  again: 18 % 12 = 6
- Replace a with b & b with the remaninder: a = 12, b = 6.
- Divide a by b  again: 12 % 6 = 0
- Since b is now 0, the GCD is the last non-zero remainder, which is 6.

*/
 