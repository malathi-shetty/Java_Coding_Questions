package factorial_of_a_Number;

public class Factorial_of_a_Number_1_Ascending_Order_2 {

	public static void main(String[] args) {
		// Approach 2 - Difference is only of Datatype of Factorial in case of bigger number
				int num = 5;
				long factorial = 1; 

				// Ascending order
				for (int j = 1; j <= num; j++) // 5! = 1 * 2 * 3 * 4 * 5
				{
					factorial = factorial * j;
				}
				System.out.println("Ascending order for Long Factorial of a Number --> " + num + " is: " + factorial);


	}

}
