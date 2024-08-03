package reverse_A_String_3_Ways;

public class Reverse_String_3_Using_StringBuffer {

	public static void main(String[] args) {
		
		String str = "Program";
		String rev = "";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
