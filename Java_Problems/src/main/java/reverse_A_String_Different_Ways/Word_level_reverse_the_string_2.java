package reverse_A_String_Different_Ways;

public class Word_level_reverse_the_string_2 {

	public static void main(String[] args) {

		String s ="Hey good girl";
		
		System.out.println("s: " + s);
		String[] words = s.split(" "); // give space in between
		
		String rev = "";
		
		for(String c: words)
		{
			for(int i=c.length()-1; i>=0; i--)
				{
					rev = rev + c.charAt(i) ;
				
				}
			rev = rev + " ";
		
			
	}
			System.out.println("Reverse words: " + rev);
	}
}

/*
output: 

s: Hey good girl
Reverse words: yeH doog lrig 


*/