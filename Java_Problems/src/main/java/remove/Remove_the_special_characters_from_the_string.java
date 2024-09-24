package remove;

public class Remove_the_special_characters_from_the_string {

	public static void main(String[] args) {
		
		String s ="abababababaab@123";
		
		//1st replace
		
		String a = s.replaceAll("a", "b");
		System.out.println(a); //bbbbbbbbbbbbb@123
		
		String k = s.replaceAll("[@,0-9]", " ");
		System.out.println(k); //abababababaab 
		
		String l = s.replaceAll("[@,a-z,A-Z]", "");
		System.out.println(l); // 123
		
		String m = s.replaceAll("[^@,a-z,A-Z]", ""); // by keepin ^ it does opposite 
		System.out.println(m); // 123

	}

}
