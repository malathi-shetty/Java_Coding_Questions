package palindrome;

public class Palindrome_StringBuilder {

	public static void main(String[] args) {
		
		String str ="radar";
		boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
		System.out.println("Is Palindrome? " + isPalindrome);

	}

}
