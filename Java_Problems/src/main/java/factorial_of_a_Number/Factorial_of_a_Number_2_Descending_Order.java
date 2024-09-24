package factorial_of_a_Number;

public class Factorial_of_a_Number_2_Descending_Order {

	public static void main(String[] args) {
		
		//Descending order
				int num = 4;
				long factorial = 1;
				for(int j=num; j>=1; j--) // 4! = 4 * 3 * 2 * 1
				{
					factorial = factorial * j;
				}
				System.out.println("Descending order for Long Factorial1 of a Number --> " + num +" is: "  + factorial);	
	}

}
