package swap_Two_Numbers_5_Ways;

public class Swap_Two_Numbers_5 {

	public static void main(String[] args) {
		// Swapping is Interchanging values of Variables
		
		// a=60, b=70 - before swapping
		//a=70, b=60 - after swapping
		
		int a=60, b=70;
		System.out.println("Before Swapping values are.. " + "a: " + a + " , " + "b: " + b );
		
		// Logic 5: Using Single Statement
		
		b = a + b - (a = b); // execution always start from right to left
		// a = b i.e b is 70 assigned to a then a is 70 now -- a = 70
		// a + b = 60 + 70 = 130
		// a + b - (a = b) == 130 - 70 = 60 -- now b = 60
		
		System.out.println("After Swapping values are.. " + " a: " + a + " , " + "b: " + b );

	}

}
