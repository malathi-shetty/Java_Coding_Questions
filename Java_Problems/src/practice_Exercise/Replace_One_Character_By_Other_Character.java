package practice_Exercise;

public class Replace_One_Character_By_Other_Character {

	public static void main(String[] args) {
		String str ="I am learning java java learning";
		
		int num = str.length()-str.replaceAll("a", "").length();
		System.out.println(num);

	}

}
