package practice_Exercise;

public class Test_2 {

	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		int z = 4;
		int w = 5;
		int a = 10;
		int b = 7;

		x = (x > 2) ? x + 1 : x - 1; // x = 4 (since x > 2)
		y = (y > 1) ? y + 1 : y - 1; // y = 3 (since y > 1)
		z = (z < 6) ? z + 2 : z - 1; // z = 6 (since z < 6)
		w = (w % 2 == 0) ? w / 2 : w * 2; // w = 10 (since w is odd, w * 2 = 10)

		a = (a % 3 == 0) ? a - 3 : (a > 5 ? a - 2 : a + 1); // a = 8 (since a % 3 != 0, and a > 5, so a - 2)
		b = (b < 10) ? b + 3 : b - 1; // b = 10 (since b < 10)
		x = (x == y) ? x + 2 : x; // x remains 4 (since x != y)
		y = (x != y) ? y - 1 : y; // y = 2 (since x != y, so y - 1)
		System.out.print((x > 5 && y > 0) ? "First "
				: (z > 5) ? "Second " : (w > 5) ? "Third " : (a < 7) ? "Fourth " : (b == 10) ? "Fifth " : "");
		System.out.println("End of Program");

		/*
		 * Final conditional string output: The program evaluates multiple conditions to
		 * decide which string to print:
		 * 
		 * (x > 5 && y > 0) → x is 4 and y is 2, so this is false.
		 * 
		 * (z > 5) → z is 6, so this is true. The string "Second " will be printed.
		 * 
		 * The rest of the conditions won't be checked since the previous condition is
		 * true.
		 */

	}

}

/*

Initial values:

int x = 3;

int y = 2;

int z = 4;

int w = 5;

int a = 10;

int b = 7;

x = 3

y = 2

z = 4

w = 5

a = 10

b = 7

Step 1: First set of ternary operations

x = (x > 2) ? x + 1 : x - 1;  

x = 3, and 3 > 2 is true, so the expression x + 1 is chosen.

New value of x = 3 + 1 = 4.

y = (y > 1) ? y + 1 : y - 1;  

y = 2, and 2 > 1 is true, so the expression y + 1 is chosen.

New value of y = 2 + 1 = 3.

z = (z < 6) ? z + 2 : z - 1;  

z = 4, and 4 < 6 is true, so the expression z + 2 is chosen.

New value of z = 4 + 2 = 6.

w = (w % 2 == 0) ? w / 2 : w * 2;  

w = 5, and 5 % 2 == 0 is false (because 5 is odd), so the expression w * 2 is chosen.

New value of w = 5 * 2 = 10.

Values after this step:

x = 4

y = 3

z = 6

w = 10

Step 2: Second set of ternary operations

a = (a % 3 == 0) ? a - 3 : (a > 5 ? a - 2 : a + 1);  

a = 10, and 10 % 3 == 0 is false, so we evaluate the second part: (a > 5 ? a - 2 : a + 1).

a = 10, and 10 > 5 is true, so we choose a - 2.

New value of a = 10 - 2 = 8.

b = (b < 10) ? b + 3 : b - 1;  

b = 7, and 7 < 10 is true, so the expression b + 3 is chosen.

New value of b = 7 + 3 = 10.

Values after this step:

a = 8

b = 10

Step 3: Further ternary operations on x and y

x = (x == y) ? x + 2 : x;  

x = 4, and x == y (i.e., 4 == 3) is false, so the value of x remains unchanged.

New value of x = 4.

y = (x != y) ? y - 1 : y;  

x = 4, y = 3, and x != y (i.e., 4 != 3) is true, so we choose y - 1.

New value of y = 3 - 1 = 2.

Values after this step:

x = 4

y = 2

Step 4: Final conditional output

Now, we check the conditions in the System.out.print statement:

System.out.print((x > 5 && y > 0) ? "First " : (z > 5) ? "Second " : (w > 5) ? "Third " 
                              : (a < 7) ? "Fourth " : (b == 10) ? "Fifth " : "");
We evaluate these conditions in order:

(x > 5 && y > 0) → x = 4 and y = 2, so 4 > 5 is false, and y > 0 is true. Since the first part is false, we don't print "First ".

(z > 5) → z = 6, and 6 > 5 is true, so we print "Second ".

Because this condition is true, the rest of the conditions won't be evaluated (since ternary operators work like if-else, and the first match causes the rest to be skipped).

Final Output:

Second End of Program

So, the program prints:


Second End of Program

This happens because the condition (z > 5) is true, so "Second " is printed before "End of Program".







 * 
 * Solution is :
 * 
 * x = (x > 2) ? x + 1 : x - 1; → x = 4
 * 
 * y = (y > 1) ? y + 1 : y - 1; → y = 3
 * 
 * z = (z < 6) ? z + 2 : z - 1; → z = 6
 * 
 * w = (w % 2 == 0) ? w / 2 : w * 2; → w = 10
 * 
 * a = (a % 3 == 0) ? a - 3 : (a > 5 ? a - 2 : a + 1); → a = 8
 * 
 * b = (b < 10) ? b + 3 : b - 1; → b = 10
 * 
 * x = (x == y) ? x + 2 : x; y = (x != y) ? y - 1 : y; → x = 4, y = 2
 * 
 * Output Evaluation:
 * 
 * x > 5 && y > 0 → false
 * 
 * z > 5 → true, so "Second " is printed.
 * 
 */