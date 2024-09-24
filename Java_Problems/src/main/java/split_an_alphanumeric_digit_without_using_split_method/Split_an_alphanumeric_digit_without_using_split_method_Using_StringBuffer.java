package split_an_alphanumeric_digit_without_using_split_method;

public class Split_an_alphanumeric_digit_without_using_split_method_Using_StringBuffer {

	public static void main(String[] args) {
		String str = "Welcome234To567Java89Programming0@#!!";
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				special.append(str.charAt(i));
		}

		System.out.println("Letters: " + alpha);
		System.out.println("Digits: " + num);
		System.out.println("Special Characters: " + special);
	}

}

/*
 * 
 * Use of StringBuffer: Good choice! StringBuffer is thread-safe and allows you
 * to modify the string efficiently. 
 * 
 * Character Checks: You’re using
 * Character.isDigit() and Character.isAlphabetic() effectively to categorize characters.
 *  
 * 
 * Output: The output includes all three categories, which is
 * exactly what you intended.
 * 
 */