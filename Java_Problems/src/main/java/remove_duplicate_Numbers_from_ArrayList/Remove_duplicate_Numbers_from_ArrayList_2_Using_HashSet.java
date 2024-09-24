package remove_duplicate_Numbers_from_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_duplicate_Numbers_from_ArrayList_2_Using_HashSet {

	public static void main(String[] args) {

		// Approach 2: Stream

		// Approach using HashSet
		ArrayList<Integer> marksList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 2, 3, 3, 4, 6, 7, 2, 3, 5, 4, 3, 8, 5, 8, 2));

		// Use a HashSet to remove duplicates
		HashSet<Integer> uniqueMarksSet = new HashSet<>(marksList);
		List<Integer> marksListUnique = new ArrayList<>(uniqueMarksSet);

		System.out.println(marksListUnique);
	}
}

/*
 * 
 * HashSet: A HashSet automatically removes duplicates when you add items to it.
 * 
 * Convert Back to List: After removing duplicates, convert the HashSet back to
 * a List.
 * 
 */