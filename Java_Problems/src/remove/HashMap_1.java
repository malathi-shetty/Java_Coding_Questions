package remove;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_1 {

	public static void main(String[] args) {
		HashMap<String, Integer> newobj = new HashMap<String, Integer>();
		newobj.put("priyanka", 60);
		newobj.put("p", 7);
		newobj.put("k", 8);

		Set<Map.Entry<String, Integer>> s = newobj.entrySet();

		// Print only unique entries
		for (Map.Entry<String, Integer> k : s) {

			if (!k.getKey().equals("priyanka") && k.getValue() != 60) {
				System.out.println(k.getKey() + " " + k.getValue());
			}
		}

	}
}
