package pyramid_pattern_star_number_alphabets;

public class Code_Printin_pyramid_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 8 10
		// 12 14 16
		// 18 20 22 24

		// Starting number for the pattern
		/*
		 * int k = 8;
		 * 
		 * // Number of rows in the pattern int rows = 3;
		 * 
		 * for(int i=1; i<=rows; i++) { // Print numbers in each row for(int j=0; j<=i;
		 * j++) { System.out.print(k + " "); System.out.print("\t"); k=k+2; // Move to
		 * the next even number } // Move to the next line after each row
		 * System.out.println(""); }
		 */

		int k = 8; // number starts from 8
		for (int i = 1; i < 4; i++) // row + 1 i.e i < 4
		{
			for (int j = 0; j <= i; j++) // initiated j = 0, so that 8 & 10 are in 1 line
			{
				System.out.print(k + " "); // to have space between columns
				// System.out.print(j);
				System.out.print("\t");
				k = k + 2; // 8 + 2 = 10 i.e to increment numbers by 2
			}
			System.out.println("");
		}

	}

}

//System.out.print(j); // if enabled then output would be printed as below:

// 0	1	
// 0	1	2	
// 0	1	2	3	