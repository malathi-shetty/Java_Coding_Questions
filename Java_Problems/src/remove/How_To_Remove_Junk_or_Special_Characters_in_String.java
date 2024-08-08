package remove;

public class How_To_Remove_Junk_or_Special_Characters_in_String {

	public static void main(String[] args) {
		
		String s = "!@$%^€¢£¥¤®±°²µ¾¿Ð×ð&␠*-+ latin string 01234567890";
		String s1 ="@#$@#$@ testing @#$@#$@ Selenium @#$@#$@ &&&& Java !!!!";
		
		//match all alphabet & Numeric - ^ means remove all character except a-zA-Z0-9
		s = s.replaceAll("[^a-zA-Z0-9]", ""); 
		System.out.println(s);
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}