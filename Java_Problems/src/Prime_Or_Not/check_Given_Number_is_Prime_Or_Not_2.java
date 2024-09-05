package Prime_Or_Not;

public class check_Given_Number_is_Prime_Or_Not_2 {

	public static void main(String[] args) {

		int num = 7;
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println("Is " + num + " Prime?: " + isPrime);
	}
}
