package swap_Two_Numbers_5_Ways;

public class Swap_Two_Numbers_1 {

	public static void main(String[] args) {
		// Swapping is Interchanging values of Variables
		
		// a=10, b=20 - before swapping
		//a=20, b=10 - after swapping
		
		int a=10, b=20;
		System.out.println("Before Swapping values are.. " + "a: " + a + " , " + "b: " + b );
		
		// Logic 1:  Using Third Variable i.e Temp value - int t
		
		int t=a; // t = 10
		a=b;   // a = 20
		b=t;  // b = 10
		
		System.out.println("After Swapping values are.. " + "a: " + a + " , " + "b: " + b );

	}

}
