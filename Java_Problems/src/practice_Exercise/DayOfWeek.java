package practice_Exercise;

import java.util.Scanner;

public class DayOfWeek {
	//WAP to find out the day of the week given the number [1 for Monday, 2 for Tuesday... and so on!]?

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number (1-7) to find the day of the week: ");
        int dayNumber = scanner.nextInt();

        // Determine the day of the week
        String dayName;
        switch (dayNumber) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Invalid day number. Please enter a number between 1 and 7."; break;
        }

        // Output the result
        System.out.println("The day of the week is: " + dayName);

	}

}
