package finding_Power_of_a_Number;

public class Finding_Power_of_A_Number_when_exponent_is_0_or_negative {

	public static void main(String[] args) {
		/*
		 * By definition, any non-zero number raised to the power of 0 is 1.
For negative exponents, the result is the reciprocal of the base raised to the absolute value of the exponent.
*/
		int base = 2;
		int exponent = -3;  // Test case with a negative exponent
	//	int exponent = 0; // Test case with a 0 exponent
	//	int exponent = 3;// Test case with a positive exponent
		double result = 1;
		
		if(exponent < 0)
		{
			 // Handle negative exponents
			int positiveExponent = -exponent;
			for(int i = 0; i < positiveExponent; i++)
			{
				result  = result * base;
			}
			  result = 1 / result; // Take the reciprocal for negative exponent
			
		}else if(exponent == 0)
		{
			// Handle exponent of 0
            result = 1;
		}else {
            // Handle positive exponents
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
		}
		System.out.println("Result: " + result);

	}

}

/*
 * By definition in mathematics, any non-zero number raised to the power of 0 is 1. 
 * This is a standard rule in mathematics.
 * 
 * In the code, when exponent is 0, the for loop does not run 
 * because the condition i < exponent (i.e., 0 < 0) is false from the start. 
 * Thus, result remains as initialized, which is 1.
 * 
 * 
 * Negative Exponents:
Convert the negative exponent to a positive one (int positiveExponent = -exponent).
Compute the power as usual.
Take the reciprocal of the result (result = 1 / result).
Computes 2^3 as 8, then takes the reciprocal, resulting in 1/8 = 0.125.

Zero Exponent:
Simply set result to 1 without entering the loop.

Positive Exponents:
Compute the power using the loop as before.  Computes 2^3 = 8
 
 * For a given base and a negative exponent : Formula is
 * base ^-exponent = 1 / (base ^ exponent);
 * 
 * Base: 2, Exponent: -3

Expected Result: 0.125 (since 2 ^ -3 = 1 / 8 )

 */