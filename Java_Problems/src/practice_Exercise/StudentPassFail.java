package practice_Exercise;

import java.util.Scanner;

public class StudentPassFail {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        // Define the total number of subjects
        final int NUMBER_OF_SUBJECTS = 3;
        // Define the passing percentages
        final double REQUIRED_OVERALL_PERCENTAGE = 40.0;
        final double REQUIRED_SUBJECT_PERCENTAGE = 33.0;
        
        // Input marks for each subject
        System.out.println("Enter marks for " + NUMBER_OF_SUBJECTS + " subjects:");
        System.out.print("Subject 1: ");
        double subject1 = sc.nextDouble();
        System.out.print("Subject 2: ");
        double subject2 = sc.nextDouble();
        System.out.print("Subject 3: ");
        double subject3 = sc.nextDouble();
        
        // Calculate total marks and average percentage
        double totalMarks = subject1 + subject2 + subject3;
        double totalPossibleMarks = 100.0 * NUMBER_OF_SUBJECTS; // Assuming each subject is out of 100
        double overallPercentage = (totalMarks / totalPossibleMarks) * 100;
        
        // Check individual subject percentages
        boolean subjectPass = (subject1 >= 33 && subject2 >= 33 && subject3 >= 33);
        
        // Check overall percentage
        boolean overallPass = (overallPercentage >= REQUIRED_OVERALL_PERCENTAGE);
        
        // Determine pass or fail
        if (subjectPass && overallPass) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }
        
        // Display additional information for debugging
        System.out.println("Overall Percentage: " + overallPercentage + "%");
        System.out.println("Marks in Subject 1: " + subject1);
        System.out.println("Marks in Subject 2: " + subject2);
        System.out.println("Marks in Subject 3: " + subject3);

	}

}

/*
 * Input Marks:

The program asks the user to input the marks for three subjects.

Calculate Total Marks and Percentage:

It calculates the total marks obtained and the overall percentage based on the assumption that each subject is out of 100 marks.

Check Conditions:

Individual Subject Pass: The student needs to have at least 33 marks in each subject.

Overall Pass: The overall percentage must be at least 40%.

Output:

The program prints whether the student has passed or failed based on the conditions. It also displays the overall percentage and marks in each subject for verification.

to Remember
"Overall Percentage Must Be 40% or More, and Each Subject Must Be 33% or More."

"Three Subjects, 33% Minimum Per Subject, 40% Minimum Overall."
 * 
 * 
 */
