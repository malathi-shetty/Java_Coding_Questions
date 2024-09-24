package reverse_A_String_Different_Ways;

public class Using_StringBuilder_Reverse_How_To_Reverse_Each_Word_in_a_String_5 {

	public static void main(String[] args) {
		
		String original = "Testing";
		StringBuilder reversed = new StringBuilder(original).reverse();
		System.out.println("StringBuilder: " + reversed.toString());
	}
}
