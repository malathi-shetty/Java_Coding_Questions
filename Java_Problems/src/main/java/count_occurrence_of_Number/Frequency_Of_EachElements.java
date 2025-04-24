package count_occurrence_of_Number;

public class Frequency_Of_EachElements {

	public static void main(String[] args) {
		/*
		 * Input: {1, 2, 2, 3, 1, 4, 5, 1}
🔸 Output: 1 → 3 times, etc

		 * 
		 */
		
		int a[]={1, 2, 2, 3, 1, 4, 5, 1};
		countofEachElement(a);
		
		
		
	}

	public static void countofEachElement(int[] a) {
		for(int i=0; i<a.length; i++)
		{
			boolean alreadyPresent = false;
			for(int j=0; j<i;j++)
			{
				if(a[i] == a[j])
				{
					alreadyPresent = true;
					break;
				}
			}
			
			if(alreadyPresent)
			{
				continue; // move to next element
			}
			int count =1;
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
				
				}
			System.out.println("Occurence of " + a[i] + " → " + count + " times.");
			}
		}
		
	}


