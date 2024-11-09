package powerOfTwo;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		/*
		 * Given an interger number and tell me whether the given number is power of 2
 
Ex: n = 8 // This is a power of 2 where as when n=3 which is not a power of 2.
 
output: should be boolean (either true or false) java

*/
		 
int n = 8;  // Example input
        
        // Check if the number is a power of 2
        boolean isPowerOfTwo = (n > 0) && (n & (n - 1)) == 0;
        
        System.out.println(isPowerOfTwo); // Output will be 'true' for n = 8, 'false' for n = 3
   

	}

}

/*
 * 
 To determine if a given integer is a power of 2, you can use the following approach in Java:

Explanation:

A number is a power of 2 if it has exactly one '1' bit in its binary representation. For example:

8 in binary is 1000 (which is 2^3).

16 in binary is 10000 (which is 2^4).

1 in binary is 1 (which is 2^0).

The trick is to use the following condition:

A number n is a power of 2 if and only if (n & (n - 1)) == 0 and n > 0.

Explanation of the Code:

n > 0: Ensures that the number is positive.

n & (n - 1) == 0: This bitwise operation checks if n has exactly one 1 in its binary representation, which means it’s a power of 2.

Example Runs:

For n = 8:

8 & (8 - 1) → 8 & 7 → 1000 & 0111 → 0000 (which is 0), so the output will be true.

For n = 3:

3 & (3 - 1) → 3 & 2 → 0011 & 0010 → 0010 (which is not 0), so the output will be false.

Output:

For n = 8, the output will be true, and for n = 3, the output will be false.

*/
