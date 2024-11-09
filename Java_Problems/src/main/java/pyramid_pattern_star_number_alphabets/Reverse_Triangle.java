package pyramid_pattern_star_number_alphabets;

public class Reverse_Triangle {

	public static void main(String[] args) {

		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
