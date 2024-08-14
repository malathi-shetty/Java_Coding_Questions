package perfect_Number;

public class Perfect_Number {

	public static void main(String[] args) {
		int num = 28;
		int org_num = 28;
		int sum = 0;
		
		for(int i = 1; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}
		boolean isPerfect = sum == org_num;
		System.out.println("Is " + org_num + " Perfect?: " + isPerfect);
	}
}

/*
  int num = 28; sets the number to check.
int org_num = 28; stores the original number (this is redundant here since org_num and num are the same, 
but it's useful for cases where you might compare different values).
int sum = 0; initializes the sum of proper divisors to 0.
 * 
 * The for loop iterates from 1 up to num / 2 :
 * Why up to num / 2?: 
 * The largest possible proper divisor of a number is half of that number, 
 * so you don't need to check beyond num / 2.
 * 
 * Inside the loop, the condition if(num % i == 0) checks if i is a divisor of num. If true, i is added to sum.
 * 
 * After the loop, boolean isPerfect = sum == org_num; 
 * checks if the sum of the proper divisors equals the original number.
If they are equal, isPerfect will be true; otherwise, it will be false.
 *
 * For num = 28:

Loop Iterations:

i = 1: 28 % 1 == 0, so sum = 0 + 1 = 1
i = 2: 28 % 2 == 0, so sum = 1 + 2 = 3
i = 3: 28 % 3 != 0 (not a divisor)
i = 4: 28 % 4 == 0, so sum = 3 + 4 = 7
i = 5: 28 % 5 != 0 (not a divisor)
i = 6: 28 % 6 != 0 (not a divisor)
i = 7: 28 % 7 == 0, so sum = 7 + 7 = 14
i = 8: 28 % 8 != 0 (not a divisor)
i = 9: 28 % 9 != 0 (not a divisor)
i = 10: 28 % 10 != 0 (not a divisor)
i = 11: 28 % 11 != 0 (not a divisor)
i = 12: 28 % 12 != 0 (not a divisor)
i = 13: 28 % 13 != 0 (not a divisor)
i = 14: 28 % 14 == 0, so sum = 14 + 14 = 28

sum after the loop is 28, which equals org_num, so isPerfect is true.

The code checks if a number is a perfect number by calculating the sum of its proper divisors 
and comparing this sum to the original number. 
For num = 28, it correctly identifies that 28 is a perfect number and prints true.
 */