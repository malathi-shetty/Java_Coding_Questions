package practice_Exercise;

public class Test22 {

	public static void main(String[] args) {
		  int i= 7 % 4/2*2;
		  System.out.println(i);

	}

}

/*

First, 7 % 4 is evaluated:

The modulus operator returns the remainder of the division of 7 by 4, which is 3 (7 ÷ 4 leaves a remainder of 3).

So now the expression becomes: 3 / 2 * 2

Next, 3 / 2 is evaluated:

In integer division, Java will discard the fractional part, so 3 / 2 results in 1 (not 1.5).

The expression now becomes: 1 * 2

Finally, 1 * 2 is evaluated: This results in 2.

So, the output of your code will be: 2

*/