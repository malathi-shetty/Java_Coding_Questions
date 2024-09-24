package swap_Two_Numbers_5_Ways;

public class Swap_Two_Numbers_4 {

	public static void main(String[] args) {
		// Swapping is Interchanging values of Variables
		
		// a=50, b=60 - before swapping
		//a=60, b=50 - after swapping
		
		int a=50, b=60;
		System.out.println("Before Swapping values are.. " + "a: " + a + " , " + "b: " + b );
		
		// Logic 4: Bitwise XOR operator (^)
		// http://easyonlineconverter.com/converters/bitwise-calculator.html - decimal would be converted to binary
		// 50 - 110010; 60 - 111100 -- http://easyonlineconverter.com/converters/dec_to_bin_converter.html
		// https://www.rapidtables.com/convert/number/binary-to-decimal.html
		
		a = a^b; // 50^60= 14
		b = a^b; // 14^60 = 50
		a = a^b; // 14^50 = 60
			
		System.out.println("After Swapping values are.. " + " a: " + a + " , " + "b: " + b );

	}

}