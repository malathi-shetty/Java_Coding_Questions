package practice_Exercise;

public class Test23 {

	public static void main(String[] args) {
		int x = 10;
		int z = 20;
		int y = x+++z; // Interpreted as x++ + z
		System.out.println(y);
		System.out.println("x = " + x);  // Will print x = 31

	}

}
/*
 * 
When you use x++ (post-increment), the value of x is used in the expression first, and then the increment happens afterward. So, in your code, even though x is incremented to 11 later, it still uses the value of x as 10 for the calculation.

x++ (post-increment) works like this:

The current value of x (which is 10) is used in the expression first.

After using the value of x, x is incremented by 1. So, after the expression x+++z, x will become 11, but this happens after the value of x was used.
+ z:

Now, the value of z (which is 20) is added to the value used in the previous step (which was 10 from x++).

So, the result of x++ + z is 10 + 20, which equals 30.

Final assignment:

The result of x++ + z (which is 30) is assigned to y.

After the operation:

The value of x is now incremented to 11 (because of x++).

So, y becomes 30 (as calculated), and x becomes 11 after the operation.

To summarize:

Before the operation, x is 10.

The post-increment (x++) means the value of x (which is 10) is used before the increment.

After x++ is used, x becomes 11.

The result of x++ + z is 10 + 20 = 30, and this result is assigned to y.

Output:

y is 30 because the addition is calculated using the original value of x, which was 10.

x is now 11 because the post-increment (x++) happens after the value of x is used.

The key idea is that x++ uses the value of x before it increments, which is why x++ in x+++z contributes 10 to the expression even though x is incremented to 11 afterward.

*/

