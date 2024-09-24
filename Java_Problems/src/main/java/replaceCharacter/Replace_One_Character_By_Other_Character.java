package replaceCharacter;

public class Replace_One_Character_By_Other_Character {

	public static void main(String[] args) {
		String str = "I am learning java java learning";

		int num = str.length() - str.replaceAll("a", "").length();
		System.out.println(num);

		// OR
/*
		String s = str.replaceAll("a", "");
		System.out.println(s);
		int num = str.length() - s.length();
		System.out.println(num);
*/
	}

}
