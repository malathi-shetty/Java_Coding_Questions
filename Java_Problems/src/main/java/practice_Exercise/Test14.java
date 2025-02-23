package practice_Exercise;

public class Test14 {

	public static void main(String[] args) {
		  int a = 10, b = 20, c = 30;
	        if(a > b || b > c && a < c) {
	            System.out.println("True");
	        } else {
	            System.out.println("False");
	        }

	}

}
// Output: False

/*
 * 
 * && (AND) is evaluated before || (OR). So, b > c && a < c is checked first.
 * 
b > c : Is 20 > 30 ? No, so it's false .

a < c : Is 10 < 30 ? Yes, so it's true .

Now, the condition b > c && a < c becomes false && true , which is false .

Final Condition: a > b || (b > c && a < c)

a > b: Is 10 > 20? No, so it's false .

Now the whole condition is false || false, which is false.
 * 
 ****
 *
break down the logic of the condition in the if statement:

if(a > b || b > c && a < c)

Here, the condition involves both the logical OR (||) and logical AND (&&) operators. In Java, the operators have a precedence:

&& (AND) has higher precedence than || (OR).

Expression Breakdown:

a > b:

a = 10, b = 20 → 10 > 20 is false.

b > c && a < c:

b = 20, c = 30 → 20 > 30 is false.

a = 10, c = 30 → 10 < 30 is true.

Since && is evaluated first, we get: false && true, which is false.

Final Condition:

The full expression is now:

false || false

The || operator returns true if either operand is true, but in this case, both operands are false, so the overall result is false.

Conclusion:

The output of this code will be:

False

*/