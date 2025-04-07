package pyramid_pattern_star_number_alphabets;

public class PatternPrinting {
	
	/*
	 * 
	 * Pattern Printing Challenge:

1 2 3 * 

1 2 * 4 

1 * 3 4 

* 2 3 4 

* 
	 */

	public static void main(String[] args) {
		 // Loop through the rows
        for (int i = 0; i < 4; i++) {
            // Loop through the columns
            for (int j = 0; j < 4; j++) {
                // Print '*' at the specific position
                if (j == 3 - i) {
                    System.out.print("* ");
                } else {
                    // Print numbers based on the position
                    System.out.print((j + 1) + " ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

	}

}


/*
Analysis of the Pattern:
	
The pattern consists of 4 rows and 4 columns.

In each row:

The first part (before *) contains numbers starting from 1 up to a certain number.

The * symbol is placed at different positions across the rows.

The second part (after *) contains the remaining numbers in the sequence.

Steps to print the pattern:
	
In the first row, print numbers 1, 2, 3, and then *.

In the second row, print 1, 2, and then *, and finally print 4.

In the third row, print 1, and then *, and then 3, 4.

In the fourth row, print *, and then 2, 3, 4.


Outer loop: The outer loop (i) controls the rows.

Inner loop: The inner loop (j) prints the numbers and the * symbol.

If the column index j is equal to 3 - i, it prints * (this defines the position of *).

Otherwise, it prints numbers starting from 1 up to the current column.

Output:

	The output of the above code will be:


1 2 3 * 

1 2 * 4 

1 * 3 4 

* 2 3 4

*/