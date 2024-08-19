package reverse_A_String_Different_Ways;

public class Using_StringBuilder_Reverse_How_To_Reverse_Each_Word_in_a_String_6 {

	public static void main(String[] args) {
		
		String s = "Welcome To Java";
		String [] words = s.split("\\s");
		
		String revWords = "";
		
		for(String w: words) // Welcome
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse(); // emocleW
			
			revWords = revWords + sb.toString() + " "; // emocleW
		}
		System.out.println(revWords);
	}
}