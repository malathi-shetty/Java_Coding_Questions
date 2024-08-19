package replaceCharacter;

public class Replace_SecondOccurrence_E_with_specialcharacter_1_3 {

	public static void main(String[] args) {
		
		String s = "BOOKEEPER";
		StringBuilder sb = new StringBuilder(s);
	//	sb.setCharAt(5, '#');
		
	int k =	sb.indexOf("E");
	System.out.println(k);
	int j =	sb.indexOf("E", k+1);
	System.out.println(j);
	sb.setCharAt(j, '#');
		System.out.println(sb);

	}

}
