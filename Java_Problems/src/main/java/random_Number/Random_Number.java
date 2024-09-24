package random_Number;

import java.util.Random;
import java.util.Scanner;

public class Random_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lowerBound = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        
        Random rand = new Random();
        int randomNum = rand.nextInt((upperBound - lowerBound) + 1) + lowerBound;
        
        System.out.print("Random number: " + randomNum);

	}

}

// "Generate random within specified range."