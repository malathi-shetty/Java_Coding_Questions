package star_pyramid;

public class Code_printing_pyramid_triangle_7 {

	public static void main(String[] args) {
		// 1 2 3 4
		// 5 6 7
		// 8 9
		// 10

		int k = 1;

		for (int i = 0; i < 4; i++) {
			// System.out.println("outer loop_3 started");
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t "); // space
				k++;
			}
			System.out.println(" ");
			// System.out.println("outer loop_3 finished");
		}

		System.out.println("********");
 
		System.out.println("Inverted Number Triangle");

		for (int i = 0; i < 4; i++) {
			// System.out.println("outer loop_3 started");
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(j);
				System.out.print("\t "); // space
			}
			System.out.println(" ");
			// System.out.println("outer loop_3 finished");
		}

	}

}

//1	 2	 3	 4	  
//5	 6	 7	  
//8	 9	  
//10	

//********

//Inverted Number Triangle

//1	 2	 3	 4	  
//1	 2	 3	  
//1	 2	  
//1	
