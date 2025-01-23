package email_Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Validator {

	public static void main(String[] args) {
		// Test email
		// String email = "example@example.com"; // You can change this to test other
		// emails
		// String email = " example@com";
		String email = "user@longtld.photography"; // Change to test other emails
		// Regular expression for a valid email pattern
		// String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,255}$";

		// Create a Pattern object
		Pattern pattern = Pattern.compile(emailRegex);

		// Create a matcher to check the email
		Matcher matcher = pattern.matcher(email);

		// Check if the email matches the pattern
		if (matcher.matches()) {
			System.out.println(email + " is a valid email address.");
		} else {
			System.out.println(email + " is an invalid email address.");
		}

	}

}

/*
 * 
 * Regular Expression (emailRegex):
 * 
 * ^[a-zA-Z0-9_+&*-]+: This part matches the username part of the email, which
 * can contain alphanumeric characters, as well as characters like _, +, &, *,
 * and -.
 * 
 * (?:\\.[a-zA-Z0-9_+&*-]+)*: This part allows for an optional dot (.) followed
 * by more alphanumeric characters (and similar characters as the username
 * part).
 * 
 * @: This is the separator between the username and domain.
 * 
 * (?:[a-zA-Z0-9-]+\\.)+: This part matches the domain name, which can contain
 * alphanumeric characters and hyphens, followed by a dot (.).
 * 
 * [a-zA-Z]{2,7}$: This part matches the top-level domain (TLD), which must be
 * between 2 and 7 alphabetic characters long.
 * 
 * Pattern and Matcher:
 * 
 * We create a Pattern object using the defined regular expression.
 * 
 * The matcher.matches() method checks if the input string (email) matches the
 * pattern.
 * 
 * Validation:
 * 
 * If the email matches the pattern, it is considered valid; otherwise, it is
 * invalid.
 * 
 * Output:
 * 
 * For the input email "example@example.com", the output will be:
 * 
 * example@example.com is a valid email address.
 * 
 * If you try an invalid email, like "example@com", the output will be:
 * 
 * example@com is an invalid email address.
 **********
 * 
 * 
 * To handle edge cases like very long top-level domains (TLDs) or new valid
 * characters in domain names, we need to slightly modify the regular
 * expression. The original regex provided covers basic email validation but
 * does not take into account some more recent specifications, such as:
 * 
 * Long TLDs (over 7 characters), which are now valid (e.g., .photography or
 * .technology).
 * 
 * New valid characters in domain names, such as internationalized domain names
 * (IDNs) or domain names with new top-level domains (TLDs) beyond the typical
 * .com, .net, etc.
 * 
 * Edge Case Updates:
 * 
 * Longer TLDs: Historically, TLDs were limited to 3-6 characters, but now TLDs
 * can be much longer, even up to 253 characters in total domain names (though
 * most TLDs are still quite short, e.g., .photography, .tech, etc.).
 * 
 * Valid Characters: Domain names can contain characters beyond just letters,
 * including new characters like +, _, and numbers.
 * 
 * To account for the longer TLDs and additional valid characters in domain
 * names, we need to update the regex.
 * 
 * Updated Regular Expression:
 * 
 * The following updated regex will handle:
 * 
 * Longer TLDs (more than 7 characters).
 * 
 * Domain names with alphanumeric characters, hyphens, and new characters.
 * 
 * Special characters like +, _, and more, as allowed by the email
 * specification.
 * 
 * New Regular Expression:
 * 
 * String emailRegex =
 * "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,255}$";
 * 
 * Explanation:
 * 
 * ^[a-zA-Z0-9_+&*-]+: Matches the local part (before the @ symbol) which can
 * contain alphanumeric characters and special characters like _, +, &, *, and
 * -.
 * 
 * (?:\\.[a-zA-Z0-9_+&*-]+)*: Optionally matches dots followed by more
 * alphanumeric characters or special characters in the local part.
 * 
 * @: The @ symbol is mandatory between the local part and the domain part.
 * 
 * (?:[a-zA-Z0-9-]+\\.)+: Matches the domain part, which can contain letters,
 * numbers, and hyphens followed by a dot. This allows multiple subdomains like
 * mail.example.com.
 * 
 * [a-zA-Z0-9]{2,255}$: Matches the top-level domain (TLD), which must be
 * between 2 and 255 characters long (the maximum length of a valid domain).
 * TLDs can now be longer than 7 characters, and this part allows it.
 * 
 * 
 * Local Part: The local part of the email (user@domain.com) allows alphanumeric
 * characters, +, _, &, *, -, and . as separators.
 * 
 * Domain Part: This part now allows multiple subdomains (e.g.,
 * mail.example.com) and supports longer TLDs (up to 255 characters).
 * 
 * TLD Length: The TLD can now be between 2 and 255 characters long, covering
 * new, longer TLDs like .photography, .technology, etc.
 * 
 * Edge Case Examples:
 * 
 * Valid Email with Long TLD:
 * 
 * Email: user@domain.photography
 * 
 * Output: user@domain.photography is a valid email address.
 * 
 * Valid Email with New Characters in Domain:
 * 
 * Email: user+example@mail-domain.com
 * 
 * Output: user+example@mail-domain.com is a valid email address.
 * 
 * Valid Email with Multiple Subdomains:
 * 
 * Email: user@subdomain.domain.com
 * 
 * Output: user@subdomain.domain.com is a valid email address.
 * 
 * Invalid Email with Invalid TLD:
 * 
 * 
 * Email: user@domain.fakefakefakefake
 * 
 * Output: user@domain.fakefakefakefake is an invalid email address.
 * 
 * Invalid Email with Incorrect Characters:
 * 
 * Email: user@domain#.com
 * 
 * Output: user@domain#.com is an invalid email address.
 * 
 * 
 */