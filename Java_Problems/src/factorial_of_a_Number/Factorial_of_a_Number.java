package factorial_of_a_Number;

public class Factorial_of_a_Number {

	public static void main(String[] args) {
		
		int num = 5;
		long factorial = 1;
		
		//Ascending order
		for(int i=1; i<=num; i++) // 5! = 1 * 2 * 3 * 4 * 5
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial of a Number --> " + num +" is: "  + factorial);
	//OR
		//Descending order
		int num1 = 4;
		long factorial1 = 1;
		for(int i=num1; i>=1; i--) // 4! = 4 * 3 * 2 * 1
		{
			factorial1 = factorial1 * i;
		}
		System.out.println("Factorial1 of a Number --> " + num1 +" is: "  + factorial1);	
	}
}