package z;

import java.util.HashMap;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str = "engineering";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.print("Duplicate characters: ");
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.print(ch + " ");
            }
        }

	}

}
