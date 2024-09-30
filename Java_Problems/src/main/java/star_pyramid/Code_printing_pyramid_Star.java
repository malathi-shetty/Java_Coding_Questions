package star_pyramid;

public class Code_printing_pyramid_Star {

	public static void main(String[] args) {
		int n = 5; // Change this value for different height

		// Ascending
		System.out.println("Ascending");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) { // int j = 1; star would be in left side
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Descending
		System.out.println(" ");
		System.out.println("Descending");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j > i; j--) { // int j = n;
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

/*
 * 
 * The outer loop (for (int i = n; i >= 1; i--)) iterates from the total number
 * of rows down to 1.
 * 
 * The inner loop (for (int j = 1; j <= i; j++)) prints the stars based on the
 * current row number, producing the desired descending star pattern.
 * 
 * 
 * 
 * 
 * for (int j = 1; j > i; j--) { // j = 1;
 * 
 * Ascending
 * 
 * //*
 * 
 * //* *
 * 
 * //* * *
 * 
 * //* * * *
 * 
 * //* * * * *
 * 
 * 
 * 
 * 
 * for (int j = n; j <= i; j++) { // j = n; & "*"
 * 
 * System.out.print("*");
 * 
 * }
 * 
 * // *
 * 
 * // **
 * 
 * // ***
 * 
 * // ****
 * 
 * // *****
 * 
 * 
 * 
 * for (int j = n; j > i; j--) // j = n; & "* " -- in triangle form
 * 
 * // System.out.print("* ");
 * 
 * Ascending
 * 
 * // *
 * 
 * // * *
 * 
 * // * * *
 * 
 * // * * * *
 * 
 * // * * * * *
 * 
 * 
 * 
 * 
 * 
 * 
 */