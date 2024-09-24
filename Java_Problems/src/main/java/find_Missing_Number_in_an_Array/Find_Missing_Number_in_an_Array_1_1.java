package find_Missing_Number_in_an_Array;

public class Find_Missing_Number_in_an_Array_1_1 {

	public static void main(String[] args) {

		//int[] a = { 1, 2, 3, 5, 6, 7, 8, 9, 10 }; // maxNumber is 10
		int[] a = { 1, 2, 3, 5};
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println("sum of the array: " + sum);

		int sum1 = 0;
	//	for (int j = 1; j <= 10; j++) // i.e j<maxNumber i.e 10
		for (int j = 1; j <= 5; j++) // i.e j<maxNumber i.e 10
		{

			sum1 = sum1 + j;

		}
		System.out.println("sum1 of the maxNumber initialized: " + sum1);

		int Missing_number;
		Missing_number = sum1 - sum;
		System.out.println("Missing number: " + Missing_number);

	}

}
/*
 * for (int i = 0; i < a.length; i++) { // i=i+a[i]; // 0=0+1; // 1=1+2; //
 * 3=3+4 & so on
 *
 */