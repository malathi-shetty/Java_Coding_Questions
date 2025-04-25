package z;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		  String str1 = "listen";
	        String str2 = "silent";

	        // Remove spaces and convert to lowercase
	        str1 = str1.replaceAll(" ", "").toLowerCase();
	        str2 = str2.replaceAll(" ", "").toLowerCase();

	        if (str1.length() != str2.length()) {
	            System.out.println("Not anagrams");
	            return;
	        }

	        char[] a1 = str1.toCharArray();
	        char[] a2 = str2.toCharArray();

	        Arrays.sort(a1);
	        Arrays.sort(a2);

	        boolean result = Arrays.equals(a1, a2);
	        System.out.println("Are Anagrams? " + result);

	}

}
