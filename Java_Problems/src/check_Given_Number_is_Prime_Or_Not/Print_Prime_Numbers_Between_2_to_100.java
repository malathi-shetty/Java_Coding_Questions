package check_Given_Number_is_Prime_Or_Not;

public class Print_Prime_Numbers_Between_2_to_100 {
	public static void main(String[] args) {
	// Print Prime Numbers Between 2 to 100 Excluding Those Numbers Containing 3 or 7
	//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97	
		
		for(int i=2; i<=100; i++) //This loop checks each number (i) between 2 and 100.
		{
			//It calls the isPrime method to determine if i is a prime number.
			//It uses the containsDigit method to check if the number does not contain the digits 3 or 7.
			if(isPrime(i) && !containsDigit(i,3) && !containsDigit(i,7))
			{
				System.out.println(i); //Print the number if all conditions are met
			}
		}
	}
	private static boolean isPrime(int num) 
	{
//This method checks if a number is a prime number. A prime number is a number greater than 1 that has no divisors other than 1 and itself.
		if(num <= 1) return false; //Check if the number is less than or equal to 1 - Numbers less than or equal to 1 are not prime.
		
//We only need to check divisors up to the square root of num because if num is divisible by a number larger than its square root, 
		//it will also be divisible by a number smaller than its square root.
		for(int i=2; i<=Math.sqrt(num); i++) //Loop from 2 to the square root of the number
		{
			if(num % i == 0) return false; 
		//Check if num is divisible by i: If num can be divided by i with no remainder, it's not a prime number.
		}	
		return true; //Return true if no divisors were found:
	}
	private static boolean containsDigit(int num, int digit) //This method checks if a number contains a specific digit.
	{
		return Integer.toString(num).contains(Integer.toString(digit)); 
//It converts both num and digit to strings.Then it checks if the string representation of digit is present in the string representation of num.
	}
}