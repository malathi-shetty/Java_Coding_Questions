package practice_Exercise;

public class Test12 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				break;
			case 1:
				System.out.print("one ");
			case 2:
				System.out.print("two ");
			case 3:
				System.out.print("three ");
			}
		}
		System.out.println("done");

	}

}

/*
 * Output: one two three two three done
 ****
 * 
 * 
 * Key Points:
 * 
 * Loop:
 * 
 * The loop for(int i = 0; i < 3; i++) runs three times. The value of i will be
 * 0, 1, and 2 for each iteration.
 * 
 * Switch-Case:
 * 
 * Inside the switch(i), the value of i is checked in each iteration.
 * 
 * Iteration Breakdown:
 * 
 * First Iteration (i = 0):
 * 
 * The switch statement checks the value of i, which is 0.
 * 
 * case 0: break; is executed. The break statement causes the program to exit
 * the switch statement immediately without doing anything further.
 * 
 * No output is printed for this iteration because the break ends the execution
 * before any print statements.
 * 
 * Second Iteration (i = 1):
 * 
 * The switch statement checks the value of i, which is 1.
 * 
 * case 1: is executed, printing "one ".
 * 
 * However, there is no break statement after case 1. So, the program continues
 * to execute the next cases.
 * 
 * case 2: is executed next, printing "two ".
 * 
 * case 3: is executed after that, printing "three ".
 * 
 * So, the output for this iteration will be: one two three .
 * 
 * Third Iteration (i = 2):
 * 
 * The switch statement checks the value of i, which is 2.
 * 
 * case 2: is executed, printing "two ".
 * 
 * As there is no break statement, it proceeds to case 3:, printing "three ".
 * 
 * So, the output for this iteration will be: two three .
 * 
 * Final Output:
 * 
 * After all iterations of the loop, the program will print:
 * 
 * one two three two three done
 * 
 * Explanation of Output:
 * 
 * The first iteration (i = 0) does not print anything because the break
 * prevents further execution in the switch block.
 * 
 * The second iteration (i = 1) prints one two three due to the lack of break
 * statements after each case.
 * 
 * The third iteration (i = 2) prints two three.
 * 
 * After the loop, "done" is printed.
 * 
 * So, the complete output will be:
 * 
 * one two three two three done
 * 
 */