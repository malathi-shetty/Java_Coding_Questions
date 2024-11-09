package pyramid_pattern_star_number_alphabets;

public class Binary_Pattern {
	/*
	 * 1
	 * 
	 * 0 1
	 * 
	 * 1 0 1
	 * 
	 * 0 1 0 1
	 * 
	 * 1 0 1 0 1
	 * 
	 * 0 1 0 1 0 1
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6; // Total number of rows

		// Loop through each row
		for (int i = 1; i <= rows; i++) {
			// Loop through each column in the row
			for (int j = 1; j <= i; j++) {
				// Print alternating 1's and 0's
			//	 System.out.print((i + j) % 2  + " "); // uncomment this & comment below
				// to see changes
				System.out.print(((i + j) % 2 == 0 ? 1 : 0) + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

}

/*
 * 
 * The Outer Loop (for (int i = 1; i <= rows; i++))
 * 
 * This loop runs 6 times (since rows = 6). It controls the number of rows of
 * the pattern to print.
 * 
 * When i = 1, it's the first row.
 * 
 * When i = 2, it's the second row.
 * 
 * And so on, until i = 6 (the sixth row).
 * 
 * 2. The Inner Loop (for (int j = 1; j <= i; j++))
 * 
 * The inner loop runs a variable number of times depending on the value of i.
 * It controls the number of columns printed in each row. For example:
 * 
 * In row 1 (i = 1), it prints 1 value (because j runs from 1 to 1).
 * 
 * In row 2 (i = 2), it prints 2 values (because j runs from 1 to 2).
 * 
 * In row 3 (i = 3), it prints 3 values, and so on.
 * 
 * 3. The Conditional Expression (((i + j) % 2 == 0 ? 1 : 0))
 * 
 * This is the key part of the pattern generation. Let's break it down:
 * 
 * 
 * (i + j):
 * 
 * This is the sum of the current row number (i) and the current column number
 * (j).
 * 
 * (i + j) % 2:
 * 
 * The % operator calculates the remainder when (i + j) is divided by 2.
 * 
 * If the sum (i + j) is even (i.e., divisible by 2 with no remainder), (i + j)
 * % 2 will give 0.
 * 
 * If the sum (i + j) is odd (i.e., when divided by 2 it leaves a remainder of
 * 1), (i + j) % 2 will give 1.
 * 
 * So, this part (i + j) % 2 == 0 checks whether the sum of i + j is even:
 * 
 * If true (sum is even), it returns 1.
 * 
 * If false (sum is odd), it returns 0.
 * 
 * The full ternary expression ((i + j) % 2 == 0 ? 1 : 0) does the following:
 * 
 * If the sum (i + j) is even, it prints 1.
 * 
 * If the sum (i + j) is odd, it prints 0.
 * 
 * Example Walkthrough
 * 
 * Let's walk through the first few iterations of the program to see how this
 * works.
 * 
 * Row 1 (i = 1):
 * 
 * Column 1 (j = 1):
 * 
 * i + j = 1 + 1 = 2 (which is even)
 * 
 * 2 % 2 == 0 → true → print 1
 * 
 * Row 1 output: 1
 * 
 * Row 2 (i = 2):
 * 
 * Column 1 (j = 1):
 * 
 * i + j = 2 + 1 = 3 (which is odd)
 * 
 * 3 % 2 == 0 → false → print 0
 * 
 * Column 2 (j = 2):
 * 
 * i + j = 2 + 2 = 4 (which is even)
 * 
 * 4 % 2 == 0 → true → print 1
 * 
 * Row 2 output: 0 1
 * 
 * Row 3 (i = 3):
 * 
 * Column 1 (j = 1):
 * 
 * i + j = 3 + 1 = 4 (which is even)
 * 
 * 4 % 2 == 0 → true → print 1
 * 
 * Column 2 (j = 2):
 * 
 * i + j = 3 + 2 = 5 (which is odd)
 * 
 * 5 % 2 == 0 → false → print 0
 * 
 * Column 3 (j = 3):
 * 
 * i + j = 3 + 3 = 6 (which is even)
 * 
 * 6 % 2 == 0 → true → print 1
 * 
 * Row 3 output: 1 0 1
 * 
 * Row 4 (i = 4):
 * 
 * Column 1 (j = 1):
 * 
 * i + j = 4 + 1 = 5 (which is odd)
 * 
 * 5 % 2 == 0 → false → print 0
 * 
 * Column 2 (j = 2):
 * 
 * i + j = 4 + 2 = 6 (which is even)
 * 
 * 6 % 2 == 0 → true → print 1
 * 
 * Column 3 (j = 3):
 * 
 * i + j = 4 + 3 = 7 (which is odd)
 * 
 * 7 % 2 == 0 → false → print 0
 * 
 * Column 4 (j = 4):
 * 
 * i + j = 4 + 4 = 8 (which is even)
 * 
 * 8 % 2 == 0 → true → print 1
 * 
 * Row 4 output: 0 1 0 1
 * 
 * 
 * Full Example of Output
 * 
 * The program runs for 6 rows, and the output looks like this:
 * 
 * 1
 * 
 * 0 1
 * 
 * 1 0 1
 * 
 * 0 1 0 1
 * 
 * 1 0 1 0 1
 * 
 * 0 1 0 1 0 1
 * 
 * Summary:
 * 
 * (i + j) % 2 == 0 ? 1 : 0 evaluates whether the sum of the current row (i) and
 * column (j) is even or odd.
 * 
 * If the sum is even, it prints 1.
 * 
 * If the sum is odd, it prints 0.
 * 
 * This alternates the 1s and 0s across the rows and columns, creating the
 * desired pattern.
 ******* 
 * explanation: 2 ***
 *
 * Row 1 (i = 1) and Column 1 (j = 1)
 * 
 * Row 1: i = 1
 * 
 * This means we are printing the first row.
 * 
 * The loop for i starts at i = 1 (since we're going through 6 rows in total).
 * 
 * Column 1: j = 1
 * 
 * For the first row, we are in the first column, so j = 1.
 * 
 * Now, let's evaluate the expression ((i + j) % 2 == 0 ? 1 : 0) step by step:
 * 
 * Step 1: Calculate i + j
 * 
 * i = 1 (the current row number)
 * 
 * j = 1 (the current column number)
 * 
 * So, we calculate:
 * 
 * 
 * i+j=1+1=2 Step 2: Apply the modulus operation (i + j) % 2 Now we compute the
 * modulus of 2 divided by 2:
 * 
 * 2%2=0
 * 
 * (When you divide 2 by 2, there is no remainder, so the result is 0.) Step 3:
 * Check if (i + j) % 2 == 0 Since (i + j) % 2 = 0, we check if it's equal to 0:
 * 
 * 0==0(True!)
 * 
 * Step 4: Evaluate the ternary operator
 * 
 * Since the condition (i + j) % 2 == 0 is true, the ternary operator ? :
 * returns the value 1.
 * 
 * Thus, for Row 1, Column 1, the value printed is 1.
 * 
 * Summary for Row 1:
 * 
 * The sum of i (1) and j (1) is 2.
 * 
 * Since 2 % 2 == 0, the ternary expression returns 1, and 1 is printed for this
 * position in the first row.
 * 
 * Full Breakdown of Row 1
 * 
 * Since the first row only has 1 column, the loop for j runs once, and the
 * expression prints only one value.
 * 
 * Output for Row 1:
 * 
 * 1
 * 
 * How It Continues for Other Rows:
 * 
 * how it works for Row 2 and Row 3.
 * 
 * Row 2 (i = 2):
 * 
 * Column 1 (j = 1):
 * 
 * i+j=2+1=3
 * 
 * 
 * 3%2=1 (odd, so print 0)
 * 
 * Column 2 (j = 2):
 * 
 * i+j=2+2=4
 * 
 * 4%2=0 (even, so print 1 Output for Row 2:
 * 
 * 0 1 Row 3 (i = 3):
 * 
 * Column 1 (j = 1):
 * 
 * i+j=3+1=4
 * 
 * 4%2=0 (even, so print 1 Column 2 (j = 2):
 * 
 * i+j=3+2=5
 * 
 * 5%2=1 (odd, so print 0)
 * 
 * Column 3 (j = 3):
 * 
 * i+j=3+3=6
 * 
 * 6%2=0 (even, so print 1)
 * 
 * Output for Row 3:
 * 
 * 1 0 1 Final Output for the Whole Program
 * 
 * The pattern will look like this after all rows and columns have been printed:
 * 
 * 1
 * 
 * 0 1
 * 
 * 1 0 1
 * 
 * 0 1 0 1
 * 
 * 1 0 1 0 1
 * 
 * 0 1 0 1 0 1
 * 
 * Recap of the Key Idea
 * 
 * Sum of i + j: For each position in the grid, we add the row index (i) and the
 * column index (j).
 * 
 * Modulo operation: We check if the sum is even or odd by taking the result of
 * (i + j) % 2.
 * 
 * Even: Print 1.
 * 
 * Odd: Print 0.
 * 
 * This alternating 1 and 0 pattern is driven by whether the sum of the row
 * number (i) and column number (j) is even or odd.
 * 
 * 
 * 
 * **** explanatipn 3: ***
 * 
 * The ternary expression ((i + j) % 2 == 0 ? 1 : 0) applies every time the
 * inner loop runs, not just at the start. Let's break down the loops and how
 * the ternary expression works within the inner loop.
 * 
 * 
 * Key Points:
 * 
 * Outer loop: for (int i = 1; i <= rows; i++) controls the rows. It will
 * iterate from 1 to rows (which is 6 in this case).
 * 
 * Inner loop: for (int j = 1; j <= i; j++) controls the columns in each row.
 * The number of columns printed in each row depends on the value of i. For
 * example:
 * 
 * For i = 1, the inner loop runs once (j = 1).
 * 
 * For i = 2, the inner loop runs twice (j = 1, 2).
 * 
 * And so on.
 * 
 * The Role of the Ternary Expression:
 * 
 * The ternary expression ((i + j) % 2 == 0 ? 1 : 0) is inside the inner loop,
 * meaning it will be evaluated each time the inner loop executes. It’s
 * evaluated for each column in the current row, and based on the sum of i and
 * j, it will print either 1 or 0.
 * 
 * How It Works:
 * 
 * Let’s take a detailed look at the ternary expression:
 * 
 * 
 * ((i + j) % 2 == 0 ? 1 : 0)
 * 
 * i + j: This adds the row index (i) and column index (j).
 * 
 * (i + j) % 2: This calculates the remainder when i + j is divided by 2. The
 * result will be 0 for even sums and 1 for odd sums.
 * 
 * == 0: This checks if the result of (i + j) % 2 is equal to 0 (i.e., if the
 * sum is even).
 * 
 * ? 1 : 0: This is a ternary (conditional) operator:
 * 
 * If (i + j) % 2 == 0 is true (the sum is even), it returns 1.
 * 
 * If (i + j) % 2 == 0 is false (the sum is odd), it returns 0.
 * 
 * So, for each value of i (the row number) and j (the column number), the
 * expression will decide whether to print 1 or 0 based on the sum of i and j.
 * 
 * Example Walkthrough
 * 
 * Let’s break down a specific case to see how this works in action.
 * 
 * Row 1 (i = 1):
 * 
 * For i = 1, we only have 1 column (since j goes from 1 to i, which is 1).
 * 
 * Column 1 (j = 1):
 * 
 * i + j = 1 + 1 = 2 (even)
 * 
 * (i + j) % 2 = 2 % 2 = 0 → true (since the sum is even)
 * 
 * The ternary expression returns 1, so 1 is printed.
 * 
 * Output for Row 1: 1
 * 
 * Row 2 (i = 2):
 * 
 * For i = 2, we have 2 columns (since j goes from 1 to i, which is 2).
 * 
 * Column 1 (j = 1):
 * 
 * i + j = 2 + 1 = 3 (odd)
 * 
 * (i + j) % 2 = 3 % 2 = 1 → false (since the sum is odd)
 * 
 * The ternary expression returns 0, so 0 is printed.
 * 
 * Column 2 (j = 2):
 * 
 * i + j = 2 + 2 = 4 (even)
 * 
 * (i + j) % 2 = 4 % 2 = 0 → true (since the sum is even)
 * 
 * The ternary expression returns 1, so 1 is printed.
 * 
 * Output for Row 2: 0 1
 * 
 * Row 3 (i = 3):
 * 
 * For i = 3, we have 3 columns (since j goes from 1 to i, which is 3).
 * 
 * Column 1 (j = 1):
 * 
 * i + j = 3 + 1 = 4 (even)
 * 
 * (i + j) % 2 = 4 % 2 = 0 → true (since the sum is even)
 * 
 * The ternary expression returns 1, so 1 is printed.
 * 
 * Column 2 (j = 2):
 * 
 * i + j = 3 + 2 = 5 (odd)
 * 
 * (i + j) % 2 = 5 % 2 = 1 → false (since the sum is odd)
 * 
 * The ternary expression returns 0, so 0 is printed.
 * 
 * Column 3 (j = 3):
 * 
 * i + j = 3 + 3 = 6 (even)
 * 
 * (i + j) % 2 = 6 % 2 = 0 → true (since the sum is even)
 * 
 * The ternary expression returns 1, so 1 is printed.
 * 
 * Output for Row 3: 1 0 1
 * 
 * How the Ternary Expression Works on Each Loop Iteration:
 * 
 * The ternary expression ((i + j) % 2 == 0 ? 1 : 0) is evaluated every time the
 * inner loop runs. This means:
 * 
 * For each column (j) in a given row (i), it checks whether the sum of i + j is
 * even or odd.
 * 
 * It then prints 1 if the sum is even, and 0 if the sum is odd.
 * 
 * This pattern continues for each row and column in the grid. The ternary
 * expression is evaluated individually for each column in the current row.
 * 
 * Final Output:
 * 
 * The final output after all the loops run will be:
 * 
 * 1
 * 
 * 0 1
 * 
 * 1 0 1
 * 
 * 0 1 0 1
 * 
 * 1 0 1 0 1
 * 
 * 0 1 0 1 0 1
 * 
 * Summary:
 * 
 * The ternary expression is evaluated on each column (each j value) for every
 * row (each i value).
 * 
 * It checks if the sum of the current row (i) and column (j) is even or odd
 * using (i + j) % 2.
 * 
 * It does not apply only at the start; it's applied each time the inner loop
 * runs (for each column in a row).
 * 
 * Based on whether the sum is even or odd, it prints 1 or 0, respectively.
 * 
 * 
 * 
 * 
 */