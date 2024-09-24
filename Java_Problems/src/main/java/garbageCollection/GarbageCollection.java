package garbageCollection;

public class GarbageCollection {

	public static void main(String[] args) {
		String fruit1 = new String("apple"); // Creates a new String object "apple"
		String fruit2 = new String("orange"); // Creates a new String object "orange"
		String fruit3 = new String("pear"); // Creates a new String object "pear"

		fruit3 = fruit1; // fruit3 now refers to the same object as fruit1 ("apple")
		fruit2 = fruit3; // fruit2 now refers to the same object as fruit3 ("apple")
		fruit1 = fruit2; // fruit1 now refers to the same object as fruit2 ("apple")

	}

}

/*
 * 
 * How many of the String objects are eligible for garbage collection right
 * before the end of the main method?
 * 
 * public static void main(String[] fruits) { String fruit1 = new
 * String("apple"); String fruit2 = new String("orange"); String fruit3 = new
 * String("pear"); fruit3 = fruit1; fruit2 = fruit3; fruit1 = fruit2; }
 * 
 * 
 * A. None B. One C. Two D. Three
 * 
 * 
 * Object References: Initially:
 * 
 * fruit1 points to "apple"
 * 
 * fruit2 points to "orange"
 * 
 * fruit3 points to "pear"
 * 
 * 
 * After fruit3 = fruit1;:
 * 
 * fruit1 points to "apple"
 * 
 * fruit2 points to "orange"
 * 
 * fruit3 now also points to "apple" (the reference to "pear" is lost).
 * 
 * 
 * After fruit2 = fruit3;:
 * 
 * fruit1 points to "apple"
 * 
 * fruit2 now points to "apple" (the reference to "orange" is lost).
 * 
 * fruit3 still points to "apple".
 * 
 * After fruit1 = fruit2;:
 * 
 * All three variables (fruit1, fruit2, and fruit3) now point to "apple".
 * 
 * The references to "orange" and "pear" are lost.
 * 
 * Garbage Collection Eligibility:
 * 
 * At this point:
 * 
 * The "apple" object is still referenced by all three variables.
 * 
 * The "orange" and "pear" objects are no longer referenced by any variable and
 * are eligible for garbage collection.
 * 
 * Conclusion: Two String objects ("orange" and "pear") are eligible for garbage
 * collection.
 * 
 * Thus, the answer is C. Two.
 * 
 */