
package armstrong_Numbers;

public class Checking_Armstrong_Number_1 {

	public static void main(String[] args) {
		
		//153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153
		
		int num = 153;
		int org_num = num;
		double sum = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			sum = sum + (Math.pow(digit, 3));
			num = num / 10;
		}
		
		boolean isArmstrong = sum == org_num;
		System.out.println("Is given num " + org_num + " Armstrong? : " + isArmstrong);

	}
}