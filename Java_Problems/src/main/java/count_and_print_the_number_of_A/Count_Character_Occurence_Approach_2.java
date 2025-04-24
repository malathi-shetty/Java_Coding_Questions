package count_and_print_the_number_of_A;

public class Count_Character_Occurence_Approach_2 {

	public static void main(String[] args) {

		String str = "I am learning java java learning";
		
		System.out.println("length of the String: " + str.length());
		
		
		int num = str.length()-str.replaceAll("a", "").length();
		//32-25 = 7
		
		
		
		System.out.println(num); // a is repeated 7 times

	}

}
 