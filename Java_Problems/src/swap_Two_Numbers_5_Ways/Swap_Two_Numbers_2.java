package swap_Two_Numbers_5_Ways;

public class Swap_Two_Numbers_2 {

	public static void main(String[] args) {
		// Swapping is Interchanging values of Variables
		
				// a=10, b=20 - before swapping
				//a=20, b=10 - after swapping
				
				int a=10, b=20;
				System.out.println("Before Swapping values are.. " + "a: " + a + " , " + "b: " + b );		
				
				// Logic 2: Using Operator: + & - , without using third Variable
				
				a = a + b; // 10+20 = 30
				b = a - b; // 30 - 20 = 10
				a = a - b; // 30-10 = 20		
				
				System.out.println("After Swapping values are.. " + "a: " + a + " , " + "b: " + b );

	}

}