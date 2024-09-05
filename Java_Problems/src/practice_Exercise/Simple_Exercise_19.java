package practice_Exercise;

public class Simple_Exercise_19 {

	public static void main(String[] args) {
		String s = null;
		System.out.print("s: ");
		System.out.print(s instanceof String);

		System.out.println(" ");
		String s1 = "hello";
		boolean result = s1 instanceof String; // result is true because s1 is indeed an instance of String
		System.out.println("s1: " + s1);

		System.out.println(" ");
		// Example variable
		Object s2 = "Hello, World!"; // Change this to test different scenarios

		// Perform the type check
		if (s2 != null && s2 instanceof String) {
			// At this point, `s2` is guaranteed to be both non-null and an instance of
			// String
			String str = (String) s2; // Safe to cast to String
			// Now you can safely perform operations on `str`
			System.out.println("The length of the string is: " + str.length());
		} else {
			System.out.println("The variable is either null or not a String.");
		}

	}

}

/*
 * 
 * The instanceof operator in Java checks if an object is an instance of a
 * specific class or subclass.
 *
 * 
 * A String variable s is declared and initialized to null.
 * 
 * The instanceof operator is used to check if s is an instance of String.
 * 
 * Since s is null, s instanceof String evaluates to false. This is because null
 * is not an instance of any class, although instanceof would not throw a
 * NullPointerException in this case.
 * 
 * null instanceof Type: The result is always false for any type if the
 * left-hand side of the instanceof operator is null. The instanceof operator
 * checks whether the object is an instance of a specific class or subclass, but
 * null does not reference any object, so it can't be an instance of any class.
 * 
 * Avoid Null Checks: Using instanceof with null is often unnecessary. If you
 * need to check if a variable is both non-null and an instance of a certain
 * class, you typically first check if the variable is null and then perform the
 * instanceof check.
 * 
 * Type Safety: This way, you ensure that instanceof is only called when there
 * is an actual object to test, avoiding potential pitfalls with null
 * references.
 ****
 * 
 * 
 * 
 * perform an operation on a variable that should be both non-null and of a
 * specific type (e.g., String), you use a conditional check that first ensures
 * the variable is not null and then confirms its type using instanceof
 * 
 * Object s = "Hello, World!"; // This is an example value, it could be any
 * Object
 * 
 * s is declared as an Object. You might use this approach if you're working
 * with variables of type Object that could be of various types, including
 * String.
 * 
 * if (s != null && s instanceof String) {
 * 
 * s != null: Ensures s is not null. This is necessary because null values are
 * not instances of any class, so an instanceof check on null would be
 * meaningless.
 * 
 * s instanceof String: Checks if s is an instance of String. Given that s is
 * not null, this check is safe and ensures that s is indeed a String.
 * 
 * String str = (String) s; // Safe to cast since we know s is a String
 * System.out.println("The length of the string is: " + str.length());
 * 
 * Since you’ve confirmed that s is a String, you can safely cast s to String
 * and perform operations specific to String, such as calling length().
 * 
 * System.out.println("The variable is either null or not a String.");
 * 
 * Handles the case where s is either null or not an instance of String. This
 * provides feedback or alternative handling for unexpected values.
 * 
 * if s is not null and then verifying its type with instanceof, you ensure that
 * you only perform type-specific operations when it's safe to do so. This
 * pattern helps prevent ClassCastException and ensures that your code operates
 * safely and efficiently
 * 
 * 
 */