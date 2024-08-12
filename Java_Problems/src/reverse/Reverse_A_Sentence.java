package reverse;

public class Reverse_A_Sentence {

	public static void main(String[] args) {
		String s="Learn Java In a Simple Method";
		
		String a[] = s.split(" ");
		
		String rev="";
		
		for(int i=a.length-1; i>=0; i--)
		{
			rev = rev+  " " + a[i]; // gives space in between Text
		}
		
		System.out.println(rev); // Method Simple a In Java Learn

	}

}
