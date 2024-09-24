package swap_Two_Numbers_5_Ways;

public class Swap_Two_Numbers_2_2_Without_Using_Temp {

	public static void main(String[] args) {
		
		int num1=5;
		int num2=10;
		swapNumbers(num1, num2);

	}

	public static void swapNumbers(int num1, int num2) {
		
		System.out.println("Before Swapping: ");
		System.out.println(num1);
		System.out.println(num2);
		
		 num1 = num1 + num2;
		 num2 = num1-num2;
		 num1 = num1-num2;
		
		
		
		System.out.println("After Swapping: ");
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
