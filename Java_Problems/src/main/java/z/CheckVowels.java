package z;

public class CheckVowels {

	public static void main(String[] args) {
		  String str = "Sky and cloud";
	        boolean hasVowel = false;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = Character.toLowerCase(str.charAt(i));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                hasVowel = true;
	                break;
	            }
	        }

	        System.out.println("Input: " + str);
	        System.out.println("Contains Vowel? " + hasVowel);

	}

}
