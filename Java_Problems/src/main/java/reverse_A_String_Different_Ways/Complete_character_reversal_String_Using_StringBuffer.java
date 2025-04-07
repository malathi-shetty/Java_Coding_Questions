package reverse_A_String_Different_Ways;

public class Complete_character_reversal_String_Using_StringBuffer {

	public static void main(String[] args) {
		
		String str = "Java coding Program";	
		System.out.println("str: " + str);
		StringBuffer sb = new StringBuffer(str);
		System.out.println("StringBuffer: " + sb.reverse());

	}

}

/*

str: Java coding Program

StringBuffer: margorP gnidoc avaJ

*/