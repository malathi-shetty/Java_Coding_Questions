package sum_of_all_the_digits_in_a_number;

public class Count_Sum_Of_Digits_in_a_Number {

	public static void main(String[] args) {
		// Number = 1234 - 1 + 2 + 3 + 4 = 10
		// Initial we will take Sum = 0
		// extract the last number by modulo & add the number to sum, then eliminate last digit by dividing by 10 & so on
		
		
		int num = 1234;
		int sum = 0;
		while(num != 0)
		{
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of digits in a number: "+ sum);

	}

}