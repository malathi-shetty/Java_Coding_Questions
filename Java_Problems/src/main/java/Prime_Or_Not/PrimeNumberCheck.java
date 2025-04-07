package Prime_Or_Not;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		 int number = 29;
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	    public static boolean isPrime(int num) {
	        // Handle edge cases for numbers less than 2
	        if (num <= 1) {
	            return false;
	        }
	        // Check for factors from 2 to square root of the number
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // Not prime if divisible by any number
	            }
	        }
	        return true; // Prime if no divisors found
	    }

	

}

/*
 * 
 * To check if a number is prime, you can divide the number by all integers from 2 to the square root of the number, and if any division is exact, the number is not prime.
 * 
The isPrime() method checks if the number is divisible by any integer between 2 and sqrt(num).

If it finds any divisor, it returns false, meaning the number is not prime. If no divisors are found, the number is prime.

Check Prime Number: Checks if a number is prime by testing divisibility from 2 to sqrt(num).

29 is a prime number.


*/