package count_Number_Of_Digits_in_A_Number;

public class Count_Number_Of_Digits_in_A_Number_2 {

	public static void main(String[] args) {
		long num = 29845315;
		int count = 0; // 1. by using while loop
		long tempNum = num; // Store original number

		while (tempNum != 0) {
			tempNum = tempNum / 10;
			count++;
		}
		System.out.println("Number of digits in " + num + " : " + count);

	}

}
