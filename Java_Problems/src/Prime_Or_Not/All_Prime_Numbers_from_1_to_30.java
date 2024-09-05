package Prime_Or_Not;

public class All_Prime_Numbers_from_1_to_30 {

	public static void main(String[] args) {
		//Java Program to Print All Prime Numbers from 1 to 30

		
		 System.out.println("Prime numbers from 1 to 30:");
	        for (int num = 2; num <= 30; num++) {
	            boolean isPrime = true;
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.println(num + " ");
	            }

	}

}
}

//Check divisibility for primes.