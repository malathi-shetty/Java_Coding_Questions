package reverse_A_String_Different_Ways;

public class Using_charAt_How_To_Reverse_Each_Word_in_a_String_2_1 {

	public static void main(String[] args) {

		String s = "Java coding questions";
		String []a = s.split(" "); // java - 0, coding - 1, questions - 2
	
		String rev = "";
		
		for(String k:a)
		{
			for(int i=k.length()-1; i>=0; i--)
			{
			rev = rev + k.charAt(i);			
			}
			rev = rev + " ";
		}		
		System.out.println(rev);
	}
}