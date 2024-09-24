package factorial_of_a_Number;

public class Factorial_of_a_Number_1_Ascending_Order_1 {

	public static void main(String[] args) {

		// Approach 1

		int i, fact = 1;
		int number = 6;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}

		System.out.println("Ascending order for int Factorial of a Number --> " + number + " is: " + fact);

		

		
	}
}