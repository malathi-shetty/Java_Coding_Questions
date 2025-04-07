package reverse_A_String_Different_Ways;

public class Word_level_reverse_the_string_with_StringBuilder_2 {

	public static void main(String[] args) {
		
		String s = "Welcome To Java";
		System.out.println("s: " + s);
		String [] words = s.split("\\s");
		
		String revWords = "";
		
		for(String w: words) // Welcome
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse(); // emocleW
			
			revWords = revWords + sb.toString() + " "; // emocleW
		}
		System.out.println("revWords: " + revWords);
	}
}

/*

s: Welcome To Java
revWords: emocleW oT avaJ 

*/