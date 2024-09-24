package reverse_A_String_Different_Ways;

public class Using_charAt_How_To_Reverse_Each_Word_in_a_String_2_1 {

	public static void main(String[] args) {

		String s ="Hey good girl";
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