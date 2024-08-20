package remove_duplicate_Numbers_from_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_duplicate_Numbers_from_ArrayList_2_Using_Stream {

	public static void main(String[] args) {

		// Approach 2: Stream

		ArrayList<Integer> marksList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 2, 3, 3, 4, 6, 7, 2, 3, 5, 4, 3, 8, 5, 8, 2));
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
	}
}
