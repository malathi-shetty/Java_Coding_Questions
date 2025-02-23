package practice_Exercise;

public class Test7 {

	public static void main(String[] args) {
		int count = 1;
		while(count <= 15)
		{
			System.out.println(count % 2 == 1 ? "***" : "+++++");
			++count;
		}

	}

}
// Output: 8 times * and 7 times +++++

/*

How it Works:

Initialization: The variable count is initialized to 1.

While Loop Condition: The loop continues to run while count <= 15.

Ternary Operation: Inside the loop, the ternary operation checks if count % 2 == 1 (whether count is odd). If count is odd, the output is ***; otherwise, the output is +++++.

Increment: After printing, the value of count is incremented by 1 (++count).

Understanding the Pattern:

The loop runs 15 times because count starts at 1 and increments until it reaches 15.

On odd values of count (1, 3, 5, 7, 9, 11, 13, 15), the output is ***.

On even values of count (2, 4, 6, 8, 10, 12, 14), the output is +++++.

Count of Each Output:

Odd numbers from 1 to 15 are: 1, 3, 5, 7, 9, 11, 13, 15 (total 8 times).

Even numbers from 1 to 15 are: 2, 4, 6, 8, 10, 12, 14 (total 7 times).

Thus, the output is *** printed 8 times and +++++ printed 7 times.

Output:

***

+++++

***

+++++

***

+++++

***

+++++

***

+++++

***

+++++

***

+++++

***

+++++

This is why the program produces 8 times *** and 7 times +++++.

*/