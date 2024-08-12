package reverse;

public class Reverse_Each_And_Every_Word {

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