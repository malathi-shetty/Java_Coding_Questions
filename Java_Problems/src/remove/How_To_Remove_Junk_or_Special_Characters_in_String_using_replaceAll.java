package remove;

public class How_To_Remove_Junk_or_Special_Characters_in_String_using_replaceAll {

	public static void main(String[] args) {
		
	
		String s ="Java123!@#$^&*";
		String k = s.replaceAll("[^A-Za-z]", ""); //match all alphabet - ^ means remove all character except a-zA-Z
		System.out.println("Only Alphabet: " + k);
		
		
		System.out.println("");
		String s1 = "!@$%^€¢£¥¤®±°²µ¾¿Ð×ð&␠*-+ latin string 01234567890";
		// ^ Negation means (keep)
		//match all Junk Characters - ^ means remove all character : a-zA-Z0-9
		s1 = s1.replaceAll("[a-zA-Z0-9]", ""); 
		System.out.println("Only Junk Character: " + s1);
		
		System.out.println("");
		String s2 ="@#$@#$@ testing @#$@#$@ Selenium123 @#$@#$@ &&&& Java !!!!";
		//match all alphabet & Numeric - ^ means remove all character except a-zA-Z0-9
		s2=s2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Only Alphabet & Numerics: " + s2);
		
		System.out.println("");
		String s3 ="Java123!@#$^&*";
		 s3 = s3.replaceAll("[^0-9]", ""); 
		System.out.println("Only Numerics: " + s3);
		
	}

}