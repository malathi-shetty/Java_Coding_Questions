package practice_Exercise;

import java.util.Map;
import java.util.TreeMap;

public class Simple_Exercise_36_TreeMap_1 {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(11, "Car");
		treeMap.put(11, "Vehicle");  // Overwrites previous value for key 11
	//	treeMap.put(12, "Bike");

		System.out.println("size: " + treeMap.size());     // Output: 1
		System.out.println("Key=Value: " + treeMap);            // Output: {11=Vehicle}

	}

}

/*output:
 * 
 *
 *size: 1
 * 
Key=Value: {11=Vehicle}

if bike is added then output:

2

{11=Vehicle, 12=Bike}
 * 
 */