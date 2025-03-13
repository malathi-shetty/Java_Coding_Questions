package Prime_Or_Not;

public class Check_if_a_number_is_prime {

	public static void main(String[] args) {
		 int num = 29; // You can change the number here
	        if (isPrime(num)) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	    }

	private static boolean isPrime(int num) {
		if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
	}
}
