package gcd_lcm;

public class Finding_Least_Common_Multiple {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 18;
		int gcd = 1;
		
		for( int i = 1; i <= a && i <= b; i++)
		{
			if( a % i == 0 && b % i == 0)
			{
				gcd = i;
			}
		}
		int lcm = (a * b) / gcd;
		System.out.println("LCM: " + lcm);
	}
}

/*
 * This loop iterates through all possible values from 1 up to the smaller of a or b.
For each number i, it checks if i is a divisor of both a and b (i.e., a % i == 0 and b % i == 0).
If it is, gcd is updated to i. By the end of the loop, gcd holds the greatest common divisor of a and b.
 * The formula for LCM is: 
LCM(𝑎,𝑏) = 𝑎 × 𝑏 / GCD (𝑎 , 𝑏)

LCM:
 * List the Multiples:
Multiples of 12: 12, 24, 36, 48, 60, 72, ...
Multiples of 18: 18, 36, 54, 72, 90, ...
The first common multiple is 36.

GCD:
- Start with 𝑎 = 12 and  𝑏 = 18.
- Divide 𝑎 by 𝑏 and find the remainder: 12 % 18 = 12 (because 12 is less than 18, so the remainder is 12).
	12 ÷ 18 = 0 (quotient)
	12 − ( 0 × 18 ) = 12 (remainder)
	Hence, 12 % 18 = 12.
- Replace a with b & b with the remaninder: a = 18, b = 12.
- Divide a by b  again: 18 % 12 = 6
- Replace a with b & b with the remaninder: a = 12, b = 6.
- Divide a by b  again: 12 % 6 = 0
- Since b is now 0, the GCD is the last non-zero remainder, which is 6
The GCD of 12 and 18 is 6 

LCM(𝑎,𝑏) = 𝑎 × 𝑏 / GCD (𝑎 , 𝑏)
LCM(12,18) = 12 × 18 / GCD (12,18) = 216/6 = 36


 * 
 */