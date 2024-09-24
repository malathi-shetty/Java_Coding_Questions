package retrieve_A_Particular_Word_From_Sentence;

public class Retrieve_A_Particular_Word_From_Sentence {

	public static void main(String[] args) {
		String s="Learn Java In a Simple Method"; // Retrieve only "simple"
		
		String a[] = s.split(" ");
		

			System.out.println(a[4]); //Learn -0,  Java-1, In-2, a-3, Simple-4, Method-5
	

	}

}
