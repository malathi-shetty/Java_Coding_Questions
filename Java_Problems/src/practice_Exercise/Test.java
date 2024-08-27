package practice_Exercise;

public class Test { // This class performs operations and prints results.

	static int x = 10; // Static variable x
	int y = 50; // Instance variable y

	public static void main(String[] args) {
		Run run = new Run(); // Create an instance of Run - This class initializes the Test class and manages
								// the operations.
	}

	public void m() {
		x = x + 10; // Update static variable x
		y = y + x; // Update instance variable y with new x
		System.out.println("value of x: " + x); // Print updated x
		System.out.println("value of y: " + y); // Print updated y
	}

}

/*
 * Test: This class performs operations and prints results. Run: This class
 * initializes the Test class and manages the operations.
 * 
 *
 * static int x = 10;: X marks the static spot, starts at 10. 
 * 
 * int y = 50;: Y for instance variable, starts at 50. 
 * 
 * int z = 20;: Z for a new start, begins at 20.
 * 
 * The main method creates an instance of Run, starting the process.
 * 
 * 
 * Inside Method m() of Test:
 * 
 * x = x + 10;: Updates static X. X becomes 10 + 10 = 20. y = y + x;: Updates
 * instance Y. Y becomes 50 + 20 = 70. System.out.println(x);: Prints the
 * updated X (20). System.out.println(y);: Prints the updated Y (70).
 * 
 * 
 * "Run starts and Test runs: X grows, Y and Z show."
 * 
 * Run starts everything and creates Test. Test updates X and Y. Run calculates
 * and prints Z after running Test.
 * 
 */