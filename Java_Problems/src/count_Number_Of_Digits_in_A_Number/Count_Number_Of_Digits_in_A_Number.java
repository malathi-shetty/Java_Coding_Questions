package count_Number_Of_Digits_in_A_Number;

public class Count_Number_Of_Digits_in_A_Number {

	public static void main(String[] args) {
		// Number = 145678 --> Number of Digits: 6
		// Divide the number using division operator by 10 & immediately specify a variable & increase it like count_Number_of_Words_in_a_String +1
		// eliminate the number digit & increase count_Number_of_Words_in_a_String
		
		//int num = 123456;
		int num = 6541;
		int count = 0;
		
		while(num>0)
		{
			num = num / 10;
			count++;
		}
		
		System.out.println("Number Of Digits in A Number: " + count);

	}

}