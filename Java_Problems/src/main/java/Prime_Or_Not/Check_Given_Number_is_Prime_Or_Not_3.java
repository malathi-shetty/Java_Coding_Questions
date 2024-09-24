package Prime_Or_Not;

public class Check_Given_Number_is_Prime_Or_Not_3 {

	//Prime number is a number that is greater than 1 and divided by 1 or itself only.
	public static void main(String[] args) {
		int num = 31;
		int count = 0;
		if (num <= 1) {
			System.out.println("The number is not prime");
			return;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				count++;
		}
		if (count > 1) {
			System.out.println(num  + ": The number is not prime");
		} else {
			System.out.println(num + ": The number is prime");
		}

	}

}
