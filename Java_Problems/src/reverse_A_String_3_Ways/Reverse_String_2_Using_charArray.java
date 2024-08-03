package reverse_A_String_3_Ways;

public class Reverse_String_2_Using_charArray {

	public static void main(String[] args) {
		// Logic 2: Using Character Array
		// separate each character & then store it into a character array
		
		String str = "Testing";
		String rev = "";
		
		char a[] = str.toCharArray();
		int len = a.length; //7
		System.out.println("Length of the Character: " + len);
		
		for(int i=len-1; i>=0; i--) // 6 5 4 3 2 1 0       -1(come out of the loop)
		{
			rev = rev + a[i]; // g n i t s e T
		}
		
		System.out.println("Reverse String is: " + rev);
			
		// toCharArray(); - a method to convert string into into multiple characters store into character array	char a[]
	}

}