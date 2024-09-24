package swap_Two_Numbers_5_Ways;

public class Swap_Two_Numbers_3 {

	public static void main(String[] args) {
		// Swapping is Interchanging values of Variables
		
		// a=10, b=20 - before swapping
		//a=20, b=10 - after swapping
		
		int a=30, b=40;
		System.out.println("Before Swapping values are.. " + "a: " + a + " , " + "b: " + b );
		
		// Logic 3: Using Operator: * & / , without using third Variable
		// Applies when a & b values should not be Zero
		
		a = a * b; // 30*40 = 1200
		b = a / b; // 1200 / 40 = 30
		a = a / b; // 1200 / 30 = 40
		
		System.out.println("After Swapping values are.. " + " a: " + a + " , " + "b: " + b );

	}

}