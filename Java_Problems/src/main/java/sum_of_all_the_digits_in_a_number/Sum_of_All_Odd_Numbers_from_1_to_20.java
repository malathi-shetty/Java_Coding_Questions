package sum_of_all_the_digits_in_a_number;

public class Sum_of_All_Odd_Numbers_from_1_to_20 {

	public static void main(String[] args) {
		int sum =0;
		
		// Iterate from 1 to 20
		for(int i =1; i<=20; i++)
		{
			// Check if the number is odd
            if (i % 2 != 0) {
			sum = sum + i;
            }
		}
		System.out.println("Sum of odd numbers from 1 to 20: " + sum);

	}

}


/*

For Loop: Iterates from 1 to 20.

If Condition: Checks if the number i is odd (i % 2 != 0).

Sum Update: Adds the odd numbers to the sum.

*/