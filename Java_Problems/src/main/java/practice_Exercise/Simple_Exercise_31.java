package practice_Exercise;

import java.util.ArrayList;

public class Simple_Exercise_31 {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        
        ArrayList<Integer> y = x; // y references the same ArrayList as x
        y.add(4); // This modifies the ArrayList that both x and y reference
        
        System.out.println(x); // Output the contents of x

	}

}

/*

Initialization: x is an ArrayList initialized with values 1, 2, 3.

Reference Assignment: y is assigned to reference the same ArrayList as x.

Modification: When y.add(4) is called, it modifies the list that both x and y point to.

Output: Printing x shows the modified list, which now includes 4.

*/