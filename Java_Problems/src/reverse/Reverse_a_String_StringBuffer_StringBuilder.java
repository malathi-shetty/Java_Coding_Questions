package reverse;

public class Reverse_a_String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		String s ="Testing";
		
		StringBuffer newobj = new StringBuffer(s);
		System.out.println("StringBuffer: " + newobj.reverse());
		
		
		String original = "hello";
		StringBuilder reversed = new StringBuilder(original).reverse();
		System.out.println("StringBuilder: " + reversed.toString());

	}

}
