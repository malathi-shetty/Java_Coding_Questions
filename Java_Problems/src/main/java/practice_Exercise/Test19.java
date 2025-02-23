package practice_Exercise;

public class Test19 {

	public static void main(String[] args) {
		String s1 = "abc"; // String literal "abc"
		String s2 = s1 + "def"; // Concatenation
		String s3 = s1 + "ijk"; // Concatenation

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
// how many object will be there in string pool ? There will be 3 objects 

/*
 * 
 * String s1 = "abc";
 * 
 * String literal "abc": This will be placed in the string pool if it's not
 * already there.
 * 
 * String pool: 1 object ("abc").
 * 
 * Heap: 0 new objects for s1.
 * 
 * String s2 = s1 + "def";
 * 
 * This is a string concatenation.
 * 
 * The value of s1 is "abc", and "def" is a string literal.
 * 
 * During concatenation, a new string "abcdef" is created on the heap (this is a
 * runtime string object).
 * 
 * String pool: The string "abc" is already in the pool, but "abcdef" is not
 * added to the pool automatically (unless you call .intern()).
 * 
 * Heap: 1 new object for the string "abcdef".
 * 
 * s2 is a reference to this string "abcdef" on the heap.
 * 
 * String s3 = s1 + "ijk";
 * 
 * Similar to s2, the value of s1 is "abc", and "ijk" is another string literal.
 * 
 * A new string "abcijk" is created on the heap.
 * 
 * String pool: "abcijk" is not automatically placed in the string pool.
 * 
 * Heap: 1 new object for the string "abcijk".
 * 
 * s3 is a reference to this string "abcijk" on the heap.
 * 
 * Total Number of Objects:
 * 
 * String pool: 1 object ("abc")
 * 
 * Heap: 2 objects (one for "abcdef" and one for "abcijk")
 * 
 * Additional objects:
 * 
 * 3 String references (s1, s2, s3), but they are just references to the string
 * objects, not new objects themselves.
 * 
 * Final Count of Objects:
 * 
 * In the string pool: 1 object ("abc").
 * 
 * In the heap: 2 objects ("abcdef" and "abcijk").
 * 
 * Total number of objects: 3 objects (1 in the string pool + 2 in the heap).
 * 
 * Conclusion:
 * 
 * The total number of objects created is 3: 1 in the string pool and 2 in the
 * heap.
 * 
 * 
 * 
 */
