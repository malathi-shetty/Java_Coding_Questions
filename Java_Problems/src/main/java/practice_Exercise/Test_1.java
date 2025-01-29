package practice_Exercise;

public class Test_1 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		if (a > b || b > c && a < c) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}

/*
 * 
 * Initial values:
 * 
 * int a = 10, b = 20, c = 30;
 * 
 * a = 10
 * 
 * b = 20
 * 
 * c = 30
 * 
 * Condition:
 * 
 * if(a > b || b > c && a < c)
 * 
 * The expression inside the if statement contains logical operators (|| for OR
 * and && for AND), and we need to consider operator precedence to evaluate it
 * correctly.
 * 
 * Operator precedence:
 * 
 * && (AND) has higher precedence than || (OR).
 * 
 * So, the expression b > c && a < c is evaluated first, and then the result is
 * combined with a > b using ||.
 * 
 * Step-by-Step Evaluation:
 * 
 * Evaluate b > c && a < c:
 * 
 * b = 20 and c = 30.
 * 
 * b > c → 20 > 30 is false.
 * 
 * a = 10 and c = 30.
 * 
 * a < c → 10 < 30 is true.
 * 
 * So, b > c && a < c becomes false && true, which evaluates to false (since
 * false && true is false).
 * 
 * Evaluate the full condition a > b || (b > c && a < c):
 * 
 * Now, the expression becomes a > b || false.
 * 
 * a = 10 and b = 20.
 * 
 * a > b → 10 > 20 is false.
 * 
 * So, the full condition becomes false || false, which is false (since false ||
 * false is false).
 * 
 * Conclusion:
 * 
 * Since the condition evaluates to false, the else block will be executed.
 * 
 * Output: False
 * 
 * So, the program prints: False
 * 
 */