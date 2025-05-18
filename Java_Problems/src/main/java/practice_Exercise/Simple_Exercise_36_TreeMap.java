package practice_Exercise;

import java.util.Map;
import java.util.TreeMap;

public class Simple_Exercise_36_TreeMap {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(11, "Car");
		treeMap.put(null, null);
		treeMap.put(11, "Vehicle");
		treeMap.put(null, "Truck");

		System.out.println(treeMap.size());
		System.out.println(treeMap);

	}

}

/*
 * Output:
 * 
 * Exception in thread "main" java.lang.NullPointerException at
 * java.base/java.util.Objects.requireNonNull(Objects.java:233) at
 * java.base/java.util.TreeMap.put(TreeMap.java:844) at
 * java.base/java.util.TreeMap.put(TreeMap.java:569) at
 * practice_Exercise.Simple_Exercise_36_TreeMap.main(Simple_Exercise_36_TreeMap.
 * java:11)
 * 
 * 
 */

/*
 * TreeMap in Java does not allow null keys. Unlike HashMap (which allows one
 * null key), TreeMap relies on comparisons (Comparable or a Comparator) to sort
 * keys, and comparing null with other keys causes a NullPointerException.
 * 
 * 🔍 What will happen:
 * 
 * treeMap.put(null, null); This line will throw a NullPointerException at
 * runtime, because TreeMap tries to compare the null key with existing keys in
 * order to insert it in sorted order.
 * 
 * So, the program will not reach the System.out.println(treeMap.size()); line —
 * it will crash at the first insertion of null.
 * 
 * 🛠 Fix: If you want to use null keys, consider using a HashMap instead:
 * 
 * 
 * Map<Integer, String> map = new HashMap<>(); Or, if you must use a TreeMap, do
 * not use null keys.
 * 
 * 
 */