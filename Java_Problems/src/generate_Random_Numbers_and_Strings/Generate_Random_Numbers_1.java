package generate_Random_Numbers_and_Strings;

import java.util.Random;

public class Generate_Random_Numbers_1 {

	public static void main(String[] args) {
		// Approach1: Random -By using Random class we can create both integer & doubles
		
	//	ran.nextInt(10); 
		// Generates Random number but we have to give integer eg: 10: 0-9 it will consider & randomly pick 1 number
		// Max-limit is 999

//		ran.nextDouble(); Can also be used to generate decimal numbers - range is 0.0 and less than 1.0
		
		Random ran = new Random();
		int random_int = ran.nextInt(100); 
		System.out.println("Random Number: " + random_int);
		
		double random_dbl = ran.nextDouble();
		System.out.println("Random Decimal Number: " + random_dbl);
	}
}