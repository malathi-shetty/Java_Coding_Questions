package practice_Exercise;

public class Test8 {

	public static void main(String[] args) {
       
		// Is 3 * 0.1 == 0.3; true or false
		
		   double result = 3 * 0.1;
		// Print the result formatted to 1 decimal place
	        if (Math.abs(result - 0.3) < 1e-9) {
	            System.out.println("True! 3 * 0.1 equals 0.3.");
	        } else {
	            System.out.println("False! 3 * 0.1 does not equal 0.3.");
	        }

	}

}
// Output: True! 3 * 0.1 equals 0.3.