package find_numberOccurrence_Using_Arraylist;

import java.util.ArrayList;
public class NumberOccurrence_Using_ArrayList {
	public static void main(String[] args) {
		
		// Create and initialize the ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);

        // Number to find occurrences of
        int targetNumber = 2;

        // Call the method to count_Number_of_Words_in_a_String occurrences
        int count = countOccurrences(numbers, targetNumber);

        // Print the result
        System.out.println("The number " + targetNumber + " occurs " + count + " times.");
    }

    // Method to count_Number_of_Words_in_a_String occurrences of a number in an ArrayList
    public static int countOccurrences(ArrayList<Integer> list, int number) {
        int count = 0;
        for (int num : list) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }
}