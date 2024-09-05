package sum_of_all_the_digits_in_a_number;

public class Sum_of_All_Even_Numbers_from_1_to_20 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 2; i <= 20; i = i + 2) {
			sum = sum + i; // Add the even number to sum
		}
		System.out.println("Sum of even numbers from 1 to 20: " + sum);

	}

}

/*
 * 
 * Initialization: The loop starts with i set to 2.
 * 
 * Condition: The loop continues as long as i is less than or equal to 20.
 * 
 * Increment: i is incremented by 2 on each iteration, so it only takes even
 * values.
 * 
 * Sum Update: The even number i is added to sum in each iteration
 * 
 * 
 * // Iterate from 2 to 20, incrementing by 2 each time // Iterate over even
 * numbers only. Start from 2 and increment by 2 each time to get the next even
 * number for(int i =2; i<=20; i= i+2)
 * 
 */