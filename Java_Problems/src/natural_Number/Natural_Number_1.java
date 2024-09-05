package natural_Number;

public class Natural_Number_1 {

	public static void main(String[] args) {
		 int number = -5; // Change this number to test different cases

	        if (isNaturalNumber(number)) {
	            System.out.println(number + " is a natural number.");
	        } else {
	            System.out.println(number + " is not a natural number.");
	        }
	    }

	    public static boolean isNaturalNumber(int number) {
	        return number > 0; // Natural numbers are positive integers (not including zero in this definition)
	    }

	}


