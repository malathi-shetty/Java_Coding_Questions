package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Duplicates_in_the_Array_ArrayList_Using_HashSet {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 1, 2, 6 };
		System.out.println("Array Duplicates: " + findDuplicatesInArray(a));

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6));
		System.out.println("ArrayList Duplicates: " + findDuplicatesInArrayList(list));
	}

	public static HashSet<Integer> findDuplicatesInArray(int[] a) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : a) {
			if (!set.add(num)) {
				duplicates.add(num);
			}
		}
		return duplicates;
	}

	public static HashSet<Integer> findDuplicatesInArrayList(ArrayList<Integer> list) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : list) {
			if (!set.add(num)) {
				duplicates.add(num);
			}
		}
		return duplicates;
	}

}