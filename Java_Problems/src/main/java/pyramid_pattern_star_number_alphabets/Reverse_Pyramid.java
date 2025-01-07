package pyramid_pattern_star_number_alphabets;

public class Reverse_Pyramid {

	public static void main(String[] args) {
		int n = 5; // height of the pyramid
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" "); // spaces before stars
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*"); // stars
			}
			System.out.println();

		}

	}

}

/*
 * 
 * Variable Initialization:
 * 
 * int n = 5; // height of the pyramid
 * 
 * The variable n is set to 5, which represents the height of the pyramid. This
 * means the pyramid will have 5 rows of stars.
 * 
 * Outer Loop:
 * 
 * for (int i = n; i >= 1; i--) {
 * 
 * This loop controls the number of rows printed.
 * 
 * The loop starts with i = n (which is 5 in this case) and runs until i = 1.
 * 
 * In each iteration, i is decremented by 1, so the outer loop runs a total of 5
 * times (for i = 5, i = 4, i = 3, i = 2, and i = 1).
 * 
 * First Inner Loop (Spaces):
 * 
 * for (int j = 0; j < n - i; j++) {
 * 
 * System.out.print(" "); // spaces before stars
 * 
 * }
 * 
 * This loop is responsible for printing spaces before the stars in each row.
 * 
 * The number of spaces before the stars depends on the current row number (i).
 * 
 * In each iteration of the outer loop, the spaces printed are n - i.
 * 
 * For example, when i = 5, no spaces are printed (n - i = 0).
 * 
 * When i = 4, 1 space is printed (n - i = 1), and so on.
 * 
 * Second Inner Loop (Stars):
 * 
 * for (int j = 0; j < 2 * i - 1; j++) {
 * 
 * System.out.print("*"); // stars
 * 
 * }
 * 
 * This loop is responsible for printing the stars (*).
 * 
 * The number of stars printed in each row is 2 * i - 1.
 * 
 * For example, when i = 5, the number of stars is 2 * 5 - 1 = 9.
 * 
 * When i = 4, the number of stars is 2 * 4 - 1 = 7, and so on.
 * 
 * This ensures that the number of stars starts from 9 in the first row and
 * decreases as we move down.
 * 
 * New Line After Each Row:
 * 
 * System.out.println();
 * 
 * After each row is printed (spaces and stars), this line moves the cursor to
 * the next line so that the next row can be printed.
 * 
 * Output:
 * 
 * With n = 5, the program prints the following reverse pyramid pattern:
 *********
 *******
 *****
 ***
 *
 *
 * 
 * In the first row, there are 0 spaces and 9 stars.
 * 
 * In the second row, there is 1 space and 7 stars.
 * 
 * In the third row, there are 2 spaces and 5 stars.
 * 
 * In the fourth row, there are 3 spaces and 3 stars.
 * 
 * In the fifth row, there are 4 spaces and 1 star.
 * 
 * Summary:
 * 
 * This Java program prints a reverse pyramid pattern with stars. The number of
 * rows is determined by the value of n, which is set to 5. For each row, spaces
 * are printed first, followed by the stars, and the number of stars decreases
 * as the program moves downward. The program uses nested loops: the outer loop
 * controls the rows, and the two inner loops control the spaces and stars in
 * each row.
 * 
 */