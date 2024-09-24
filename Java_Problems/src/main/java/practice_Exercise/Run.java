package practice_Exercise;

public class Run {

	int z = 20; // Instance variable z
	Test test; // Reference to Test class

	public Run() {
		this.z = z + Test.x; // Update z with the static x from Test
		this.test = new Test(); // Create an instance of Test
		this.test.m(); // Call the method m() on the Test instance
		System.out.println("value of z: " + z); // Print updated z

	}
}

/*
 * 
 * Constructor of Run:
 * 
 * this.z = z + Test.x;: Updates Z by adding X (which is initially 10). 
 * 
 * Z becomes 20 + 10 = 30. 
 * 
 * this.test = new Test();: Creates an instance of Test.
 * 
 * this.test.m();: Calls method m() from the Test instance.
 * 
 * Output in Runner after calling m():
 * 
 * Z remains 30, which is printed.

 */