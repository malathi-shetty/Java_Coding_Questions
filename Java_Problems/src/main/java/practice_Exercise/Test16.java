package practice_Exercise;

public class Test16 {

	public static void main(String[] args) {
		for(int i =0; 0; i++) //compilation problem - cannot convert from int to boolean
		{
			System.out.println("Hello");
			break;
		}

	}

}

/*

It looks like there is an issue with the for loop condition in your code.

In this line:

for(int i = 0; 0; i++)

The condition 0 is not a valid boolean expression. In Java, loop conditions need to evaluate to a boolean value (true or false), but 0 is treated as an integer value and does not work as a condition. If you want the loop to run indefinitely, you could use true as the condition, like this:

for(int i = 0; true; i++)  

{
    System.out.println("Hello");
    
    break;
    
}

In this case, the loop will run indefinitely, but the break statement will cause the loop to exit after the first iteration, printing "Hello" only once.

Alternatively, if you want the loop to run only once, you could change the condition to i < 1 or something else that makes sense based on your logic:

for(int i = 0; i < 1; i++)  

{

    System.out.println("Hello");
    
    break;
    
}
*/