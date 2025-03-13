package array_Coding_Questions_Assignment_Sort_the_Array_and_ArrayList_Using_Bubble_Sort_Mechanism;

public class BubbleSort {

	public static void main(String[] args) {
		 int[] a = {5, 3, 8, 4, 2}; // You can modify this array
	        bubbleSort(a);
	        
	        System.out.println("Sorted array:");
	        for (int num : a) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void bubbleSort(int[] a) {
	        int n = a.length;
	        for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (a[j] > a[j+1]) {
	                    // Swap a[j] and a[j+1]
	                    int temp = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = temp;
	                }
	            }
	        }

	    }
	    }
