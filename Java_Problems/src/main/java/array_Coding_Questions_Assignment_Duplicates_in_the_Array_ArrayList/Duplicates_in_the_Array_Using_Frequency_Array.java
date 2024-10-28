package array_Coding_Questions_Assignment_Duplicates_in_the_Array_ArrayList;

public class Duplicates_in_the_Array_Using_Frequency_Array {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 1, 2, 6};

        findDuplicates(a);
    }

    public static void findDuplicates(int[] a) {
        int[] frequency = new int[101]; // Adjust size according to your range
        System.out.print("Duplicates: ");

        for (int num : a) {
            frequency[num]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 1) {
                System.out.print(i + " ");
            }
        }
    }

}
