package reverse_A_String_Different_Ways;

public class Reverse_String_4_Using_StringBuilder {

	public static void main(String[] args) {
		
		String original = "Testing";
		StringBuilder reversed = new StringBuilder(original).reverse();
		System.out.println("StringBuilder: " + reversed.toString());

	}

}
